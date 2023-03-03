package com.majdoor.ovr.shramik.app.Activities

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.majdoor.ovr.shramik.app.databinding.ActivityMainBinding


open class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }
}