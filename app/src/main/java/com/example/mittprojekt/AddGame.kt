
package com.example.mittprojekt

import android.annotation.SuppressLint
import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView
import android.widget.Button
import android.widget.LinearLayout
import android.widget.RatingBar
import android.widget.TextView
import android.widget.Toast
import androidx.cardview.widget.CardView


class  AddGame: AppCompatActivity() {

    //Det är också en view
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_game)
//Jag höll temat på alla activiter på det sättet för jag insåg att det var bästa sättet att hålla det simpelt och effektivt för mig att inte ha för många färger och teman som skulle ta för mycket tid
        //för jag fann att det statiska och logiken på allt tog för lång tid för att kunna tänka på ux:n
//Jag ska bara kunna se denna post
        val buttonSearch = findViewById<Button>(R.id.goBackToYourGamesFromAddGames)
        buttonSearch.setOnClickListener {
            finish()
        }
        val options = arrayOf(
            "Dark souls 3",
            "Persona 3 Reload",
            "Lies of P",
            "High Fi Rush",
            "God of War Ragranork",
            "Celeste",
            "Grimfan dango",
            "It takes two",
            "The Witcher 3: Wild Hunt",
            "Red Dead Redemption 2",
            "Super Mario Odyssey",
            "Final Fantasy VII Remake",
            "The Last of Us Part II",
            "Animal Crossing: New Horizons",
            "Cyberpunk 2077",
            "Assassin's Creed Valhalla",
            "Hades",
            "Among Us",
            "Ghost of Tsushima",
            "Call of Duty: Warzone",
            "Minecraft",
            "Death Stranding",
            "Fallout 4",
            "Overwatch",
            "Persona 5",
            "Borderlands 3",
            "Valorant",
            "Grand Theft Auto V",
            "The Legend of Zelda: Breath of the Wild",
            "FIFA 21",
            "Marvel's Spider-Man: Miles Morales",
            "Doom Eternal",
            "Resident Evil Village",
            "Rainbow Six Siege",
            "Tom Clancy's The Division 2",
            "Destiny 2",
            "Star Wars Jedi: Fallen Order",
            "Splatoon 2",
            "Monster Hunter: World",
            "Nioh 2",
            "Pokémon Sword and Shield",
            "Control",
            "Sekiro: Shadows Die Twice",
            "Rocket League",
            "The Elder Scrolls V: Skyrim",
            "Apex Legends",
            "Fortnite",
            "Super Smash Bros. Ultimate",
            "Genshin Impact",
            "Halo Infinite",
            "Mortal Kombat 11",
            "Street Fighter V",
            "Dragon Ball Z: Kakarot",
            "World of Warcraft",
            "StarCraft II",
            "Diablo III",
            "Dead by Daylight",
            "Warframe",
            "Team Fortress 2",
            "Counter-Strike: Global Offensive",
            "Dota 2",
            "Battlefield V",
            "Rainbow Six Quarantine",
            "Watch Dogs: Legion",
            "Baldur's Gate III",
            "Mafia: Definitive Edition",
            "Tony Hawk's Pro Skater 1+2",
            "Wasteland 3",
            "Crash Bandicoot 4: It's About Time",
            "Assassin's Creed Odyssey",
            "Shadow of the Tomb Raider",
            "Little Nightmares II",
            "Ratchet & Clank: Rift Apart",
            "Demon's Souls",
            "Cyber Shadow",
            "Hitman 3",
            "Dark soul 2",
            "Dark souls"
        )


        fun saveGameDetailsToSharedPreferences(gameDetailsMap: Map<String, Float>) {
            val PREFS_NAME = "GameDetails"
            val sharedPreferences = getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE)
            val editor = sharedPreferences.edit()

            // Concatenate game details with ratings using a delimiter and save it
            val gameDetailsString = gameDetailsMap.entries.joinToString(";") { "${it.key}:${it.value}" }
            editor.putString("GameDetails", gameDetailsString)
            editor.apply()
        }
        fun getGameDetailsFromSharedPreferences(): MutableMap<String, Float> {
            val PREFS_NAME = "GameDetails"
            val sharedPreferences = getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE)
            val gameDetailsString = sharedPreferences.getString("GameDetails", "")

            val gameDetailsMap = mutableMapOf<String, Float>()

            if (!gameDetailsString.isNullOrEmpty()) {
                gameDetailsString.split(";").forEach {
                    try {
                        val (game, rating) = it.split(":")
                        gameDetailsMap[game] = rating.toFloat()
                    } catch (e: NumberFormatException) {
                        // Handle the exception
                    }
                }
            }

            return gameDetailsMap
        }



        val button = findViewById<Button>(R.id.buttonGameDetail)
        val gameAdd = findViewById<TextView>(R.id.gameId)
        val autoCompleteTextView = findViewById<AutoCompleteTextView>(R.id.autoCompleteTextView)
        val ratingBarGame = findViewById<RatingBar>(R.id.ratingbarGame)

// Create the adapter
        val adapter = ArrayAdapter(this, android.R.layout.simple_dropdown_item_1line, options)

// Set the adapter to the bloody AutoCompleteTextView
        autoCompleteTextView.setAdapter(adapter)

// Set threshold to show suggestions after the first character is typed
        autoCompleteTextView.threshold = 1

// Initialize an empty set to hold game details
        val gameDetailsSet = mutableSetOf<String>()

// Add predefined games to the set
        val predefinedGames = setOf("Tekken 8", "Need for Speed Most Wanted", "It Takes Two", "Persona 3 Reload", "God of War Ragnarok", "Dark Souls 3")
        gameDetailsSet.addAll(predefinedGames)

        button.setOnClickListener {
            val message = gameAdd.text.toString()
            val choosedGame = autoCompleteTextView.text.toString()
            val rating = ratingBarGame.rating

            if (choosedGame.isBlank()) {
                Toast.makeText(this@AddGame, "Please choose a game first", Toast.LENGTH_SHORT).show()
            } else if (message.isBlank()) {
                Toast.makeText(this@AddGame, "Please enter a message first", Toast.LENGTH_SHORT).show()
            } else {
                val gameDetailsMap = getGameDetailsFromSharedPreferences()

                if (gameDetailsMap.containsKey(message)) {
                    Toast.makeText(this@AddGame, "You've already chosen the game: $message", Toast.LENGTH_SHORT).show()
                } else {
                    gameDetailsMap[message] = rating
                    saveGameDetailsToSharedPreferences(gameDetailsMap)
                    Toast.makeText(this@AddGame, "$choosedGame has been chosen and the review has been created", Toast.LENGTH_SHORT).show()
                }
            }
        }






    }




}


