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

const val API_KEY = "P3MO6TiVOppzktqOzMz0QpoVZ2koxq7idlxCkSAo"
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
    //val textView = findViewById<TextView>(R.id.text_main)
    private fun GetResult(first_curr: String = "EUR", base_curr:String = "USD"){
        val url = "https://api.currencyapi.com/v3/latest?apikey=$API_KEY" +
                "&currencies=$first_curr&base_currency=$base_curr"
        val queue = Volley.newRequestQueue(this)
        val stringRequest = StringRequest(com.android.volley.Request.Method.GET,
            url, {response -> Log.d("My log", response)
                 /*textView.text = "Response is: ${response}"*/

            }, {
                Log.d("My Log", "Volley error: $it")

            }
        )
        queue.add(stringRequest)

    }

}