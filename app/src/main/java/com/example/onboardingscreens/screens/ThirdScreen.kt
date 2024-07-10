package com.example.onboardingscreens.screens

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.onboardingscreens.HomeFragment
import com.example.onboardingscreens.R
import com.example.onboardingscreens.databinding.FragmentThirdScreenBinding

class ThirdScreen : Fragment() {
    private lateinit var binding : FragmentThirdScreenBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentThirdScreenBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.tvFinish.setOnClickListener {
            onBoardScreenSeen()
            requireActivity().supportFragmentManager.beginTransaction().apply {
                replace(R.id.fragmentContainerView,HomeFragment())
                commit()
            }
        }
    }

    private fun onBoardScreenSeen(){
        val sharedPref = requireActivity().getSharedPreferences("onboardscreen",Context.MODE_PRIVATE)
        val editor = sharedPref.edit()
        editor.putBoolean("seen",true)
        editor.apply()
    }
}