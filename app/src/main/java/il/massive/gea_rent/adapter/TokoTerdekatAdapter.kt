package il.massive.gea_rent.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import il.massive.gea_rent.R
import il.massive.gea_rent.model.TokoModel

class TokoTerdekatAdapter(
    val tokos: List<TokoModel>,
    val listener: OnAdapterListener
): RecyclerView.Adapter<TokoTerdekatAdapter.ViewHolder>() {
    class ViewHolder(val view: View):RecyclerView.ViewHolder(view){
        val image = view.findViewById<ImageView>(R.id.iv_profile_toko_terdekat)
        val nama = view.findViewById<TextView>(R.id.nama_toko_terdekat)
        val alamat = view.findViewById<TextView>(R.id.alamat_toko_terdekat)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.toko_terdekat, parent, false)
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

    interface OnAdapterListener{
        fun onClick(result: TokoModel)
    }
}