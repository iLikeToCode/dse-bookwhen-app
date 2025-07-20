package com.archiehurst.bookwhen

import android.annotation.SuppressLint
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    @SuppressLint("SetJavaScriptEnabled")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()

        val webView = findViewById<WebView>(R.id.webView)
        webView.webViewClient = WebViewClient() // ensures it stays in-app
        webView.settings.javaScriptEnabled = true
        webView.loadUrl("https://melissabutt.bookwhen.com/schedules")
    }
}
