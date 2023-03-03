package com.majdoor.ovr.shramik.app.Activities

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.majdoor.ovr.shramik.app.databinding.ActivityPersonalDetailBinding

class PersonalDetailActivity : AppCompatActivity() {
    private lateinit var binding: ActivityPersonalDetailBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPersonalDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setSupportActionBar(binding.toolbar)

    }
}