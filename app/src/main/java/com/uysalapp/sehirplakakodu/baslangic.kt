package com.uysalapp.sehirplakakodu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.uysalapp.sehirplakakodu.databinding.ActivityBaslangicBinding

class baslangic : AppCompatActivity() {
    private lateinit var binding: ActivityBaslangicBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBaslangicBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
    }

    fun trGezi(view: View) {
        val intent = Intent(this@baslangic, gezilecekyer::class.java)
        startActivity(intent)
    }
    fun plakaUlke(view: View) {
        val intent = Intent(this@baslangic, ulkesecim::class.java)
        startActivity(intent)
    }
}