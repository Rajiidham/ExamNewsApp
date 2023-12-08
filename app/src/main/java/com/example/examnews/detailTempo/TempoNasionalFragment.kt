package com.example.examnews.detailTempo

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.examnews.NewsViewModel
import com.example.examnews.NewsViewModelFactory
import com.example.examnews.R
import com.example.examnews.adapter.NewsAdapter
import com.example.examnews.data.repository.NewsRepository
import com.example.examnews.databinding.FragmentSuaraTerbaruBinding
import com.example.examnews.databinding.FragmentTempoNasionalBinding


class TempoNasionalFragment : Fragment() {
    lateinit var binding: FragmentTempoNasionalBinding
    private val tempoNasional: NewsViewModel by viewModels {
        NewsViewModelFactory(NewsRepository())
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentTempoNasionalBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val mAdapter = NewsAdapter()

        tempoNasional.getTempoNasionalNews()

        tempoNasional.tempoNews.observe(viewLifecycleOwner){dataNews ->
            dataNews?.data?.let { mAdapter.setData(it.posts) }
        }

        binding.rvCommonNews.apply {
            adapter = mAdapter
            layoutManager = LinearLayoutManager(requireContext())
        }
    }

}