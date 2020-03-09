package com.e.spacex.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.e.spacex.R

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

//    private fun setupRecyclerView() =
//        newsAdapter?.apply { notifyDataSetChanged() } ?: run {
//            newsAdapter = NewsAdapter(articleArrayList)
//            with(rvNews) {
//                layoutManager = LinearLayoutManager(context)
//                adapter = newsAdapter
//                itemAnimator = DefaultItemAnimator()
//                isNestedScrollingEnabled = true
//            }
//        }
}
