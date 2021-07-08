package com.blogspot.wasakamantap.data.komoditas

import com.blogspot.wasakamantap.R
import com.blogspot.wasakamantap.data.Data

class KomoditasMakananDiawetkan {

    companion object {
        private val image: List<Int> =
            listOf(
                0,
                R.drawable.komoditas_ikan_kering,
                R.drawable.komoditas_ikan_wadi,
                R.drawable.komoditas_pakasam,
                R.drawable.komoditas_ikan_kerupuk,
                R.drawable.komoditas_ikan_rabuk,
                R.drawable.komoditas_telur_asin
            )

        private val description: List<String> =
            listOf(
                "Daging yang dikeringkan disebut dendeng. Dendeng biasanya dari binatang perburuan seperti menjangan yang diiris tebal lalu diberi garam dan dijemur. Biasanya disebut dendeng tapah. Sedangkan untuk dendeng biasa diiris tipis, selain diberi garam ada pula yang diberi bumbu. (Urang Banjar dan Kebudayaannya, 2007)",
                "Dikeringkan, seperti diberi garam yang dikenal dengan istilah iwak karing.",
                "Wadi, ikan yang diberi garam ditambahkan gabuk dari padi atau beras yang digoreng dan ditumbuk, tak dikeringkan atau dibiarkan basah disimpan dalam tempayan dari keramik atau tembikar.",
                "Pakasam atau samu, ikan yang diberi garam kemudian dicampur dengan beras tumbuk yang telah disangrai. Untuk cepat menjadi asam biasanya dipercikkan sedikit air kelapa namun cara ini kurang tahan lama jika disimpan.",
                "Sebagai bahan kerupuk.",
                "Iwak rabuk atau sambal lengkong, daging ikan yang sudah direbus dicampur santan dan bumbu, dimasak sampai kering menjadi seperti bubuk.",
                "Telur asin, telur ikan diberi garam dan disimpan dalam tempat tertutup."
            )

        private val name: List<String> =
            listOf(
                "Daging",
                "Ikan Sapat",
                "Ikan Wadi",
                "Ikan Pakasam",
                "Ikan Kerupuk",
                "Ikan Rabuk",
                "Telur Asin"
            )

        private val address: List<String> =
            listOf(
                "",
                "Pasar Pal 7 Lantai 2, Jl. A. Yani, Pemurus Luar, Kec. Banjarmasin Tim., Kota Banjarmasin, Kalimantan Selatan 70654",
                "Pasar Pal 7 Lantai 2, Jl. A. Yani, Pemurus Luar, Kec. Banjarmasin Tim., Kota Banjarmasin, Kalimantan Selatan 70654",
                "Pasar Pal 7 Lantai 2, Jl. A. Yani, Pemurus Luar, Kec. Banjarmasin Tim., Kota Banjarmasin, Kalimantan Selatan 70654",
                "Pusat Oleh-Oleh Khas Banjar Sarahai, Jl. Let. Jend. Haryono, Kertak Baru Ulu, Kec. Banjarmasin Tengah, Kota Banjarmasin, Kalimantan Selatan 70231",
                "Pusat Oleh-Oleh Khas Banjar Sarahai, Jl. Let. Jend. Haryono, Kertak Baru Ulu, Kec. Banjarmasin Tengah, Kota Banjarmasin, Kalimantan Selatan 70231",
                "Pusat Oleh-Oleh Khas Banjar Sarahai, Jl. Let. Jend. Haryono, Kertak Baru Ulu, Kec. Banjarmasin Tengah, Kota Banjarmasin, Kalimantan Selatan 70231"
            )

        private val price: List<String> =
            listOf(
                "",
                "Rp 75.000/kg",
                "Rp 120.000/600g",
                "Rp 55.000/kg",
                "Rp 25.000/250g",
                "Rp 55.000/100g",
                "Rp 3.000/butir"
            )

        fun getListData() : ArrayList<Data> {
            val list: ArrayList<Data> = ArrayList()
            for (position in name.indices) {
                list.add(
                    Data(
                    image[position],
                    description[position],
                    name[position],
                    "Makanan Yang Diawetkan",
                    address[position],
                    price[position]
                )
                )
            }
            return list
        }
    }
}