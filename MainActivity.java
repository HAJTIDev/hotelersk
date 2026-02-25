// Mini aplikacja pogodowa Android (Kotlin) - ŁADNE UI
// Używa OpenWeatherMap API

package com.example.weatherapp

import android.graphics.Color
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import okhttp3.*
import org.json.JSONObject
import java.io.IOException

class MainActivity : AppCompatActivity() {

    private val API_KEY = "TU_WSTAW_API_KEY"
    private val client = OkHttpClient()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        getWeather("Rabien,PL", findViewById(R.id.rabienTemp), findViewById(R.id.rabienDesc))
        getWeather("Koluszki,PL", findViewById(R.id.koluszkiTemp), findViewById(R.id.koluszkiDesc))
    }

    private fun getWeather(city: String, tempView: TextView, descView: TextView) {
        val url = "https://api.openweathermap.org/data/2.5/weather?q=$city&appid=$API_KEY&units=metric&lang=pl"

        val request = Request.Builder().url(url).build()

        client.newCall(request).enqueue(object : Callback {
            override fun onFailure(call: Call, e: IOException) {
                runOnUiThread { tempView.text = "Błąd" }
            }

            override fun onResponse(call: Call, response: Response) {
                val body = response.body?.string()
                if (body != null) {
                    val json = JSONObject(body)
                    val temp = json.getJSONObject("main").getDouble("temp")
                    val desc = json.getJSONArray("weather").getJSONObject(0).getString("description")

                    runOnUiThread {
                        tempView.text = "${temp}°C"
                        descView.text = desc.replaceFirstChar { it.uppercase() }
                    }
                }
            }
        })
    }
}

/* activity_main.xml (ładne karty pogodowe)

<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:orientation="vertical"
    android:padding="20dp"
    android:background="#0F172A"
    android:layout_width="match_parent"
    android:layout_height="match_parent">

    <TextView
        android:text="Mini Pogoda"
        android:textSize="28sp"
        android:textStyle="bold"
        android:textColor="#FFFFFF"
        android:layout_marginBottom="20dp"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"/>

    <LinearLayout
        android:orientation="vertical"
        android:padding="20dp"
        android:background="#1E293B"
        android:layout_marginBottom="16dp"
        android:layout_width="match_parent"
        android:layout_height="wrap_content">

        <TextView android:text="Rąbień" android:textColor="#CBD5F5" android:textSize="18sp" android:layout_width="wrap_content" android:layout_height="wrap_content"/>
        <TextView android:id="@+id/rabienTemp" android:text="--°C" android:textColor="#FFFFFF" android:textSize="34sp" android:textStyle="bold" android:layout_width="wrap_content" android:layout_height="wrap_content"/>
        <TextView android:id="@+id/rabienDesc" android:text="opis" android:textColor="#94A3B8" android:textSize="16sp" android:layout_width="wrap_content" android:layout_height="wrap_content"/>

    </LinearLayout>

    <LinearLayout
        android:orientation="vertical"
        android:padding="20dp"
        android:background="#1E293B"
        android:layout_width="match_parent"
        android:layout_height="wrap_content">

        <TextView android:text="Koluszki" android:textColor="#CBD5F5" android:textSize="18sp" android:layout_width="wrap_content" android:layout_height="wrap_content"/>
        <TextView android:id="@+id/koluszkiTemp" android:text="--°C" android:textColor="#FFFFFF" android:textSize="34sp" android:textStyle="bold" android:layout_width="wrap_content" android:layout_height="wrap_content"/>
        <TextView android:id="@+id/koluszkiDesc" android:text="opis" android:textColor="#94A3B8" android:textSize="16sp" android:layout_width="wrap_content" android:layout_height="wrap_content"/>

    </LinearLayout>

</LinearLayout>
*/


Stworzyłem dla Ciebie prosty kod aplikacji pogodowej w Kotlinie — masz go już po prawej stronie w canvasie, żebyś mógł łatwo kopiować i edytować 👍

✅ Co robi aplikacja

✔ korzysta z API pogodowego (OpenWeatherMap)
✔ pobiera pogodę dla Rąbienia i Koluszek
✔ pokazuje temperaturę + opis pogody
✔ działa asynchronicznie (bez zawieszania UI)


---

📌 Co musisz zrobić teraz

1️⃣ Pobierz klucz API

Wejdź na: 👉 https://openweathermap.org/api
Załóż konto i skopiuj API key

W kodzie podmień:

private val API_KEY = "TU_WSTAW_API_KEY"


---

2️⃣ Dodaj zależność OkHttp

W build.gradle (Module):

implementation("com.squareup.okhttp3:okhttp:4.12.0")


---

3️⃣ Layout activity_main.xml

Utwórz bardzo prosty layout:

<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:orientation="vertical"
    android:padding="24dp"
    android:gravity="center"
    android:layout_width="match_parent"
    android:layout_height="match_parent">

    <TextView
        android:id="@+id/rabienText"
        android:text="Rąbień..."
        android:textSize="22sp"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"/>

    <TextView
        android:id="@+id/koluszkiText"
        android:text="Koluszki..."
        android:textSize="22sp"
        android:layout_marginTop="20dp"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"/>

</LinearLayout>


---

⭐ Jeśli chcesz

Mogę Ci teraz zrobić wersję: ✅ ładniejszą (ikony + tło zależne od pogody)
✅ z automatycznym odświeżaniem
✅ z lokalizacją GPS
✅ z prognozą na 7 dni
✅ w Jetpack Compose (bardziej nowocześnie)
✅ pod publikację do Google Play

Napisz 👍