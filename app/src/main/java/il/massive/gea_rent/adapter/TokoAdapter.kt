package il.massive.gea_rent.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import il.massive.gea_rent.R
import il.massive.gea_rent.data.toko.DataToko
import il.massive.gea_rent.model.TokoModel

class TokoAdapter(
    val tokos: List<TokoModel>,
    val listener: onAdapterListener
): RecyclerView.Adapter<TokoAdapter.ViewHolder>() {
    class ViewHolder(val view: View):RecyclerView.ViewHolder(view){
        val image = view.findViewById<ImageView>(R.id.iv_toko)
        val nama = view.findViewById<TextView>(R.id.tv_nama_toko)
        val alamat = view.findViewById<TextView>(R.id.tv_alamat_toko)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.toko_adapter, parent, false)
        )
    }

    override fun getItemCount() = tokos.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val toko = tokos[position]
        holder.image.setImageResource(toko.image)
        holder.nama.text = toko.nama
        holder.alamat.text = toko.alamat
        holder.itemView.setOnClickListener{
            listener.onClick(toko)
        }
    }

    interface onAdapterListener{
        fun onClick(result: TokoModel)
    }


}