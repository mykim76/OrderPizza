package com.example.orderpizza

import android.os.Bundle
import com.example.orderpizza.adapters.StoreFragmentPagerAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity() {
    lateinit var myPagerAdapter : StoreFragmentPagerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setValues()
        setupEvents()
    }

    override fun setValues() {
        myPagerAdapter = StoreFragmentPagerAdapter(supportFragmentManager)
        storeViewPager.adapter = myPagerAdapter

        myTab.setupWithViewPager(storeViewPager)
    }

    override fun setupEvents() {

    }
}
