package com.company;

public class Main {

    public static void main(String[] args) {
        Vokabel Vokabel1 = new Vokabel("Hund", "dog");
        Vokabelliste Liste1 = new Vokabelliste();
        Liste1.hinzufuegen(Vokabel1);
        //Vokabel1.anzeigen();
        Liste1.getVokabelliste();
        Liste1.englisch("Hund");
    }
}
