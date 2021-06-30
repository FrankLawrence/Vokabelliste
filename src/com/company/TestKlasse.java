package com.company;

public class Testklasse {
    private Vokabelliste liste;

    public Testklasse()
    {
        liste = new Vokabelliste();

        liste.hinzufuegen("Hund","dog");
        liste.hinzufuegen("Katze","cat");
        liste.hinzufuegen("Schwein","pig");
        liste.hinzufuegen("Kuh","cow");
        liste.hinzufuegen("Ratte","rat");
        liste.hinzufuegen("Aal","eel");
        liste.hinzufuegen("Fisch","fish");
        liste.hinzufuegen("Esel","donkey");
        liste.hinzufuegen("Affe","monkey");
        liste.getVokabelliste();
        System.out.println("\nSortieren nach deutschen Begriffen...");
        liste.sortierenDeutsch();
        liste.getVokabelliste();
        System.out.println("\nSortieren nach englischen Begriffen...");
        liste.sortierenEnglisch();
        liste.getVokabelliste();
    }
}
