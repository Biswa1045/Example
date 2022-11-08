package com.biswa1045.example

import android.os.Bundle
import android.webkit.WebSettings
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.ProgressBar
import androidx.appcompat.app.AppCompatActivity


class MainActivity2 : AppCompatActivity() {
    lateinit var webView:WebView
    lateinit var pb:ProgressBar
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        webView = findViewById(R.id.webview)
        pb = findViewById(R.id.pb)
        webView.getSettings().setJavaScriptEnabled(true)
        webView.loadUrl("https://www.hotelmasterchef.in/")
        webView.webViewClient = myWebViewClient()
        val settings: WebSettings = webView.settings
        settings.domStorageEnabled = true
        webView.clearView()
        webView.measure(100, 100)
        settings.useWideViewPort = true
        settings.loadWithOverviewMode = true
    }
    class myWebViewClient : WebViewClient() {
        override fun shouldOverrideUrlLoading(view: WebView, url: String): Boolean {
            view.loadUrl(url)

            return true
        }
    }

    override fun onBackPressed() {
        if(webView.canGoBack()){
            webView.goBack()
        }else{
            finishAffinity()
        }

    }
}
