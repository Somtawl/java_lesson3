import java.util.ArrayList;
import java.util.Random;

public class task1 {
    public static void main(String[] args) {
        ArrayList arr = new ArrayList();
        Random random = new Random();

        for (int i = 0; i < 100; i++) {
            int value = random.nextInt(100) + 1;
            arr.add(value); // генерируем случайное число от 1 до 100
        }

        System.out.println("Массив сгенерирован:");
        System.out.println(arr);
        int min = Integer.parseInt("" + arr.get(0));
        int max = Integer.parseInt("" + arr.get(0));
        int average = Integer.parseInt("" + arr.get(0));
        int averageTmp = 0;
    
        //Перебираем массив
        for (int i = 0; i < arr.size(); i++) {
            var tmp = arr.get(i);
            int num = Integer.parseInt("" + tmp);

            if (min > num) {
                min = num;
            }
            if (max < num) {
                max = num;
            }
            averageTmp = averageTmp + num;
            if (num % 2 == 0) {
                arr.remove(i); // Убираем число из массива
            }
        }
        average = averageTmp / 100;

        System.out.println("Минимальное значение в массиве");
        System.out.println(min);
        System.out.println("Максимальное значение в массиве");
        System.out.println(max);
        System.out.println("Средее арифметическое массива");
        System.out.println(average);     
        System.out.println("Массив без четных чисел");
        System.out.println(arr);
    }
}