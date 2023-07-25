package com.lynn.mamamboga_app
import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.lynn.mamamboga_app.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {
    lateinit var binding:ActivityLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    override fun onResume() {
        super.onResume()


        binding.tvSignUp.setOnClickListener {
            val intent = Intent(this@LoginActivity, SignUpActivity::class.java)
            startActivity(intent)
            validateSignUp()
            clearErrors()
        }
        binding.btnLogin.setOnClickListener {

//            val intent = Intent(this@LoginActivity, ButtonActivity::class.java)
//            startActivity(intent)0
            validateSignUp()
            clearErrors()
        }
    }


    fun validateSignUp() {
        val fullName = binding.etfullName.text.toString()

        val email = binding.etEmail.text.toString()
        val password = binding.etpassword.text.toString()

        var error = false

        if (fullName.isBlank()) {
            binding.tilfullName.error = "First name is required"
            error = true
        }

        if (email.isBlank()) {
            binding.tilEmail.error = "Email is required"
            error = true
        }
        if (password.isBlank()) {
            binding.etpassword.error = "Password is required"
            error = true
        }



        if (!error) {
            Toast.makeText(this, "$fullName $email", Toast.LENGTH_LONG).show()
            val intent = Intent(this, Order::class.java)
            startActivity(intent)

        }
    }

    private fun clearErrors() {
        binding.tilfullName.error = null
        binding.tilEmail.error = null
        binding.tilpassword.error = null

    }
}