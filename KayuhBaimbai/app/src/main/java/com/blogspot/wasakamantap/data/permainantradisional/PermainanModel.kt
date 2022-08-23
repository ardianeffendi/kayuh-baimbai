package com.blogspot.wasakamantap.data.permainantradisional

import com.blogspot.wasakamantap.R
import com.blogspot.wasakamantap.data.Data

class PermainanModel {

    companion object {
        private val picture: List<Int> =
            listOf(
                R.drawable.permainan_gasing,
                R.drawable.permainan_dakuan,
                R.drawable.permainan_lugu,
                R.drawable.permainan_kalayangan,
                R.drawable.permainan_bagimpar,
                R.drawable.permainan_batungkau,
                R.drawable.permainan_bayasinan,
                R.drawable.permainan_bapatakan
            )

        private val description: List<String> =
            listOf(
                "Gasing adalah nama alat permainan rakyat tradisional Daerah Kalimantan Selatan. Di daerah Kalimantan Selatan permainannya disebut bagasing. Tambahan awalan ba tersebut memiliki makna permainan dengan menggunakan alat gasing.\n" +
                        "\tAlat lain yang tak terpisahkan dari permainan gasing ini adalah susuk yang digunakan untuk menyusuk (menyeduk), tutukan untuk menghempaskan gasing, dan tali sebagai pengikat gasing.\n" +
                        "•\tCara memainkan\n" +
                        "Permainan gasing ini bisa dilakukan perorangan maupun berkelompok. Dalam suatu pertandingan harus dibuatkan balai tempat bermain berupa serubung berukuran 6 x 10 meter yang di dalam serubung tersebut ditempatkan susunan batang pisang yang kira-kira setengah meter dan panjangnya sekitar 5 meter. Kegunaan susuan batang pisang ini adalah untuk penahan atau sebagai dinding agar lompatan gasing yang dipukul dalam acara betukun tidak keluar dari balai dan jangan sampai gasing tersebut mengenai penonton. Permainan gasing ini dilakukan dengan memutar gasing pasangan yang menurut istilah derah disebut memalu, dan memukul gasing lawan dalam pertandingan yang disebut manukun. (Urang Banjar dan Kebudayaannya, 2007)",
                "Alat yang dikatakan Dakuan ini sebuah benda yang dipakai dalam permainan tradisional yang telah lama ada dan semua daerah di Kalimantan Selatan mengenalnya. Alat  ini dalam bahasa Indonesia disebut Dakon. Sedangkan nama permainannya adalah Badaku yang berarti bermain dengan menggunakan alat Dakuan. Benda lainnya yang ada di Badakuan adalah Anak Dakuan yaitu biji-bijian seperti biji sawo, siput kerang, atau batu-batuan kecil. \n" +
                        "•\tCara memainkan\n" +
                        "Permainan ini hanya bisa dimainkan dua orang pemain yang duduk saling berhadapan melawan pemain lain. Sebelum permainan dimulai dilakukan basiun (pinsut) untuk menentukan siapa yang berhak memainkan anak dakuan terlebih dahulu.\n" +
                        "Pada setiap lubang diisi sama rata jumlahnya sesuai dengan jumlah lubang yang ada. Sedangkan kedua rumah (lubang besar) dikosongkan.\n" +
                        "Pemain yang berhak bermain duluan pertama-tama mengambil sesuai anak dakuan yang ada dalam lubang.\n" +
                        "Selanjutnya anak dakuan tersebut diisikan satu persatu pada setiap lubang yang dilaluinya. Setiap melewati rumah miliknya diisi satu biji anak dakuan. Jika anak dakuan yang terakhir masuk ke lubang anak dakuan lainnya, maka wajib diambil kembali semua anak dakuan yang ada dilubang itu. Begitu seterusnya sampai dinyatakan mati langkah.\n" +
                        "Permainan Badaku dinyatakan berakhir apabila semua anak dakuan yang ada di dalam lubang-lubang kecil habis berpindah ke rumah masing-masing dan yang menang adalah rumah yang paling banyak anak dakuannya. (Urang Banjar dan Kebudayaannya, 2007)",
                "Lugu adalah nama alat yang digunakan dalam suatu permainan tradisional yang telah lama ada dan semua daerah di Kalimantan Selatan mengenalnya. Sedangnya nama permainannya disebut balugu.\n" +
                        "Dalam permainan balugu ini masih harus dibantu lagi oleh sebuah alat yang disebut penapak atau cacampak. Dalam Bahasa Indonesia penapak atau cacampak adalah pemukul.\n" +
                        "•\tCara Memainkan\n" +
                        "Permainan balugu ini bisa dilakukan perorangan (satu lawan satu) dan bisa pula beregu atau berkawan. Jika dimainkan secara beregu harus dengan jumlah genap.\n" +
                        "Cara memukul lugu ini adalah dengan menggunakan penapak atau cacampak dengan posisi tergantung pada jenis lugu yang digunakan. Apabila menggunakan jenis lugu kelayangan, maka penapaknya berada diujung lugu. Sedangkan bila menggunakan lugu bentuk biuku atau bentuk bidawang, maka penapaknya berada tepat di ruang atau lubang khusus untuk ujung penapak.\n" +
                        "Sebelum permainan dilaksanakan, terlebih dahulu menyiapkan peralatan permainan yang terdiri dari lugu dan penapaknya. Setiap pemain diharuskan membawa dan memiliki lugu dan panapaknya. Untuk tempat bermain dicari tempat yang datar dan luas dengan panjangnya minimal 20 meter. Apalagi kalau pemainnya para remaja panjang lapangan yang diperlukan sekitar 50 meter, \n" +
                        "Setelah tempat dan peralatan siap, maka permainan lugu pun dapat dimulai. Dalam permainan beregu untuk mencari siapa yang berhak memukul (yang naik), biasanya diadakan undian dengan cara disepakati bersama misalnya melalui pinsut atau dengan ambungan benda. Bagi kelompok yang menang dalam undian atau ambungan ini, maka mereka berhak memulai permainan sebagai regu yang naik. Sedangkan kelompok yang kalah undian mereka harus memasang lugunya dan siap untuk dikenakan oleh lugu lawan. (Urang Banjar dan Kebudayaannya, 2007)",
                "Kalayangan dandang adalah nama alat permainan tradisional daerah Kalimantan Selatan (Badandang) untuk membedakannya dengan kelayangan biasa karena kelayangan dandang adalah layang-layang yang besar. Dalam Bahasa Indonesia kelayanggan berarti layang-layang.\n" +
                        "•\tCara memainkan\n" +
                        "Kalayangan ditating (disiapkan menyongsong angin) dengan beberapa orang yang mendirikannya, tali direntangkan untuk ditarik ke udara. Apabila dengan satu tarikan tersebut kalayangan bisa naik dan menimbulkan bunyi yang bagus, maka kalayangan itu akan tetap melayang di udara. (Urang Banjar dan Kebudayaannya, 2007)",
                "Bagimpar adalah permainan traditional khas Dari Kalimantan Selatan. Permainan ini menggunakan media batu kecil untuk permainannya. Berasal Dari kata gampar yang berarti melempar dengan satu kaki.",
                "Nama parmainan batungkau berarti meninggikan badan. Kata dasarnya adalah tungkau. Awalan ba dalam bahasa daerah Banjar sama dengan ber dalam bahasa Indonesia. Meninggikan badan disini biasanya berdiri diatas ujung jari kaki. Bilamana seseorang ingin mengambil barang sesuatu yang terletak tinggi di etas sehingga tangan tidak sampai menjangkaunya dalam posisi berdiri biasa, maka untuk mendapatkan barang tersebut kita harus bertungkau. Dalam permainan itu sendiri anak - anak mempergunakan suatu alat sehingga badannya bisa menjadi tinggi.",
                "Bayasinan dimainkan di lapangan yang digarisi 6 petak persegi panjang. Setiap garis dijaga oleh 1 orang dari tim lawan. Jumlah anggota 1 tim sebanyak 5 orang yang jaga/ajak dan 5 orang yang menyerang.\n" +
                        "Tim yang ajak menjaga garis secara mendatar (horizontal) dan tegak lurus (vertikal). 1 orang hanya boleh menjaga sesuai garisnya. Ada 1 garis mendatar yang panjang di tengah, biasanya dijaga oleh pemain andalan dalam tim ajak.\n" +
                        "Tim yang menyerang boleh bergerak bebas di dalam kotak selama tidak tersentuh tim yang ajak. Tim serang mulai dari markas menerobos garis pertahanan musuh sampai ujung dan kembali lagi ke markas. Apabila berhasil bolak-balik maka dihitung dapat 1 point.",
                "Bapatakan berasal dari kata patak mendapat awalan ba ( - ber dalam bahasa Indonesia) den akhiran an. Arti kata patak ialah simpan atau tanam. Bapatakan maksudnya bermain patak-patakan atau simpan-simpanan atau tanam-tanaman.\n" +
                        "Biasanya permainan ini dilakukan di lapangan permainan yaitu halaman sekolah atau rumah, maka akan tampa seorang atau beberapa orang anak menyimpan atau menanam satu benda kecil di tanah berpasir. Satu atau beberapa anak lainnya kemudian menajadi pencari atau penerka letak benda kecil tersebut, begitulah permainan ini berjalan secara bergantian dengan pencari sampai permainan diangap selesai."
            )

        private val name: List<String> =
            listOf(
                "Gasing",
                "Dakuan",
                "Lugu",
                "Kalayangan",
                "Bagimpar",
                "Batungakau (Enggrang)",
                "Bayasinan",
                "Bapatakan"
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