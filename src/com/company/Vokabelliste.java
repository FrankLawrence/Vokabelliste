package com.company;

public class Vokabelliste {
    public Vokabel[] vokabelliste;

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
        for (int i = 0; i < vokabelliste.length; i++) {
            if (vokabelliste[i] == null)
                break;
            else
                vokabelliste[i].anzeigen();
        }
    }
}
