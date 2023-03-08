package com.example.photocarpet

import android.content.ContentValues
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.activity.OnBackPressedCallback
import com.example.photocarpet.databinding.ActivitySearchScreenBinding

class SearchScreenActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySearchScreenBinding

    private val callback = object : OnBackPressedCallback(true) {
        override fun handleOnBackPressed() {
            // 뒤로가기 클릭 시 실행시킬 코드 입력
            Log.e(ContentValues.TAG, "뒤로가기 클릭")
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySearchScreenBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // 탭 레이아웃을 위한 부분
        val adaptersearchscreen = SearchScreenAdapterPager(supportFragmentManager)
        adaptersearchscreen.addFragment(SearchScreenArtistsFragment(), "Artists")
        adaptersearchscreen.addFragment(SearchScreenExhibitionsFragment(), "Exhibitions")
        binding.searchScreenViewpager.adapter = adaptersearchscreen
        binding.searchScreenTab.setupWithViewPager(binding.searchScreenViewpager)

        // 뒤로 가기 버튼
        binding.ivBack.setOnClickListener{
            this.onBackPressedDispatcher.addCallback(this, callback)
        }

    }
}