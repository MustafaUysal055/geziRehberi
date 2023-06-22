package com.uysalapp.sehirplakakodu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class edirne : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edirne)
    }
    fun geri(view: View) {
        val intent = Intent(this@edirne, gezilecekyer::class.java)
        startActivity(intent)

    }
}