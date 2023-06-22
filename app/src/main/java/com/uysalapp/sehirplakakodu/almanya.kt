package com.uysalapp.sehirplakakodu

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.uysalapp.sehirplakakodu.databinding.ActivityAlmanyaBinding
import com.uysalapp.sehirplakakodu.databinding.ActivityTurkiyeBinding

class almanya : AppCompatActivity() {
    lateinit var binding: ActivityAlmanyaBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAlmanyaBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        binding.bul.setOnClickListener{
            if (binding.plkkodu.text.isNotEmpty()){
                var plakakodu = binding.plkkodu.text.toString()
                when(plakakodu){
                    "ac"-> binding.sonuc.text="Aachen"
                    "AC"-> binding.sonuc.text="Aachen"
                    "a"-> binding.sonuc.text="Augsburg"
                    "A"-> binding.sonuc.text="Augsburg"
                    "B"-> binding.sonuc.text="Berlin"
                    "b"-> binding.sonuc.text="Berlin"
                    "bi"-> binding.sonuc.text="Bielefeld"
                    "BI"-> binding.sonuc.text="Bielefeld"
                    "bo"-> binding.sonuc.text="Bochum"
                    "BO"-> binding.sonuc.text="Bochum"
                    "BN"-> binding.sonuc.text="Bonn"
                    "bn"-> binding.sonuc.text="Bonn"
                    "BS"-> binding.sonuc.text="Braunschweig"
                    "bs"-> binding.sonuc.text="Braunschweig"
                    "HB"-> binding.sonuc.text="Bremen"
                    "hb"-> binding.sonuc.text="Bremen"
                    "BHV"-> binding.sonuc.text="Bremerhaven"
                    "bhv"-> binding.sonuc.text="Bremerhaven"
                    "C"-> binding.sonuc.text="Chemnitz"
                    "c"-> binding.sonuc.text="Chemnitz"
                    "DA"-> binding.sonuc.text="Darmstadt"
                    "da"-> binding.sonuc.text="Darmstadt"
                    "DO"-> binding.sonuc.text="Dortmund"
                    "do"-> binding.sonuc.text="Dortmund"
                    "DD"-> binding.sonuc.text="Dresden"
                    "dd"-> binding.sonuc.text="Dresden"
                    "DU"-> binding.sonuc.text="Duisburg"
                    "du"-> binding.sonuc.text="Duisburg"
                    "D"-> binding.sonuc.text="Düsseldorf"
                    "d"-> binding.sonuc.text="Düsseldorf"
                    "EF"-> binding.sonuc.text="Erfurt"
                    "ef"-> binding.sonuc.text="Erfurt"
                    "ER"-> binding.sonuc.text="Erlangen"
                    "er"-> binding.sonuc.text="Erlangen"
                    "E"-> binding.sonuc.text="Essen"
                    "e"-> binding.sonuc.text="Essen"
                    "FL"-> binding.sonuc.text="Flensburg"
                    "fl"-> binding.sonuc.text="Flensburg"
                    "F"-> binding.sonuc.text="Frankfurt am Main"
                    "f"-> binding.sonuc.text="Frankfurt am Main"
                    "FR"-> binding.sonuc.text="Freiburg"
                    "fr"-> binding.sonuc.text="Freiburg"
                    "FÜ"-> binding.sonuc.text="Fürth"
                    "fü"-> binding.sonuc.text="Fürth"
                    "HH"-> binding.sonuc.text="Hamburg"
                    "hh"-> binding.sonuc.text="Hamburg"



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
        val intent = Intent(this@almanya,ulkesecim::class.java)
        startActivity(intent)


    }
}