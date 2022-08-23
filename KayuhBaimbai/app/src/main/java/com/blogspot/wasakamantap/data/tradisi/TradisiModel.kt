package com.blogspot.wasakamantap.data.tradisi

import com.blogspot.wasakamantap.R
import com.blogspot.wasakamantap.data.Data

class TradisiModel {

    companion object {
        private val picture: List<Int> =
            listOf(
                R.drawable.tradisi_balamutan,
                R.drawable.tradisi_madihin,
                R.drawable.tradisi_baturai_pantun,
                R.drawable.tradisi_sinoman_hadrah,
                R.drawable.tradisi_bapingit,
                0,
                0,
                R.drawable.tradisi_maantar_jujuran,
                R.drawable.tradisi_batimung,
                R.drawable.tradisi_badudus,
                R.drawable.tradisi_batasmiyah,
                R.drawable.tradisi_bamandi,
                R.drawable.tradisi_batapung,
                R.drawable.tradisi_babaras_kuning,
                R.drawable.tradisi_mamanda,
                R.drawable.tradisi_mahancu
            )

        private val description: List<String> =
            listOf(
                "Kesenian lamut adalah sebuah tradisi bertutur dari suku Banjar. Biasanya, palamutan (pemain lamut) saat memainkannya diiringi oleh alat musik terbang.",
                "Madihin merupakan genre puisi rakyat anonim dan hanya dimiliki oleh suku Banjar. Sastra ini dengan sendirinya tidak dapat dirumuskan dengan cara membandingkan atau mengadopsinya dari khasanah di luar folklor Banjar.\n" +
                        "Pertunjukan Madihin sendiri sekarang bisa diadakan untuk setiap momen baik untuk memperintai hari-hari besar kenegaraan, kedaerahan, keagamaan, kampanye partai politik, khitanan, menghibur tamu agung, pasar malam, penyuluhan, perkawinan, pesta adat, maupun saprah amal dan lainnya.",
                "Baturai pantun merupakan salah satu kesenian tradisional budaya Banjar yang disebut basasahutan atau dalam Bahasa Indonesia adalah berbalas-balasan. Baturai pantun biasanya dilakukan oleh dua orang.",
                "Sinoman Hadrah atau tari Hadrah adalah suatu seni pertunjukan rakyat. Tarian ini banyak dipertunjukkan dalam mengarak pengantik. Untuk tarian yang digunakan pada upacara perkawinan terutama untuk mengarak pengantin tersebut, Payung ubur-ubur tidak dapat dipisahkan keberadaannya. (Peralatan Hiburan dan Kesenian Tradisional Daerah Kalimantan Selatan, 1986)",
                "Bapingit merupakan salah satu tahap yang harus dilewati oleh seorang gadis menjelang hari pernikahannya. Intinya, calon pengantin wanita ‘dikurung’ selama seminggu dengan maksud untuk menghadirkan dari hal-hal yang tidak diinginkan. Sesuai perkembangan masa, acara bapingit kini semakin dipersingkat antara dua sampai tiga hari saja. Pada masa bapingit calon mempelai wanita tidak diperkenankan dikunjungi oleh calon mempelai pria atau pemuda lainnya. \n" +
                        "Selama masa bapingit calon pengantin wanita benar-benar harus mempersiapkan lahir dan batin untuk mengarungi mahligai rumah tangga.",
                "Berasal dari kata suluh, merupakan proses pencarian informasi mengenai gadis yang diinginkan, hal ini dilakukan secara diam-diam oleh pihak pria. Pada masa lalu perkawinan lazim atas dasar perjodohan atau pilihan orang tua, sehingga tradisi semacam ini merupakan keharusan. Biasanya dilanjutkan dengan “Batatakun” yaitu pencarian informasi secara terbuka melalui kedua pihak keluarga, dengan tujuan untuk meyakinkan perihal asal-usul keluarga, kemampuan ekonomi, dan seterusnya.",
                "Acara meminang secara resmi oleh keluarga calon mempelai pria terhadap calon mempelai wanita. Secara tradisional, dalam acara ini terjadi dialog dengan Bahasa Banjar serta diisi dengan berbalas pantun antara dua keluarga. Apabila lamaran diterima, kemudian ditetapkan beberapa kesepakatan antara lain mengenai besarnya jujuran (mas kawin), hari mengantarkan mas kawin, serta menetapkan hari perkawinan.",
                "Maantar Jujuran  atau Maantar Patalian adalah sebuah pengikat atau bukti telah bertunangan, calon mempelai pria harus memberikan “jujuran/ patalian” atau oleh-oleh kepada calon mempelai wanita. Benda-benda patalian diantaranya berupa seperangkat busana, seperangkat perlengkapan tata rias, wangi-wangian, perlengkapan kamar tidur, perhiasan dan sejumlah uang.\n" +
                        "Maatar Patalian ini dilakukan oleh rombongan yang terdiri dari ibu-ibu sebanyak sepuluh sampai dua puluh orang dan biasanya diterima dengan upacara sederhana. Kesempatan ini digunakan oleh keluarga untuk mengumumkan kepada para tamu tentang hubungan calon pengantin yang disebut balarangan atau bertunangan. Dalam acara tersebut kedua calon pengantin harus dihadirkan.",
                "Inilah saat intensif melakukan perawatan dan membersihkan diri calon mempelai wanita agar terlihat cantik dan segar. Sesuai tradisi, ritual perawatan menggunakan ramuan khusus berupa ‘kasai’ yakni semacam cairan pembersih dari beras ketan yang telah digoreng kering secara berulang-ulang. Selain itu calon pengantin melakukan ritual mandi uap air wewangian, dalam istilah Banjar disebut Batimung, agar pada hari pernikahan tubuh menjadi bersih dan tidak banyak mengeluarkan keringat.",
                "Badudus merupakan prosesi mandi untuk menyucikan diri calon pengantin. Menggunakan air dicampur bunga-bunga dan air jeruk, dilengkapi dengan mayang dan air kelapa gading. Prosesi badudus dilakukan selepas bapingit, dua atau tiga hari sebelum upacara perkawinan. Ritual tersebut bisa dijalankan serentak oleh kedua calon pengantin atau di rumahnya masing-masing. Untuk memandikan dipilih lima atau tujuh orang wanita tua dari keluarga terdekat.\n" +
                        "Rangkaian prosesi ini diwarnai dengan detil perlengkapan dan dekorasi berwarna kuning. Antara lain pada ‘lalangitan’ berupa kain kuning yang direntangkan pada bagian atas lokasi berlangsungnya prosesi.",
                "Tradisi Bapalas merupakan upacara yang dilakukan oleh suatu keluarga setelah sang ibu melahirkan anaknya. Upacara Bapalas Bidan bertujuan untuk mengucapkan rasa syukur kepada yang Bidan, sang pengasuh bayi setelah dilahirkan. \n" +
                        "Sedangkan  pelaksanaan tasmiah selalu disertai dengan upacara akikah atau pemotongan seekor kambing.\n" +
                        "Sebelum di-tasmiah, bayi diturunkan dari ayunan dan diarak keliling rumah. Acara ini diiringi rombongan kesenian sinoman hadrah, yang melantunkan pujian kepada Nabi Muhammad SAW. Selain itu, acara tasmiah juga disertai dengan pembacaan ayat suci Alquran dan dakwah agama.",
                "Menurut keyakinan orang Banjar, makhluk halus sangat tertarik untuk mengganggu wanita yang sedang hamil. Bahkan proses kehamilan juga sangat rentan dengan gangguan makhluk halus. Sehingga dengan diakan acara mandi tian mandaring, diharapkan ibu dan anak yang akan dilahirkan selalu dilindungi dan lahir dengan selamat.",
                "Batapung tawar adalah tradisi yang dulunya diiringi mantra dan telah berganti do’a. Tapung tawar memiliki makna sebagai do’a dan keinginan yang baik, serta memohon kepada yang Maha kuasa dengan harapan terkabulkan.\n" +
                        "Ritual Tapung tawar tersebut kerap dilakukan saat baru menempati rumah baru, peresmian gedung, sunatan anak, bamandi-mandi dalam acara perkawinan, kelahiran anak (pemberian nama anak), baayun maulid dan kegiatan lainnya. ",
                "Umumnya beras kuning ditaburkan pada acara perkawinan. Pada saat calon pengantin pria tiba di rumah calon pengantin wanita, di depan pintu masuk seseorang yang dituakan atau penghulu disambut dengan menaburkan beras kuning diiringi ucapan shalawat kepada Nabi Muhammad saw, yang kemudian disambut juga dengan ucapan yang sama oleh orang-orang yang hadir.",
                "Mamanda adalah seni teater rakyat atau pementasan tradisional yang berasal dari Kalimantan Selatan. Dibanding dengan seni pementasan yang lain, Mamanda lebih mirip dengan Lenong dari segi hubungan yang terjalin antara pemain dengan penonton. Interaksi ini membuat penonton menjadi aktif menyampaikan komentar-komentar lucu yang disinyalir dapat membuat suasana jadi lebih hidup.",
                "Mahancau adalah alat berupa batang bambu yang dirangkai membentuk segi empat sama sisi yang diberi jala, kemudian diberi tangkai untuk pegangan.\n" +
                        "Penggunaannya bagian yang ada jala direndam di sungai, beberapa menit kemudian diangkat dan sejumlah ikan menyangkut dijala tersebut, selanjutnya diangkat ke darat dan diambil dengan tangan atau gayung."
            )

        private val name: List<String> =
            listOf(
                "Balamutan",
                "Madihin",
                "Baturai Pantun",
                "Sinoman Hadrah",
                "Bapingit",
                "Basasuluh",
                "Badatang",
                "Maantar Jujuran",
                "Bakasi dan Batimung",
                "Badudus",
                "Bapalas Bidan dan Batasmiyah",
                "Bamandi-mandi 7 Bulanan",
                "Batapung Tawar",
                "Babaras Kuning",
                "Mamanda",
                "Mahancau"
            )

        fun getListData() : ArrayList<Data> {
            val list: ArrayList<Data> = ArrayList()
            for (position in picture.indices) {
                list.add(
                    Data(
                        picture[position],
                        description[position],
                        name[position]
                    )
                )
            }
            return list
        }
    }
}