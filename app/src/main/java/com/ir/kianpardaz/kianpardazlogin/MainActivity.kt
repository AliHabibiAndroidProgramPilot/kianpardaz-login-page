package com.ir.kianpardaz.kianpardazlogin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ir.kianpardaz.kianpardazlogin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}