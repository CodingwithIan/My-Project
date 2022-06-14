package com.ian.myvan

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth
import com.ian.myvan.databinding.ActivityResetPasswordBinding

class ResetPasswordActivity : AppCompatActivity() {
    private lateinit var binding: ActivityResetPasswordBinding
    private lateinit var auth: FirebaseAuth
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityResetPasswordBinding.inflate(layoutInflater)
        setContentView(binding.root)
        auth= FirebaseAuth.getInstance()
        binding.submitEmail.setOnClickListener {
            val arafa=binding.companyEmail.text.toString().trim { it <= ' ' }
            if (arafa.isNotEmpty()){
                auth.sendPasswordResetEmail(arafa).addOnCompleteListener {
                    if (it.isSuccessful){
                        Toast.makeText(this,"Reset Code has been sent to your email",Toast.LENGTH_SHORT).show()

        finish()
                    }
                    else{
                        Toast.makeText(this,it.exception.toString(),Toast.LENGTH_SHORT).show()
                    }

                }
            }
            else{
                Toast.makeText(this,"Enter Valid Email",Toast.LENGTH_SHORT).show()
            }
        }
    }
}