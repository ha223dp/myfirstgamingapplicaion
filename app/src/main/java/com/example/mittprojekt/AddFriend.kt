
package com.example.mittprojekt

import android.annotation.SuppressLint
import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.RatingBar
import android.widget.TextView
import android.widget.Toast


class  AddFriend: AppCompatActivity() {
    @SuppressLint("MissingInflatedId")


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activty_add_friend)
//Jag höll temat på alla activiter på det sättet för jag insåg att det var bästa sättet att hålla det simpelt och effektivt för mig att inte ha för många färger och teman som skulle ta för mycket tid
        //för jag fann att det statiska och logiken på allt tog för lång tid för att kunna tänka på ux:n
//Jag ska bara kunna se denna post
        val buttonSearch = findViewById<Button>(R.id.goBackToFriends)
        buttonSearch.setOnClickListener {
            finish()
        }

        val button = findViewById<Button>(R.id.buttonFriendDetail)
        val friendAdd = findViewById<TextView>(R.id.textViewAddFriendDetails)

        // Initialize an empty set to hold friend details
        val friendDetailsSet = mutableSetOf<String>()

        // Add predefined names to the set
        val predefinedNames = setOf("GamerBoy2", "Arg pappa", "Mikes 2", "YesMan", "Den Emil", "Harambe")
        friendDetailsSet.addAll(predefinedNames)

        button.setOnClickListener {
            val message = friendAdd.text.toString()

            if (friendDetailsSet.contains(message)) {
                Toast.makeText(this@AddFriend, "You are already friends with them", Toast.LENGTH_SHORT).show()
            } else {
                friendDetailsSet.add(message)
                saveFriendDetailsToSharedPreferences(friendDetailsSet.toList())
                Toast.makeText(this@AddFriend, "Friend has been added", Toast.LENGTH_SHORT).show()
            }
        }
    }

    private fun saveFriendDetailsToSharedPreferences(friendDetailsList: List<String>) {
        val PREFS_NAME = "FriendDetails"
        val sharedPreferences = getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE)
        val editor = sharedPreferences.edit()
        editor.putStringSet("friendDetails", friendDetailsList.toSet())
        editor.apply()
    }
}


