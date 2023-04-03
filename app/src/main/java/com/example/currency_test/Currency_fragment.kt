package com.example.currency_test

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import com.android.volley.Request
import com.android.volley.toolbox.StringRequest
import com.android.volley.toolbox.Volley


class Currency_fragment : Fragment(), View.OnClickListener{
    override fun onClick(v: View?) {

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val button = view?.findViewById<Button>(R.id.button_1)
        button?.setOnClickListener{getResult("EUR", "USD")

        }
        return inflater.inflate(R.layout.fragment_currency_fragment, container, false)
    }
    private fun getResult(first_curr: String, base_curr:String){
        val url = "https://api.currencyapi.com/v3/latest?apikey=$API_KEY" +
                "&currencies=$first_curr&base_currency=$base_curr"
        val queue = Volley.newRequestQueue(context)
        val stringRequest = StringRequest(
            Request.Method.GET,
            url, {response -> Log.d("My log", "$response")
                /*textView.text = "Response is: ${response}"*/

            }, {
                Log.d("My Log", "Volley error: $it")

            }
        )
        queue.add(stringRequest)

    }

    companion object {

        @JvmStatic
        fun newInstance() = Currency_fragment()

    }
}