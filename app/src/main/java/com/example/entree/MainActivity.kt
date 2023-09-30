package com.example.entree

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.ComponentActivity
import androidx.compose.material3.ScrollableTabRow
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import androidx.viewpager2.widget.ViewPager2

class MainActivity : ComponentActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val i = Intent(this, PageActivity::class.java)
        startActivity(i)

        //var myIntent = Intent(this, PageActivity::class.java)
        //startActivity(myIntent)
    }
}
//private const val NUM_PAGES = 5
//class ScreenSlidePageFragment : Fragment(){
//    override fun onCreateView(
//        inflater: LayoutInflater,
//        container: ViewGroup?,
//        savedInstanceState: Bundle?
//    ) : View = inflater.inflate(R.layout.activity_page, container, false)
//}
//
//class ScreenSliderPageActivity : FragmentActivity(){
//    private lateinit var viewPager : ViewPager2
//    override fun onCreate(savedInstanceState: Bundle?){
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_scroller)
//        viewPager= findViewById(R.id.pager)
//        val pagerAdapter = ScreenSliderPageAdapter(this)
//        viewPager.adapter = pagerAdapter
//    }
//    override fun onBackPressed(){
//        if (viewPager.currentItem == 0){
//            super.onBackPressed()
//        }
//        else{
//            viewPager.currentItem = viewPager.currentItem - 1
//        }
//    }
//
//    private inner class ScreenSliderPageAdapter(fa: FragmentActivity) : FragmentStateAdapter(fa){
//        override fun getItemCount(): Int = NUM_PAGES
//        override fun createFragment(position: Int): Fragment = ScreenSlidePageFragment()
//    }
//}