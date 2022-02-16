package Homework06;

import java.util.Arrays;

public class Main2 {

    /**
     * процедура принимающая на вход массив из целых чисел, и выводящая в консоль значимые числа влево, а нули вправо.
     * @param array - входящий массив целых чисел.
     */
    public  static void autoSorting(int[] array) {
        int[] outputArray = new int[array.length];
        int indexOutputArray = 0;
        for (int i : array) {
            if (i != 0) {
                outputArray[indexOutputArray] = i;
                indexOutputArray++;
            }

        }
        System.out.println(Arrays.toString(outputArray));
    }
    public static void main(String[] args) {
        int[] massive = {12,0,23,4,32,543,6,0,4,54,24,0,1,95,40,0,23};
        int[] massive2 = {235,34,21,5,343,728,0,23,0,123,4,9,45,325,0,5,32,657,0,64};
        autoSorting(massive);
        autoSorting(massive2);
    }
}
