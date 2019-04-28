package com.example.animasyonlu_satirgecisleri_rv.Model;

public class Uyeler {

    private String ad;
    private String email;
    private String profilResim;

    public Uyeler() {
    }

    public Uyeler(String ad, String email, String profilResim) {
        this.ad = ad;
        this.email = email;
        this.profilResim = profilResim;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getProfilResim() {
        return profilResim;
    }

    public void setProfilResim(String profilResim) {
        this.profilResim = profilResim;
    }
}
