package il.massive.gea_rent.ui

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import il.massive.gea_rent.R
import il.massive.gea_rent.databinding.FragmentProfileBinding

class ProfileFragment : Fragment() {

    private lateinit var binding: FragmentProfileBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = FragmentProfileBinding.inflate(inflater, container, false)
        val view = binding.root

        // Find the button by ID
        val btnbukatoko: ImageButton = view.findViewById(R.id.bukatoko)
//        val btntokosaya: ImageButton = view.findViewById(R.id.tokosaya)

        // Set an OnClickListener for the button
        btnbukatoko.setOnClickListener {
            val intent = Intent(activity, DaftarTokoActivity::class.java)
            startActivity(intent)
        }

//        btntokosaya.setOnClickListener {
//            val intent = Intent(activity, TokoSayaActivity::class.java)
//            startActivity(intent)
//        }

        return view
    }
}
