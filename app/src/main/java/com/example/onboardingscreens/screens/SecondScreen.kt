package com.example.onboardingscreens.screens

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.onboardingscreens.R
import com.example.onboardingscreens.ViewPagerFragment
import com.example.onboardingscreens.databinding.FragmentSecondScreenBinding


class SecondScreen : Fragment() {
    private lateinit var binding : FragmentSecondScreenBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSecondScreenBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.tvNext.setOnClickListener {
            ViewPagerFragment.viewPager?.currentItem = 2
        }
    }
}