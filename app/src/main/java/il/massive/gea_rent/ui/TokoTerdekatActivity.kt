package il.massive.gea_rent.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import il.massive.gea_rent.R
import il.massive.gea_rent.adapter.TokoAdapter
import il.massive.gea_rent.adapter.TokoTerdekatAdapter
import il.massive.gea_rent.data.toko.DataToko
import il.massive.gea_rent.databinding.ActivityTerdekatBinding
import il.massive.gea_rent.databinding.TokoTerdekatBinding
import il.massive.gea_rent.model.TokoModel

class TokoTerdekatActivity : AppCompatActivity() {
    private lateinit var binding: ActivityTerdekatBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTerdekatBinding.inflate(layoutInflater)
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
                Toast.makeText(applicationContext, result.nama, Toast.LENGTH_SHORT).show()
            }
        })
        binding.rvTokoTerdekatLihatSemua.apply {
            layoutManager = LinearLayoutManager(this@TokoTerdekatActivity)
            adapter = tokoAdapter
        }

    }


}