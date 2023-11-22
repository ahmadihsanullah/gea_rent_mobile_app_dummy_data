package il.massive.gea_rent.ui.adapters

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import il.massive.gea_rent.databinding.TokoItemBinding
import il.massive.gea_rent.ui.ProdukSewaActivity
import il.massive.gea_rent.ui.model.TokoSayaModel

class TokoSayaAdapter(private val list: List<TokoSayaModel>, private val context:Context) :
    RecyclerView.Adapter<TokoSayaAdapter.ViewHolder>() {

    class ViewHolder(val binding: TokoItemBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TokoSayaAdapter.ViewHolder {
        val binding = TokoItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }
    override fun getItemCount(): Int = list.size

    override fun onBindViewHolder(holder: TokoSayaAdapter.ViewHolder, position: Int) {
        with(holder){
            with(list[position]){
                binding.imagealat.setImageResource(this.image)
                binding.judulalat.text = this.judul
                binding.tersedia.text = this.tersedia
                binding.hargaalat.text = this.harga
            }
        }
        holder.itemView.setOnClickListener {
            val context = holder.itemView.context
            val intent = Intent(context, ProdukSewaActivity::class.java)

            // Anda dapat menambahkan data tambahan ke intent jika diperlukan
            intent.putExtra("judul", list[position].judul)
            intent.putExtra("tersedia", list[position].tersedia)
            intent.putExtra("harga", list[position].harga)

            context.startActivity(intent)
        }

    }
}