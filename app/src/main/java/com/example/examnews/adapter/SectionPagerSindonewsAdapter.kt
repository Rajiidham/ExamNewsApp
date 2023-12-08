package com.example.examnews.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.examnews.SindonewsFragment
import com.example.examnews.detailSindonews.SindonewsDaerahFragment
import com.example.examnews.detailSindonews.SindonewsInternationalFragment
import com.example.examnews.detailSindonews.SindonewsMetroFragment
import com.example.examnews.detailSuara.SuaraEntertainmentFragment
import com.example.examnews.detailSuara.SuaraTerbaruFragment

class SectionPagerSindonewsAdapter(fa: FragmentActivity) : FragmentStateAdapter(fa)  {
    override fun getItemCount(): Int = 3

    override fun createFragment(position: Int): Fragment {
        return when(position) {
            0 -> SindonewsMetroFragment()
            1 -> SindonewsInternationalFragment()
            2 -> SindonewsDaerahFragment()
            else -> SindonewsMetroFragment()
        }
    }
}