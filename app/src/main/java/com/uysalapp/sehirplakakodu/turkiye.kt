package com.uysalapp.sehirplakakodu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.uysalapp.sehirplakakodu.databinding.ActivityTurkiyeBinding
import com.uysalapp.sehirplakakodu.databinding.ActivityUlkesecimBinding


class turkiye : AppCompatActivity() {
    lateinit var binding:ActivityTurkiyeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTurkiyeBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        binding.bul.setOnClickListener{
            if (binding.plkkodu.text.isNotEmpty()){
                var plakakodu = binding.plkkodu.text.toString().toInt()
                when(plakakodu){
                    1 -> binding.sonuc.text="Adana"
                    2 -> binding.sonuc.text="Adıyaman"
                    3 -> binding.sonuc.text="Afyon"
                    4 -> binding.sonuc.text="Ağrı"
                    5 -> binding.sonuc.text="Amasya"
                    6 -> binding.sonuc.text="Ankara"
                    7 -> binding.sonuc.text="Antalya"
                    8 -> binding.sonuc.text="Artvin"
                    9 -> binding.sonuc.text="Aydın"
                    10 -> binding.sonuc.text="Balıkesir"
                    11-> binding.sonuc.text="Bilecik"
                    12-> binding.sonuc.text="Bingöl"
                    13-> binding.sonuc.text="Bitlis"
                    14-> binding.sonuc.text="Bolu"
                    15 -> binding.sonuc.text="Burdur"
                    16-> binding.sonuc.text="Bursa"
                    17-> binding.sonuc.text="Çanakkale"
                    18-> binding.sonuc.text="Çankırı"
                    19-> binding.sonuc.text="Çorum"
                    20-> binding.sonuc.text="Denizli"
                    21-> binding.sonuc.text="Diyarbakır"
                    22-> binding.sonuc.text="Edirne"
                    23-> binding.sonuc.text="Elazığ"
                    24-> binding.sonuc.text="Erzincan"
                    25-> binding.sonuc.text="Erzurum"
                    26-> binding.sonuc.text="Eskişehir"
                    27-> binding.sonuc.text="Gaziantep"
                    28-> binding.sonuc.text="Giresun"
                    29-> binding.sonuc.text="Gümüşhane"
                    30-> binding.sonuc.text="Hakkari"
                    31-> binding.sonuc.text="Hatay"
                    32-> binding.sonuc.text="Isparta"
                    33-> binding.sonuc.text="Mersin"
                    34-> binding.sonuc.text="İstanbul"
                    35-> binding.sonuc.text="İzmir"
                    36-> binding.sonuc.text="Kars"
                    37-> binding.sonuc.text="Kastamonu"
                    38-> binding.sonuc.text="Kayseri"
                    39-> binding.sonuc.text="Kırklareli"
                    40-> binding.sonuc.text="Kırşehir"
                    41-> binding.sonuc.text="Kocaeli"
                    42-> binding.sonuc.text="Konya"
                    43-> binding.sonuc.text="Kütahya"
                    44-> binding.sonuc.text="Malatya"
                    45-> binding.sonuc.text="Manisa"
                    46-> binding.sonuc.text="K.Maraş"
                    47-> binding.sonuc.text="Mardin"
                    48-> binding.sonuc.text="Muğla"
                    49-> binding.sonuc.text="Muş"
                    50-> binding.sonuc.text="Nevşehir"
                    51-> binding.sonuc.text="Niğde"
                    52-> binding.sonuc.text="Ordu"
                    53-> binding.sonuc.text="Rize"
                    54-> binding.sonuc.text="Sakarya"
                    55-> binding.sonuc.text="Samsun"
                    56-> binding.sonuc.text="Siirt"
                    57-> binding.sonuc.text="Sinop"
                    58-> binding.sonuc.text="Sivas"
                    59-> binding.sonuc.text="Tekirdağ"
                    60-> binding.sonuc.text="Tokat"
                    61-> binding.sonuc.text="Trabzon"
                    62-> binding.sonuc.text="Tunceli"
                    63-> binding.sonuc.text="Şanlıurfa"
                    64-> binding.sonuc.text="Uşak"
                    65-> binding.sonuc.text="Van"
                    66-> binding.sonuc.text="Yozgat"
                    67-> binding.sonuc.text="Zonguldak"
                    68-> binding.sonuc.text="Aksaray"
                    69-> binding.sonuc.text="Bayburt"
                    70-> binding.sonuc.text="Karaman"
                    71-> binding.sonuc.text="Kırıkkale"
                    72-> binding.sonuc.text="Batman"
                    73-> binding.sonuc.text="Şırnak"
                    74-> binding.sonuc.text="Bartın"
                    75-> binding.sonuc.text="Ardahan"
                    76-> binding.sonuc.text="Iğdır"
                    77-> binding.sonuc.text="Yalova"
                    78-> binding.sonuc.text="Karabük"
                    79-> binding.sonuc.text="Kilis"
                    80-> binding.sonuc.text="Osmaniye"
                    81-> binding.sonuc.text="Düzce"


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
        val intent = Intent(this@turkiye,ulkesecim::class.java)
        startActivity(intent)


    }
}