package com.fisma.fishmarket.ui.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.fisma.fishmarket.core.data.source.local.DummyData
import com.fisma.fishmarket.core.data.source.model.Category
import com.fisma.fishmarket.core.data.source.model.Product
import com.fisma.fishmarket.core.data.source.model.Slider

class HomeViewModel : ViewModel() {

    val listCategory: LiveData<List<Category>> = MutableLiveData<List<Category>>().apply {
        value = DummyData.listCategory
    }

    val listSlider: LiveData<List<Slider>> = MutableLiveData<List<Slider>>().apply {
        value = DummyData.listSlider
    }

    val listProduct: LiveData<List<Product>> = MutableLiveData<List<Product>>().apply {
        value = DummyData.listProduct
    }
}