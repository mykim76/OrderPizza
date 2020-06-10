package com.example.orderpizza.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import com.bumptech.glide.Glide
import com.example.orderpizza.R
import com.example.orderpizza.datas.Store
import de.hdodenhof.circleimageview.CircleImageView

class StoreListAdapter(context: Context, resId:Int, list:List<Store>):ArrayAdapter<Store>(context,resId,list){
    val mContext = context
    val mList=list
    val inf = LayoutInflater.from(mContext)

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var tempRow = convertView

        tempRow?.let {
            //널이 아닐 땐 그냥 지나감 =>재활용 할 뷰가 있음
        }.let {

            //널인 경우
            tempRow = inf.inflate(R.layout.store_list_item, null)
        }

        val row = tempRow!!

        val data = mList[position]
        val imgLogo = row.findViewById<CircleImageView>(R.id.imgLogo)
        val txtStoreName = row.findViewById<TextView>(R.id.txtStoreName)
        val txtPhoneNum = row.findViewById<TextView>(R.id.txtPhoneNum)

        txtStoreName.text = data.name
        txtPhoneNum.text = data.phoneNum
//        Glide
//            .with(myFragment)
//            .load(url)
//            .centerCrop()
//            .placeholder(R.drawable.loading_spinner)
//            .into(myImageView);
        Glide.with(mContext).load(data.logo).centerCrop().into(imgLogo)


//        imgLogo.set .text="${data.name}(${data.getAge(2020)}세)"
//        if(data.isMale) {
//            genderTxt.text = "남자"
//        }
//        else{
//            genderTxt.text = "여자"
//        }

        return row

    }

}