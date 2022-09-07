package com.ibtech.interfaces;

public class Test {
    public static void main(String[] args) {
        Pigeon pigeon = new Pigeon("Paçalı");
        pigeon.fly();
        pigeon.land();

        System.out.println();

        Bird bird = new Pigeon("Taklacı");
        bird.fly();
        bird.land();

        System.out.println();

        Flyable flyable = new Pigeon("Postacı");
        flyable.fly();
        flyable.land();

        System.out.println();

        Bat bat = new Bat("Batman");
        bat.fly();
        bat.land();

        System.out.println();

        Mammal mammal = new Bat("Robin");
        //mammal.fly();
        //mammal.land();

        Flyable flyable2 = new Bat("Vampir");
        flyable2.fly();
        flyable2.land();

        makeFly(pigeon);
        makeFly(bird);
        makeFly(flyable);
        makeFly(bat);
        //makeFly(mammal);
        makeFly(flyable2);
    }

    private static void makeFly(Flyable flyable) {
        System.out.println();
        System.out.println("UÇ");
        flyable.fly();
        System.out.println("KON");
        flyable.land();
    }
}
