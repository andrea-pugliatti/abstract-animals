package org.lessons.java.animals;

public class Aquila extends AbstractAnimale implements IVolante {
    public void verso() {
        System.out.println("Keee keee");
    }

    public void mangia() {
        System.out.println("L'aquila mangia un roditore");
    }

    public void vola() {
        System.out.println("L'aquila sta volando nel cielo");
    }
}
