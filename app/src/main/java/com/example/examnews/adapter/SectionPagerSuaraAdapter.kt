package com.example.examnews.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.examnews.detailSuara.SuaraEntertainmentFragment
import com.example.examnews.detailSuara.SuaraOtomotifFragment
import com.example.examnews.detailSuara.SuaraTerbaruFragment

class SectionPagerSuaraAdapter(fa: FragmentActivity) : FragmentStateAdapter(fa)  {
    override fun getItemCount(): Int = 3

    override fun createFragment(position: Int): Fragment {
        return when(position) {
            0 -> SuaraTerbaruFragment()
            1 -> SuaraOtomotifFragment()
            2 -> SuaraEntertainmentFragment()
            else -> SuaraTerbaruFragment()
        }
    }
}