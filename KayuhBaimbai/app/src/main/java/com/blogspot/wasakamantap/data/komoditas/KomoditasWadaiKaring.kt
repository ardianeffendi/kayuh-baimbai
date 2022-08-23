package com.blogspot.wasakamantap.data.komoditas

import com.blogspot.wasakamantap.R
import com.blogspot.wasakamantap.data.Data

class KomoditasWadaiKaring {
    companion object {
        private val image: List<Int> =
            listOf(
                R.drawable.komoditas_amplang,
                R.drawable.komoditas_jintan,
                R.drawable.komoditas_gegatas,
                R.drawable.komoditas_ilat_sapi,
                R.drawable.komoditas_wadai_rokok,
                R.drawable.komoditas_gabin,
                R.drawable.komoditas_kue_satu
            )

        private val description: List<String> =
            listOf(
                "",
                "",
                "",
                "",
                "",
                "",
                ""
            )

        private val name: List<String> =
            listOf(
                "Amplang",
                "Wadai Jintan",
                "Gegatas",
                "Ilat Sapi",
                "Wadai Rokok",
                "Gabin Sagu",
                "Wadai Satu"
            )

        private val address: List<String> =
            listOf(
                "Pasar Pal 7,  Jl. A. Yani, Pemurus Luar, Kec. Banjarmasin Tim., Kota Banjarmasin, Kalimantan Selatan 70654",
                "Pasar Pal 7,  Jl. A. Yani, Pemurus Luar, Kec. Banjarmasin Tim., Kota Banjarmasin, Kalimantan Selatan 70654",
                "Pasar Pal 7,  Jl. A. Yani, Pemurus Luar, Kec. Banjarmasin Tim., Kota Banjarmasin, Kalimantan Selatan 70654",
                "Pasar Pal 7,  Jl. A. Yani, Pemurus Luar, Kec. Banjarmasin Tim., Kota Banjarmasin, Kalimantan Selatan 70654",
                "Pasar Pal 7,  Jl. A. Yani, Pemurus Luar, Kec. Banjarmasin Tim., Kota Banjarmasin, Kalimantan Selatan 70654",
                "Pasar Pal 7,  Jl. A. Yani, Pemurus Luar, Kec. Banjarmasin Tim., Kota Banjarmasin, Kalimantan Selatan 70654",
                "Pasar Pal 7,  Jl. A. Yani, Pemurus Luar, Kec. Banjarmasin Tim., Kota Banjarmasin, Kalimantan Selatan 70654"
            )

        private val price: List<String> =
            listOf(
                "Rp 5.000/kemasan kecil",
                "Rp 5.000/kemasan kecil",
                "Rp 1.000/buah",
                "Rp 2.000/biji",
                "Rp 5.000/kemasan kecil",
                "Rp 5.000/kemasan",
                "Rp 15.000/toples"
            )

        fun getListData() : ArrayList<Data> {
            val list: ArrayList<Data> = ArrayList()
            for (position in name.indices) {
                list.add(
                    Data(
                    image[position],
                    description[position],
                    name[position],
                    "Wadai Karing",
                    address[position],
                    price[position]
                )
                )
            }
            return list
        }
    }
}