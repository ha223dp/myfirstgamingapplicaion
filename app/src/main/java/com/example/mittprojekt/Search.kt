package com.example.mittprojekt

import android.annotation.SuppressLint
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.MediaController
import android.widget.VideoView
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class Search : AppCompatActivity() {

//Jag höll temat på alla activiter på det sättet för jag insåg att det var bästa sättet att hålla det simpelt och effektivt för mig att inte ha för många färger och teman som skulle ta för mycket tid
    //för jag fann att det statiska och logiken på allt tog för lång tid för att kunna tänka på ux:n
//jag var tvungen att ta bort filternet i min första prototyp, för det visades sig vara utmanade, samt att den tjänsten jag har gjorde nu är välidgt buggig som det är,
    //todo jag är tvungen att potienciell lägga en funktion där man ska lägga in en ny knapp där man ska kunna lägga in videos, så att det sparas på det flödet.

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_search)

        val videoView = findViewById<VideoView>(R.id.xml_videoView1)
        val packageName="android.resource://" + getPackageName() + "/" + R.raw.highfirushvideo
        val uri= Uri.parse(packageName)
        videoView.setVideoURI(uri)
        val mediaController = MediaController(this)
        videoView.setMediaController(mediaController)

        val videoView2 = findViewById<VideoView>(R.id.xml_videoView2)
        val packageName1="android.resource://" + getPackageName() + "/" + R.raw.godofwarvideo
        val uri1= Uri.parse(packageName1)
        videoView2.setVideoURI(uri1)
        val mediaController1 = MediaController(this)
        videoView2.setMediaController(mediaController1)

        val videoView3 = findViewById<VideoView>(R.id.xml_videoView3)
        val packageName3="android.resource://" + getPackageName() + "/" + R.raw.sekirovideo1
        val uri2= Uri.parse(packageName3)
        videoView3.setVideoURI(uri2)
        val mediaController3 = MediaController(this)
        videoView3.setMediaController(mediaController3)

        val videoView4 = findViewById<VideoView>(R.id.xml_videoView4)
        val packageName4="android.resource://" + getPackageName() + "/" + R.raw.liesofpvideo1
        val uri4= Uri.parse(packageName4)
        videoView4.setVideoURI(uri4)
        val mediaController4 = MediaController(this)
        videoView4.setMediaController(mediaController4)

//val buttonSearch = findViewById<Button>(R.id.goBackSearch)
    //   buttonSearch.setOnClickListener{finish()}


        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.bottom_navigation)
        bottomNavigationView.selectedItemId = R.id.bottom_search

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





