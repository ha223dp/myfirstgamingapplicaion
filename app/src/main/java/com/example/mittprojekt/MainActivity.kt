package com.example.mittprojekt


import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {

//Jag höll temat på alla activiter på det sättet för jag insåg att det var bästa sättet att hålla det simpelt och effektivt för mig att inte ha för många färger och teman som skulle ta för mycket tid
    //för jag fann att det statiska och logiken på allt tog för lång tid för att kunna tänka på ux:n


    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        //Här för att trycka på dina spel
        val clickMe1 = findViewById<ImageButton>(R.id.ImageButtonMain1)
        clickMe1.setOnClickListener{
            val Intent = Intent(this, GamesDetails::class.java)
            startActivity(Intent)
        }

        val clickMe2 = findViewById<ImageButton>(R.id.ImageButtonMain2)
        clickMe2.setOnClickListener{
            val Intent = Intent(this, GamesDetails2::class.java)
            startActivity(Intent)
        }


        val clickMe3 = findViewById<ImageButton>(R.id.ImageButtonMain3)
        clickMe3.setOnClickListener{
            val Intent = Intent(this, GamesDetails3::class.java)
            startActivity(Intent)
        }

        val clickMe4 = findViewById<ImageButton>(R.id.ImageButtonMain4)
        clickMe4.setOnClickListener{
            val Intent = Intent(this, GamesDetails4::class.java)
            startActivity(Intent)
        }

        val clickMe5 = findViewById<ImageButton>(R.id.ImageButtonMain5)
        clickMe5.setOnClickListener{
            val Intent = Intent(this, GamesDetails5::class.java)
            startActivity(Intent)
        }


        //Det här för att trycka på dina vänner
        val clickMe6 = findViewById<ImageButton>(R.id.imageButtonMain20)
        clickMe6.setOnClickListener{
            val Intent = Intent(this, YourFriends::class.java)
            startActivity(Intent)
        }

        val clickMe7 = findViewById<ImageButton>(R.id.imageButtonMain12)
        clickMe7.setOnClickListener{
            val Intent = Intent(this, YourFriends2::class.java)
            startActivity(Intent)
        }


        val clickMe8 = findViewById<ImageButton>(R.id.imageButtonMain21)
        clickMe8.setOnClickListener{
            val Intent = Intent(this, YourFriends3::class.java)
            startActivity(Intent)
        }

        val clickMe9 = findViewById<ImageButton>(R.id.imageButtonMain22)
        clickMe9.setOnClickListener{
            val Intent = Intent(this, YourFriends4::class.java)
            startActivity(Intent)
        }

        val clickMe10 = findViewById<ImageButton>(R.id.imageButtonMain23)
        clickMe10.setOnClickListener{
            val Intent = Intent(this, YourFriends5::class.java)
            startActivity(Intent)
        }

        val clickMe11 = findViewById<ImageButton>(R.id.imageButtonMain24)
        clickMe11.setOnClickListener{
            val Intent = Intent(this, YourFriends6::class.java)
            startActivity(Intent)
        }

        //Det här för att trycka på dina omdömen
        val clickMe12 = findViewById<ImageButton>(R.id.imageButtonMain30)
        clickMe12.setOnClickListener{
            val Intent = Intent(this, ForumPost::class.java)
            startActivity(Intent)
        }

        val clickMe13 = findViewById<ImageButton>(R.id.imageButtonMain31)
        clickMe13.setOnClickListener{
            val Intent = Intent(this, ForumPost2::class.java)
            startActivity(Intent)
        }


        val clickMe14 = findViewById<ImageButton>(R.id.imageButtonMain32)
        clickMe14.setOnClickListener{
            val Intent = Intent(this, ForumPost3::class.java)
            startActivity(Intent)
        }

        val clickMe15 = findViewById<ImageButton>(R.id.imageButtonMain33)
        clickMe15.setOnClickListener{
            val Intent = Intent(this, ForumPost4::class.java)
            startActivity(Intent)
        }

        val clickMe16 = findViewById<ImageButton>(R.id.imageButtonMain34)
        clickMe16.setOnClickListener{
            val Intent = Intent(this, ForumPost5::class.java)
            startActivity(Intent)
        }


        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.bottom_navigation)
        bottomNavigationView.selectedItemId = R.id.bottom_home

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