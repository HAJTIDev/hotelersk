OK — zadanie 2 polega na:

✅ dodaniu Switch (Tryb ciemny)
✅ zmianie motywu po kliknięciu
✅ zapisaniu stanu w SharedPreferences, aby nie resetował się po zamknięciu aplikacji

Poniżej masz gotowe rozwiązanie.


---

✅ 1. activity_main.xml

Dodaj na górze layoutu:

<androidx.appcompat.widget.SwitchCompat
    android:id="@+id/switch_theme"
    android:layout_width="wrap_content"
    android:layout_height="wrap_content"
    android:text="Tryb ciemny"
    android:layout_margin="16dp"/>

Jeśli masz ConstraintLayout — powiedz, dam Ci constraints.


---

✅ 2. MainActivity.kt

Dodaj logikę zapisu + zmiany motywu:

import android.content.Context
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.app.AppCompatDelegate
import androidx.appcompat.widget.SwitchCompat

class MainActivity : AppCompatActivity() {

    private lateinit var switchTheme: SwitchCompat

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        switchTheme = findViewById(R.id.switch_theme)

        val prefs = getSharedPreferences("settings", Context.MODE_PRIVATE)
        val isDark = prefs.getBoolean("dark_mode", false)

        // ustaw zapisany stan
        switchTheme.isChecked = isDark
        setThemeMode(isDark)

        switchTheme.setOnCheckedChangeListener { _, isChecked ->
            prefs.edit().putBoolean("dark_mode", isChecked).apply()
            setThemeMode(isChecked)
        }
    }

    private fun setThemeMode(dark: Boolean) {
        if (dark) {
            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES)
        } else {
            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
        }
    }
}


---

⭐ Co pokaże prowadzącemu, że działa

👉 przełączasz switch → zmienia się motyw
👉 zamykasz aplikację → uruchamiasz ponownie → stan zostaje


---

🔥 Jeśli chcesz, mogę Ci jeszcze dać:

✅ wersję pod ConstraintLayout
✅ wersję pod Material3 (lepsza na ocenę)
✅ jak uniknąć restartu Activity przy zmianie motywu
✅ gotowca pod 5/5 z komentarzami do oddania

Napisz 👍