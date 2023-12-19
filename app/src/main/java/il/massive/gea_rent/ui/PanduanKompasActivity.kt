package il.massive.gea_rent.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageButton
import android.widget.Toast
import il.massive.gea_rent.R

class PanduanKompasActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_panduan_kompas)
        val btnPanduan: ImageButton = findViewById(R.id.back_panduan5)
        btnPanduan.setOnClickListener(this)
    }
    override fun onClick(v: View?) {
        when(v?.id){
            R.id.back_panduan5-> {
                Toast.makeText(this@PanduanKompasActivity,"Kembali", Toast.LENGTH_LONG).show()
                finish()
            }
        }
    }
}