package com.lynn.mamamboga_app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.lynn.mamamboga_app.databinding.ActivityMamaMbogaBinding

class mamaMboga : AppCompatActivity() {
    lateinit var binding: ActivityMamaMbogaBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMamaMbogaBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
    override fun onResume() {
        super.onResume()
        binding.btnPrevious.setOnClickListener {
            val intent= Intent(this,ButtonActivity::class.java)
            startActivity(intent)
        }

    }
}