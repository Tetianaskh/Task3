package com.company;


import java.util.Scanner;

public class Task3 {

    // Обязательные задачи:

    // Задача 1. Максимальное из введенных чисел
    static void exercise01() {
        System.out.println("Добрый день!");
        System.out.println("Наш помощник вычислит максимальное из пяти введенных чисел:");

        Scanner sc = new Scanner(System.in);
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();
        int number3 = sc.nextInt();
        int number4 = sc.nextInt();
        int number5 = sc.nextInt();

        int result = Math.max(number1, number2);
        int result2 = Math.max(result, number3);
        int result3 = Math.max(result2, number4);
        int result4 = Math.max(result3, number5);

        System.out.println(result4);
    }
    // Задача 2. Тест
    static void exercise02() {
        System.out.println("Добрый день!");
        System.out.println("Пройдите тест на общие знания о нашей солнечной системе:");

        Scanner sc = new Scanner(System.in);

        System.out.println("1. Какая планета солнечной системы самая большая?" +
        "1 Венера" +
        "2 Сатурн" +
        "3 Юпитер*" +
        "4 Меркурий");
        String answer1 = sc.toString();

        System.out.println("2. Самосветящееся небесное тело?" +
        "1 звезда*" +
        "2 планета" +
        "3 метеорит" +
        "4 Луна");
        String answer2 = sc.toString();

        System.out.println("3. Группа звезд, занимающая определенный участок неба?" +
        "1 орбита" +
        "2 комета" +
        "3 астероиды" +
        "4 созвездие*");
        String answer3 = sc.toString();

        System.out.println("4. Путь движения планет вокруг Солнца называют?" +
        "1 астероидами" +
        "2 спутниками" +
        "3 орбитами*" +
        "4 кометами");
        String answer4 = sc.toString();

        System.out.println("5. Планеты Солнечной системы изучают?" +
        "1 географы" +
        "2 астрономы*" +
        "3 историки" +
        "4 химики");
        String answer5 = sc.toString();

        System.out.println("6. Самая яркая планета Солнечной системы, названная в честь богини красоты?" +
        "1 Земля" +
        "2 Марс" +
        "3 Венера*" +
        "4 Луна");
        String answer6 = sc.toString();

        System.out.println("7. Небесное тело, обращающееся вокруг Солнца?" +
        "1 планета*" +
        "2 спутник" +
        "3 звезда" +
        "4 метеорит");
        String answer7 = sc.toString();

        System.out.println("8. Космический объект, обращающийся вокруг планеты?" +
        "1 звезда" +
        "2 комета" +
        "3 спутник*" +
        "4 астероид");
        String answer8 = sc.toString();

        System.out.println("9. На какой планете побывали автоматические межпланетные станции?" +
        "1 на Венере*" +
        "2 на Юпитере" +
        "3 на Сатурне" +
        "4 на Марсе");
        String answer9 = sc.toString();

        System.out.println("10. Из-за чего происходит смена времен года?" +
        "1 из-за вращения Земли вокруг своей оси" +
        "2 из-за вращения Земли вокруг Солнца*" +
        "3 из-за вращения Земли вокруг Луны" +
        "4 из-за вращения Луны вокруг Земли");
        String answer10 = sc.toString();

    }
    // Задача 3. Проверка даты
    static void exercise03() {

    }
    // Задача 4. Линейное уравнение
    static void exercise04() {
        System.out.println("Добрый день!");
        System.out.println("Наш калькулятор поможет с решением линейных уравнений ax + b = 0:");

        Scanner sc = new Scanner(System.in);

        System.out.println("Введите значение переменной а");
        int a = sc.nextDouble();

        System.out.println("Введите значиние переменной b");
        int b = sc.nextDouble();

        if ( a = 0 && b = 0);
        System.out.println("х = 0");
        else (result = (0 - b) / a);
        System.out.println("х = " + result);
    }
    // Задача 5. Квадратное уранение
    static void exercise05() {

    }

    // Дополнительные задачи:

    // Задача 1. Самолет и топливо
    static void exercise001() {

    }
    // Задача 2. Алгоритм приготовления тостов
    static void exercise() {

    }
    // Задача 3. Жалюзи
    static void exercise003() {

    }
    // Задача 4. Программист Вася
    static void exercise004() {

    }

    public static void main(String[] args) {
        exercise02();
    }
}