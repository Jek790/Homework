package Homework07;

import java.util.Scanner;

/**
 * Данная прогррамма принимает на вход последовательность целых чисел и выводит число повторяющееся меньшее количество раз.
 * Все числа в диапазоне от -100 до 100.
 * Введение новых чисел заканчивается вводом "-1"
 */
public class MinNumberOfTime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number between -100 and 100");
        int[] array = new int[201];
        int number = Integer.parseInt(scanner.nextLine());
        while (number != -1) {
            if(number >= -100 && number <= 100) {
                array[number + 100]++;
            } else {
                System.out.println("Number is out of range. Please re-enter the number");
            }
            number = Integer.parseInt(scanner.nextLine());
        }
        int result = -1;
        int tempValue = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            if(array[i] < tempValue && array[i] != 0) {
                tempValue = array[i];
                result = i - 100;
            }
        }
        System.out.println("The number that is entered the least number of times is " + result);
    }
}
