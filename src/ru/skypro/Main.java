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

        int deliveryDistance = 61;
        calculationDelivery(deliveryDistance);

    }

    public static void calculationDelivery(int distance) {
        if (distance <= 20){
            System.out.println("1 Days");
        }
        else if (distance > 20 && distance <= 60) {
            System.out.println(" 2 Days");
        }
        else if (distance > 60 && distance <= 100) {
            System.out.println("3 Days");
        }
        else System.out.println("Доставка не осуществляется");
    }
    public static void checkDeviceYear(int year, int operationSys) {
        if (operationSys == 1){
            if (year < 2015){
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            }
            else System.out.println("Установите версию приложения для iOS по ссылке");
        }
        else if (operationSys == 0) {
            if (year < 2015){
                System.out.println("Установите облегченную версию приложения для Android  по ссылке");
            }
            else System.out.println("Установите версию приложения для Android  по ссылке");
        }
        else System.out.println("Ваша ОС не поддерживается");
    }
    public static void checkYear(int year) {
        if (year % 4 == 0 || year % 400 ==0){
            if (year % 100 != 0) {
                System.out.println("Год високосный");
            }
            else System.out.println("Год не високосный");
        }
        else System.out.println("Год не високосный");
    }
}
