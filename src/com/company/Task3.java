package com.company;


import java.util.Scanner;

public class Task3 {

    // Обязательные задачи:

    // Задача 1. Максимальное из введенных чисел
    static void exercise01() {
        System.out.println("Добрый день!");
        System.out.println("Наш помощник вычислит максимальное из пяти введенных чисел:");

        Scanner sc = new Scanner(System.in);

        System.out.println("Введите пожалуйста, пять целых чисел:");
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();
        int number3 = sc.nextInt();
        int number4 = sc.nextInt();
        int number5 = sc.nextInt();

        int max = Math.max(number1, number2);
        max = Math.max(max, number3);
        max = Math.max(max, number4);
        max = Math.max(max, number5);

        System.out.println("Максимальное число из введенных Вами = " + max);
    }
    // Задача 2. Тест
    static void exercise02() {
        System.out.println("Добрый день!");
        System.out.println("Пройдите тест на общие знания о нашей солнечной системе:");

        Scanner sc = new Scanner(System.in);

        int score = 0;
        int numberOfQuestions = 10;
        int maxScore = 12;

        System.out.println("1. Какая планета солнечной системы самая большая? " +
        "\n 1 Венера " +
        "\n 2 Сатурн " +
        "\n 3 Юпитер* " +
        "\n 4 Меркурий");
        if (sc.nextInt() == 3) {
            score += 1;
            System.out.println("Верный ответ");
        } else {
            System.out.println("Неверный ответ");
        }

        System.out.println("2. Самосветящееся небесное тело? " +
        "\n 1 звезда* " +
        "\n 2 планета " +
        "n 3 метеорит " +
        "\n 4 Луна");
        if (sc.nextInt() == 1) {
            score += 1;
            System.out.println("Верный ответ");
        } else {
            System.out.println("Неверный ответ");
        }

        System.out.println("3. Группа звезд, занимающая определенный участок неба?" +
        "\n 1 орбита" +
        "\n 2 комета" +
        "\n 3 астероиды" +
        "\n 4 созвездие*");
        if (sc.nextInt() == 4) {
            score += 1;
            System.out.println("Верный ответ");
        } else {
            System.out.println("Неверный ответ");
        }

        System.out.println("4. Путь движения планет вокруг Солнца называют?" +
        "\n 1 астероидами" +
        "\n 2 спутниками" +
        "\n 3 орбитами*" +
        "\n 4 кометами");
        if (sc.nextInt() == 3) {
            score += 1;
            System.out.println("Верный ответ");
        } else {
            System.out.println("Неверный ответ");
        }

        System.out.println("5. Планеты Солнечной системы изучают?" +
        "\n 1 географы" +
        "\n 2 астрономы*" +
        "\n 3 историки" +
        "\n 4 химики");
        if (sc.nextInt() == 2) {
            score += 1;
            System.out.println("Верный ответ");
        } else {
            System.out.println("Неверный ответ");
        }

        System.out.println("6. Самая яркая планета Солнечной системы, названная в честь богини красоты?" +
        "\n 1 Земля" +
        "\n 2 Марс" +
        "\n 3 Венера*" +
        "\n 4 Луна");
        if (sc.nextInt() == 3) {
            score += 1;
            System.out.println("Верный ответ");
        } else {
            System.out.println("Неверный ответ");
        }

        System.out.println("7. Небесное тело, обращающееся вокруг Солнца?" +
        "\n 1 планета*" +
        "\n 2 спутник" +
        "\n 3 звезда" +
        "\n 4 метеорит");
        if (sc.nextInt() == 1) {
            score += 1;
            System.out.println("Верный ответ");
        } else {
            System.out.println("Неверный ответ");
        }

        System.out.println("8. Космический объект, обращающийся вокруг планеты?" +
        "\n 1 звезда" +
        "\n 2 комета" +
        "\n 3 спутник*" +
        "\n 4 астероид");
        if (sc.nextInt() == 3) {
            score += 1;
            System.out.println("Верный ответ");
        } else {
            System.out.println("Неверный ответ");
        }

        System.out.println("9. На какой планете побывали автоматические межпланетные станции?" +
        "\n 1 на Венере*" +
        "\n 2 на Юпитере" +
        "\n 3 на Сатурне" +
        "\n 4 на Марсе");
        if (sc.nextInt() == 1) {
            score += 1;
            System.out.println("Верный ответ");
        } else {
            System.out.println("Неверный ответ");
        }

        System.out.println("10. Из-за чего происходит смена времен года?" +
        "\n 1 из-за вращения Земли вокруг своей оси" +
        "\n 2 из-за вращения Земли вокруг Солнца*" +
        "\n 3 из-за вращения Земли вокруг Луны" +
        "\n 4 из-за вращения Луны вокруг Земли");
        if (sc.nextInt() == 2) {
            score += 1;
            System.out.println("Верный ответ");
        } else {
            System.out.println("Неверный ответ");
        }
        int result = score * maxScore / numberOfQuestions;
        System.out.println("Ваша оценка = " + result);
    }
    // Задача 3. Проверка даты
    static void exercise03() {
        System.out.println("Добрый день!");
        System.out.println("Наш помощник определит корректность введеной Вами даты:");

        Scanner sc = new Scanner(System.in);

        System.out.println("Введите дату пожалуйста, в формате день месяц год");
        int day = sc.nextInt();
        int month = sc.nextInt();
        int year = sc.nextInt();

        if (year < 1 || month < 1 || month > 12 || day < 1) {
            System.out.println("Введенная Вами дата некорректна!");
            return;
        }

        boolean leapYear = (year % 4 == 0 || year % 400 == 0) && (year % 100 != 0);

        int lastDayOfMonth = 0;

        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
            lastDayOfMonth = 31;
        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
            lastDayOfMonth = 30;
        } else if (month == 2) {
            if (leapYear) {
                lastDayOfMonth = 29;
            } else {
                lastDayOfMonth = 28;
            }
        }

