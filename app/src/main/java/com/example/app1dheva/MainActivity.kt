package com.example.app1dheva

import android.os.Bundle
import android.content.Intent
import android.net.Uri
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.app1dheva.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Tombol Instagram
        binding.BtnInstagram.setOnClickListener {
            val instagramInten = Intent(Intent.ACTION_VIEW, Uri.parse("https://instagram.com/sridheva.awn"))
            startActivity(instagramInten)
        }

        // tombol Whastapp
        binding.BtnWa.setOnClickListener {
            val phoneNumber = "089667981071"
            val whatsappIntent = Intent(Intent.ACTION_VIEW, Uri.parse("https://wa.me/$phoneNumber"))
            startActivity(whatsappIntent)
        }
    }
}