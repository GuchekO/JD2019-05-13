package by.it.akhmelev.jd01_02;

import java.util.Scanner;

public class TaskA {

    public static void main(String[] args) {
        int[] mas = new int[10];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < mas.length; i++) {
            mas[i] = scanner.nextInt();
        }

        step1(mas);
        step2(mas);
        step3(mas);

    }

    private static void step1(int[] mas) {
        int max = mas[0];
        int min = mas[0];
        for (int element : mas) {
            if (max < element) max = element;
            if (min > element) min = element;
        }
        System.out.println(min + " " + max);
    }
    private static void step2(int[] mas) {
        double sum = 0;
        for (int element : mas) {
            sum = sum + element;
        }
        double avg = sum / mas.length;
        for (int element : mas) {
            if (element < avg)
                System.out.print(element + " ");
        }
        System.out.println();
    }

    private static void step3(int[] mas) {
        int min = mas[0];
        for (int element : mas) {
            if (min > element) min = element;
        }

        for (int i = mas.length - 1; i >= 0; i--) {
            if (mas[i]==min)
                System.out.print(i+" ");
        }
        System.out.println();
    }





}
