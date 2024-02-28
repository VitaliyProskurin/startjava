package com.startjava.lesson_1.base;

public class CyclesTheme {
    public static void main(String[] args) {
        System.out.println("TASK 1 Подсчет суммы четных и нечетных чисел");
        int beginNumber = -10;
        int endNumber = 21;
        int counter = beginNumber;
        int sumEvenNumbers = 0;
        int sumOddNumbers = 0;
        do {
            if (counter % 2 == 0) {
                sumEvenNumbers += counter;
            } else {
                sumOddNumbers += counter;
            }
            counter++;
        } while (counter <= endNumber);
        System.out.println("В отрезке [" + beginNumber + ", "+ endNumber
                + "] сумма четных чисел = " + sumEvenNumbers
                + ", " + " а нечетных = " + sumOddNumbers);
        
        System.out.println("\nTASK 2 Вывод чисел в порядке убывания");
        int a = 10;
        int b = 5;
        int c = -1;
        int min = a;
        int max = a;
        if (b < min) {
            min = b;
        }
        if (c < min) {
            min = c;
        }
        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }
        for (int i = max - 1; i > min; i--) {
            System.out.print(i);
        }

        System.out.println("\n\nTASK 3 Вывод реверсивного числа и суммы его цифр");
        int number = 1234;
        int sumDigits = 0;
        System.out.print("Исходное число в обратном порядке: ");
        while (number > 0) {
            int digit = number % 10;
            System.out.print(digit);
            sumDigits += digit;
            number = number / 10;
        }
        System.out.println("\nСумма цифр числа: " + sumDigits);

        System.out.println("\nTASK 4 Вывод чисел в несколько строк");
        beginNumber = 1;
        endNumber = 30;
        counter = 0;
        for (int i = beginNumber; i < endNumber; i += 2) {
            System.out.printf("%4d", i);
            counter++;
            if (counter % 5 == 0) {
                System.out.println();
            }
        }
        while (counter % 5 != 0) {
            System.out.printf("%4d", 0);
            counter++;
        }

        System.out.println("\n\nTASK 5 Проверка количества двоек числа на четность/нечетность");
        number = 3222592;
        int copyNumber = number;
        int countTwos = 0;
        while (copyNumber > 0) {
            if (copyNumber % 10 == 2) {
                countTwos++;
            }
            copyNumber /= 10;
        }
        if (countTwos % 2 == 0) {
            System.out.println("В " + number + " четное количество двоек - " + countTwos);
        } else {
            System.out.println("В " + number + " нечетное количество двоек - " + countTwos);
        }

        System.out.println("\nTASK 6 Отображение геометрических фигур");
        for (int i = 0; i < 50; i++) {
            if (i % 10 == 0) {
                System.out.println();
            }
            System.out.print("*");
        }

        System.out.println("\n");
        int rowElement = 0;
        int rowCounter = 5;
        int copyRowElement = rowCounter;
        while (rowElement < 15) {            
            if (rowElement == copyRowElement) {
                System.out.println();
                rowCounter--;
                copyRowElement = rowElement;
                copyRowElement += rowCounter;
            } 
            System.out.print("#");
            rowElement++;
        }

        System.out.println("\n");
        rowCounter = 1;
        int maxRowElement = 9;
        boolean trendUp = true;
        do {
            rowElement = 0;
            do {
                System.out.print("$");
                rowElement++;
            } while (rowElement < rowCounter);
            System.out.println();
            if (trendUp) {
                rowCounter++;
                if (rowCounter == maxRowElement) {
                    trendUp = false;
                }
            } else {
                rowCounter--;
            }
        } while (rowCounter > 0);

        System.out.println("\n\nTASK 7 Отображение ASCII-символов");
        int minSymbol = 15;
        int maxSymbol = 48;
        System.out.printf("%s%13s%15s\n","DECIMAL","CHARACTER","DESCRIPTION");
        for (int i = minSymbol; i <= maxSymbol; i++) {
            if (i % 2 != 0) {
                System.out.printf("%4d%12c%12s%.25s\n", i, i, " ", Character.getName(i));
            }
        }
        int symbolLowercaseA = 97;
        int symbolLowercaseZ = 122;
        for (int i = symbolLowercaseA; i <= symbolLowercaseZ; i++) {
            if (i % 2 == 0) {
                System.out.printf("%4d%12c%12s%.25s\n", i, i, " ", Character.getName(i));
            }
        }

        System.out.println("\nTASK 8 Проверка, является ли число палиндромом");
        number = 1234321;
        int reverseNumber = 0;
        copyNumber = number;
        while (copyNumber > 0) {
            reverseNumber = copyNumber % 10 + reverseNumber * 10;
            copyNumber /= 10;
        }
        if (reverseNumber == number) {
            System.out.printf("Число %d является палиндромом", number);
        } else {
            System.out.printf("Число %d не является палиндромом", number);
        }

        System.out.println("\n\nTASK 9 Проверка, является ли число счастливым");
        number = 123123;
        copyNumber = number;
        counter = 0;
        int sumLeftHalf = 0;
        int sumRightHalf = 0;
        System.out.print("Число " + number);
        for (int i = 0; i < 6; i++) {
            int digit = number % 10;
            if (i < 3) {
                sumRightHalf += digit;
            } else {
                sumLeftHalf += digit;
            }
            number /= 10;
        }
        if (sumLeftHalf == sumRightHalf) {
            System.out.print(" является счастливым");
        } else {
            System.out.print(" не является счастливым");
        }
        System.out.println("\nСумма цифр ABC = " + sumLeftHalf 
                    + ", а сумма цифр DEF = " + sumRightHalf);
                    
        System.out.println("\n\nTASK 10 Отображение таблицы умножения Пифагора");
        for (int i = 1; i <= 9; i++) {
            if (i == 1) {
                System.out.printf("%4s|", " ");
            } else {
                System.out.printf("%4d", i);
            }
        }
        System.out.println("\n--------------------------------------");
        for (int i = 2; i <= 9; i++) {
            System.out.printf("%3d |", i);
            for (int j = 2; j <= 9; j++) {
                System.out.printf("%4d", i * j);
            }
            System.out.println();
        }
    }
}