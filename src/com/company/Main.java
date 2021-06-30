package com.company;

public class Main {

    public static void main(String[] args) {
        Vokabel Vokabel1 = new Vokabel("Hund", "dog");
        Vokabel Vokabel2 = new Vokabel("Fisch", "fish");
        Vokabelliste Liste1 = new Vokabelliste();
        Liste1.vokabelnHinzufuegen(Vokabel1);
        Liste1.vokabelnHinzufuegen(Vokabel2);
        //Vokabel1.anzeigen();
        Liste1.getVokabelliste();
        //Liste1.englisch("Hund");
        Liste1.compare();
    }
}
