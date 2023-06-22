package com.uysalapp.sehirplakakodu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.uysalapp.sehirplakakodu.databinding.ActivityAyasofyaBinding
import com.uysalapp.sehirplakakodu.databinding.ActivityIstanbul1Binding

class ayasofya : AppCompatActivity() {
    private lateinit var binding: ActivityAyasofyaBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAyasofyaBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
    }
    fun geri(view: View) {
        val intent = Intent(this@ayasofya, istanbul1::class.java)
        startActivity(intent)
    }
}