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
import com.example.examnews.databinding.FragmentTempoDuniaBinding
import com.example.examnews.databinding.FragmentTempoNasionalBinding

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [TempoDuniaFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class TempoDuniaFragment : Fragment() {
    lateinit var binding: FragmentTempoDuniaBinding
    private val tempoDunia: NewsViewModel by viewModels {
        NewsViewModelFactory(NewsRepository())
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentTempoDuniaBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val mAdapter = NewsAdapter()

        tempoDunia.getTempoDuniaNews()

        tempoDunia.tempoNews.observe(viewLifecycleOwner){dataNews ->
            dataNews?.data?.let { mAdapter.setData(it.posts) }
        }

        binding.rvCommonNews.apply {
            adapter = mAdapter
            layoutManager = LinearLayoutManager(requireContext())
        }
    }

}