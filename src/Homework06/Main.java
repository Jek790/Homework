package Homework06;


public class Main {

    /**
     * функция принимающая на вход массив "array" и число "number" и выводящая индекс элемента этого числа.
     * @param array - входной массив
     * @param number - входное число
     * @return возвращает индекс входного числа в массиве.
     */
    public static int getIngexFromNumber(int[] array, int number){
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i] == number)
                index = i;
        }
        return index;
    }

    public static void main(String[] args) {
        int[] array = {2,4,34,76,3,56,435,85,90,10,34,32,73,57};
        int number = 90;
        int index = getIngexFromNumber(array, number);
        System.out.println("В массиве число " +number+ " находится под индексом " +index);
    }
}
