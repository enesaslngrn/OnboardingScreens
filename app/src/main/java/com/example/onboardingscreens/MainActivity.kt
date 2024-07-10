package com.example.onboardingscreens

import android.content.Context
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.example.onboardingscreens.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Onboarding Screens

        val sharedPref = getSharedPreferences("onboardscreen",Context.MODE_PRIVATE).getBoolean("seen",false)
        if (sharedPref){
            changeFragment(HomeFragment())
        }else{
            changeFragment(ViewPagerFragment())
        }

        /*
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.fragmentContainerView,HomeFragment())
            commit()
        }

         */
    }

    private fun changeFragment(fragment: Fragment){
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.fragmentContainerView,fragment)
            commit()
        }
    }
}