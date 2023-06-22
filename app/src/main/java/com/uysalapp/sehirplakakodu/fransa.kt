package com.uysalapp.sehirplakakodu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.uysalapp.sehirplakakodu.databinding.ActivityAlmanyaBinding
import com.uysalapp.sehirplakakodu.databinding.ActivityFransaBinding

class fransa : AppCompatActivity() {
    lateinit var binding: ActivityFransaBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFransaBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        binding.bul.setOnClickListener{
            if (binding.plkkodu.text.isNotEmpty()){
                var plakakodu = binding.plkkodu.text.toString().toInt()
                when(plakakodu){

                    1-> binding.sonuc.text="Ain"
                    2-> binding.sonuc.text="Aisne"
                    3-> binding.sonuc.text="Allier"
                    4-> binding.sonuc.text="Alpes-de-Haute-Provence"
                    5-> binding.sonuc.text="Hautes-Alpes"
                    6-> binding.sonuc.text="Alpes-Maritimes"
                    7-> binding.sonuc.text="Ardèche"
                    8-> binding.sonuc.text="Ardennes"
                    9-> binding.sonuc.text="Ariège"
                    10-> binding.sonuc.text="Aube"
                    11-> binding.sonuc.text="Aude"
                    12-> binding.sonuc.text="Aveyron"
                    13-> binding.sonuc.text="Bouches-du-Rhône"
                    14-> binding.sonuc.text="Calvados"
                    15-> binding.sonuc.text="Cantal"
                    16-> binding.sonuc.text="Charente"
                    17-> binding.sonuc.text="Charente-Maritime"
                    18-> binding.sonuc.text="Cher"
                    19-> binding.sonuc.text="Corrèze"
                    20-> binding.sonuc.text="Corse-du-Sud & Haute-Corse"
                    21-> binding.sonuc.text="Côte-d'Or"
                    22-> binding.sonuc.text="Côtes-d'Armor"
                    23-> binding.sonuc.text="Creuse"
                    24-> binding.sonuc.text="Dordogne"
                    25-> binding.sonuc.text="Doubs"
                    26-> binding.sonuc.text="Drôme"
                    27-> binding.sonuc.text="Eure"
                    28-> binding.sonuc.text="Eure-et-Loir"
                    29-> binding.sonuc.text="Finistère"
                    30-> binding.sonuc.text="Gard"
                    31-> binding.sonuc.text="Haute-Garonne"
                    32-> binding.sonuc.text="Gers"
                    33-> binding.sonuc.text="Gironde"
                    34-> binding.sonuc.text="Hérault"
                    35-> binding.sonuc.text="Ille-et-Vilaine"
                    36-> binding.sonuc.text="Indre"
                    37-> binding.sonuc.text="Indre et Loire"
                    38-> binding.sonuc.text="Isère"
                    39-> binding.sonuc.text="Jura"
                    40-> binding.sonuc.text="Landes"
                    41-> binding.sonuc.text="Loir et Cher"
                    42-> binding.sonuc.text="Loire"
                    43-> binding.sonuc.text="Haute Loire"
                    44-> binding.sonuc.text="Loire Atlantique"
                    45-> binding.sonuc.text="Loiret"
                    46-> binding.sonuc.text="Lot"
                    47-> binding.sonuc.text="Lot et Garonne"
                    48-> binding.sonuc.text="Lozère"
                    49-> binding.sonuc.text="Maine et Loire"
                    50-> binding.sonuc.text="Manche"
                    51-> binding.sonuc.text="Marne"
                    52-> binding.sonuc.text="Haute Marne"
                    53-> binding.sonuc.text="Mayenne"
                    54-> binding.sonuc.text="Meurthe et Moselle"
                    55-> binding.sonuc.text="Meuse"
                    56-> binding.sonuc.text="Morbihan"
                    57-> binding.sonuc.text="Moselle"
                    58-> binding.sonuc.text="Nièvre"
                    59-> binding.sonuc.text="Nord"
                    60-> binding.sonuc.text="Oise"
                    61-> binding.sonuc.text="Orne"
                    62-> binding.sonuc.text="Pas de Calais"
                    63-> binding.sonuc.text="Puy de Dôme"
                    64-> binding.sonuc.text="Pyrénées Atlantiques"
                    65-> binding.sonuc.text="Hautes Pyrénées"
                    66-> binding.sonuc.text="Pyrénées Orientales"
                    67-> binding.sonuc.text="Bas Rhin"
                    68-> binding.sonuc.text="Haut Rhin"
                    69-> binding.sonuc.text="Rhône"
                    70-> binding.sonuc.text="Haute Saône"
                    71-> binding.sonuc.text="Saône et Loire"
                    72-> binding.sonuc.text="Sarthe"
                    73-> binding.sonuc.text="Savoie"
                    74-> binding.sonuc.text="Haute Savoie"
                    75-> binding.sonuc.text="Paris"
                    76-> binding.sonuc.text="Seine Maritime"
                    77-> binding.sonuc.text="Seine et Marne"
                    78-> binding.sonuc.text="Yvelines"
                    79-> binding.sonuc.text="Deux Sèvres"
                    80-> binding.sonuc.text="Somme"
                    81-> binding.sonuc.text="Tarn"
                    82-> binding.sonuc.text="Tarn-et-Garonne"
                    83-> binding.sonuc.text="Var"
                    84-> binding.sonuc.text="Vaucluse"
                    85-> binding.sonuc.text="Vendée"
                    86-> binding.sonuc.text="Vienne"
                    87-> binding.sonuc.text="Haute-Vienne"
                    88-> binding.sonuc.text="Vosges"
                    89-> binding.sonuc.text="Yonne"
                    90-> binding.sonuc.text="Territoire de Belfort"
                    91-> binding.sonuc.text="Essonne"
                    92-> binding.sonuc.text="Hauts de Seine"
                    93-> binding.sonuc.text="Seine Saint Denis"
                    94-> binding.sonuc.text="Val de Marne"
                    95-> binding.sonuc.text="Val d Oise"


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
        val intent =Intent(this@fransa,ulkesecim::class.java)
        startActivity(intent)


    }
}