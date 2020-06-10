package com.example.orderpizza.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.orderpizza.BaseFragment
import com.example.orderpizza.R
import com.example.orderpizza.adapters.StoreFragmentPagerAdapter
import com.example.orderpizza.adapters.StoreListAdapter
import com.example.orderpizza.datas.Store
import kotlinx.android.synthetic.main.fragment_chicken_store.*

class ChickenFragment:BaseFragment() {

    val chickenStores = ArrayList<Store>()
    lateinit var storeAdapter : StoreListAdapter

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_chicken_store,container,false)
    }
    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        setValues()
        setupEvents()
    }

    override fun setValues() {

        AddPizzaStore()
        storeAdapter = StoreListAdapter(mContext, R.layout.store_list_item,chickenStores)
        chickenListView.adapter = storeAdapter
    }

    override fun setupEvents() {

    }

    fun AddPizzaStore() {

        chickenStores.add(
            Store(
                "https://lh3.googleusercontent.com/proxy/Tt6Q_DL4CMLnzx0cZGjaZbDTv2OvdZtj_JWSYblswjMadlQAzPY7IFSA13z32Gde9mBNM3xsMN2e2JAbmD1JFtHKqRqyTTScRWiGCtS5p0K7hkSQxN--Lf9lHCo7TPp8fA004sgh-H8fXX06U38QeU2zKolQ0A01LoI_28UvVMPvxWHbnpP36zFZRzXhFYexS1QAy_mX2JSxqEIO35p6a5pFyo5w0hV6Er8",
                "미스터피자",
                "031-1111-2222"
            )
        )
        chickenStores.add(
            Store(
                "https://img1.daumcdn.net/thumb/R800x0/?scode=mtistory2&fname=https%3A%2F%2Fk.kakaocdn.net%2Fdn%2FnkQca%2FbtqwVT4rrZo%2FymhFqW9uRbzrmZTxUU1QC1%2Fimg.jpg",
                "피자헛",
                "031-222-2222"
            )
        )
        chickenStores.add(
            Store(
                "http://mblogthumb2.phinf.naver.net/20160530_65/ppanppane_1464617766007O9b5u_PNG/%C6%C4%C6%C4%C1%B8%BD%BA_%C7%C7%C0%DA_%B7%CE%B0%ED_%284%29.png?type=w800",
                "파파존스",
                "031-333-2222"
            )
        )
        chickenStores.add(
            Store(
                "https://pbs.twimg.com/profile_images/1098371010548555776/trCrCTDN_400x400.png",
                "도미노",
                "031-444-2222"
            )
        )
    }
}