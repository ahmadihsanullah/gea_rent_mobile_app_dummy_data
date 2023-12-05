package il.massive.gea_rent.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import il.massive.gea_rent.R
import il.massive.gea_rent.databinding.ActivityDetailProfileBinding

class DetailProfileActivity : AppCompatActivity() {
    private lateinit var binding : ActivityDetailProfileBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_profile)
        binding = ActivityDetailProfileBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnSimpanProfile.setOnClickListener {
            Toast.makeText(this@DetailProfileActivity,"Update Berhasil", Toast.LENGTH_LONG).show()
            finish()
        }
        binding.btnBackprofile.setOnClickListener {
            finish()
        }

    }
}