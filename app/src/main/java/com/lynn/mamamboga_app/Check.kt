package com.lynn.mamamboga_app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.lynn.mamamboga_app.databinding.ActivityCheckBinding

class Check : AppCompatActivity() {
    lateinit var binding: ActivityCheckBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityCheckBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    override fun onResume() {
        super.onResume()
        binding.imageView2.setOnClickListener {
            val intent= Intent(this,Payment::class.java)
            startActivity(intent)
        }

    }

}