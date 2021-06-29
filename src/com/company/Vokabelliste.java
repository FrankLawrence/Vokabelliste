package com.company;

public class Vokabelliste {
    public Vokabel[] vokabelliste;
    int anzahl;

    public Vokabelliste() {
        vokabelliste = new Vokabel[100];
    }

    public void hinzufuegen(Vokabel newWord) {
        for (int i = 0; i<vokabelliste.length; i++){
            if (vokabelliste[i] == null) {
                vokabelliste[i] = newWord;
                break;
            }
        }
    }

    public void getVokabelliste() {
        for (Vokabel vokabel : vokabelliste) {
            if (vokabel == null)
                break;
            else
                vokabel.anzeigen();
        }
    }

    public void englisch(String deutsch) {
       String d, e;

        for (Vokabel vokabel : vokabelliste) {
            d = vokabel.getDeutsch();
            e = vokabel.getEnglish();
            if (deutsch.equals(d)) {
                System.out.println(deutsch + " auf English heißt " + e);
                break;
            } else {
                System.out.println("nicht enthlaten");
            }
        }
    }

}
