package com.reptilefury.animation_2

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.reptilefury.animation_2.databinding.FragmentWelcomeFragmentBinding

class Welcome_Fragment: Fragment(){
    private lateinit var binding: FragmentWelcomeFragmentBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentWelcomeFragmentBinding.inflate(inflater, container, false)
        val view = binding.root
        binding.okButton.setOnClickListener {
            val action = Welcome_FragmentDirections.actionWelcomeFragmentToTicTacToe()
            findNavController().navigate(action)

        }
        return view
    }

}