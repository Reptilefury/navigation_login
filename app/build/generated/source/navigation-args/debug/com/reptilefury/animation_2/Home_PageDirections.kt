package com.reptilefury.animation_2

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections

public class Home_PageDirections private constructor() {
  public companion object {
    public fun actionHomePageToLoginPage(): NavDirections =
        ActionOnlyNavDirections(R.id.action_home_Page_to_login_page)
  }
}
