package com.ian.myvan

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth
import com.ian.myvan.databinding.ActivityLoginBinding


class LoginActivity : AppCompatActivity() {
    private lateinit var binding: ActivityLoginBinding
    private lateinit var auth: FirebaseAuth
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)
    auth= FirebaseAuth.getInstance()

        binding.forgotPass.setOnClickListener {
            startActivity(Intent(this,ResetPasswordActivity::class.java))
        }
        binding.registerHere.setOnClickListener {
            startActivity(Intent(this,RegisterActivity::class.java))
        }
        binding.loinBtn.setOnClickListener {
            val arafa=binding.companyEmail.text.toString().trim { it <= ' ' }
            val siri=binding.companyPasscode.text.toString().trim { it <= ' ' }
            if (arafa.isEmpty()&&siri.isEmpty()){

            }
            else{
              auth.signInWithEmailAndPassword(arafa,siri).addOnCompleteListener {
                  if (it.isSuccessful){
                      startActivity(Intent(this,DashActivity::class.java))

                  }
                  else{
                      Toast.makeText(this,it.exception.toString(),Toast.LENGTH_LONG).show()
                  }
              }
            }
        }
    }
}