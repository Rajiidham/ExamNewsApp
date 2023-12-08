package com.example.examnews.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.examnews.detailTempo.TempoBisnisFragment
import com.example.examnews.detailTempo.TempoDuniaFragment
import com.example.examnews.detailTempo.TempoNasionalFragment

class SectionPagerTempoAdapter(fa: FragmentActivity) : FragmentStateAdapter(fa)  {
    override fun getItemCount(): Int = 3

    override fun createFragment(position: Int): Fragment {
        return when(position) {
            0 -> TempoNasionalFragment()
            1 -> TempoDuniaFragment()
            2 -> TempoBisnisFragment()
            else -> TempoNasionalFragment()
        }
    }
}