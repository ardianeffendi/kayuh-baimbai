package com.blogspot.wasakamantap.viewmodel

import androidx.lifecycle.ViewModel
import com.blogspot.wasakamantap.data.Data
import com.blogspot.wasakamantap.data.komoditas.*

class KomoditasViewModel : ViewModel() {
    private val list: ArrayList<Data> = ArrayList()

    fun getMasakanKhas() : ArrayList<Data> {
        list.addAll(KomoditasMasakanKhas.getListData())
        return list
    }

    fun getMakananDiawetkan() : ArrayList<Data> {
        list.addAll(KomoditasMakananDiawetkan.getListData())
        return list
    }

    fun getSayuranBuahIkan() : ArrayList<Data> {
        list.addAll(KomoditasSayuranBuahIkan.getListData())
        return list
    }

    fun getKueBasah() : ArrayList<Data> {
        list.addAll(KomoditasKueBasah.getListData())
        return list
    }

    fun getWadaiKaring() : ArrayList<Data> {
        list.addAll(KomoditasWadaiKaring.getListData())
        return list
    }
}