package il.massive.gea_rent.ui

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import il.massive.gea_rent.R
import il.massive.gea_rent.adapter.BarangAdapter
import il.massive.gea_rent.adapter.LayananAdapter
import il.massive.gea_rent.adapter.TokoTerdekatAdapter
import il.massive.gea_rent.data.barang.DataBarang
import il.massive.gea_rent.data.toko.DataToko
import il.massive.gea_rent.databinding.ActivityLayananBinding
import il.massive.gea_rent.databinding.ActivityTokoTerdekatBinding
import il.massive.gea_rent.model.BarangModel
import il.massive.gea_rent.model.TokoModel

class LayananActivity : AppCompatActivity() {
    private lateinit var binding: ActivityLayananBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLayananBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.icArrowBack.setOnClickListener {
            finish()
        }
        binding.btnHubungiStore.setOnClickListener {
            // Ganti nomor ini dengan nomor WhatsApp toko yang sesuai
            val nomorWhatsApp = "628979276362"

            val pesanWhatsApp = "Saya tertarik dengan produk yang berada di toko anda"
            val url = "https://api.whatsapp.com/send?phone=$nomorWhatsApp&text=${Uri.encode(pesanWhatsApp)}"

            // Buka WhatsApp dengan Intent
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
            startActivity(intent)
        }
    }

    override fun onStart() {
        super.onStart()
        setUpRecyclerView()
    }

    private fun setUpRecyclerView(){
        val items = DataBarang.dummyDataBarang

        var barangAdapter = LayananAdapter(items, object: LayananAdapter.onAdapterListener{
            override fun onClick(result: BarangModel) {
                Toast.makeText(this@LayananActivity, result.nama, Toast.LENGTH_SHORT).show()
            }
        })
        binding.rvLayanan.apply {
            layoutManager = LinearLayoutManager(this@LayananActivity)
            adapter = barangAdapter
        }

    }
}