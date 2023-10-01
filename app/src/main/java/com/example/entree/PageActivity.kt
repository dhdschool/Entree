package com.example.entree

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.activity.ComponentActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager.widget.ViewPager
import androidx.viewpager2.adapter.FragmentStateAdapter
import androidx.viewpager2.widget.ViewPager2

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
                    val i = Intent(this@PageActivity, PageActivity::class.java)
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

        override fun createFragment(position: Int): Fragment{

            val arr: IntArray = intArrayOf(R.layout.activity_scroller, R.layout.activity_page, R.layout.activity_page)
            val arrPosition = arr[position]
            val currentView = ScreenSlidePageFragment(arrPosition)




            return currentView
        }
    }
}
