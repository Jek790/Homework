package Homework08;

/**
 * класс содержащий в себе информацию о полях и методах.
 */
public class Person {
    private final String name;
    private final double weight;

    public Person(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public String getName() {
        return name;
    }
}

