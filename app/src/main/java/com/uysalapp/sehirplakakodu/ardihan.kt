package com.uysalapp.sehirplakakodu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class ardihan : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ardihan)
    }
    fun geri(view: View) {
        val intent = Intent(this@ardihan, gezilecekyer::class.java)
        startActivity(intent)

    }
}