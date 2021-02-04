package com.example.carrent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.example.carrent.fragments.HomeFragment
import com.example.carrent.fragments.InfoFragment
import com.example.carrent.fragments.NewFragment
import com.google.android.material.bottomnavigation.BottomNavigationView
import kotlinx.android.synthetic.main.activity_third.*

class ThirdActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)


        val firstFragment=HomeFragment()
        val secondFragment=InfoFragment()
        val thirdFragment=NewFragment()

        setCurrentFragment(firstFragment)

        nav_view.setOnNavigationItemSelectedListener {
            when(it.itemId){
                R.id.navigation_home->setCurrentFragment(firstFragment)
                R.id.navigation_info->setCurrentFragment(secondFragment)
                R.id.navigation_new->setCurrentFragment(thirdFragment)

            }
            true
        }

    }

    private fun setCurrentFragment(fragment: Fragment)=
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.nav_host_fragment,fragment)
            commit()
        }



    }
