package com.reptilefury.animation_2

import android.os.Bundle
import androidx.navigation.NavDirections
import kotlin.Int
import kotlin.String

public class Fragment_LoginDirections private constructor() {
  private data class ActionLoginPageToWelcomeFragment(
    public val username: String,
    public val password: String
  ) : NavDirections {
    public override fun getActionId(): Int = R.id.action_login_page_to_welcome_fragment

    public override fun getArguments(): Bundle {
      val result = Bundle()
      result.putString("username", this.username)
      result.putString("password", this.password)
      return result
    }
  }

  public companion object {
    public fun actionLoginPageToWelcomeFragment(username: String, password: String): NavDirections =
        ActionLoginPageToWelcomeFragment(username, password)
  }
}
