package com.uysalapp.sehirplakakodu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class ankara : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ankara)
    }
    fun geri(view: View) {
        val intent = Intent(this@ankara, gezilecekyer::class.java)
        startActivity(intent)
    }
    fun anitkabir(view: View) {
        val intent = Intent(this@ankara, anitkabir::class.java)
        startActivity(intent)
    }
}