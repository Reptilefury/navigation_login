 package com.reptilefury.animation_2
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.reptilefury.animation_2.databinding.FragmentHomePageBinding

class Home_Page: Fragment(){
    private lateinit var binding: FragmentHomePageBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHomePageBinding.inflate(inflater, container, false)
    //return super.onCreateView(inflater, container, savedInstanceState)
        val view = binding.root
        binding.proceedButton.setOnClickListener {
            val action = Home_PageDirections.actionHomePageToLoginPage()
            findNavController().navigate(action)
        }
        return view
    }
}




