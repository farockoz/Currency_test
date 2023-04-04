package com.example.currency_test

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.currency_test.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

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