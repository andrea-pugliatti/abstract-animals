package org.lessons.java.animals;

public class Main {
    public static void main(String[] args) {
        Aquila aquila = new Aquila();
        Cane cane = new Cane();
        Passerotto passerotto = new Passerotto();
        Delfino delfino = new Delfino();

        aquila.dormi();
        cane.verso();
        passerotto.mangia();
        delfino.verso();

        delfino.nuota();

        faiVolare(aquila);
        faiNuotare(delfino);
    }

    public static void faiVolare(IVolante animale) {
        animale.vola();
    }

    public static void faiNuotare(INuotante animale) {
        animale.nuota();
    }
}
