package com.example.entree

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.ComponentActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager.widget.ViewPager
import androidx.viewpager2.adapter.FragmentStateAdapter
import androidx.viewpager2.widget.ViewPager2
import org.json.JSONArray
import org.json.JSONObject
import java.io.File

class ScreenSlidePageFragment(activityPageId : Int) : Fragment(){
    public final val activityPageId : Int = activityPageId
    override fun onCreateView(inflater: LayoutInflater,
                              container: ViewGroup?,
                              savedInstanceState: Bundle?
    ): View{
        val activityPageId : Int = this.activityPageId
        return inflater.inflate(activityPageId, container, false)
    }
}

private const val NUM_PAGES = 3

class PageActivity : FragmentActivity() {


    private lateinit var viewPager: ViewPager2

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_scroller)


        viewPager = findViewById(R.id.pager)
        viewPager.currentItem = 1

        val pagerAdapter = ScreenSlidePagerAdapter(this)

        viewPager.adapter = pagerAdapter
        viewPager.setCurrentItem(1)
        viewPager.registerOnPageChangeCallback(object: ViewPager2.OnPageChangeCallback(){
            override fun onPageSelected(position: Int) {
                if(position==2){

                    var prefs = getSharedPreferences(
                        "com.example.app", MODE_PRIVATE
                    )
                    val setter = prefs.getInt("com.example.app.currentFood", 0)
                    prefs.edit().putInt("com.example.app.currentFood", setter+1).commit()

                    val i = Intent(this@PageActivity, PageActivity::class.java)
                    startActivity(i)
                }
                if(position==0){
                    val i = Intent(this@PageActivity, NutritionActivity::class.java)
                    startActivity(i)
                }
                super.onPageSelected(position)
            }
        })

    }


    override fun onBackPressed() {
        return
//        if(viewPager.currentItem==0){
//            super.onBackPressed()
//        }
//        else {
//            viewPager.currentItem = viewPager.currentItem - 1
//        }
    }

    fun getCurrentItem() : Int{
        return this.viewPager.getCurrentItem()
    }

    fun setCurrentItem(intSet: Int){
        this.viewPager.setCurrentItem(intSet)
    }


    private inner class ScreenSlidePagerAdapter(fa: PageActivity) : FragmentStateAdapter(fa) {
        private val fa = fa
        override fun getItemCount(): Int = NUM_PAGES

        override fun createFragment(position: Int): Fragment {

            val arr: IntArray = intArrayOf(
                R.layout.activity_scroller,
                R.layout.activity_page,
                R.layout.activity_scroller
            )
            val arrPosition = arr[position]


            val currentView = ScreenSlidePageFragment(arrPosition)
            //if (position == 1) {


                var prefs = getSharedPreferences(
                    "com.example.app", MODE_PRIVATE
                )

                var currentFood: Int = prefs.getInt("com.example.app.currentFood", 0)
                val json: JSONArray = getJSON()
                if (json != null) {
                    val temp = json.getJSONObject(currentFood)
                    if (temp != null) {
                        if(currentFood >= 40) currentFood=0
                        val d = temp.getString("name").filter { !it.isWhitespace() }
                        val imageId =
                            getResources().getIdentifier(d, "drawable", fa.getPackageName())
                        initPage(temp.getString("name"), imageId)
                    }
                }
            //}
            return currentView
        }
            }





        fun initPage(nameText: String, imgSrc : Int){
            if(findViewById<TextView>(R.id.textView) != null){
                val nameTextField = findViewById<TextView>(R.id.textView)
                nameTextField.text = nameText
            }
            if(findViewById<ImageView>(R.id.imageView) != null){
                val imageViewField = findViewById<ImageView>(R.id.imageView)
                imageViewField.setImageResource(imgSrc)
            }
        }

        fun getJSON() : JSONArray {
            val jsonObject = (::KotlinJsonObject)()
            jsonObject.returnJson()
            return jsonObject.obj
        }
    }




