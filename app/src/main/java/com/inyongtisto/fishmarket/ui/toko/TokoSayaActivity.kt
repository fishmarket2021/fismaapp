package com.inyongtisto.fishmarket.ui.toko

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.inyongtisto.fishmarket.databinding.ActivityTokoSayaBinding
import com.inyongtisto.fishmarket.util.Constants
import com.inyongtisto.fishmarket.util.Prefs
import com.inyongtisto.myhelper.extension.getInitial
import com.inyongtisto.myhelper.extension.setToolbar
import com.squareup.picasso.Picasso

class TokoSayaActivity : AppCompatActivity() {

    private lateinit var binding: ActivityTokoSayaBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTokoSayaBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setToolbar(binding.lyToolbar.toolbar, "Toko Saya")
        // get data dari server

        setData()
    }

    private fun setData() {
        val user = Prefs.getUser()
        if (user != null) {
            binding.apply {
                if (user.toko != null) {
                    tvName.text = user.toko.name
                    tvInisial.text = user.toko.name.getInitial()
                    Picasso.get().load(Constants.USER_URL + user.toko.name)
                        .into(binding.imageProfile)
                }
            }
        }
    }

    private fun mainButton() {
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return super.onSupportNavigateUp()
    }
}