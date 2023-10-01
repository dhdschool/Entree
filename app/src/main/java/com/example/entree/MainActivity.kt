package com.example.entree

import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.activity.ComponentActivity
import androidx.fragment.app.Fragment
import org.json.JSONObject
import java.io.File

class MainActivity : ComponentActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var prefs = getSharedPreferences(
            "com.example.app", MODE_PRIVATE
        )
        prefs.edit().clear().commit();
        findViewById<Button>(R.id.beginButton)
            .setOnClickListener {
                val i = Intent(this, PageActivity::class.java)
                startActivity(i)
            }
        }
    fun jsonDataSort(){
        val jsonFile = File("food.json")
        val foodObject = JSONObject(jsonFile.readText())
    }

}