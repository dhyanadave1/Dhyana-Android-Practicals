package com.example.chapter2programs

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.chapter2programs.adapters.ViewPagerAdapter
import com.google.android.material.tabs.TabLayoutMediator
import kotlinx.android.synthetic.main.activity_view_pager.tab_layout
import kotlinx.android.synthetic.main.activity_view_pager.view_pager_2

class ViewPagerActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_pager)
        val adapter = ViewPagerAdapter(supportFragmentManager, lifecycle)
        view_pager_2.adapter = adapter
        TabLayoutMediator(tab_layout, view_pager_2) {tab, position ->
            when (position) {
                0 -> {
                    tab.text = getString(R.string.first)
                } 1 -> {
                    tab.text = getString(R.string.second)
                } 2 -> {
                    tab.text = getString(R.string.third)
                }
            }
        }.attach()
    }
}