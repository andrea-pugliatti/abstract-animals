package org.lessons.java.animals;

public class Passerotto extends AbstractAnimale implements IVolante {
    public void verso() {
        System.out.println("Chirp chirp");
    }

    public void mangia() {
        System.out.println("Il passerotto mangia insetti e semi");
    }

    public void vola() {
        System.out.println("Il passerotto sta volando tra gli alberi");
    }
}
