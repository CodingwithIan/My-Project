package com.ian.myvan

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ian.myvan.databinding.ActivityDashBinding

class DashActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDashBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityDashBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.mystudents.setOnClickListener {
            startActivity(Intent(this,MainActivity::class.java))
        }
    }
}