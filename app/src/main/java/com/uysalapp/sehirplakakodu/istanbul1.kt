package com.uysalapp.sehirplakakodu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.uysalapp.sehirplakakodu.databinding.ActivityIstanbul1Binding

class istanbul1 : AppCompatActivity() {
    private lateinit var binding: ActivityIstanbul1Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityIstanbul1Binding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
    }


    fun geri(view: View) {
        val intent = Intent(this@istanbul1, gezilecekyer::class.java)
        startActivity(intent)
    }

    fun ayasofya(view: View) {
        val intent = Intent(this@istanbul1, ayasofya::class.java)
        startActivity(intent)
    }

    fun dolmabahce(view: View) {
        val intent = Intent(this@istanbul1, dolmabahce::class.java)
        startActivity(intent)
    }

    fun topkapi(view: View) {
        val intent = Intent(this@istanbul1, topkapi::class.java)
        startActivity(intent)
    }

    fun sultanahmet(view: View) {
        val intent = Intent(this@istanbul1, sultanahmet::class.java)
        startActivity(intent)
    }
    fun rumeli(view: View) {
        val intent = Intent(this@istanbul1, rumeli::class.java)
        startActivity(intent)
    }
    fun kapalicarsi(view: View) {
        val intent = Intent(this@istanbul1, kapalicarsi::class.java)
        startActivity(intent)
    }
}

