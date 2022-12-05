package lab4.progmob.dbapi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import lab4.progmob.dbapi.databinding.ActivityDetailsBinding

class DetailsActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDetailsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailsBinding.inflate(layoutInflater).also{ setContentView(it.root) }

        // TODO: Better use date instead of name
        val holiday = intent.getStringExtra(EXTRA_HOLIDAY)
        if (holiday.isNullOrEmpty()) {
            throw RuntimeException("There is no holiday")
        }
    }

    companion object {
        @JvmStatic private val EXTRA_HOLIDAY = "EXTRA_HOLIDAY"
    }
}
