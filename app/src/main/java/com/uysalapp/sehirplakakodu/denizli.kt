package com.uysalapp.sehirplakakodu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class denizli : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_denizli)
    }

fun geri(view: View) {
    val intent = Intent(this@denizli, gezilecekyer::class.java)
    startActivity(intent)
 }
}