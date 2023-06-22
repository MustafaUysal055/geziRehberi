package com.uysalapp.sehirplakakodu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class anitkabir : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_anitkabir)
    }
    fun geri(view: View) {
        val intent = Intent(this@anitkabir, ankara::class.java)
        startActivity(intent)

    }
}