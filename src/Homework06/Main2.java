package Homework06;

public class Main2 {

    /**
     * процедура принимающая на вход массив из целых чисел, и выводящая в консоль значимые числа влево, а нули вправо.
     * @param array - входящий массив целых чисел.
     */
    public  static void autoSorting(int[] array){
        int[] outputArray = new int[array.length];
        int indexOutputArray = 0;
        for (int i = indexOutputArray; i < array.length; i++) {
            if(array[i] != 0){
                outputArray[indexOutputArray] = array[i];
                indexOutputArray++;
            }

        }
        for (int j : outputArray) {
            System.out.print(j + ", ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] massive = {12,0,23,4,32,543,6,0,4,54,24,0,1,95,40,0,23};
        autoSorting(massive);
    }
}
