package il.massive.gea_rent.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import il.massive.gea_rent.R
import il.massive.gea_rent.adapter.BarangAdapter
import il.massive.gea_rent.adapter.TokoAdapter
import il.massive.gea_rent.data.barang.DataBarang
import il.massive.gea_rent.data.toko.DataToko
import il.massive.gea_rent.databinding.FragmentBerandaBinding


class BerandaFragment : Fragment() {
    private var _binding: FragmentBerandaBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentBerandaBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Set layout manager for RecyclerView
        binding.rvTokoTerdekat.layoutManager = LinearLayoutManager(requireContext(),LinearLayoutManager.HORIZONTAL, false)

        // Set adapter for RecyclerView
        binding.rvTokoTerdekat.adapter = tokoAdapter

        binding.rvBarangTerlengkap.layoutManager = LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false)
        binding.rvBarangTerlengkap.adapter = barangAdapter


    }
    private val tokoAdapter by lazy {
        val items = DataToko.dummyTokoData

        TokoAdapter(items)
    }

    private val barangAdapter by lazy {
        val items = DataBarang.dummyDataBarang

        BarangAdapter(items)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}