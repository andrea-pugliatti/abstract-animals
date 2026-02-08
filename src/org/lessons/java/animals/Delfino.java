package org.lessons.java.animals;

public class Delfino extends AbstractAnimale implements INuotante {
    @Override
    public void verso() {
        System.out.println("Clik kik");
    }

    @Override
    public void mangia() {
        System.out.println("Il delfino mangia pesci e crostacei");
    }

    @Override
    public void nuota() {
        System.out.println("Il delfino nuota nel mare");
    }
}
