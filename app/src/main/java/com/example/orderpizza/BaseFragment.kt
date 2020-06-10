package com.example.orderpizza

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment

abstract class BaseFragment : Fragment() {

    // 화면을 Intent 생성을 위해 선언 시작
    lateinit var mContext : Context
    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        mContext = activity as Context

    }
    abstract fun setValues()
    abstract fun setupEvents()
}