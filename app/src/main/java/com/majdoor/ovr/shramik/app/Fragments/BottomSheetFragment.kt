package com.majdoor.ovr.shramik.app.Fragments

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.inputmethod.InputMethodManager
import android.widget.Button
import android.widget.Toast
import androidx.core.content.ContextCompat
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import com.google.firebase.FirebaseException
import com.google.firebase.auth.*
import com.majdoor.ovr.shramik.app.Activities.ChooseActivity
import com.majdoor.ovr.shramik.app.Activities.PersonalDetailActivity
import com.majdoor.ovr.shramik.app.R
import com.majdoor.ovr.shramik.app.databinding.FragmentBottomSheetBinding
import java.util.concurrent.TimeUnit

class BottomSheetFragment : BottomSheetDialogFragment() {

    private var _binding: FragmentBottomSheetBinding? = null
    private val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentBottomSheetBinding.inflate(inflater, container, false)

        return binding.root

    }
}