package org.lessons.java.animals;

public class Delfino extends AbstractAnimale implements INuotante {
    public void verso() {
        System.out.println("Clik kik");
    }

    public void mangia() {
        System.out.println("Il delfino mangia pesci e crostacei");
    }

    public void nuota() {
        System.out.println("Il delfino nuota nel mare");
    }
}
