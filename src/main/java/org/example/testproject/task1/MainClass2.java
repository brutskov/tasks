package org.example.testproject.task1;

public class MainClass2 {

    /**
     * Iterate an array and output into console lions which can fly and are older than 14 y.o.
     */
    public static void main(String[] args) {
        Animal cat = new Animal();
        cat.setAge(10);
        cat.setType("Cat");
        cat.setCanFly(false);

        Animal lion = new Animal();
        lion.setAge(15);
        lion.setType("Lion");
        cat.setCanFly(true);

        Animal fish = new Animal();
        fish.setAge(5);
        fish.setType("Lion");
        cat.setCanFly(true);

        Animal bird = new Animal();
        bird.setAge(2);
        bird.setType("Lion");

        Animal human = new Animal();
        human.setAge(18);
        human.setType("Lion");
        cat.setCanFly(true);

        Animal[] animals = { cat, lion, fish, bird, human };

        // implement here using for

        // implement here using while
    }
}
