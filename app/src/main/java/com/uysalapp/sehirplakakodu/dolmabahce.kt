package com.uysalapp.sehirplakakodu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.uysalapp.sehirplakakodu.databinding.ActivityDolmabahceBinding
import com.uysalapp.sehirplakakodu.databinding.ActivityIstanbul1Binding

class dolmabahce : AppCompatActivity() {
    private lateinit var binding: ActivityDolmabahceBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDolmabahceBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
    }
    fun geri(view: View) {
        val intent = Intent(this@dolmabahce, istanbul1::class.java)
        startActivity(intent)
    }
}