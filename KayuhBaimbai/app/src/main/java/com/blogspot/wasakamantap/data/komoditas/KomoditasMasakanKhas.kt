package com.blogspot.wasakamantap.data.komoditas

import com.blogspot.wasakamantap.R
import com.blogspot.wasakamantap.data.Data

class KomoditasMasakanKhas {

    companion object {
        private val image: List<Int> =
            listOf(
                R.drawable.komoditas_soto_banjar,
                R.drawable.komoditas_lontong,
                R.drawable.komoditas_buras,
                R.drawable.komoditas_ketupat
            )

        private val description: List<String> =
            listOf(
                "Terdiri dari ketupat, daging ayam dengan kuah bumbu soto, perkedel, telur rebus, sohun, bawang/brambang goring, seledri cincang, sambal, irisan jeruk nipis atau limau kuit.",
                "Terdiri dari ketupat, daging ayam dengan kuah bumbu soto, perkedel, telur rebus, sohun, bawang/brambang goring, seledri cincang, sambal, irisan jeruk nipis atau limau kuit.",
                "Terdiri dari buras atau lapat dengan sambal yang ditambah kemiri atau kacang tanah, dilengkapi telur pindang.",
                "Biasanya dimasak dalam urung ketupat yang agak kecil ikan yang dipanggang lebih dahulu, diberi bumbu dan santan cair kemudian diselesaikan dengan santan kental. Ikan yang digunakan biasanya adalah ikan gabus sebagai kuahnya. Disajikan dengan sambl pedas dari binjai dan kadang dilengkapi telur rebus. (Urang Banjar dan Kebudayaannya, 2007)"
            )

        private val name: List<String> =
            listOf(
                "Soto Banjar",
                "Lontong Lengkap",
                "Buras (Lapat)",
                "Ketupat"
            )

        private val address: List<String> =
            listOf(
                "Soto Banjar Bang Amat, Jl. Banua Anyar No.6, Benua Anyar, Kec. Banjarmasin Tim., Kota Banjarmasin, Kalimantan Selatan 70121",
                "Rumah Makan Lontong Orari Banjarmasin, Jl. Sungai Mesa, Seberang Mesjid, Kec. Banjarmasin Tengah, Kota Banjarmasin, Kalimantan Selatan 70122",
                "Warung SD, Jl. A. Yani No.Km, RW.8, Tatah Belayung Baru, Kec. Kertak Hanyar, Banjar, Kalimantan Selatan 70654",
                "Warung Ketupat Kandangan Siah, Jl. Pematang Panjang, Gambut Bar., Kec. Gambut, Banjar, Kalimantan Selatan 70652"
            )

        private val price: List<String> =
            listOf(
                "Rp 30.000/porsi",
                "Rp 33.000/porsi",
                "Rp 5.000/porsi",
                "Rp 15.000/porsi"
            )

        fun getListData() : ArrayList<Data> {
            val list: ArrayList<Data> = ArrayList()
            for (position in name.indices) {
                list.add(
                    Data(
                    image[position],
                    description[position],
                    name[position],
                    "Masakan Khas",
                    address[position],
                    price[position]
                )
                )
            }
            return list
        }
    }
}