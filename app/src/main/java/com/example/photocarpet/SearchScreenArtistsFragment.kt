package com.example.photocarpet

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.photocarpet.databinding.FragmentSearchScreenArtistsBinding

class SearchScreenArtistsFragment : Fragment() {

    private lateinit var binding: FragmentSearchScreenArtistsBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val searchList = arrayListOf(
            SearchSceenResult(R.drawable.man, "이름", "설명어쩌구저쩌구"),
            SearchSceenResult(R.drawable.man, "이름1", "asdsjkfajkfhfdfsfsgsds"),
            SearchSceenResult(R.drawable.man, "이름2", "dmddsf")
        )

        binding.rvSearchArtists.layoutManager = LinearLayoutManager(context)
        binding.rvSearchArtists.setHasFixedSize(true)

        binding.rvSearchArtists.adapter = SearchScreenAdapterList(searchList)

        return binding.root
    }
}
