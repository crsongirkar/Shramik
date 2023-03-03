package com.majdoor.ovr.shramik.app.Activities

import android.content.Intent
import android.graphics.Bitmap
import android.net.Uri
import android.os.Bundle
import android.provider.MediaStore
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Toast
import androidx.activity.result.ActivityResult
import androidx.activity.result.ActivityResultLauncher
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AppCompatActivity
import com.google.android.gms.tasks.OnFailureListener
import com.google.android.gms.tasks.OnSuccessListener
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.storage.FirebaseStorage
import com.google.firebase.storage.StorageReference
import com.google.firebase.storage.UploadTask
import com.majdoor.ovr.shramik.app.R
import com.majdoor.ovr.shramik.app.databinding.ActivityWorkerPostBinding
import java.io.ByteArrayOutputStream
import java.io.IOException
import java.util.*


class WorkerPostActivity : AppCompatActivity() {
    lateinit var binding:ActivityWorkerPostBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityWorkerPostBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}