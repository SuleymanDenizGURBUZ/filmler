package com.suleymandeniz.filmler

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //kategoriler nesnesi
        val k1 = Kategoriler(1,"aksiyon")
        val k2 = Kategoriler(2,"korku")
        val k3 = Kategoriler(3,"komedi")

        //yonetmenler nesnesi
        val y1 = Yonetmenler(1,"husnu")
        val y2 = Yonetmenler(2,"mahmut")
        val y3 = Yonetmenler(3,"mehmut")

        //film nesneleri
        val f1 = Filmler(1,"yavas ve ofkesiz",2018,k1,y2)
        val f2 = Filmler(2,"granny",2014,k2,y1)
        val f3 = Filmler(3,"evde tek basına 2",2023,k3,y3)

        //f1 ekrana yazdırma
        println("film adı : ${f1.filmAdi}")
        println("film yıl : ${f1.filmYil}")
        println("film kategorisi : ${f1.kategori.kategoriAd}")
        println("film yonetmeni : ${f1.yonetmen.yonetmenAdi}")

        //f2 ekrana yazdırma
        println("========================================================")
        println("film adı : ${f2.filmAdi}")
        println("film yıl : ${f2.filmYil}")
        println("film kategorisi : ${f2.kategori.kategoriAd}")
        println("film yonetmeni : ${f2.yonetmen.yonetmenAdi}")

        //f3 ekrana yazdırma
        println("=========================================================")
        println("film adı : ${f3.filmAdi}")
        println("film yıl : ${f3.filmYil}")
        println("film kategorisi : ${f3.kategori.kategoriAd}")
        println("film yonetmeni : ${f3.yonetmen.yonetmenAdi}")

    }
}