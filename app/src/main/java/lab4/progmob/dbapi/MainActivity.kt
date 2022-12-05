package lab4.progmob.dbapi

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import lab4.progmob.dbapi.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater).also { setContentView(it.root) }
    }
}
