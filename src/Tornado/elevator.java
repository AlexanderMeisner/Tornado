package Tornado;

import java.util.Arrays;
import java.util.Scanner;

public class elevator {

    public static void main(String[] args) {

        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите количество этажей, на которых требуется забрать пассажиров: ");
            int length = scanner.nextInt();
            int[] array = new int[length];
            System.out.println("Введите номера этих этажей:");
            for (int i = 0; i < length; i++) {
                array[i] = scanner.nextInt();
            }

            int maxNum = array[0];
            for (int j : array) {
                if (j > maxNum)
                    maxNum = j;
            }

            int minNum = array[0];
            for (int k : array) {
                if (k < minNum)
                    minNum = k;
            }

//        System.out.println("Массив: " + Arrays.toString(array));
//        System.out.println("Максимальное значение: " + maxNum);
//        System.out.println("Минимальное значение: " + minNum);

            System.out.print("Введите начальное положение лифта (номер этажа): ");
            int floor = scanner.nextInt();
            System.out.print("Введите текущее направление движения (вверх = 0, вниз = 1): ");
            int way = scanner.nextInt();
            if (way == 0) {
                for (int n = floor; n < maxNum; n++) {
                    floor = n;
                    System.out.println("Этаж №" + n + " едем вверх");
                }

                way = 1;

                for (int n = floor + 1; n > minNum; n--) {
                    floor = n;
                    System.out.println("Этаж №" + n + " едем вниз");
                }

                System.out.println("Этаж №" + (floor - 1) + " едем вниз");
            } else {
                for (int n = floor; n > minNum; n--) {
                    floor = n;
                    System.out.println("Этаж №" + n + " едем вниз");
                }

                way = 0;

                for (int n = floor - 1; n < maxNum; n++) {
                    floor = n;
                    System.out.println("Этаж №" + n + " едем вверх");
                }

                System.out.println("Этаж №" + (floor + 1) + " едем вверх");
            }
        }

    }

}
