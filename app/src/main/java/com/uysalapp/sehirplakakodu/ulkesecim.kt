package com.uysalapp.sehirplakakodu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.uysalapp.sehirplakakodu.databinding.ActivityUlkesecimBinding

class ulkesecim : AppCompatActivity() {
    private lateinit var binding: ActivityUlkesecimBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityUlkesecimBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

    }

    fun trBayrak(view: View) {
        val intent = Intent(this@ulkesecim,turkiye::class.java)
        startActivity(intent)

    }
    fun almBayrak(view: View) {
        val intent = Intent(this@ulkesecim,almanya::class.java)
        startActivity(intent)

    }
    fun azBayrak(view: View) {
        val intent = Intent(this@ulkesecim,azerbeycan::class.java)
        startActivity(intent)

    }
    fun frBayrak(view: View) {
        val intent = Intent(this@ulkesecim,fransa()::class.java)
        startActivity(intent)

    }
    fun itBayrak(view: View) {
        val intent = Intent(this@ulkesecim,ıtalya()::class.java)
        startActivity(intent)

    }
    fun geri(view: View) {
        val intent = Intent(this@ulkesecim, baslangic::class.java)
        startActivity(intent)
    }
}
