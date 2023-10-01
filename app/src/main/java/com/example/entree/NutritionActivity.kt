package com.example.entree


import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Button
import androidx.activity.ComponentActivity
import androidx.fragment.app.Fragment

class NutritionActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_nutrition)

        findViewById<Button>(R.id.matchReturn)
            .setOnClickListener {
                val i = Intent(this, PageActivity::class.java)
                startActivity(i)
            }
    }

    fun initDms (foodName: String, imgSrc: String, foodData: String){
        val nameTextView = findViewById<View>(R.id.messageView0)

    }

    fun editMessage(foodDatum: String){

        for (i in 1..11){
            val msgId = "messageView$i"
            val msgTextView = findViewById<View>(R.id.msgId)
        }
        // Dear Dow: this obviously doesn't work. There are ways to do it, but Its too late and I want to sleep.
        // The whole constructing new messages thing didn't work. It's not worth the effort to find a solution, especially considering it wouldn't make a functional difference.
        // I did seem to find a way to get json objects and strings but im gonna be honest, I didn't really test it or anything. I wanted to get a little bit of everything done.
        // I'm writing the note because Im either going to be very late or not show up at all. It's 3:30 am. Brain Mush.
        // Note: they seem to really not want you to change xml text after runtime for some reason. Like, everything in strings.xml for example is permanent. Figure that out FIRST!

    }
}
