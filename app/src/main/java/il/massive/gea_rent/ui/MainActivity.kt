package il.massive.gea_rent.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView
import il.massive.gea_rent.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        loadFragment(BerandaFragment()).run {
            title = "Beranda"
        }



        val bottomNavigationView: BottomNavigationView = findViewById(R.id.bottom_nav)
        bottomNavigationView.setOnNavigationItemSelectedListener { item ->
            when (item.itemId) {
                R.id.beranda -> {
                    loadFragment(BerandaFragment())
                    item.setTitle("Beranda")
                    return@setOnNavigationItemSelectedListener true
                }
                R.id.panduan -> {
                    loadFragment(PanduanFragment())
                    item.setTitle("Panduan")
                    return@setOnNavigationItemSelectedListener true
                }
                R.id.pengaturan -> {
                    loadFragment(PengaturanFragment())
                    item.setTitle("Pengaturan")
                    return@setOnNavigationItemSelectedListener true
                }
                else -> return@setOnNavigationItemSelectedListener false
            }
        }
    }

    private fun loadFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction()
            .replace(R.id.fragment_container, fragment) // Replace with your fragment container ID
            .commit()
    }
}