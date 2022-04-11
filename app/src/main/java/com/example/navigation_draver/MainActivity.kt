package com.example.navigation_draver

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

import kotlinx.android.synthetic.main.activity_main.*

import kotlinx.android.synthetic.main.content_main.*
import kotlinx.android.synthetic.main.header_nav_view.*

class MainActivity : AppCompatActivity() {
val makatabga_qabul_list= arrayOf("QABUL QILISH TARTIBI","TEST NAMUNALARI","VIDEO QO'LLANMA","HUJJATLAR NAMUNASI","ONLINE ARIZA")
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
        cancel_button_header.setOnClickListener {
            drawerLayout.closeDrawer(leftDrawerMenu)
        }
        maktabga_qabul1.setOnClickListener {

            val alert=AlertDialog.Builder(this)
            alert.setItems(makatabga_qabul_list){_,which->

                    when (which) {
                        which -> {
                            val intent=Intent(this,Maktabga_qabul::class.java)
                            intent.putExtra("title","${makatabga_qabul_list[which]}")
                            startActivity(intent)
                        }
                    }
            }

            alert.show()

        }

maktabga_qabul.setOnClickListener {

            val alert=AlertDialog.Builder(this)
            alert.setItems(makatabga_qabul_list){_,which->

                    when (which) {
                        which -> {
                            val intent=Intent(this,Maktabga_qabul::class.java)
                            intent.putExtra("title","${makatabga_qabul_list[which]}")
                            startActivity(intent)
                        }
                    }
            }

            alert.show()

        }


    }
    private fun toggleLeftDrawer() {
        if (drawerLayout.isDrawerOpen(leftDrawerMenu)) {
            drawerLayout.closeDrawer(leftDrawerMenu)
        } else {
            drawerLayout.openDrawer(leftDrawerMenu)
        }
    }

    override fun onBackPressed() {
    val alert=AlertDialog.Builder(this)
    alert.setTitle("Chiqishni hohlaysizmi?")
        alert.setNegativeButton("Yo'q"){_,_->

        }
        alert.setPositiveButton("Ha"){_,_ ->
            finishAffinity()
        }
        alert.show()
    }

}