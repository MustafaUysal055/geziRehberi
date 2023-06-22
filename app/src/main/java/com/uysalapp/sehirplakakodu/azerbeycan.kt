package com.uysalapp.sehirplakakodu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.uysalapp.sehirplakakodu.databinding.ActivityAzerbeycanBinding

class azerbeycan : AppCompatActivity() {
    private lateinit var binding: ActivityAzerbeycanBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAzerbeycanBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        binding.bul.setOnClickListener{
            if (binding.plkkodu.text.isNotEmpty()){
                var plakakodu = binding.plkkodu.text.toString()
                when(plakakodu){
                    "AB"-> binding.sonuc.text="Abşeron"
                    "ab"-> binding.sonuc.text="Abşeron"
                    "AGC"-> binding.sonuc.text="Ağcabədi"
                    "agc"-> binding.sonuc.text="Abşeron"
                    "AGM"-> binding.sonuc.text="Ağdam"
                    "agm"-> binding.sonuc.text="Abşeron"
                    "AGS"-> binding.sonuc.text="Ağdaş"
                    "ags"-> binding.sonuc.text="Abşeron"
                    "AGA"-> binding.sonuc.text="Ağstafa"
                    "aga"-> binding.sonuc.text="Ağstafa"
                    "AGU"-> binding.sonuc.text="Ağsu"
                    "agu"-> binding.sonuc.text="Ağstafa"
                    "AST"-> binding.sonuc.text="Astara"
                    "ast"-> binding.sonuc.text="Ağstafa"
                    "BA"-> binding.sonuc.text="Bakı"
                    "ba"-> binding.sonuc.text="Bakı"
                    "BAL"-> binding.sonuc.text="Balakən"
                    "bal"-> binding.sonuc.text="Balakən"
                    "BRD"-> binding.sonuc.text="Bərdə"
                    "brd"-> binding.sonuc.text="Bərdə"
                    "BEY"-> binding.sonuc.text="Beyləqan"
                    "bey"-> binding.sonuc.text="Beyləqan"
                    "BIL"-> binding.sonuc.text="Biləsuvar"
                    "bil"-> binding.sonuc.text="Biləsuvar"
                    "CBR"-> binding.sonuc.text="Cəbrayıl"
                    "cbr"-> binding.sonuc.text="Cəbrayıl"
                    "CAL"-> binding.sonuc.text="Cəlilabad"
                    "cal"-> binding.sonuc.text="Cəlilabad"
                    "DAŞ"-> binding.sonuc.text="Daşkəsən"
                    "daş"-> binding.sonuc.text="Daşkəsən"
                    "FZL"-> binding.sonuc.text="Füzuli"
                    "fzl"-> binding.sonuc.text="Füzuli"
                    "GAD"-> binding.sonuc.text="Gədəbəy"
                    "gad"-> binding.sonuc.text="Gədəbəy"
                    "GOY"-> binding.sonuc.text="Göyçay"
                    "goy"-> binding.sonuc.text="Göyçay"
                    "HAC"-> binding.sonuc.text="Hacıqabul"
                    "hac"-> binding.sonuc.text="Hacıqabul"
                    "İMT"-> binding.sonuc.text="İmişli"
                    "imt"-> binding.sonuc.text="İmişli"
                    "İSMA"-> binding.sonuc.text="İsmayıllı"
                    "isma"-> binding.sonuc.text="İsmayıllı"
                    "KLB"-> binding.sonuc.text="Kəlbəcər"
                    "klb"-> binding.sonuc.text="Kəlbəcər"
                    "KUR"-> binding.sonuc.text="Kürdəmir"
                    "kur"-> binding.sonuc.text="Kürdəmir"
                    "LAC"-> binding.sonuc.text="Laçın"
                    "lac"-> binding.sonuc.text="Laçın"
                    "LƏ"-> binding.sonuc.text="Lənkəran"
                    "lƏ"-> binding.sonuc.text="Lənkəran"
                    "LRK"-> binding.sonuc.text="Lerik"
                    "lrk"-> binding.sonuc.text="Lerik"
                    "MAS"-> binding.sonuc.text="Masallı"
                    "mas"-> binding.sonuc.text="Masallı"
                    "NEF"-> binding.sonuc.text="Neftçala"
                    "nef"-> binding.sonuc.text="Neftçala"
                    "OGZ"-> binding.sonuc.text="Oğuz"
                    "ogz"-> binding.sonuc.text="Oğuz"
                    "QAB"-> binding.sonuc.text="Qəbələ "
                    "qab"-> binding.sonuc.text="Qəbələ"
                    "Qax "-> binding.sonuc.text="Qax"
                    "qax"-> binding.sonuc.text="Qax"
                    "QAZ"-> binding.sonuc.text="Qazax"
                    "qaz"-> binding.sonuc.text="Qazax"
                    "QOB"-> binding.sonuc.text="Qobustan"
                    "qob"-> binding.sonuc.text="Qobustan"
                    "QBA"-> binding.sonuc.text="Quba"
                    "qba"-> binding.sonuc.text="Quba"
                    "QBD"-> binding.sonuc.text="Qubadlı"
                    "qbd"-> binding.sonuc.text="Qubadlı"
                    "QUS"-> binding.sonuc.text="Qusar"
                    "qus"-> binding.sonuc.text="Qusar"
                    "SA"-> binding.sonuc.text="Saatlı"
                    "sa"-> binding.sonuc.text="Saatlı"
                    "SAB"-> binding.sonuc.text="Sabirabad"
                    "sab"-> binding.sonuc.text="Sabirabad"
                    "ŞA"-> binding.sonuc.text="Şabran"
                    "şa"-> binding.sonuc.text="Şabran"
                    "SAD"-> binding.sonuc.text="Sədərək"
                    "sad"-> binding.sonuc.text="Sədərək"
                    "ŞE"-> binding.sonuc.text="Şəki"
                    "şe"-> binding.sonuc.text="Şəki"
                    "ŞKI"-> binding.sonuc.text="Şəmkir"
                    "şkı"-> binding.sonuc.text="Şəmkir"
                    "ŞR"-> binding.sonuc.text="Şərur"
                    "şr"-> binding.sonuc.text="Şərur"
                    "SIZ"-> binding.sonuc.text="Siyəzən"
                    "sız"-> binding.sonuc.text="Siyəzən"
                    "SMT"-> binding.sonuc.text="Sumqayıt"
                    "smt"-> binding.sonuc.text="Sumqayıt"
                    "ŞU"-> binding.sonuc.text="Şuşa"
                    "şu"-> binding.sonuc.text="Şuşa"
                    "TƏR"-> binding.sonuc.text="Tərtər"
                    "tƏr"-> binding.sonuc.text="Tərtər"
                    "TOV"-> binding.sonuc.text="Tovuz"
                    "tov"-> binding.sonuc.text="Tovuz"
                    "UCA"-> binding.sonuc.text="Ucar"
                    "uca"-> binding.sonuc.text="Ucar"
                    "XAÇ"-> binding.sonuc.text="Xaçmaz"
                    "xaç"-> binding.sonuc.text="Xaçmaz"
                    "XIZ"-> binding.sonuc.text="Xızı"
                    "xız"-> binding.sonuc.text="Xızı"
                    "XOC"-> binding.sonuc.text="Xocalı"
                    "xoc"-> binding.sonuc.text="Xocalı"
                    "XVD"-> binding.sonuc.text="Xocavənd"
                    "xvd"-> binding.sonuc.text="Xocavənd"
                    "YAR"-> binding.sonuc.text="Yardımlı"
                    "yar"-> binding.sonuc.text="Yardımlı"
                    "YEV"-> binding.sonuc.text="Yevlax"
                    "yev"-> binding.sonuc.text="Yevlax"
                    "ZƏN"-> binding.sonuc.text="Zəngilan"
                    "zƏn"-> binding.sonuc.text="Zəngilan"
                    "ZAQ"-> binding.sonuc.text="Zaqatala"
                    "zaq"-> binding.sonuc.text="Zaqatala"
                    "ZAR"-> binding.sonuc.text="Zərdab"
                    "zar"-> binding.sonuc.text="Zərdab"


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
        val intent = Intent(this@azerbeycan,ulkesecim::class.java)
        startActivity(intent)


    }
}



