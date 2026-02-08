package org.lessons.java.animals;

public class Aquila extends AbstractAnimale implements IVolante {
    @Override
    public void verso() {
        System.out.println("Keee keee");
    }

    @Override
    public void mangia() {
        System.out.println("L'aquila mangia un roditore");
    }

    @Override
    public void vola() {
        System.out.println("L'aquila sta volando nel cielo");
    }
}
