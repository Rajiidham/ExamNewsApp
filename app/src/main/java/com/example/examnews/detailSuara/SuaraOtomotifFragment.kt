package com.example.examnews.detailSuara

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.examnews.NewsViewModel
import com.example.examnews.NewsViewModelFactory
import com.example.examnews.R
import com.example.examnews.adapter.NewsAdapter
import com.example.examnews.data.repository.NewsRepository
import com.example.examnews.databinding.FragmentSuaraOtomotifBinding
import com.example.examnews.databinding.FragmentSuaraTerbaruBinding

/**
 * A simple [Fragment] subclass.
 * Use the [SuaraOtomotifFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class SuaraOtomotifFragment : Fragment() {
    lateinit var binding: FragmentSuaraOtomotifBinding
    private val suaraTerbaru: NewsViewModel by viewModels {
        NewsViewModelFactory(NewsRepository())
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentSuaraOtomotifBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val mAdapter = NewsAdapter()

        suaraTerbaru.getSuaraOtomotifNews()

        suaraTerbaru.suaraNews.observe(viewLifecycleOwner){dataNews ->
            dataNews?.data?.let { mAdapter.setData(it.posts) }
        }

        binding.rvCommonNews.apply {
            adapter = mAdapter
            layoutManager = LinearLayoutManager(requireContext())
        }
    }

}