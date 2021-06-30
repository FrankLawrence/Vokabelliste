package com.company;

public class Vokabelliste {
    public Vokabel[] vokabelliste;
    int anzahl;

    public Vokabelliste() {
        vokabelliste = new Vokabel[100];
    }

    public void hinzufuegen(String deutsch, String englisch) {
        Vokabel neuVokabel = new Vokabel(deutsch, englisch);
        for (int i = 0; i<vokabelliste.length; i++){
            if (vokabelliste[i] == null) {
                vokabelliste[i] = neuVokabel;
                break;
            }
        }
    }

    public void vokabelnHinzufuegen(Vokabel newWord) {
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

    private void umtauschen(int a, int b) {
        Vokabel speicher = vokabelliste[a];
        vokabelliste[a] = vokabelliste[b];
        vokabelliste[b] = speicher;
    }

    public void sortierenDeutsch() {
        String d1,d2;

        for (int anfang = 1; anfang < vokabelliste.length; anfang++)
            for (int speicher=0; speicher < vokabelliste.length-1; speicher++) {
                if (vokabelliste[speicher+1] != null) {
                    d1 = vokabelliste[speicher].getDeutsch();
                    d2 = vokabelliste[speicher + 1].getDeutsch();
                    if (d1.compareTo(d2) > 0) {
                        umtauschen(speicher, speicher + 1);
                    }
                } else {break;}
            }
    }

    public void sortierenEnglisch() {
        String d1,d2;

        for (int anfang = 1; anfang < vokabelliste.length; anfang++)
            for (int speicher=0; speicher < vokabelliste.length-1; speicher++)
            {
                d1 = vokabelliste[speicher].getEnglish();
                d2 = vokabelliste[speicher+1].getEnglish();
                if (d1.compareTo(d2) > 0)
                {
                    umtauschen(speicher, speicher+1);
                }
            }
    }

}
