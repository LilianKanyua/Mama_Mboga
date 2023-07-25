package com.lynn.mamamboga_app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.lynn.mamamboga_app.databinding.ActivityPaymentBinding

class Payment : AppCompatActivity() {
    lateinit var binding: ActivityPaymentBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityPaymentBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
    override fun onResume() {
        super.onResume()
        binding.btnDone.setOnClickListener {
            val intent= Intent(this,Check::class.java)
            startActivity(intent)
        }

        binding.btnCancel.setOnClickListener {
            val intent= Intent(this,Category::class.java)
            startActivity(intent)
        }
    }
}