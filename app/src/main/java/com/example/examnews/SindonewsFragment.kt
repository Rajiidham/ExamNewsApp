package com.example.examnews

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.examnews.adapter.SectionPagerSindonewsAdapter
import com.example.examnews.databinding.FragmentSindonewsBinding
import com.google.android.material.tabs.TabLayoutMediator

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [sindonewsFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class SindonewsFragment : Fragment() {
    lateinit var binding: FragmentSindonewsBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentSindonewsBinding.inflate(layoutInflater)
        setUpViewPager()
        return binding.root


    }

    private fun setUpViewPager() {
        val tabList = arrayOf(
            "Metro",
            "International",
            "Daerah"
        )

        val sectionPagerAdapter = SectionPagerSindonewsAdapter(requireActivity())
        binding.vpNews.adapter = sectionPagerAdapter

        TabLayoutMediator(binding.tabs, binding.vpNews){tabs, page ->
            tabs.text = tabList[page]
        }.attach()
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }




}
