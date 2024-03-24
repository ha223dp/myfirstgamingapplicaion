package com.example.mittprojekt

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import com.google.android.material.bottomnavigation.BottomNavigationView

class Friends : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_friends)

//Jag höll temat på alla activiter på det sättet för jag insåg att det var bästa sättet att hålla det simpelt och effektivt för mig att inte ha för många färger och teman som skulle ta för mycket tid
        //för jag fann att det statiska och logiken på allt tog för lång tid för att kunna tänka på ux:n
        //Jag var tvungen att ha alla vänner på en scrollview för jag insåg att det var lättare att göra så om en användare skulle skaffa sig fler vänner.

        //todo jag ska lägga en ny activiet där man kan lägga in mer vänner med en ny onclick
        //todo att sedan kunna ha det möjligt att kunna fixa funktionen att utöka cardviewn där en ny användare är tillagt med bild


        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.bottom_navigation)
        bottomNavigationView.selectedItemId = R.id.bottom_friends

        val clickMe10 = findViewById<ImageButton>(R.id.imageButtonFriendsId1)
        clickMe10.setOnClickListener{
            val intent = Intent(this, YourFriends::class.java)
            startActivity(intent)}

            val clickMe11 = findViewById<ImageButton>(R.id.imageButtonFriendsId2)
            clickMe11.setOnClickListener{
                val intent = Intent(this, YourFriends2::class.java)
                startActivity(intent)}

                val clickMe12 = findViewById<ImageButton>(R.id.imageButtonFriendsId3)
                clickMe12.setOnClickListener{
                    val intent = Intent(this, YourFriends3::class.java)
                    startActivity(intent)}

                    val clickMe13 = findViewById<ImageButton>(R.id.imageButtonFriendsId4)
                    clickMe13.setOnClickListener{
                        val intent = Intent(this, YourFriends4::class.java)
                        startActivity(intent)}

                        val clickMe14 = findViewById<ImageButton>(R.id.imageButtonFriendsId5)
                        clickMe14.setOnClickListener{
                            val intent = Intent(this, YourFriends5::class.java)
                            startActivity(intent)}

        val clickMe15 = findViewById<ImageButton>(R.id.imageButtonFriendsId6)
        clickMe15.setOnClickListener{
            val intent = Intent(this, YourFriends6::class.java)
            startActivity(intent)}


        val clickMe16 = findViewById<ImageButton>(R.id.friendsButtonAddFriend)
        clickMe16.setOnClickListener{
            val intent = Intent(this, AddFriend::class.java)
            startActivity(intent)}


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