package com.example.entree


import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.ComponentActivity
import org.json.JSONArray
import org.json.JSONObject


class NutritionActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        var prefs = getSharedPreferences(
            "com.example.app", MODE_PRIVATE
        )

        setContentView(R.layout.activity_nutrition)

        findViewById<ImageButton>(R.id.matchReturn)
            .setOnClickListener {
                val i = Intent(this, PageActivity::class.java)
                startActivity(i)
            }
        val json: JSONArray = getJSON()

        var currentFood: Int = prefs.getInt("com.example.app.currentFood", 0)


        if(json != null){
        val temp = json.getJSONObject(currentFood)
        System.out.println(temp)
        if(temp != null){
            currentFood = currentFood % json.length()
            val d = temp.getString("name").filter{!it.isWhitespace()}
            val imageId = getResources().getIdentifier(d, "drawable", this.getPackageName())
        initDms(temp, imageId)}}

        currentFood = currentFood + 1
        prefs.edit().putInt("com.example.app.currentFood", currentFood).commit()
    }

    override fun onBackPressed() {
        return
    }

    fun getJSON() : JSONArray {
        val jsonObject = (::KotlinJsonObject)()
        jsonObject.returnJson()
        return jsonObject.obj
    }

    fun initDms(foodName: JSONObject, imgSrc: Int) {
        val bigNameView = findViewById<TextView>(R.id.matchName)
        val nameTextView = findViewById<TextView>(R.id.messageView2)
        val calorieTextView = findViewById<TextView>(R.id.messageView3)
        val servingSizeView = findViewById<TextView>(R.id.messageView4)
        val fatTotalTextView = findViewById<TextView>(R.id.messageView5)
        val fatSatTextView = findViewById<TextView>(R.id.messageView6)
        val proteinTextView = findViewById<TextView>(R.id.messageView7)
        val sodiumTextView = findViewById<TextView>(R.id.messageView8)
        val potassiumTextView = findViewById<TextView>(R.id.messageView9)
        val cholTextView = findViewById<TextView>(R.id.messageView10)
        val carbTextView = findViewById<TextView>(R.id.messageView11)
        val sugarTextView = findViewById<TextView>(R.id.messageView12)



        bigNameView.text = foodName.getString("name")
        nameTextView.text = "Hi, my name is " + foodName.getString("name") + "!"
        calorieTextView.text = "I have " + foodName.getDouble("calories").toString() + " calories!"
        servingSizeView.text = "My serving size is " + foodName.getDouble("serving_size_g").toString() + " grams!"
        fatTotalTextView.text = "The total fat is " + foodName.getDouble("fat_total_g") + " grams!"
        fatSatTextView.text = "The total saturated fat is " + foodName.getDouble("fat_saturated_g") + " grams!"
        proteinTextView.text = "The total protein is " + foodName.getDouble("protein_g").toString() + " grams!"
        sodiumTextView.text = "The total sodium is " + foodName.getDouble("sodium_mg").toString() + " milligrams!"
        potassiumTextView.text = "The total potassium is " + foodName.getDouble("potassium_mg").toString() + " milligrams!"
        cholTextView.text = "The total cholesterol is " + foodName.getDouble("cholesterol_mg").toString() + " milligrams!"
        carbTextView.text = "The total carbohydrates is " + foodName.getDouble("carbohydrates_total_g").toString() + " grams!"
        sugarTextView.text = "The total sugar is " + foodName.getDouble("sugar_g").toString() + " grams!"


        val arr : IntArray = intArrayOf(R.id.textPfp1,
            R.id.textPfp2, R.id.textPfp3, R.id.textPfp4,
            R.id.textPfp5, R.id.textPfp6, R.id.textPfp7,
            R.id.textPfp8, R.id.textPfp9, R.id.textPfp10,
            R.id.textPfp11, R.id.textPfp12, R.id.matchPfp)
        for(item in arr){
            val itemImageView = findViewById<ImageView>(item)
            itemImageView.setImageResource(imgSrc)
        }
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
