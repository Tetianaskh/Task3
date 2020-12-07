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

    /*  1  Какая планета солнечной системы самая большая?

        Венера
                Сатурн
      ....  Юпитер
                Меркурий

       2 Самосветящееся небесное тело:

        ......звезда
                планета
        метеорит
                Луна
        3 Группа звезд, занимающая определенный участок неба:

        орбита
                комета
        астероиды
        ......        созвездие
        4 Путь движения планет вокруг Солнца называют:

        астероидами
                спутниками
        ......орбитами
                кометами
        5 Планеты Солнечной системы изучают:

        географы
          ......      астрономы
        историки
                химики
        6 Самая яркая планета Солнечной системы, названная в честь богини красоты:

        Земля
                Марс
        ........Венера
                Луна
        7 Небесное тело, обращающееся вокруг Солнца:

        .....планета
                спутник
        звезда
                метеорит
        8 Космический объект, обращающийся вокруг планеты:

        звезда
                комета
        .......спутник
                астероид
        9 На какой планете побывали автоматические межпланетные станции?

         ......       На Венере
        На Юпитере
        На Сатурне
        На Марсе
       10 Из-за чего происходит смена времен года?

                Из-за вращения Земли вокруг своей оси
        Из-за вращения Земли вокруг Солнца
        Из-за вращения Земли вокруг Луны
        Из-за вращения Луны вокруг Земли*/
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
        exercise04();
    }
}