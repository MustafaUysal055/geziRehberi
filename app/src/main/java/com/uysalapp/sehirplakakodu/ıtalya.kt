package com.uysalapp.sehirplakakodu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.uysalapp.sehirplakakodu.databinding.ActivityFransaBinding
import com.uysalapp.sehirplakakodu.databinding.ActivityItalyaBinding

class ıtalya : AppCompatActivity() {
    lateinit var binding: ActivityItalyaBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityItalyaBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        binding.bul.setOnClickListener{
            if (binding.plkkodu.text.isNotEmpty()){
                var plakakodu = binding.plkkodu.text.toString()
                when(plakakodu){

                    "MI"-> binding.sonuc.text="Milano"
                    "mı"-> binding.sonuc.text="Milano"
                    "RM"-> binding.sonuc.text="Roma"
                    "rm"-> binding.sonuc.text="Roma"
                    "NA"-> binding.sonuc.text="Napoli"
                    "na"-> binding.sonuc.text="Napoli"
                    "To"-> binding.sonuc.text="Torino"
                    "to"-> binding.sonuc.text="Torino"
                    "PA"-> binding.sonuc.text="Palermo"
                    "pa"-> binding.sonuc.text="Palermo"
                    "GE"-> binding.sonuc.text="Genova"
                    "ge"-> binding.sonuc.text="Genova"
                    "BO"-> binding.sonuc.text="Bologna"
                    "bo"-> binding.sonuc.text="Bologna"
                    "FI"-> binding.sonuc.text="Floransa"
                    "fı"-> binding.sonuc.text="Floransa"
                    "VE"-> binding.sonuc.text="Venedik"
                    "ve"-> binding.sonuc.text="Venedik"
                    "VR"-> binding.sonuc.text="Verona"
                    "vr"-> binding.sonuc.text="Verona"
                    "BA"-> binding.sonuc.text="Bari"
                    "ba"-> binding.sonuc.text="Bari"
                    "CT"-> binding.sonuc.text="Katanya"
                    "ct"-> binding.sonuc.text="Katanya"
                    "PD"-> binding.sonuc.text="Padova"
                    "pd"-> binding.sonuc.text="Padova"
                    "TS"-> binding.sonuc.text="Trieste"
                    "ts"-> binding.sonuc.text="Trieste"
                    "BS"-> binding.sonuc.text="Brescia"
                    "bs"-> binding.sonuc.text="Brescia"



                    else -> {
                        binding.sonuc.text = "Bulunamadı"
                    }
                }

            }
            else{
                binding.sonuc.text = "Şehir plaka Kodu Giriniz"
            }
            binding.plkkodu.text.clear()
        }

    }
    fun bayraklar(view: View) {
        val intent = Intent(this@ıtalya,ulkesecim::class.java)
        startActivity(intent)


    }
}