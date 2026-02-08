package org.lessons.java.animals;

public class Cane extends AbstractAnimale {
    @Override
    public void verso() {
        System.out.println("Bau bau");
    }

    @Override
    public void mangia() {
        System.out.println("Il cane mangia croccantini");

    }
}
