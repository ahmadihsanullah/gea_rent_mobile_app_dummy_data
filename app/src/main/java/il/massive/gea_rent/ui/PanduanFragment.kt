package il.massive.gea_rent.views.panduan

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import il.massive.gea_rent.R
import il.massive.gea_rent.adapter.PanduanAdapter
import il.massive.gea_rent.adapter.TokoAdapter
import il.massive.gea_rent.data.panduan.DataPanduan
import il.massive.gea_rent.data.toko.DataToko
import il.massive.gea_rent.databinding.FragmentBerandaBinding
import il.massive.gea_rent.databinding.FragmentPanduanBinding
import il.massive.gea_rent.model.BarangModel
import il.massive.gea_rent.model.PanduanModel
import il.massive.gea_rent.ui.DetailPanduanActivity
import il.massive.gea_rent.ui.PanduanKompasActivity
import il.massive.gea_rent.ui.PanduanKomporActivity
import il.massive.gea_rent.ui.PanduanSleepingBagActivity
import il.massive.gea_rent.ui.PanduanTendaActivity
import il.massive.gea_rent.ui.PanduanWaterActivity

class PanduanFragment : Fragment() {
    private var _binding: FragmentPanduanBinding? = null
    private val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentPanduanBinding.inflate(inflater, container, false)
        return binding.root

    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Set layout manager for RecyclerView
        binding.rvPanduan.layoutManager = LinearLayoutManager(requireContext(),
            LinearLayoutManager.VERTICAL, false)

        // Set adapter for RecyclerView
        binding.rvPanduan.adapter = panduanAdapter

    }

    private val panduanAdapter by lazy {
        val items = DataPanduan.dummyDataPanduan

        PanduanAdapter(items, object: PanduanAdapter.onAdapterListener{
            override fun onClick(panduan: PanduanModel) {
                if (panduan.judul=="Panduan Penggunaan Kompor Portable"){
                    startActivity(Intent(requireContext(),PanduanKomporActivity::class.java))
                }
                if (panduan.judul=="Panduan Mendirikan Tenda Dome"){
                    startActivity(Intent(requireContext(),PanduanTendaActivity::class.java))
                }
                if (panduan.judul=="Panduan Penggunaan Sleeping Bag yang Benar"){
                    startActivity(Intent(requireContext(), PanduanSleepingBagActivity::class.java))
                }
                if (panduan.judul=="Panduan Memakai Water Bladder dengan Hydropack"){
                    startActivity(Intent(requireContext(), PanduanWaterActivity::class.java))
                }
                if (panduan.judul=="Panduan Penggunaan Kompas yang Benar"){
                    startActivity(Intent(requireContext(), PanduanKompasActivity::class.java))
                }
            }

        })
    }

    private fun openDetailPanduan(panduan: PanduanModel) {
        val intent = Intent(requireContext(), DetailPanduanActivity::class.java)
        intent.putExtra("gambar_panduan", panduan.gambar)
        intent.putExtra("nama_panduan", panduan.judul)
        intent.putExtra("deskripsi_panduan", panduan.deskripsi)
        startActivity(intent)
    }

}