package com.example.orderpizza

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import com.example.orderpizza.datas.Store
import kotlinx.android.synthetic.main.activity_show_store_detail.*
import kotlinx.android.synthetic.main.activity_show_store_detail.txtPhoneNum
import kotlinx.android.synthetic.main.activity_show_store_detail.txtStoreName
import kotlinx.android.synthetic.main.store_list_item.*

class ShowStoreDetailActivity : BaseActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_show_store_detail)
        setValues()
        setupEvents()
    }

    override fun setValues() {
        val theStore = intent.getSerializableExtra("theStore") as Store

        txtPhoneNum.text = theStore.phoneNum
        txtStoreName.text = "${theStore.name}"
        Glide.with(mContext).load(theStore.logo).into(photoLogo)
    }

    override fun setupEvents() {

    }
}
