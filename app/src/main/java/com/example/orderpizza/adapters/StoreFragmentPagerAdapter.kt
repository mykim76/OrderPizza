package com.example.orderpizza.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.example.orderpizza.fragments.ChickenFragment
import com.example.orderpizza.fragments.PizzaFragment

class StoreFragmentPagerAdapter(fm:FragmentManager):FragmentPagerAdapter(fm) {
    override fun getItem(position: Int): Fragment {
        return when(position)
        {
            0-> PizzaFragment()
            else -> ChickenFragment()
        }
    }

    override fun getCount(): Int {
        return 2
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return when(position)
        {
            0-> "Pizza Store"
            else -> "Chicken Store"
        }
    }
}