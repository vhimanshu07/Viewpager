package com.example.viewpager

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.viewpager.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        setupViewPager()
    }

    private fun setupViewPager() {
        val viewPager = binding.viewpager
        val tableLayout= binding.tabLayout
        tableLayout.setupWithViewPager(viewPager)
        viewPager.adapter = ViewerPageAdapter(supportFragmentManager)
    }

}