package org.example.testproject.task2;

public class MainClass {

    /**
     * Fix code and what will be written in the console
     * How can you get rid of 2 print methods?
     */
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.setType("cat");
        cat.setAge(1);
        print(cat);

        Lion lion = new Lion();
        lion.setType("lion");
        lion.setAge(2);
        print(lion);
    }

    private static void print(Lion lion) {
        System.out.println(lion.getType());
    }

    private static void print(Cat cat) {
        System.out.println(cat.getType());
    }

    private static Integer print(Cat cat) {
        System.out.println(cat.getType());
        return 0;
    }
}
