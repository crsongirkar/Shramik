package com.majdoor.ovr.shramik.app.Activities

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.FirebaseDatabase
import com.majdoor.ovr.shramik.app.databinding.ActivityAddPostBinding
import java.text.SimpleDateFormat
import java.util.*

class AddPostActivity : AppCompatActivity() {
    lateinit var binding:ActivityAddPostBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAddPostBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }
}