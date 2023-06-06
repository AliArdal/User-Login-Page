package com.aliardal.kullanicigirissayfasi

import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    lateinit var preferences: SharedPreferences
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        preferences = getSharedPreferences("bilgiler", MODE_PRIVATE)
        Toast.makeText(applicationContext,"Hoşgeldiniz",Toast.LENGTH_LONG).show()
    }
    fun giris(view: View){
        var kayitliKullanici = preferences.getString("kullanici","")
        var kayitliParola = preferences.getString("parola","")

        var girisKullanici = girisKullaniciAdi.text.toString()
        var girisParola = girisParola.text.toString()

        if(kayitliKullanici==girisKullanici && (kayitliParola==girisParola)){
            intent = Intent(applicationContext,MainHosgeldiniz::class.java)
            startActivity(intent)

        }else{
            Toast.makeText(applicationContext,"Giriş Bilgileri Hatalı",Toast.LENGTH_LONG).show()
        }




    }
    fun kayit(view: View){
        intent = Intent(applicationContext,MainKayitOl::class.java)
        startActivity(intent)
    }
}