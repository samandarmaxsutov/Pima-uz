package com.example.navigation_draver

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_maktabga_qabul.*
import kotlinx.android.synthetic.main.activity_qayta_aaloqa.*

class Maktabga_qabul : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_maktabga_qabul)
        val bundle: Bundle? = intent.extras
        val title = bundle!!.getString("title")
        if (title == "QABUL QILISH TARTIBI") {
            web_view_maktaga_qabul.loadUrl("https://portal.piima.uz/admission")
        }
        if (title == "TEST NAMUNALARI") {
            web_view_maktaga_qabul.loadUrl("https://portal.piima.uz/page/test-namunalari")
        }
        if (title == "VIDEO QO'LLANMA") {
            web_view_maktaga_qabul.loadUrl("https://portal.piima.uz/page/video-qo-llanma")
        }
        if (title == "HUJJATLAR NAMUNASI") {
            web_view_maktaga_qabul.loadUrl("https://portal.piima.uz/page/hujjatlar-namunasi")
        }
        if (title == "ONLINE ARIZA") {
            web_view_maktaga_qabul.loadUrl("https://ariza.piima.uz/")
        }


    }

    override fun onBackPressed() {
            val intent= Intent(this,MainActivity::class.java)
            startActivity(intent)


        }

}