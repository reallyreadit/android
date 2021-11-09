package com.readup.android

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView

class MainActivity : AppCompatActivity() {
    @SuppressLint("SetJavaScriptEnabled")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val mainWebView = findViewById<WebView>(R.id.mainWebView)

        mainWebView.settings.domStorageEnabled = true
        mainWebView.settings.javaScriptEnabled = true

        mainWebView.loadUrl("https://dev.readup.com/?clientType=App&appPlatform=Android&appVersion=1.0.0")
    }
}