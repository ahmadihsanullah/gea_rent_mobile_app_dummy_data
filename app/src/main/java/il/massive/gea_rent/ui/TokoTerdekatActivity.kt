package il.massive.gea_rent.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import il.massive.gea_rent.R
import il.massive.gea_rent.adapter.TokoAdapter
import il.massive.gea_rent.adapter.TokoTerdekatAdapter
import il.massive.gea_rent.data.toko.DataToko
import il.massive.gea_rent.databinding.ActivityTokoTerdekatBinding
import il.massive.gea_rent.databinding.TokoTerdekatBinding
import il.massive.gea_rent.model.TokoModel

class TokoTerdekatActivity : AppCompatActivity() {
    private lateinit var binding: ActivityTokoTerdekatBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTokoTerdekatBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.icArrowBack.setOnClickListener {
            finish()
        }
    }

    override fun onStart() {
        super.onStart()
        setUpRecyclerView()
    }

    private fun setUpRecyclerView(){
        val items = DataToko.dummyTokoData

        var tokoAdapter = TokoTerdekatAdapter(items, object: TokoTerdekatAdapter.OnAdapterListener{
            override fun onClick(result: TokoModel) {
                val intent = Intent(this@TokoTerdekatActivity, DetailTokoActivity::class.java)
                intent.putExtra("gambar_toko", result.image)
                intent.putExtra("nama_toko", result.nama)
                intent.putExtra("alamat_toko", result.alamat)
                intent.putExtra("no_telepon", result.telpon)
                startActivity(intent)

                }
        })
        binding.rvTokoTerdekatLihatSemua.apply {
            layoutManager = LinearLayoutManager(this@TokoTerdekatActivity)
            adapter = tokoAdapter
        }

    }


}