package Homework09;

import java.util.Scanner;

/**
 * программа принимающая на вход объекты с данными о имени и весе
 * сортирует полученные объекты в порядке возрастания веса.
 */
public class Main {
    public static void main(String[] args) {
        //создание массива
        Person[] person = new Person[10];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < person.length; i++) {
            System.out.println("Введите имя " + (i + 1) + "-го человека:");
            String name = scanner.nextLine();

            System.out.println("Сколько весит " + (i + 1) + "-й человек?");
            double weight = Double.parseDouble(scanner.nextLine());

            person[i] = new Person(name, weight);
        }
        // сортировка массива
        for(int i = 0; i < person.length; i++) {
            double min = person[i].getWeight();
            int minIndex = i;
            for (int j = i + 1; j < person.length; j++) {
                if(person[j].getWeight() < min) {
                    min = person[j].getWeight();
                    minIndex = j;
                }
            }
            Person temp = person[i];
            person[i] = person[minIndex];
            person[minIndex] = temp;
        }
        //вывод массива на печать
        for (int i = 0; i < person.length; i++) {
            System.out.println(person[i].getName() + " " + person[i].getWeight());
        }
    }
}
