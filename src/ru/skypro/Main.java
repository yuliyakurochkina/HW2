package ru.skypro;

public class Main {

    public static void main(String[] args) {
        //Задание 1
        int clientOS = 1;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке.");
        } else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке.");
        }
        System.out.println();
        //Задание 2
        int clientDeviceYear = 2015;
        if (clientOS == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке.");
        } else if (clientOS == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке.");
        }
        if (clientOS == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке.");
        } else if (clientOS == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке.");
        }
        System.out.println();
        //Задание 3
        int year = 2021;
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println("Год является високосным.");
        } else {
            System.out.println("Год не является високосным.");
        }
        System.out.println();
        //Задание 4
        int deliveryDistance = 95;
        int deliveryTime;
        if (deliveryDistance < 20) {
            deliveryTime = 1;
            System.out.println("Потребуется дней: " + deliveryTime);
            System.out.println();
        } else if (deliveryDistance >= 20 && deliveryDistance < 60) {
            deliveryTime = 2;
            System.out.println("Потребуется дней: " + deliveryTime);
            System.out.println();
        } else if (deliveryDistance >= 60 && deliveryDistance < 100) {
            deliveryTime = 3;
            System.out.println("Потребуется дней: " + deliveryTime);
            System.out.println();
        } else {
            System.out.println("Срок доставки уточняйте у оператора.");
            System.out.println();
        }
        //Задание 5
        int monthNumber = 12;
        String season = switch (monthNumber) {
            case 12, 1, 2 -> "зиме";
            case 3, 4, 5 -> "весне";
            case 6, 7, 8 -> "лету";
            case 9, 10, 11 -> "осени";
            default -> "вымешленным месяцам";
        };
        System.out.println(monthNumber + "й месяц принадлежит к " + season);
    }
}
