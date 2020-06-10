package com.example.orderpizza

import android.Manifest
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.bumptech.glide.Glide
import com.example.orderpizza.datas.Store
import com.gun0912.tedpermission.PermissionListener
import com.gun0912.tedpermission.TedPermission
import kotlinx.android.synthetic.main.activity_show_store_detail.*
import kotlinx.android.synthetic.main.activity_show_store_detail.txtPhoneNum
import kotlinx.android.synthetic.main.activity_show_store_detail.txtStoreName
import kotlinx.android.synthetic.main.store_list_item.*

class ShowStoreDetailActivity : BaseActivity() {


    lateinit var theStore : Store

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_show_store_detail)
        setValues()
        setupEvents()
    }

    override fun setValues() {
        theStore = intent.getSerializableExtra("theStore") as Store

        txtPhoneNum.text = theStore.phoneNum
        txtStoreName.text = "${theStore.name}"
        Glide.with(mContext).load(theStore.logo).into(photoLogo)
    }

    override fun setupEvents() {

        btnCall.setOnClickListener {
            //권한 체크
            val permissionListener = object : PermissionListener{
                override fun onPermissionGranted() {
                    val myUri = Uri.parse( "tel:${theStore.phoneNum}")
                    val myIntent = Intent(Intent.ACTION_CALL, myUri)
                    startActivity(myIntent)

                }

                override fun onPermissionDenied(deniedPermissions: MutableList<String>?) {

                    Toast.makeText(mContext,"권한 거부로 전화 불가능", Toast.LENGTH_SHORT).show()

                }

            }

            TedPermission.with(mContext)
                .setPermissionListener(permissionListener)
                .setDeniedMessage("권한을 거부하면 통화 할 수 없습니다.[설정]>[권한]에서 권한설정 해주세요.")
                .setPermissions(Manifest.permission.CALL_PHONE)
                .check()
        }

    }
}
