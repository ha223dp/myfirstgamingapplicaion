package com.example.mittprojekt

import android.content.Intent
import android.media.RouteListingPreference
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.bottomnavigation.BottomNavigationView

class Forum : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_forum)

        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.bottom_navigation)
        bottomNavigationView.selectedItemId = R.id.bottom_forum

        val buttonSearch = findViewById<Button>(R.id.goBackForum)
        buttonSearch.setOnClickListener {
            finish()
        }

  //      List<RouteListingPreference.Item>items= new ArrayList<RouteListingPreference.Item>();
    //    items.add(new Item("Johans", "fed"))

      //  RecyclerView recyclerView = findViewById(R.id.recycleViewForForum)
      //  RecyclerView.setLayoutManager(new LinearLayoutManager(this));
      //  RecyclerView.setAdapter(new MyAdapter(getApplicationContext()))
        //todo man ska kunna ta det som folk skrev på sina spel sidor, sen ska det automatisk komma på forum sidan att utan ratingen ska vara kvar där

        val clickMe15 = findViewById<ImageButton>(R.id.imageButtonForum1)
        clickMe15.setOnClickListener{
            val Intent = Intent(this, ForumPost::class.java)
            startActivity(Intent)
        }
        val clickMe16 = findViewById<ImageButton>(R.id.imageButtonForum2)
        clickMe16.setOnClickListener{
            val Intent = Intent(this, ForumPost2::class.java)
            startActivity(Intent)
        }

        val clickMe17 = findViewById<ImageButton>(R.id.imageButtonForum3)
        clickMe17.setOnClickListener{
            val Intent = Intent(this, ForumPost3::class.java)
            startActivity(Intent)
        }

        val clickMe18 = findViewById<ImageButton>(R.id.imageButtonForum4)
        clickMe18.setOnClickListener{
            val Intent = Intent(this, ForumPost4::class.java)
            startActivity(Intent)
        }

        val clickMe19 = findViewById<ImageButton>(R.id.imageButtonForum5)
        clickMe19.setOnClickListener{
            val Intent = Intent(this, ForumPost5::class.java)
            startActivity(Intent)
        }

        val clickMe20 = findViewById<ImageButton>(R.id.imageButtonForum6)
        clickMe20.setOnClickListener{
            val Intent = Intent(this, ForumPost6::class.java)
            startActivity(Intent)
        }

        val clickMe21 = findViewById<ImageButton>(R.id.imageButtonForum7)
        clickMe21.setOnClickListener{
            val Intent = Intent(this, ForumPost7::class.java)
            startActivity(Intent)
        }



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

