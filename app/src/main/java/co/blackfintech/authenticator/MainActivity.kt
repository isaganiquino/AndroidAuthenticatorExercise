package co.blackfintech.authenticator

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import co.blackfintech.authenticator.util.SessionStore
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.sdk25.coroutines.onClick
import org.jetbrains.anko.startActivity

class MainActivity : AppCompatActivity() {

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)

    logoutButton.onClick{
      logout()
    }
  }

  private fun logout(){
    startActivity<LoginActivity>()
    SessionStore().clearEmail(this)
    finish()
  }
}
