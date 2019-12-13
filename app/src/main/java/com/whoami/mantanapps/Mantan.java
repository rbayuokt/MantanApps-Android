package com.whoami.mantanapps;

public class Mantan {
    private String nama;
    private String ttl;
    private String lamaPacaran;
    private String alasanPutus;
    private int gambar;

//    public Mantan(String nama, String lamaPacaran, int gambar) {
//        this.nama = nama;
//        this.lamaPacaran = lamaPacaran;
//        this.gambar = gambar;
//    }
//
//    public Mantan(String nama, String ttl, String lamaPacaran, String alasanPutus, int gambar) {
//        this.nama = nama;
//        this.ttl = ttl;
//        this.lamaPacaran = lamaPacaran;
//        this.alasanPutus = alasanPutus;
//        this.gambar = gambar;
//    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getTtl() {
        return ttl;
    }

    public void setTtl(String ttl) {
        this.ttl = ttl;
    }

    public String getLamaPacaran() {
        return lamaPacaran;
    }

    public void setLamaPacaran(String lamaPacaran) {
        this.lamaPacaran = lamaPacaran;
    }

    public String getAlasanPutus() {
        return alasanPutus;
    }

    public void setAlasanPutus(String alasanPutus) {
        this.alasanPutus = alasanPutus;
    }

    public int getGambar() {
        return gambar;
    }

    public void setGambar(int gambar) {
        this.gambar = gambar;
    }
}
