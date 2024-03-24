package com.example.mittprojekt


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import com.google.android.material.bottomnavigation.BottomNavigationView

class YourGames: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_your_games)

        //Jag höll temat på alla activiter på det sättet för jag insåg att det var bästa sättet att hålla det simpelt och effektivt för mig att inte ha för många färger och teman som skulle ta för mycket tid
        //för jag fann att det statiska och logiken på allt tog för lång tid för att kunna tänka på ux:n

        //todo jag ska lägga en ny activiet där man kan lägga in mer  spel  med en ny onclick

        //todo att sedan kunna ha det möjligt att kunna fixa funktionen att utöka cardviewn för att ett spel




        val buttonSearch = findViewById<Button>(R.id.goBackYour_Games)
        buttonSearch.setOnClickListener {
            val bottomNavigationView = findViewById<BottomNavigationView>(R.id.bottom_navigation)
            bottomNavigationView.selectedItemId = R.id.bottom_yourGames
            finish()
        }

        val clickMe5 = findViewById<ImageButton>(R.id.imageButton_your_games)
        clickMe5.setOnClickListener{
            val intent = Intent(this, GamesDetails::class.java)
            startActivity(intent)
        }

        val clickMe6 = findViewById<ImageButton>(R.id.imageButton_your_games2)
        clickMe6.setOnClickListener{
            val intent = Intent(this, GamesDetails7::class.java)
            startActivity(intent)
        }

        val clickMe7 = findViewById<ImageButton>(R.id.imageButton_your_games3)
        clickMe7.setOnClickListener{
            val intent = Intent(this, GamesDetails2::class.java)
            startActivity(intent)
        }

        val clickMe8 = findViewById<ImageButton>(R.id.imageButton_your_games4)
        clickMe8.setOnClickListener{
            val intent = Intent(this, GamesDetails6::class.java)
            startActivity(intent)
        }

        val clickMe9 = findViewById<ImageButton>(R.id.imageButton_your_games5)
        clickMe9.setOnClickListener{
            val intent = Intent(this, GamesDetails3::class.java)
            startActivity(intent)
        }


        val clickMe11 = findViewById<ImageButton>(R.id.imageButton_your_games7)
        clickMe11.setOnClickListener{
            val intent = Intent(this, GamesDetails5::class.java)
            startActivity(intent)
        }

        val clickMe12 = findViewById<ImageButton>(R.id.imageButton_your_games8)
        clickMe12.setOnClickListener{
            val intent = Intent(this, GamesDetails4::class.java)
            startActivity(intent)
        }

        val clickMe33 = findViewById<ImageButton>(R.id.GamesButtonAddGame)
        clickMe33.setOnClickListener{
            val intent = Intent(this, AddGame::class.java)
            startActivity(intent)
        }



        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.bottom_navigation)
        bottomNavigationView.selectedItemId = R.id.bottom_yourGames

        bottomNavigationView.setOnItemSelectedListener{menuItem->
            when(menuItem.itemId){
                R.id.bottom_home->{
                    val intent = Intent(this, MainActivity::class.java)
                    startActivity(intent)
                    true
                }
                R.id.bottom_search->{
                    val intent = Intent(this, Search::class.java)
                    startActivity(intent)
                    true
                }
                R.id.bottom_friends->{
                    val intent = Intent(this, Friends::class.java)
                    startActivity(intent)
                    true
                }
                R.id.bottom_yourGames->{
                    val intent = Intent(this, YourGames::class.java)
                    startActivity(intent)
                    true
                }
                R.id.bottom_forum->{
                    val intent = Intent(this, Forum::class.java)
                    startActivity(intent)
                    true
                }
                else -> false
            }
        }
    }
}

