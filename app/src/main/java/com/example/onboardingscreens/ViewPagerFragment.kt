package com.example.onboardingscreens

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.viewpager2.widget.ViewPager2
import com.example.onboardingscreens.adapter.ViewPagerAdapter
import com.example.onboardingscreens.databinding.FragmentViewPagerBinding


class ViewPagerFragment : Fragment() {
    private lateinit var binding: FragmentViewPagerBinding
    private lateinit var adapter: ViewPagerAdapter
    companion object {
        var viewPager: ViewPager2? = null
    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentViewPagerBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        adapter = ViewPagerAdapter(requireActivity().supportFragmentManager,lifecycle)
        binding.viewPager.adapter = adapter

        viewPager = binding.viewPager
    }

    override fun onDestroyView() {
        super.onDestroyView()
        viewPager = null // Avoid memory leak
    }
}