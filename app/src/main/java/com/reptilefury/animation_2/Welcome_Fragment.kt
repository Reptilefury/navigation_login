package com.reptilefury.animation_2

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.NavArgs
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.reptilefury.animation_2.databinding.FragmentWelcomeFragmentBinding

class Welcome_Fragment: Fragment(){
    private lateinit var binding: FragmentWelcomeFragmentBinding
    private val args:Welcome_FragmentArgs by navArgs()
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentWelcomeFragmentBinding.inflate(inflater, container, false)
        val view = binding.root
        binding.TextViewUsername.text = args.username
        binding.TextViewPassword.text = args.password
        binding.okButton.setOnClickListener {
            val action = Welcome_FragmentDirections.actionWelcomeFragmentToHomePage()
            findNavController().navigate(action)
        }
        return view
    }

}