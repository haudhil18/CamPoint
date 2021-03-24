package com.udinus.a4511_4512_Kelompok07_UASPPB;

public class DataJual {
    private String key;
    private String namakam;
    private String konkam;
    private String deskam;

    public DataJual(){

    }

    public DataJual(String namakam,String konkam, String deskam){
        this.namakam = namakam;
        this.konkam = konkam;
        this.deskam = deskam;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getNamakam() {
        return namakam;
    }

    public void setNamakam(String namakam) {
        this.namakam = namakam;
    }

    public String getKonkam() {
        return konkam;
    }

    public void setKonkam(String konkam) {
        this.konkam = konkam;
    }

    public String getDeskam() {
        return deskam;
    }

    public void setDeskam(String deskam) {
        this.deskam = deskam;
    }
}
