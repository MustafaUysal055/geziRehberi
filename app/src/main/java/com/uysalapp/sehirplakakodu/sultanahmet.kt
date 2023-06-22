package com.uysalapp.sehirplakakodu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class sultanahmet : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sultanahmet)
    }
    fun geri(view: View) {
        val intent = Intent(this@sultanahmet, istanbul1::class.java)
        startActivity(intent)
    }
}
