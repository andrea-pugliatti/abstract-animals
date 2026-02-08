package org.lessons.java.animals;

public class Passerotto extends AbstractAnimale implements IVolante {
    @Override
    public void verso() {
        System.out.println("Chirp chirp");
    }

    @Override
    public void mangia() {
        System.out.println("Il passerotto mangia insetti e semi");
    }

    @Override
    public void vola() {
        System.out.println("Il passerotto sta volando tra gli alberi");
    }
}
