package com.example.czcionkaapp

import android.os.Bundle
import android.widget.Button
import android.widget.SeekBar
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var sizeText: TextView
    private lateinit var quoteText: TextView
    private lateinit var fontSeekBar: SeekBar
    private lateinit var changeButton: Button

    private val quotes = arrayOf(
        "Dzień dobry",
        "Good morning",
        "Buenos dias"
    )

    private var currentQuoteIndex = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        sizeText = findViewById(R.id.sizeText)
        quoteText = findViewById(R.id.quoteText)
        fontSeekBar = findViewById(R.id.fontSeekBar)
        changeButton = findViewById(R.id.changeButton)

        fontSeekBar.progress = 20

        fontSeekBar.setOnSeekBarChangeListener(object :
            SeekBar.OnSeekBarChangeListener {

            override fun onProgressChanged(
                seekBar: SeekBar?,
                progress: Int,
                fromUser: Boolean
            ) {

                sizeText.text = "Rozmiar: $progress"

                quoteText.textSize = progress.toFloat()
            }

            override fun onStartTrackingTouch(seekBar: SeekBar?) {
            }

            override fun onStopTrackingTouch(seekBar: SeekBar?) {
            }
        })

        changeButton.setOnClickListener {

            currentQuoteIndex++

            if (currentQuoteIndex >= quotes.size) {
                currentQuoteIndex = 0
            }

            quoteText.text = quotes[currentQuoteIndex]
        }
    }
}