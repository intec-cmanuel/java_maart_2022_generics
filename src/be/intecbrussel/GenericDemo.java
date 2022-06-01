package be.intecbrussel;

import java.util.Random;
import java.util.function.Predicate;

public class GenericDemo {
    public static void main(String[] args) {
        Duo<String> stringDuo = new Duo<>("Hello", "World");

        System.out.println("S1: " + stringDuo.getS1());
        System.out.println("S2: " + stringDuo.getS2().toUpperCase());

        stringDuo.swap();

        System.out.println("S1: " + stringDuo.getS1());
        System.out.println("S2: " + stringDuo.getS2().toUpperCase());

        Duo<Integer> integerDuo = new Duo<>(5,8);

        System.out.println("S1: " + integerDuo.getS1());
        System.out.println("S2: " + integerDuo.getS2());

        Duo<Random> randomDuo = new Duo<>(new Random(), new Random());

        MixedDuo<String, Integer> mixedDuo = new MixedDuo<>("Hello", 455);
        MixedDuo<String, String> stringDuo2 = new MixedDuo<>("Hello", "Wolrd");


    }
}
