package com.example.entree


import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Button
import android.widget.ImageButton
import androidx.activity.ComponentActivity
import androidx.fragment.app.Fragment
import org.json.JSONArray
import org.json.JSONObject

class NutritionActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_nutrition)

        findViewById<ImageButton>(R.id.matchReturn)
            .setOnClickListener {
                val i = Intent(this, PageActivity::class.java)
                startActivity(i)
            }
        val json: JSONArray = getJSON()

        if(json != null){
        val temp = json.getJSONObject(0)
        System.out.println(temp)
        if(temp != null){
        initDms(temp, R.drawable.applejuice)}}
    }

    fun getJSON() : JSONArray {
        val jsonObject = (::KotlinJsonObject)()
        jsonObject.returnJson()
        return jsonObject.obj
    }

    fun initDms(foodName: JSONObject, imgSrc: Int) {
        val nameTextView = findViewById<TextView>(R.id.messageView0)
        val calorieTextView = findViewById<TextView>(R.id.messageView1)

        nameTextView.text = foodName.getString("name")
        calorieTextView.text = foodName.getDouble("calories").toString()

    }

//    fun editMessage(foodDatum: String){
//
//        for (i in 1..11){
//            val msgId = "messageView$i"
//            val msgTextView = findViewById<View>(R.id.msgId)
//        }
    // Dear Dow: this obviously doesn't work. There are ways to do it, but Its too late and I want to sleep.
    // The whole constructing new messages thing didn't work. It's not worth the effort to find a solution, especially considering it wouldn't make a functional difference.
    // I did seem to find a way to get json objects and strings but im gonna be honest, I didn't really test it or anything. I wanted to get a little bit of everything done.
    // I'm writing the note because Im either going to be very late or not show up at all. It's 3:30 am. Brain Mush.
    // Note: they seem to really not want you to change xml text after runtime for some reason. Like, everything in strings.xml for example is permanent. Figure that out FIRST!

//}
}
