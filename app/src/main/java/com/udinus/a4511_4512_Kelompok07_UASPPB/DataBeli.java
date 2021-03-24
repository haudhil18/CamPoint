package com.udinus.a4511_4512_Kelompok07_UASPPB;

public class DataBeli {
        private String key;
        private String nama;
        private String alamat;
        private String jenis;

        public DataBeli(){

        }

        public DataBeli(String nama, String alamat, String jenis) {
            this.nama = nama;
            this.alamat = alamat;
            this.jenis = jenis;
        }

        public String getKey() {
            return key;
        }

        public void setKey(String key) {
            this.key = key;
        }

        public String getNama() {
            return nama;
        }

        public void setNama(String nama) {
            this.nama = nama;
        }

        public String getAlamat() {
            return alamat;
        }

        public void setAlamat(String alamat) {
            this.alamat = alamat;
        }

        public String getJenis() {
            return jenis;
        }

        public void setJenis(String jenis) {
            this.jenis = jenis;
        }
}
