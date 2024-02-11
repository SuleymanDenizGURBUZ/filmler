package com.suleymandeniz.filmler

data class Filmler(var filmId : Int,
                   var filmAdi : String,
                   var filmYil : Int,
                   var kategori: Kategoriler,
                   var yonetmen: Yonetmenler)

