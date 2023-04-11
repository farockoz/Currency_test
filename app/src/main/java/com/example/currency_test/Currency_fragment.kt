package com.example.currency_test

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.Navigation
import com.android.volley.Request
import com.android.volley.toolbox.StringRequest
import com.android.volley.toolbox.Volley
import com.example.currency_test.databinding.FragmentCurrencyFragmentBinding

const val API_KEY = "P3MO6TiVOppzktqOzMz0QpoVZ2koxq7idlxCkSAo"
class Currency_fragment : Fragment() {
    private var _binding: FragmentCurrencyFragmentBinding? = null
    private val binding: FragmentCurrencyFragmentBinding? get() = _binding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentCurrencyFragmentBinding.inflate(inflater, container, false)
        val view = binding?.root
        return view
        binding!!.buttonTest.setOnClickListener{
            view:View -> Navigation.findNavController(view).navigate(R.id.action_currency_fragment_to_stonks_main)
        }
        /*val view = inflater.inflate(R.layout.fragment_currency_fragment, container, false)
        val button = view.findViewById<Button>(R.id.button_1)
        button.setOnClickListener {
            getResult("USD", "EUR")
        }
        return view
*/
    }
    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    private fun getResult(first_curr: String, base_curr: String) {
        val url = "https://api.currencyapi.com/v3/latest?apikey=$API_KEY" +
                "&currencies=$first_curr&base_currency=$base_curr"
        val queue = Volley.newRequestQueue(requireContext())
        val stringRequest = StringRequest(
            Request.Method.GET,
            url, { response ->
                Log.d("My log", "$response")
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
