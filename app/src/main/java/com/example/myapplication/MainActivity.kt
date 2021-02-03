package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
var   mweb = findViewById<WebView>(R.id.mywebview)

       button.setOnClickListener {
           mweb.webViewClient = WebViewClient()

           mweb.loadUrl("https://www.globalknowledge.com/")
           val webSettings = mweb.settings

           webSettings.javaScriptEnabled = true

       }



    }
}