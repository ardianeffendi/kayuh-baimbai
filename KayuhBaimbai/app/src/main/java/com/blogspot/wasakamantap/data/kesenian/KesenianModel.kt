package com.blogspot.wasakamantap.data.kesenian

import com.blogspot.wasakamantap.R
import com.blogspot.wasakamantap.data.Data

class KesenianModel {

    companion object {
        private val picture: List<Int> =
            listOf(
                R.drawable.kesenian_rumah_adat,
                R.drawable.kesenian_lanting,
                0,
                R.drawable.kesenian_baayun_mulud,
                R.drawable.kesenian_kayu_ulin,
                R.drawable.kesenian_meramu,
                R.drawable.kesenian_atap_sirap,
                R.drawable.kesenian_jukung_patai,
                R.drawable.kesenian_tikar_purun,
                R.drawable.kesenian_tikar_bamban,
                R.drawable.kesenian_nyiru,
                R.drawable.kesenian_sarunai,
                R.drawable.kesenian_babun,
                R.drawable.kesenian_lumma,
                R.drawable.kesenian_kangkanong,
                R.drawable.kesenian_kuriding,
                R.drawable.kesenian_panting_banjar,
                R.drawable.kesenian_payung_ubur_ubur,
                R.drawable.kesenian_baksa_kambang,
                R.drawable.kesenian_tari_radap_rahayu,
                R.drawable.kesenian_tari_japin,
                R.drawable.kesenian_pasar_terapung,
                R.drawable.kesenian_sasirangan,
                R.drawable.kesenian_kitab
            )

        private val name: List<String> =
            listOf(
                "Rumah Bubungan Tinggi",
                "Lanting"
            )

        private val description: List<String> =
            listOf(
                "Rumah adat Banjar Bubungan Tinggi adalah bangunan yang tertua dari seluruh tipe rumah tradisional. Bubungan Tinggi dikenal sebagai Istana Sultan Banjar. Oleh karena itu rumah ini dinilai sebagai bangunan paling utama dari rumah-rumat adat lainnya. (Arsitektur Tradisional Banjar Kalimantan Selatan, 2001)",
                "Rumah tradisional Lanting merupana satu-satunya rumah tinggal rakyat Banjar yang berada di perairan sungai Martapura sebagai rumah terapung.\n" +
                        "Pada zaman dahulu rumah Lanting memegang peranan yang sangat penting karena lalu-lintas komunikasi, ekonomi, dan sosial melewati sungai dengan alat transportasi jukung (perahu).\n" +
                        "Rumah Lanting pada mulanya dihuni oleh para nelayan, telah berkembang sebagai rumah tempat untuk bergadang berbagai keperluan pokok sehari-hari. (Arsitektur Tradisional Banjar Kalimantan Selatan, 2001)",
                "Dalam sebuah rumat adat Banjar terutama tipe bumbungan tinggi, gajah baliku dan palimbangan terdapat sebelas saranan bangunan yang diberi ukiran, yaitu:\n" +
                        "•\tPucuk Bumbungan\n" +
                        "Pada rumah tradisional tipe bubungan tinggi terdapat pada pucuk bubungan tinggi yang lancip (layang-layang) dalam jumlah ganji (lima) dengan motif paku alai, bogam, tombak, atau keris.\n" +
                        "Pada rumah tipe palimasan ornament berbentuk sungkul dengan motif anak catur, piramida, dan bulan bintang.\n" +
                        "Ukiran “Jamang” sebagai mahkota bubungan terdapat pada rumah adat tipe palimbangan, balai laki, balai bini, dan tipe cacak burung dengan bentuk simetris motif anak catur dengan kiri-kanannya paku alai, halilipan atau babalungan ayam.\n" +
                        "•\tPilis atau Papilis\n" +
                        "Pilis atau Papilis terdapat pada tumbukan kasau yang sekaligus menjadi penutup ujung kasau bubungan tersebut. Juga ada pada banturan (di bawah cucuran atap) serta pada batis tawing (kaki dinding) bagian luar dengan motif ukiran rincung gagatas, pucuk rabung, tali bapintal, dedaunan, kumbang bagantung (distiril), paku alai, kulat karikit, gagalangan, iitikan, sarang wanyi, kambang cangkih, teratai, gigi haruan, dll.\n" +
                        "•\tTangga\n" +
                        "Sebagai sarana penting dalam bangunan terdepan dan pertama ditemukan saat akan memasuki rumah. Pada puncak pohon tangga umumnya terdapat ornament dengan motif buah kanas (nanas), kembang melati yang belum mekar, tongkol daun pakis, belimbing, payung atau bulan sabit.\n" +
                        "Pada penapih tangga biasanya terdapat motif tali bapintal, dedaunan, buah mingkudu, dan sulur-suluran.\n" +
                        "•\tPalatar\n" +
                        "Palatar merupakan bagian depan rumah. Ragam hias dengan ukiran yang biasanya ada di jurai samping kiri dan kanan atas, batis tawing, dan kandang rasi.\n" +
                        "Ornamen pada jurai biasanya mengambil motif hiris gagatas, pucuk rabung, daun paku atau sarang wanyi.\n" +
                        "Pada batis tawing (kaki dinding) ornamen mengambil motif dedaunan, sulur-suluran, atau buah mingkudu.\n" +
                        "Kandang rasi berfungsi sebagai pagar pengaman pada lawing atasnya dihiasi dengan ragam sulur-suluran, sementara kisi-kisinya biasanya sama dengan motif kisi-kisi yang terdapat pada kandang rasi tangga yaitu anak catur, geometris, bogam melati, gagalangan, dan berbagai kreasi campuran motif tersebut.\n" +
                        "•\tLawang\n" +
                        "Lawang atau pintu utama terdapat di ruang belakang palatar pada watun sambutan.\n" +
                        "Dahi lawang dengan ukiran tali bapintal dalam bentuk lingkaran bundar telur dengan motif sulur-suluran dan bunga-bungaan dengan kaligrafi Arab.\n" +
                        "Jurai lawang berbentuk setengah lingkaran atau bulan sabit dengan kombinasi tali bapintal, sulur-suluran, bunga-bunga dan kaligrafi Arab.\n" +
                        "Daun laaing selalu menempatkan motif tali bapintal pada bagian dalam bentuk bundar telur atau hiris gagatas, kombinasi dedaunan, pancar matahari, dan daun jaruju.\n" +
                        "•\tLalungkang\n" +
                        "Lalungkang atau jendela pada umumnya menempatkan ornament sederhana yang berada pada dahi lalungkang tersebut. Ukiran sederhana tersebut berupa tatah bakurawang dengan motif bulan penuh, bulan sahiris, bulan bintang, bintang sudut lima, daun jalukap atau daun jaruju.\n" +
                        "•\tWatun\n" +
                        "Watun sebagai sarana pinggir lantai terbuka dengan ornamen pada penapihnya. Biasanya motifnya adalah tali bapintal, sulur-suluran, dedaunan, kambang taratai, kacapiring, Kananga, kambang matahari, buah-buahan.\n" +
                        "•\tTataban\n" +
                        "Tataban terletak pada sepanjang kaki dinding bagian dalam ruang panampik basar. Dengan motif tali bapintal pada posisi pinggirnya, motif dedaunan dan sulur-suluran dalam wujud kecil sepanjang jalur tataban tersebut.\n" +
                        "•\tTawing Halat\n" +
                        "Tawing Halat sebagai dinding pembatas yang utama merupakan bagian penting bersama-sama dengan dua buah lawing kambar pada kiri kanannya. Motifnya biasanya tak pernah ketinggalan motif tali bapintal, buah dan daun-daunan dengan kombinasi kaligrafi Arab.\n" +
                        "•\tSampukan Balok\n" +
                        "Rumah Adat Banjar tak mengenal adanya sarana plafon, sehingga tampak adanya pertemuan balok pada bagian atas. Pertemuan balok tersebut antara lain pada sampukan ujung tiang atau turus tawing dengan bujuran (tiwa-tiwa) dengan motif dedaunan dan garis-garis geometris.\n" +
                        "•\tGantungan Lampu\n" +
                        "Rumah Adat Banjar dahulu belum mengenal adanya listrik. Maka dipergunakanlah lampu gantung sebagai penerangan. Balok rentang yang ada di atas pada posisi tengah dipasang pangkal tali untuk gantungan lampu yang bermotif dedaunan dan bunga dalam komposisi lingkaran berbentuk relief.",
                "Upacara ini disebut baayun mulud, karena dilaksanakan pada peringatan Maulid Nabi Muhammad SAW yakni pada bulan Rabiulawal. Upacara ini biasanya dilaksanakan dalam masjid.\n" +
                        "Pada ruangan masjid digantungi ayunan yang membentang pada tiang-tiang masjid. Ayunan dibuat 3 lapis. Lapisan atas digunakan kain sarigading (sasirangan), lapisan tengah kain kuning, dan lapisan bawah tapih bahalai (kain panjang wanita).\n" +
                        "Pada tali ayunan diberi hiasan berupa anyaman janur berbentuk burung-burungan, ular-ularan, ketupat bangsul, halilipan, kambang sarai, rantai, hiasan berbentuk buah-buahan, dan kue tradisional seperti: cucur, cincin, kue gelang, pisang, dan kelapa. (Urang Banjar dan Kebudayaannya, 2007)",
                "Kayu ulin atau kayu besi (Eusideroxylon Zwageri) termasuk dalam family Lauraceae yang tumbuh di hutan primer Kalimantan. Kayu ulin ini merupakan bahan utama bagi bangunan perumahan ataupun bangunan lainnya, karena memiliki daya tahan yang luar biasa, baik sebagai penahan beban maupun keawetannya terhadap tanah, air, maupun panas matahari.\n" +
                        "Umumnya kayu ulin dipergunakan untuk keperluan tiang dan tongkat (tiang pancang) rumah, gelagar, slop, papan lantai, tangga, lis, dan bagian-bagian rumah lainnya. (Arsitektur Tradisional Banjar Kalimantan Selatan, 2001)",
                "Galam (Melaleuca Spec) adalah kayu yang tumbuh di daerah rawa di Kalimantan Selatan yang dahulu hanya digunakan untuk kayu api dan kalang sunduk atau fondasi tiang pada rumah panggung di daerah rawa, pondasi jalan, jembatan dan titian yang bersifat sementara. Dengan kondisi kayu yang sedemikian kokohnya, kayu galam mampu bertahan dalam tanah tanpa membusuk.\n" +
                        "Galam ini dipasarkan sampai ke luar daerah yaitu ke Jawa dengan menggunakan perahu layar. Sekarang dengan berkembang mesin penggergajian kayu. Kayu gala mini dibuat balokan untuk bahan pembuat rumah. Selain itu digunakan juga untuk cerucuk sebagai fondasi untuk rumah beton di perkotaan.\n" +
                        "Penduduk yang meramu galam ini banyak terdapat di Kabupaten Tapin yaitu di Kecamatan Candi Laras Selatan, serta di Kabupaten Barito Kuala, juga daerah lain seperti Liang Anggang Kabupaten Tanah Laut. (Urang Banjar dan Kebudayaannya, 2007)",
                "Sirap merupakan satu-satunya atap yang bermutu tinggi untuk rumah atau bangunan lainnya yang bersifat permanen di Kalimantan. Keuntungan lain bagi penggunaan atap sirap ini ialah di samping harganya tidak terlampau tinggi juga tidaklah merupakan beban yang berat bagi bumbungan, tidak seperti atap genteng yang terbuat dari tanah. Oleh karena itu, daya tahan rangka bangunan terhadap atap yang didukungnya lebih terjamin daripada atap genteng. (Arsitektur Tradisional Banjar Kalimantan Selatan, 2001)",
                "Jukung patai dikerjakan dari batang kayu yang tidak dibelah dua yang panjangnya sesuai dengan panjang jukung yang diinginkan. Dari batang kayu bulat panjang itu dikerjakan apa yang disebutdengan “manampirus”, adalah memberi bentuk haluan dan buritan jukung. Badan jukung yang mulai berbentuk itu diberi beberapa “mata kakap” dengan bor. Selanjutnya dikerjakan “maubang” atau mengosongkan bagian dalam jukung sampai pada batas ketebalan lambung jukung yang dikehendaki. Badan jukung itu selanjutnya dipanggang di atas api. Sambil dipanggang badan jukung itu dipukul-pukul. Pekerja jukung yang sudah berpengalaman mengetahui persis dari bunyi pukulan itu sebagai tanda pekerjaan itu sudah sempurna atau belum. (Urang Banjar dan Kebudayaannya, 2007)",
                "Tikar purun adalah olahan tikar yang berbahan baku Purun basah yang dijemur. Setelah kering dibersihkan, kemudian dipipihkan dengan cara ditumbuk dengan kayu. Selanjutnya diwarnai sesuai kebutuhan, lalu dianyam.",
                "Sebelum tikar dianyam, Bamban  harus direbus dulu, kemudian didiamkan lalu dijemur, setelah kering baru bisa dianayam menjadi bakul, tikar, dan alat keperluan lainnya.",
                "Nyiru adalah benda yang terbuat dari kulit bambu 2 (paring). Fungsinya adalah sebagai wadah untuk membersihkan beras. (Urang Banjar dan Kebudayaannya, 2007)",
                "Sarunai adalah nama alat musik tiup tradisional daerah Kalimantan Selatan. Penamaan ini menurut ucapan bahasa Banjar, yaitu berasal dari Bahasa Indonesia serunai. Sarunai ada yang terbuat dari kayu dan paring (bambu).\n" +
                        "Bentuk sarunai yang terbuat dari kayu berbeda dengan bahan yang dibuat dari parang, bentuk sarunai dari kayu pada bagian depannya seperti corong menyerupai corong terompet. Bagian tengah badannya seperti suling berlobang lima buah, dan tengahnya sekali agak cembung.\n" +
                        "Sarunai yang bahannya dari paring tali bentuk badannya datar. Bagian tengahnya juga memiliki lobang lima buah dan di bawahnya satu lobang.\n" +
                        "Kegunaannya adalah sebagai alat musik pengiring tarian, pertunjukkan pencak silat, hiburan rakyat, permainan tradisional.",
                "Alat musik ini termasuk dalam golongan membranophone. Dalam bahasa Indonesia alat inidisebut dengan gendang. Bahan untuk pembuatan Babun ini terdiri dari kayu, kulit, dan rotan. \n" +
                        "Babun atau gendang ini dalam penggunaannya mempunyai fungsi ganda. Selain sebagai instrumen musik dalam mengiringi lagu untuk pengatur irama juga dapat difungsikan untuk berbagai macam kegiatan permainan dan olahraga tradisional.",
                "Bahan yang digunakan untuk pembuatan alat ini adalah kayu, kulit, dan rotan. Bentuk Lumma hampir sama dengan ketipung kecil. Alat ini fungsinya sebagai pembantu Babun mengatur ritme, dan digunakan dalam upacara adat. (Peralatan Hiburan dan Kesenian Tradisional Daerah Kalimantan Selatan, 1986)",
                "Badan pembuatan Kanong ini aslinya terbuat dari bahan perunggu. Bentuknya tidak berbeda dengan perangkat peralatan kenong dalam gamelan Jawa. Bentuk Kanong ini lebih menyerupai agung (gong) kecil. Jumlah Kanong ini sebanyak lima buah dalam satu tangga nada. \n" +
                        "Fungsinya adalah untuk mengiringi tarian balian sebagai pengatur gerak dan ritme. Selain itu juga digunakan untuk mengiringi tarian banampak yang sifatnya hiburan. (Peralatan Hiburan dan Kesenian Tradisional Daerah Kalimantan Selatan, 1986)",
                "Beberapa bahan yang dapat digunakan untuk alat musik Kuriding ini adalah kulit luar pelepah enau atau kulit pelepah temputuk, paring dan kayu. \n" +
                        "Fungsinya untuk menghilangkan rasa takut terhadap binatang buas, terutama macan. Konon binatang macan takut mendengar bunyi yang mendengung seperti suara yang ditimbulkan oleh Kuriding. Pada perkembangan selanjutnya alat music Kuriding berfungsi sebagai hiburan pelepas lelah. (Peralatan Hiburan dan Kesenian Tradisional Daerah Kalimantan Selatan, 1986)",
                "Panting merupakan kesenian asli daerah Kalimantan Selatan. Penamaan alat ini berdasarkan bahasa Banjar yaitu petik, membunyikan senar atau tali dengan teknik sentilan.\n" +
                        "Mamanting berarti menyentil senar atau tali yang direntangkan dengan menggunakan pamanting atau sejenis penyentil yang berbentuk pipih, sehingga bila digunakan menimbulkan bunyi. (Peralatan Hiburan dan Kesenian Tradisional Daerah Kalimantan Selatan, 1986)",
                "Payung Ubur-Ubur merupakan peralatan seni tari Sinoman Hadrah. Bahan pembuatan payung ubur-ubur ini terdiri dari kain, air guci (gim), manik-manik, bamboo dan kayu. (Peralatan Hiburan dan Kesenian Tradisional Daerah Kalimantan Selatan, 1986)",
                "Tari Baksa Kembang ini sudah ada sebelum berdirinya pemerintahan raja pertama kerajaan Banjar Suriansyah. Tari Baksa Kembang sudah ada sejak zaman Hindu yang berbarengan dengan hadirnya baksa lainnya seperti Baksa tameng Baksa panah Baksa Dadap dan Baksa lilin.\n" +
                        "Tari Baksa Kembang sendiri diperuntukkan untuk menyambut para tamu agung pada awalnya. Namun Seiring berjalannya waktu tarian ini sudah dipakai di kalangan masyarakat. Walah yang membuat Tari Baksa Kembang tetap Lestari bahkan berkembang ke daerah lain. Tidak sekedar untuk penyambutan tamu saja Tari Baksa Kembang ini juga bisa ditampilkan sebagai hiburan untuk acara-acara tertentu.",
                "Cikal bakal tarian ini dihubungkan dengan legenda di zaman Kerajaan Negara Dipa. Diceritakan Patih Lambung Mangkurat pulang dari lawatannya ke Kerajaan Majapahit menggunakan Kapal Prabu Yaksa. Sayangnya, ketika sampai di Muara Mantuil atau saat memasuki Sungai Barito, kapal yang ditumpanginya tersebut oleng dan nyaris terbalik.\n" +
                        "Di saat seperti itu, sang patih pun memuja “Bantam” yang berarti meminta pertolongan pada Tuhan Yang Maha Kuasa agar diselamatkan. Tak lama kemudian turunlah 7 bidadari, di atas kapal mereka mengadakan upacara beradap-adap. Setelahnya kapal pun kembali normal dan ke tujuh bidadari kembali ke Kayangan.\n" +
                        "Setidaknya cerita itulah yang tersebar luas perihal asal mula tarian Radap Rahayu. Di sisi lain ada juga yang mengatakan bahwa tarian ini diciptakan oleh Pangeran Hidayatullah.\n" +
                        "Tarian ini sangatlah populer di lingkup Kerajaan Banjar. Selain dipentaskan saat acara penobatan raja, juga digunakan untuk menyambut tamu agung, serta saat upacara perkawinan. Sebagai tarian yang bersifat sakral, fungsi utama tarian ini adalah sebagai bagian dari upacara Tapung Tawar (batapung tawar).",
                "Tari japin menjadi bagian kesenian Melayu yang juga berkembang di Kalimantan Selatan. Tari yang sumbernya dari Timur Tengah ini biasanya ditampilkan dalam berbagai acara formal.\n" +
                        "Salah satunya Japin ditampilkan pada pesta perkawinan adat Banjar, sepaket dengan Sinoman Hadrah yang juga budaya Melayu bersumber dari Timur Tengah dan berkembang di Kalimantan Selatan.\n" +
                        "Ciri khas tari Japin adalah permainan langkah kaki yang dinamis dan berpola. Dilakukan berpasangan atau berkelompok sehingga terlihat indah dan menarik minat untuk ikut menari.",
                "Pasar Terapung merupakan ikon Kota Banjarmasin. Terdapat tiga Pasar Terapung di Banjarmasin; Pasar Terapung Muara Kuin, Pasar Terapung Siring dan Pasar Terapung Lok Baintan. Semua pasar tradisional ini memiliki ciri khas unik yaitu pedagangnya menjual produk mereka diatas \"jukung\" atau perahu tradisional.",
                "Sasirangan adalah kain adat suku Banjar di Kalimantan Selatan, kain yang didapat dari proses pewarnaan rintang dengan menggunakan bahan perintang seperti tali, benang atau sejenisnya menurut corak-corak tertentu.\n" +
                        "Pengertian kain Sasirangan itu sendiri secara umum adalah sejenis kain yang dibuat dengan teknik tusuk jelujur, kemudian diikat dengan benang atau tali raffia dan selanjutnya dicelup.\n" +
                        "Kain sasirangan, sejak dahulu merupakan sejenis batik sandang yang juga disebut dengan istilah kain calapan atau celupan yang didekorasi dengan motif tradisional khas Kalimantan Selatan, baik dari segi warna maupun motifnya.",
                "Kitab ini ditulis oleh ulama besar asal Banjar, Kalimantan, Syekh Muhammad Arsyad al-Banjari. Sabilal Muhtadin sangat terkenal pada abad ke-19 hingga awal abad ke-20.\n" +
                        "Kitab ini tak hanya menjadi rujukan umat Islam di Tanah Air, namun juga dipelajari dan diajarkan di Masjidil Haram, Makkah, juga Malaysia dan Thailand. Kitab ini diajarkan oleh para ulama asal Melayu kepada orang-orang Melayu yang datang ke Makkah sebelum mereka mahir berbahasa Arab.\n" +
                        "\n" +
                        "Sabilal Muhtadin ditulis dengan aksara Arab ber bahasa Melayu. Kitab ini adalah kitab kedua yang ditulis dengan gaya bahasa Arab pegon setelah Sirat al-Mustaqim karya Syekh Nuruddin ar-Raniri dari Aceh."
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