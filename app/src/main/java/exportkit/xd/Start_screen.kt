package exportkit.xd

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity
import androidx.core.os.HandlerCompat.postDelayed

class Start_screen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        supportActionBar?.hide()
        super.onCreate(savedInstanceState)
        setContentView(R.layout.start_screen)
        Handler().postDelayed({
            val intent = Intent(this@Start_screen, Finance_tracker__community__activity::class.java)
            startActivity(intent)
        },1000);
    }
}