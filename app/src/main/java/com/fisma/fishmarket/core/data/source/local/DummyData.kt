package com.fisma.fishmarket.core.data.source.local

import com.fisma.fishmarket.core.data.source.model.Category
import com.fisma.fishmarket.core.data.source.model.Product
import com.fisma.fishmarket.core.data.source.model.Slider
import com.fisma.fishmarket.R

object DummyData {
    val listCategory = listOf(
            Category(id = "1", name = "Ikan", image = R.drawable.ikan),
            Category(id = "2", name = "Udang", image = R.drawable.udang),
            Category(id = "3", name = "Kepiting", image = R.drawable.kepiting),
            Category(id = "4", name = "Kerang", image = R.drawable.kerang),
            Category(id = "5", name = "Pakan", image = R.drawable.pakan),
            Category(id = "6", name = "Peralatan ", image = R.drawable.alat),
            Category(id = "7", name = "Makanan  ", image = R.drawable.makanan),
//            Category(id = "8", name = "Travel", image = R.drawable.asset_travel),
//            Category(id = "9", name = "Komputer", image = R.drawable.asset_komputer),
            Category(id = "10", name = "Semua", image = R.drawable.asset_semua),
    )

    val listSlider = listOf(
            Slider(id = "1", name = "Slider1", image = R.drawable.asset_slider1),
            Slider(id = "2", name = "Slider2", image = R.drawable.asset_slider2),
            Slider(id = "3", name = "Slider3", image = R.drawable.asset_slider3),
    )

    val listProduct = listOf(
            Product(id = "1", name = "Daging Ikan Salmon Fillet | Potong | 150 Gram | Segar", harga = 98000, pengirirman = "Bawean", terjual = 150, rating = 5.0, discount = 0, grosir = true, image = R.drawable.asset_produk1),
            Product(id = "2", name = "Daging Ikan Red Bass Fillet | 250 Gram", harga = 45000, pengirirman = "Gresik", terjual = 150, rating = 5.0, discount = 10, grosir = true, image = R.drawable.asset_produk2),
            Product(id = "3", name = "Ikan Tuna | 1 ekor | 3 Kg", harga = 100000, pengirirman = "Paciran", terjual = 530, rating = 5.0, discount = 15, grosir = false, image = R.drawable.asset_produk3),
            Product(id = "4", name = "Cumi Cumi", harga = 165000, pengirirman = "Tuban", terjual = 1150, rating = 5.0, discount = 0, grosir = true, image = R.drawable.asset_produk4),
            Product(id = "5", name = "Kerapu Macan", harga = 200000, pengirirman = "Brondong", terjual = 68, rating = 5.0, discount = 15, grosir = false, image = R.drawable.asset_produk5),
            Product(id = "6", name = "Udang Lopster", harga = 150000, pengirirman = "Bawean", terjual = 150, rating = 5.0, discount = 20, grosir = false, image = R.drawable.asset_produk6),
            Product(id = "7", name = "Udang Vanami", harga = 85000, pengirirman = "Karang Geneng", terjual = 22, rating = 5.0, discount = 0, grosir = true, image = R.drawable.asset_produk7),
            Product(id = "8", name = "Ikan Bandeng | 1 Kg", harga = 30000, pengirirman = "Karang Geneng", terjual = 11, rating = 5.0, discount = 10, grosir = false, image = R.drawable.asset_produk8),
    )
}