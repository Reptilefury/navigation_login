package com.reptilefury.animation_2

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections

public class Welcome_FragmentDirections private constructor() {
  public companion object {
    public fun actionWelcomeFragmentToTicTacToe(): NavDirections =
        ActionOnlyNavDirections(R.id.action_welcome_fragment_to_tic_tac_toe)
  }
}
