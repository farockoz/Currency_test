package com.example.currency_test

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.android.volley.Request
import com.android.volley.toolbox.StringRequest
import com.android.volley.toolbox.Volley

const val API_KEY = "P3MO6TiVOppzktqOzMz0QpoVZ2koxq7idlxCkSAo"
class Stonks_main : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_stonks_main, container, false)
    }

    companion object {


        @JvmStatic
        fun newInstance() = Stonks_main()
    }
}