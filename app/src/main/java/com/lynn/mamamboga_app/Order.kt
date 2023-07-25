package com.lynn.mamamboga_app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.lynn.mamamboga_app.databinding.ActivityOrderBinding

class Order : AppCompatActivity() {
    lateinit var binding: ActivityOrderBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityOrderBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
    override fun onResume() {
        super.onResume()
        binding.btnCustomer.setOnClickListener{
            var intent=Intent(this,Category::class.java)
            startActivity(intent)
        }
        super.onResume()
        binding.btnMama.setOnClickListener{
            var intent=Intent(this,ButtonActivity::class.java)
            startActivity(intent)
        }
    }
}