        if (day <= lastDayOfMonth) {
            System.out.println("Введенная Вами дата корректна!");
        } else {
            System.out.println("Введенная Вами дата некорректна!");
        }
    }
    // Задача 4. Линейное уравнение
    static void exercise04() {
        System.out.println("Добрый день!");
        System.out.println("Наш калькулятор поможет с решением линейных уравнений ax + b = 0:");

        Scanner sc = new Scanner(System.in);

        System.out.println("Введите значение переменной а");
        double a = sc.nextDouble();

        System.out.println("Введите значиние переменной b");
        double b = sc.nextDouble();

        double result = 0;

        if ( a == 0 && b == 0) {
            System.out.println("х = 0");
        } else {
            result = - b / a;
            System.out.println("х = " + result);
        }
    }
    // Задача 5. Квадратное уранение
    static void exercise05() {
        System.out.println("Добрый день!");
        System.out.println("Наш калькулятор поможет с решением квадратных уравнений ax^2+bx+c=0:");

        Scanner sc = new Scanner(System.in);

        System.out.println("Введите значение переменной а");
        double a = sc.nextDouble();

        System.out.println("Введите значение переменной b");
        double b = sc.nextDouble();

        System.out.println("Введите значение переменной c");
        double c = sc.nextDouble();

        double D = b * b - 4 * a * c;
        if (D < 0) {
            System.out.println("Уравнение не имеет решения");
        } else if (D == 0) {
            double x = - b / (2 * a);
            System.out.println("Уравнение имеет один корень: х = " + x);
        } else {
            double x1 = (- b + Math.sqrt(D)) / (2 * a);
            double x2 = (-b - Math.sqrt(D)) / (2 * a);
            System.out.println("Уравнение имеет два различных корня:" +
                    "\n x1 = " + x1 +
                    "\n x2 = "+ x2);
        }

    }

    // Дополнительные задачи:

    // Задача 1. Самолет и топливо
    static void exercise001() {

    }
    // Задача 2. Алгоритм приготовления тостов
    static void exercise002() {
        System.out.println("Добрый день!");
        System.out.println("Наш помощник составит для Вас алгоритм приготовления тостов:");

        Scanner sc = new Scanner(System.in);

        System.out.println("Есть ли у Вас тостер?" +
                "\n 1 Да" +
                "\n 2 Нет");
        if (sc.nextInt() == 1) {
            System.out.println("Есть ли у Вас хлеб?" +
                    "\n 1 Да" +
                    "\n 2 Нет");
            if (sc.nextInt() == 1) {
                System.out.println("Ваш алгоритм:" +
                        "\n 1 - Нарезать хлеб" +
                        "\n 2 - Положить хлеб в тостер" +
                        "\n 3 - Включить тостер" +
                        "\n 4 - Подождать 5 минут" +
                        "\n 5 - Тосты готовы =)");
            } else {
                System.out.println("Есть ли у Вас деньги на хлеб?" +
                        "\n 1 Да" +
                        "\n 2 Нет");
                if (sc.nextInt() == 1) {

                }
            }
        }

    }
    // Задача 3. Жалюзи
    static void exercise003() {

    }
    // Задача 4. Программист Вася
    static void exercise004() {

    }

    public static void main(String[] args) {
        exercise03();
    }
}