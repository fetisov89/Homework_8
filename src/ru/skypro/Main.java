package ru.skypro;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        TASK_1

        Scanner scn = new Scanner(System.in);
        System.out.println("Введите год");
        int year = scn.nextInt();
        checkYear(year);

//        TASK_2

        int clientDevYear = 2014;
        int operationSys = 1;
        checkDeviceYear(clientDevYear, operationSys);

//        TASK_3

        int deliveryDistance = 500;
        if (calculationDelivery(deliveryDistance) != 0) {
            System.out.println("Доставка займет " + calculationDelivery(deliveryDistance) + " дней");
        } else {
            System.out.println("Доставка не осуществляется");
        }


    }

    private static int calculationDelivery(int distance) {
        if (distance <= 20) {
            return 1;
        }
        else if (distance > 20 && distance <= 60) {
            return 2;
        }
        else if (distance > 60 && distance <= 100) {
            return 3;
        }
        return 0;
    }
    private static void checkDeviceYear(int year, int operationSys) {
        if (operationSys == 1){
            if (year < 2015){
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            }
            else {
                System.out.println("Установите версию приложения для iOS по ссылке");
            }
        }
        else if (operationSys == 0) {
            if (year < 2015){
                System.out.println("Установите облегченную версию приложения для Android  по ссылке");
            }
            else {
                System.out.println("Установите версию приложения для Android  по ссылке");
            }
        }
        else {
            System.out.println("Ваша ОС не поддерживается");
        }
    }
    private static void checkYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 ==0){
            System.out.println("Годвисокосный");
        }
        else {
            System.out.println("Год не високосный");
        }
    }
}
