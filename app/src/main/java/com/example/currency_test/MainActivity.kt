package com.example.currency_test

import android.app.DownloadManager.Request
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextView
import com.android.volley.toolbox.StringRequest
import com.android.volley.toolbox.Volley
import org.json.JSONObject

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportFragmentManager
            .beginTransaction()
            .replace(R.id.fragment_1, Currency_fragment.newInstance())
            .commit()
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.fragment_2, Stonks_main.newInstance())
            .commit()
    }

}