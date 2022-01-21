package com.reptilefury.animation_2

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections

public class Fragment_LoginDirections private constructor() {
  public companion object {
    public fun actionLoginPageToWelcomeFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_login_page_to_welcome_fragment)
  }
}
