package il.massive.gea_rent.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import il.massive.gea_rent.R
import il.massive.gea_rent.databinding.ActivityOnBoardingBinding

class OnBoardingActivity : AppCompatActivity() {
    private lateinit var binding: ActivityOnBoardingBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityOnBoardingBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnDaftarOnboarding.setOnClickListener {
            startActivity(Intent(this@OnBoardingActivity, RegisterActivity::class.java))
        }

        binding.tvMasukDisini.setOnClickListener {
            startActivity(Intent(this@OnBoardingActivity, LoginActivity::class.java))
        }

    }
}