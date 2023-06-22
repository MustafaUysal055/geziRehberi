package com.uysalapp.sehirplakakodu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.uysalapp.sehirplakakodu.databinding.ActivityGezilecekyerBinding

class gezilecekyer : AppCompatActivity() {
    private lateinit var binding: ActivityGezilecekyerBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityGezilecekyerBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

    }

    fun geri(view: View) {
        val intent = Intent(this@gezilecekyer, baslangic::class.java)
        startActivity(intent)

    }

    fun ist(view: View) {
        val intent = Intent(this@gezilecekyer, istanbul1::class.java)
        startActivity(intent)
    }
    fun ankara(view: View) {
        val intent = Intent(this@gezilecekyer, ankara::class.java)
        startActivity(intent)
    }
    fun malatya(view: View) {
        val intent = Intent(this@gezilecekyer, malatya::class.java)
        startActivity(intent)
    }
    fun yozgat(view: View) {
        val intent = Intent(this@gezilecekyer, yozgat::class.java)
        startActivity(intent)
    }
    fun samsun(view: View) {
        val intent = Intent(this@gezilecekyer, samsun::class.java)
        startActivity(intent)
    }
    fun antalya(view: View) {
        val intent = Intent(this@gezilecekyer, antalya::class.java)
        startActivity(intent)
    }
    fun konya(view: View) {
        val intent = Intent(this@gezilecekyer, konya::class.java)
        startActivity(intent)
    }
    fun giresun(view: View) {
        val intent = Intent(this@gezilecekyer, giresun::class.java)
        startActivity(intent)
    }
    fun denizli(view: View) {
        val intent = Intent(this@gezilecekyer, denizli::class.java)
        startActivity(intent)
    }
    fun sivas(view: View) {
        val intent = Intent(this@gezilecekyer, sivas::class.java)
        startActivity(intent)
    }
    fun amasya(view: View) {
        val intent = Intent(this@gezilecekyer, amasya::class.java)
        startActivity(intent)
    }
    fun adapazari(view: View) {
        val intent = Intent(this@gezilecekyer, adapazari::class.java)
        startActivity(intent)
    }
    fun adiyaman(view: View) {
        val intent = Intent(this@gezilecekyer, adiyaman::class.java)
        startActivity(intent)
    }
    fun afyon(view: View) {
        val intent = Intent(this@gezilecekyer, afyon::class.java)
        startActivity(intent)
    }
    fun agri(view: View) {
        val intent = Intent(this@gezilecekyer, agri::class.java)
        startActivity(intent)
    }
    fun aksaray(view: View) {
        val intent = Intent(this@gezilecekyer, aksaray::class.java)
        startActivity(intent)
    }
    fun edirne(view: View) {
        val intent = Intent(this@gezilecekyer, edirne::class.java)
        startActivity(intent)
    }
    fun canakkale(view: View) {
        val intent = Intent(this@gezilecekyer, canakkale::class.java)
        startActivity(intent)
    }
    fun ordu(view: View) {
        val intent = Intent(this@gezilecekyer, ordu::class.java)
        startActivity(intent)
    }
    fun izmir(view: View) {
        val intent = Intent(this@gezilecekyer, izmir::class.java)
        startActivity(intent)
    }
    fun rize(view: View) {
        val intent = Intent(this@gezilecekyer, rize::class.java)
        startActivity(intent)
    }
    fun nevsehir(view: View) {
        val intent = Intent(this@gezilecekyer, nevsahir::class.java)
        startActivity(intent)
    }
    fun kutahya(view: View) {
        val intent = Intent(this@gezilecekyer, kutahya::class.java)
        startActivity(intent)
    }
    fun trabzon(view: View) {
        val intent = Intent(this@gezilecekyer, trabzon::class.java)
        startActivity(intent)
    }
    fun ardihan(view: View) {
        val intent = Intent(this@gezilecekyer, ardihan::class.java)
        startActivity(intent)
    }
    fun bursa(view: View) {
        val intent = Intent(this@gezilecekyer, bursa::class.java)
        startActivity(intent)
    }
    fun gaziantep(view: View) {
        val intent = Intent(this@gezilecekyer, gaziantep::class.java)
        startActivity(intent)
    }
    fun kars(view: View) {
        val intent = Intent(this@gezilecekyer, kars::class.java)
        startActivity(intent)
    }
    fun kayseri(view: View) {
        val intent = Intent(this@gezilecekyer, kayseri::class.java)
        startActivity(intent)
    }
    fun sinop(view: View) {
        val intent = Intent(this@gezilecekyer, sinop::class.java)
        startActivity(intent)
    }
}

