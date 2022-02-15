package Homework06;

public class Main {

    /**
     * Возвращает количество цифр определенного числа
     * @param number число, для которого нужно получить количество цифр.
     * @return количество цифр входного числа.
     */
    public static int getDigitsCount(int number){
        //тело функции
        int count = 0;
        while(number != 0){
            number /= 10;
            count++;
        }
        // return - оператор возврата значения из функции
        return count;
    }

    /**
     * Возвращает среднее значение всех элементов входного массива.
     * @param array - входной массив в коготом нужно высчитать среднее значение элементов.
     * @return - возвращает вещественное значение расчета функции
     */
    public static double getAverage(int[] array){
        double result=0;
        for(int i = 0; i<array.length; i++) {
            result += array[i] ;
        }
        return result/array.length;
    }

    /**
     * Функция высчитывающая вещественное среднее значение целых чисел начинающихся с входной "from" до входной "to"
     * @param from первое число в отсчете
     * @param to последнее число в отсчете
     * @return - возвращается среднее значение чисел между "from" и "to".
     */
    public static double getAverage(int from, int to){
        double sum = 0;
        for (int i = from; i <=to; i++) {
            sum += i;
        }
        return sum / ((to-from)+1);
    }

    /**
     * распечатывает список всех элементов входящего массива.
     * @param array - массив подаваемый на распечатку
     */
    public static void print(int[] array){
        for (int i = 0; i <array.length; i++) {
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int result = getDigitsCount(24);
        int result1 = getDigitsCount(254867852);
        int[] a = {2,4,6,3,5,2,6,4,87,65,4,56,12,34,32,67};
        double result3 = getAverage(a);
        double result4 = getAverage(10,15);
        print(a);
        System.out.println(result+ " " +result1+ " " +result3+ " : " +result4);
    }
}
