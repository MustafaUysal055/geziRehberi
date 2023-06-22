package com.uysalapp.sehirplakakodu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class kapalicarsi : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kapalicarsi)
    }

fun geri(view: View) {
    val intent = Intent(this@kapalicarsi, istanbul1::class.java)
    startActivity(intent)
}
}