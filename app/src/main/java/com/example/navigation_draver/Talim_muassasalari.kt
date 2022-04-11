package com.example.navigation_draver

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_talim_muassasalari.*

class Talim_muassasalari : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_talim_muassasalari)
        window.decorView.systemUiVisibility=View.SYSTEM_UI_FLAG_FULLSCREEN
        init()
    }
    private fun init(){
        setSupportActionBar(toolbar)
        supportActionBar?.title="Ta'lim muassasalari"

        supportActionBar?.let { tb->
            tb.setHomeButtonEnabled(true)
            tb.setDisplayHomeAsUpEnabled(true)
        }

    }


    override fun onSupportNavigateUp(): Boolean {
intent= Intent(this,MainActivity::class.java)
        startActivity(intent)
        return true
    }
    override fun onBackPressed() {
        val intent= Intent(this,MainActivity::class.java)
        startActivity(intent)
    }

}