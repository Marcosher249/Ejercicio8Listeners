package com.example.ejercicio8listeners

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.ejercicio8listeners.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.button.setOnClickListener{
            binding.imageView.setImageResource(R.drawable.humano)
        }
        binding.button2.setOnClickListener(){
            binding.imageView.setImageResource(R.drawable.elfo)
        }
        binding.button3.setOnClickListener(){
            binding.imageView.setImageResource(R.drawable.enano)
        }
        binding.button5.setOnClickListener(){
            binding.imageView.setImageResource(R.drawable.goblin)
        }
        binding.button4.setOnClickListener(){
            val intent = Intent(this, MainActivity2::class.java).apply {
            }
            startActivity(intent)

        }
    }
}