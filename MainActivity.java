<?xml version="1.0" encoding="utf-8"?>
<LinearLayout
    xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:orientation="vertical"
    android:padding="20dp"
    android:background="#558B2F">

    <TextView
        android:id="@+id/titleText"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:text="Właściwości czcionki"
        android:textSize="28sp"
        android:textStyle="bold"
        android:textColor="#FFFFFF"
        android:gravity="center"
        android:layout_marginBottom="20dp"/>

    <TextView
        android:id="@+id/sizeText"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:text="Rozmiar: 20"
        android:textSize="20sp"
        android:textColor="#FFFFFF"
        android:layout_marginBottom="10dp"/>

    <SeekBar
        android:id="@+id/fontSeekBar"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:max="40"
        android:progress="20"
        android:layout_marginBottom="20dp"/>

    <TextView
        android:id="@+id/quoteText"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:text="Dzień dobry"
        android:textSize="20sp"
        android:textColor="#000000"
        android:gravity="center"
        android:layout_marginBottom="20dp"/>

    <Button
        android:id="@+id/changeButton"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:text=">>"
        android:textStyle="bold"
        android:textColor="#FFFFFF"
        android:backgroundTint="#33691E"/>

</LinearLayout>