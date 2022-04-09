package com.example.navigation_draver

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_xizmatlar.*

class Xizmatlar : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_xizmatlar)
    webView.loadUrl("https://job.piima.uz/")
    }
}