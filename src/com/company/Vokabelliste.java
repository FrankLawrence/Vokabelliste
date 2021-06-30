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

    public int compare(){
        return vokabelliste[0].getDeutsch().compareTo(vokabelliste[1].getDeutsch());
    }

    /*public void sortiernDeutsch() {
        for (int i = 0; i < vokabelliste.length; i++) {
            if (vokabelliste[i].getDeutsch().compareTo(vokabelliste[i+1].getDeutsch())) {
                umtauschen(i, i+1);
            }
        }
    }*/

    public void sortierenEnglish() {

    }

}
