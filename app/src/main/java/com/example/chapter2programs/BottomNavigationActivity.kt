package com.example.chapter2programs

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.example.chapter2programs.fragments.FavouriteFragment
import com.example.chapter2programs.fragments.HomeFragment
import com.example.chapter2programs.fragments.SettingFragment
import kotlinx.android.synthetic.main.activity_bottom_navigation.bottom_navigation

class BottomNavigationActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bottom_navigation)

        val homeFragment = HomeFragment()
        val settingFragment = SettingFragment()
        val favouriteFragment = FavouriteFragment()

        makeCurrentFragment(homeFragment)

        bottom_navigation.setOnItemSelectedListener { item ->
            when (item.itemId){
                R.id.ic_home -> makeCurrentFragment(homeFragment)
                R.id.ic_fav -> makeCurrentFragment(favouriteFragment)
                R.id.ic_settings -> makeCurrentFragment(settingFragment)
            }
            true
        }
    }

    private fun makeCurrentFragment(fragment: Fragment) =
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.fl_wrapper, fragment)
            commit()
        }
    }