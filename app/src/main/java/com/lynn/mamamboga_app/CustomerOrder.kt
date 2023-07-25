package com.lynn.mamamboga_app

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.lynn.mamamboga_app.databinding.ActivityCategoryBinding
import com.lynn.mamamboga_app.databinding.ActivityCustomerOrderBinding

class CustomerOrder : AppCompatActivity() {
    lateinit var binding: ActivityCustomerOrderBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityCustomerOrderBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
    override fun onResume() {
        super.onResume()
        binding.btnCheck.setOnClickListener {
            val intent=Intent(this,Payment::class.java)
            startActivity(intent)
        }

    }
}