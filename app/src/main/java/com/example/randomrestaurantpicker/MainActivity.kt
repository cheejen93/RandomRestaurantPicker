package com.example.randomrestaurantpicker

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.SeekBar
import android.widget.TextView
import com.google.android.material.textfield.TextInputEditText
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val pickButton = findViewById<Button>(R.id.pickButton)
        val resultsTextView = findViewById<TextView>(R.id.resultsTextView)
        var textOne = findViewById<EditText>(R.id.textOne)
        var textTwo = findViewById<EditText>(R.id.textTwo)
        var textThree = findViewById<EditText>(R.id.textThree)
        var textFour = findViewById<EditText>(R.id.textFour)
        var textFive = findViewById<EditText>(R.id.textFive)

        pickButton.setOnClickListener {
            val inputOne = textOne.text
            val inputTwo = textTwo.text
            val inputThree = textThree.text
            val inputFour = textFour.text
            val inputFive = textFive.text
            var restaurants = listOf(inputOne, inputTwo, inputThree, inputFour, inputFive)
            resultsTextView.text = restaurants.random().toString()
        }
    }
}
