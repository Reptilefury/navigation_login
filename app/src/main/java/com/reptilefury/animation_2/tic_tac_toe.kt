package com.reptilefury.animation_2
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.google.android.material.snackbar.Snackbar
import com.reptilefury.animation_2.databinding.FragmentTicTacToeBinding
class tic_tac_toe : Fragment() {
    private lateinit var binding: FragmentTicTacToeBinding
    var activePlayerX = 0
    var gameState = arrayListOf(2, 2, 2, 2, 2, 2, 2, 2, 2)
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentTicTacToeBinding.inflate(inflater, container, false)
        val view = binding.root
        return view
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val imageView1 = binding.imageView1
        val imageView2 = binding.imageView2
        val imageView3 = binding.imageView3
        val imageView4 = binding.imageView4
        val imageView5 = binding.imageView5
        val imageView6 = binding.imageView6
        val imageView7 = binding.imageView7
        val imageView8 = binding.imageView8
        val imageView9 = binding.imageView9
        super.onViewCreated(view, savedInstanceState)

        fun change(imageView: ImageView) {
            val tappedSlot = imageView.tag.toString().toInt()
            if (gameState[tappedSlot] == 2) {
                gameState[tappedSlot] = activePlayerX
                Log.i("Tapped", gameState.toString())
                Snackbar.make(imageView, "Tapped slot:${tappedSlot}", Snackbar.LENGTH_SHORT).show()
                imageView.translationY = -2000f
                if (activePlayerX == 0) {
                    imageView.setImageResource(R.drawable.tic_tac_toe_o)
                    activePlayerX = 1
                } else {
                    imageView.setImageResource(R.drawable.tic_tac_toe_x)
                    activePlayerX = 0
                }
                imageView.animate().translationYBy(2000f).rotation(1800f).setDuration(500)
            }
        }
        imageView1.setOnClickListener {
            change(imageView1)
        }
        imageView2.setOnClickListener {
            change(imageView2)
        }
        imageView3.setOnClickListener {
            change(imageView3)
        }
        imageView4.setOnClickListener {
            change(imageView4)
        }
        imageView5.setOnClickListener {
            change(imageView5)
        }
        imageView6.setOnClickListener {
            change(imageView6)
        }
        imageView7.setOnClickListener {
            change(imageView7)
        }
        imageView8.setOnClickListener {
            change(imageView8)
        }
        imageView9.setOnClickListener {
            change(imageView9)
        }
    }
}