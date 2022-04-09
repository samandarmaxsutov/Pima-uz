package com.example.navigation_draver

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import kotlinx.android.synthetic.main.activity_main.*

import kotlinx.android.synthetic.main.content_main.*
import kotlinx.android.synthetic.main.header_nav_view.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        talim_muassasi.setOnClickListener {
            intent = Intent(this, Talim_muassasalari::class.java)
            startActivity(intent)
        }
        xizmatlar1.setOnClickListener {
            intent = Intent(this, Xizmatlar::class.java)
            startActivity(intent)
        }
         xizmatlar.setOnClickListener {
            intent = Intent(this, Xizmatlar::class.java)
            startActivity(intent)
        }

         talim_muassasi1.setOnClickListener {
            intent = Intent(this, Talim_muassasalari::class.java)
            startActivity(intent)
        }
 qayta_aloqa.setOnClickListener {
            intent = Intent(this, Qayta_aaloqa::class.java)
            startActivity(intent)
        }

 qayta_aloqa1.setOnClickListener {
            intent = Intent(this, Qayta_aaloqa::class.java)
            startActivity(intent)
        }


        ivNavMenu.setOnClickListener {
            toggleLeftDrawer()

        }

    }
    private fun toggleLeftDrawer() {
        if (drawerLayout.isDrawerOpen(leftDrawerMenu)) {
            drawerLayout.closeDrawer(leftDrawerMenu)
        } else {
            drawerLayout.openDrawer(leftDrawerMenu)
        }
    }


}