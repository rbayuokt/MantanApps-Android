package com.whoami.mantanapps;

import java.util.ArrayList;

public class MantanData {

    private static String[] namaMantan = {
            "Ariel Tatum",
            "Aura Kasih",
            "Raline Shah",
            "Pevita Pearce",
            "Yuki Kato",
            "Natasha Wilona",
            "Anya Geraldine",
            "Ranty Maria",
            "Irish Bella",
            "Raisa"
    };

    private static String[] tempatTanggalLahir = {
            "Jakarta, 8 November 1996",
            "Bandung, 26 February 1987",
            "Jakarta, 4 Maret 1985",
            "Jakarta, 6 Oktober 1992",
            "Malang, 2 Aprik 1995",
            "Jakarta, 15 Desember 1998",
            "Jakarta, 15 Desember 1995",
            "Jakarta, 26 April 1999",
            "Cirebon, 23 April 1996",
            "Jakarta, 6 Juni 1990"
    };

    private static String[] lamaPacaran = {
            "5 Bulan",
            "3 Bulan",
            "2 Bulan",
            "7 Bulan",
            "4 Bulan",
            "1 Bulan",
            "1 Hari",
            "4 Bulan",
            "8 Bulan",
            "1 Tahun"
    };

    private static String[] alasanPutus = {
            "Kalah sama mobil, aku masih pake beat mas",
            "Gakuat dihujat netizen, disangka pake pelet",
            "Skikernya mahal bos, gakuat aku tiap hari makan kerupuk",
            "Sadar diri aja, aku terlalu kentang untuk dia yang sempura",
            "Gadirestuin sama orang tuanya, lebih mirip supirnya katanya",
            "Ditikung moge bos, sakit banget beat lawan moge, kalah telak.",
            "Pas nerima katanya dibajak temennya. Jadinya diputusin terus di blok semua sosmed.",
            "Katanya aku terlalu baik",
            "Ditinggal nikah bos, sudah punya anak dia sekarang, I'm Still see your shadows in my room pokonya mah",
            "Kalah sama blasteran bule bos, gila itu suaminya skarang kaya langit dan inti bumi kalo dibandingin sama saya, semoga bahagia ya raisa"
    };

    private static int[] gambarMantan = {
            R.drawable.mantan_1,
            R.drawable.mantan_2,
            R.drawable.mantan_3,
            R.drawable.mantan_4,
            R.drawable.mantan_5,
            R.drawable.mantan_6,
            R.drawable.mantan_7,
            R.drawable.mantan_8,
            R.drawable.mantan_9,
            R.drawable.mantan_10
    };

    static ArrayList<Mantan> getListData(){
        ArrayList<Mantan> list = new ArrayList<>();
        for(int position = 0 ; position < namaMantan.length ; position++){
            Mantan mantan = new Mantan();
            mantan.setNama(namaMantan[position]);
            mantan.setTtl(tempatTanggalLahir[position]);
            mantan.setLamaPacaran(lamaPacaran[position]);
            mantan.setAlasanPutus(alasanPutus[position]);
            mantan.setGambar(gambarMantan[position]);
            list.add(mantan);
        }

        return list;
    }

}
