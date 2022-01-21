package com.reptilefury.animation_2

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.reptilefury.animation_2.databinding.FragmentLoginPageBinding
class Fragment_Login:Fragment() {
    private lateinit var binding: FragmentLoginPageBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentLoginPageBinding.inflate(inflater, container, false)
        val view = binding.root
        val userName = binding.UserNameField.text
        val password  = binding.passwordField.text
    //return super.onCreateView(inflater, container, savedInstanceState)
        binding.loginButton.setOnClickListener {
            Log.i("Username:", "$userName")
            Log.i("password", "$password")
            val action = Fragment_LoginDirections.actionLoginPageToWelcomeFragment()
            findNavController().navigate(action)
        }
         return  view
    }
}







