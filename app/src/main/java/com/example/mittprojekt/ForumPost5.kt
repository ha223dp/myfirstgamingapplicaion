
package com.example.mittprojekt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button


class  ForumPost5: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_forum_post5)
//Jag höll temat på alla activiter på det sättet för jag insåg att det var bästa sättet att hålla det simpelt och effektivt för mig att inte ha för många färger och teman som skulle ta för mycket tid
        //för jag fann att det statiska och logiken på allt tog för lång tid för att kunna tänka på ux:n
//Jag ska bara kunna se denna post
        val buttonSearch = findViewById<Button>(R.id.goBackForum5)
        buttonSearch.setOnClickListener {
            finish()
        }




    }
}
