package com.company;

public class Vokabel {
    private String deutsch;
    private String english;

    public Vokabel(String pDeutsch, String pEnglisch) {
        deutsch = pDeutsch;
        english = pEnglisch;
    }

    public void anzeigen() {
        System.out.println("Englisch: " + english + " , Deutsch: " + deutsch);
    }
    public String getDeutsch() {
        return deutsch;
    }

    public String getEnglish() {
        return english;
    }
}