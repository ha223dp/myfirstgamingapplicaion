package com.example.mittprojekt

import android.content.Context
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.Button
import android.widget.EditText
import android.widget.RatingBar
import android.widget.TextView
import android.widget.Toast

class GamesDetails2 : AppCompatActivity() {
    private lateinit var sharedPreferences: SharedPreferences
    private lateinit var ratingBar: RatingBar
    private lateinit var editText: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_games_details2)

        sharedPreferences = getSharedPreferences("MyPrefs2", Context.MODE_PRIVATE)
        val savedRating = sharedPreferences.getFloat("Rating", 0.0f)
        val savedText = sharedPreferences.getString("Text", "")

        ratingBar = findViewById(R.id.ratingbar)
        ratingBar.rating = savedRating

        editText = findViewById(R.id.editTextId)
        editText.setText(savedText)

        // Set up rating change listener
        ratingBar.setOnRatingBarChangeListener { _, rating, _ ->
            saveRating(rating)
            updateRatingText(rating)
        }

        // Add a TextWatcher to the EditText
        editText.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {}

            override fun afterTextChanged(s: Editable?) {
                // Save the changed text here
                val changedText = s.toString()
                saveText(changedText)
            }
        })

        val button = findViewById<Button>(R.id.buttonGameDetail)
        button.setOnClickListener {
            val message = ratingBar.rating.toString()
            Toast.makeText(this@GamesDetails2, "Rating is $message", Toast.LENGTH_SHORT).show()
        }

        val buttonSearch = findViewById<Button>(R.id.goBackYour_Games)
        buttonSearch.setOnClickListener {
            finish()
        }
    }

    private fun saveRating(rating: Float) {
        val editor = sharedPreferences.edit()
        editor.putFloat("Rating", rating)
        editor.apply()
    }

    private fun updateRatingText(rating: Float) {
        val ratingScale = findViewById<TextView>(R.id.textViewGamesDetails)
        when (rating.toInt()) {
            1 -> ratingScale.text = "Very bad"
            2 -> ratingScale.text = "Bad"
            3 -> ratingScale.text = "Good"
            4 -> ratingScale.text = "Great"
            5 -> ratingScale.text = "Best game ever"
            else -> ratingScale.text = ""
        }
    }

    private fun saveText(text: String) {
        val editor = sharedPreferences.edit()
        editor.putString("Text", text)
        editor.apply()
    }
}