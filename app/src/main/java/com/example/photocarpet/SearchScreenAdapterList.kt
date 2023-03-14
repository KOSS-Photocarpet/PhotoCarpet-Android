package com.example.photocarpet

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.photocarpet.databinding.FragmentSearchScreenArtistsBinding
import com.example.photocarpet.databinding.SearchListItemBinding

class SearchScreenAdapterList (val searchResultList: ArrayList<SearchSceenResult>) : RecyclerView.Adapter<SearchScreenAdapterList.SearchScreenViewHolder>() {

    class SearchScreenViewHolder(val binding: SearchListItemBinding) :
        RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SearchScreenViewHolder {
        val view = SearchListItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
//            LayoutInflater.from(parent.context).inflate(R.layout.search_list_item, parent, false)
        return SearchScreenViewHolder(view)
    }

    override fun getItemCount(): Int {
        return searchResultList.size
    }

    // 리스트뷰를 계속 사용할 때, onBindViewHolder가 지속적으로 호출이 되면서 모든 데이터들을 연결.
    override fun onBindViewHolder(holder: SearchScreenViewHolder, position: Int) {
        holder.binding.ivSearchPhoto.setImageResource(searchResultList.get(position).image)   // position: 현재 클릭한 것의 인덱스 번호.
        holder.binding.tvSearchTitle.text = searchResultList.get(position).title
        holder.binding.tvSearchExplanation.text = searchResultList.get(position).explanation
    }
}