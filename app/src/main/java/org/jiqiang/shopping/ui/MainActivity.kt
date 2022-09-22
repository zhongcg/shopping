package org.jiqiang.shopping.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import org.jiqiang.shopping.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.title
        binding.topBar.title = "Title"



    }
}