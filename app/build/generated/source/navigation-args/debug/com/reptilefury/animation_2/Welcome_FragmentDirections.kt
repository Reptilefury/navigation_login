package com.reptilefury.animation_2

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections

public class Welcome_FragmentDirections private constructor() {
  public companion object {
    public fun actionWelcomeFragmentToHomePage(): NavDirections =
        ActionOnlyNavDirections(R.id.action_welcome_fragment_to_home_Page)
  }
}
