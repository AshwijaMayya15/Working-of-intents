package com.example.intents

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.os.StrictMode
import android.os.StrictMode.VmPolicy
import androidx.appcompat.app.AppCompatActivity
import com.example.intents.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.expBtn.setOnClickListener {
            val intent = Intent(this,SecondActivity::class.java)
            startActivity(intent)
        }

        binding.impBtn.setOnClickListener {
            val intent2 = Intent(Intent.ACTION_VIEW)
            intent2.setData(Uri.parse("https://www.google.com"))
            startActivity(intent2)
        }
    }
}