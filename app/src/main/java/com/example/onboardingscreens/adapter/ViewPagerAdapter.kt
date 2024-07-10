package com.example.onboardingscreens.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.onboardingscreens.screens.FirstScreen
import com.example.onboardingscreens.screens.SecondScreen
import com.example.onboardingscreens.screens.ThirdScreen

class ViewPagerAdapter(fragmentManager: FragmentManager, lifecycle: Lifecycle) : FragmentStateAdapter(fragmentManager,lifecycle) {

    private val fragments = listOf(
        FirstScreen(),SecondScreen(),ThirdScreen()
    )
    override fun getItemCount(): Int {
        return fragments.size
    }

    override fun createFragment(position: Int): Fragment = fragments[position]
}