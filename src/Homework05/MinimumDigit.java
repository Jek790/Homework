package Homework05;

import java.util.Scanner;

/**
 * Программа принимающая из консоли числа и выводящая самую маленькую цифру во всех числах. Остановкой программы считается ввод с консоли "-1"
 */
public class MinimumDigit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Вводите числа. Для начала поиска минимальной цифры введите -1");
        int number = Integer.parseInt(scanner.nextLine());
        int remainder;
        int result = 9;
        while(number != -1) {
            while (number >0) {
                remainder = number % 10;
                if(remainder < result) {
                    result = remainder;
                }
                number /= 10;
            }
            number = Integer.parseInt(scanner.nextLine());
        }
        System.out.println("Самая маленькая цифра: " +result);
    }
}
