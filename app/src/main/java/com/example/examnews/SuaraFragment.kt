package com.example.examnews

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.examnews.adapter.SectionPagerSuaraAdapter
import com.example.examnews.databinding.FragmentSuaraBinding
import com.google.android.material.tabs.TabLayoutMediator

class SuaraFragment : Fragment() {
    lateinit var binding: FragmentSuaraBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentSuaraBinding.inflate(layoutInflater)
        setUpViewPager()
        return binding.root


    }

    private fun setUpViewPager() {
        val tabList = arrayOf(
            "Terbaru",
            "Otomotif",
            "Entertainment"
        )

        val sectionPagerAdapter = SectionPagerSuaraAdapter(requireActivity())
        binding.vpNews.adapter = sectionPagerAdapter

        TabLayoutMediator(binding.tabs, binding.vpNews){tabs, page ->
            tabs.text = tabList[page]
        }.attach()
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }




}
