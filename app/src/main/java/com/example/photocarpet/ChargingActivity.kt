package com.example.photocarpet

import android.content.ContentValues.TAG
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.activity.OnBackPressedCallback
import com.example.photocarpet.databinding.ActivityChargingBinding

class ChargingActivity : AppCompatActivity() {

    private lateinit var binding: ActivityChargingBinding

    private val callback = object : OnBackPressedCallback(true) {
        override fun handleOnBackPressed() {
            // 뒤로가기 클릭 시 실행시킬 코드 입력
            Log.e(TAG, "뒤로가기 클릭")
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityChargingBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // 뒤로 가기 버튼
        binding.ivBack.setOnClickListener{
            this.onBackPressedDispatcher.addCallback(this, callback)
        }

//        binding.btnNext.setOnClickListener{}
    }
}