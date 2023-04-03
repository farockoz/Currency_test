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
        /*
        val button = findViewById<Button>(R.id.button_test)
        button.setOnClickListener{
            GetResult("EUR", "USD")
        }
        */
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.fragment_1, Currency_fragment.newInstance())
            .commit()
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.fragment_2, Stonks_main.newInstance())
            .commit()
    }
    /*
    private fun GetResult(first_curr: String, base_curr:String){
        val url = "https://api.currencyapi.com/v3/latest?apikey=$API_KEY" +
                "&currencies=$first_curr&base_currency=$base_curr"
        val queue = Volley.newRequestQueue(this)
        val stringRequest = StringRequest(com.android.volley.Request.Method.GET,
            url, {response -> Log.d("My log", "$response")
                 /*textView.text = "Response is: ${response}"*/

            }, {
                Log.d("My Log", "Volley error: $it")

            }
        )
        queue.add(stringRequest)

    }

     */
}