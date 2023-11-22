package il.massive.gea_rent.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import il.massive.gea_rent.R
import il.massive.gea_rent.model.BarangModel

class BarangAdapter(
    val barangs: List<BarangModel>
): RecyclerView.Adapter<BarangAdapter.ViewHolder>() {
    class ViewHolder(val view: View):RecyclerView.ViewHolder(view){
        val image = view.findViewById<ImageView>(R.id.iv_barang)
        val nama = view.findViewById<TextView>(R.id.tv_nama_barang)
        val harga = view.findViewById<TextView>(R.id.tv_harga_barang)
        val stok = view.findViewById<TextView>(R.id.tv_jumlah_stok_barang)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.barang_terlengkap_adapter, parent, false)
        )
    }

    override fun getItemCount() = barangs.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val barang = barangs[position]
        holder.image.setImageResource(barang.gambar)
        holder.nama.text = barang.nama
        holder.harga.text = barang.harga.toString()
        holder.stok.text = barang.stok.toString()
//        holder.itemView.setOnClickListener{
//            listener.onClick(linktree)
//        }
    }
}