package il.massive.gea_rent.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import il.massive.gea_rent.R
import il.massive.gea_rent.model.BarangModel

class LayananAdapter(
    val barangs: List<BarangModel>,
    val listener: LayananAdapter.onAdapterListener
): RecyclerView.Adapter<LayananAdapter.ViewHolder>() {
    class ViewHolder(val view: View):RecyclerView.ViewHolder(view){
        val image = view.findViewById<ImageView>(R.id.iv_produk)
        val nama = view.findViewById<TextView>(R.id.nama_produk)
        val stok = view.findViewById<TextView>(R.id.jumlah_produk)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.layanan_toko, parent, false)
        )
    }

    override fun getItemCount() = barangs.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val barang = barangs[position]
        holder.image.setImageResource(barang.gambar)
        holder.nama.text = barang.nama
        holder.stok.text = barang.stok.toString()
        holder.itemView.setOnClickListener{
            listener.onClick(barang)
        }
    }
    interface onAdapterListener{
        fun onClick(result: BarangModel)
    }
}