package il.massive.gea_rent.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager.widget.ViewPager
import com.google.android.material.tabs.TabLayout
import il.massive.gea_rent.R
import il.massive.gea_rent.databinding.ActivityDetailTokoBinding
import il.massive.gea_rent.databinding.ActivityTokoTerdekatBinding

class DetailTokoActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDetailTokoBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailTokoBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val gambar = intent.getIntExtra("gambar_toko",0)
        val nama = intent.getStringExtra("nama_toko")
        val alamat = intent.getStringExtra("alamat_toko")

        binding.ivFotoToko.setImageResource(gambar)
        binding.tvNamaToko.text = nama
        binding.tvAlamatToko.text = alamat

        // Menangani perpindahan antar tab
        binding.tabLayout.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener {
            override fun onTabSelected(tab: TabLayout.Tab?) {
                val position = tab?.position ?: 0

                when (position) {
                    0 -> {
                        // Jika tab Review dipilih, tampilkan gambar Reviews
                        binding.ivReviews.setImageResource(R.drawable.reviews)
                    }
                    1 -> {
                        // Jika tab Layanan dipilih, buka aktivitas LayananActivity
                        startActivity(Intent(this@DetailTokoActivity, LayananActivity::class.java))
                        finish()
                    }
                }
            }

            override fun onTabUnselected(tab: TabLayout.Tab?) {}
            override fun onTabReselected(tab: TabLayout.Tab?) {}
            })
        }
}
