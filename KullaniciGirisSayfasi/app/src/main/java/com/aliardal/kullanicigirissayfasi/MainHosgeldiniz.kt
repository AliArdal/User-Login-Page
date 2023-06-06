package com.aliardal.kullanicigirissayfasi

import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main_hosgeldiniz.*

class MainHosgeldiniz : AppCompatActivity() {
    lateinit var preferences: SharedPreferences
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_hosgeldiniz)
        //xmlden verileri çek
        preferences = getSharedPreferences("bilgiler", MODE_PRIVATE)
        var kayitliKullanici = preferences.getString("kullanici","")
        var kayitliParola = preferences.getString("parola","")
        //textviewlere kayitli bilgileri aktarma
        kullaniciBilgisi.text = "Kullanici Adı:"+kayitliKullanici.toString()
        kullaniciParola.text= "Kullanıcı Parola"+kayitliParola.toString()
    }
    fun cikis(view: View){
        intent = Intent(applicationContext,MainActivity::class.java)
        startActivity(intent)
        finish()

    }

}