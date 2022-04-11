package com.example.navigation_draver

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_qayta_aaloqa.*
import kotlinx.android.synthetic.main.activity_xizmatlar.*

class Qayta_aaloqa : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_qayta_aaloqa)
        web_view_qayta_aloqa.loadUrl("https://portal.piima.uz/contact")
    }

 override fun onBackPressed() {
        val intent= Intent(this,MainActivity::class.java)
        startActivity(intent)
    }
}