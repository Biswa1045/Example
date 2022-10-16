package com.biswa1045.example

import android.os.Bundle
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
        webView.loadUrl("http://www.google.com")
        webView.setWebViewClient(myWebViewClient())
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