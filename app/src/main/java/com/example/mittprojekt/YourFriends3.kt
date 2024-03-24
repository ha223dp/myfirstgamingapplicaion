package com.example.mittprojekt

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.RatingBar
import android.widget.TextView
import android.widget.Toast


class YourFriends3: AppCompatActivity() {

    //Jag höll temat på alla activiter på det sättet för jag insåg att det var bästa sättet att hålla det simpelt och effektivt för mig att inte ha för många färger och teman som skulle ta för mycket tid
    //för jag fann att det statiska och logiken på allt tog för lång tid för att kunna tänka på ux:n

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_your_friends3)
//Jag ska ordnar att man kan ändra texten senare
//det är bara en visuell view

        val buttonSearch = findViewById<Button>(R.id.goBackFriends3)
        buttonSearch.setOnClickListener {
            finish() // This will close the current activity and go back to the previous one
        }





    }
}
