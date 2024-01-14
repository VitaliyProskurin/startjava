public class CyclesTheme {
    public static void main(String[] args) {
        System.out.println("TASK 1 Подсчет суммы четных и нечетных чисел");
        int beginNumber = -10;
        int endNumber = 21;
        int count = beginNumber;
        int sumEvenNumbers = 0;
        int sumOddNumbers = 0;
        do {
            if (count % 2 == 0) {
                sumEvenNumbers += count;
            } else {
                sumOddNumbers += count;
            }
            count++;
        } while (count <= endNumber);
        System.out.println("В отрезке [" + beginNumber + ", "+ endNumber 
            + "] сумма четных чисел = " + sumEvenNumbers + ", " + " а нечетных = " + sumOddNumbers);
        
        System.out.println("\nTASK 2 Вывод чисел в порядке убывания");
        int digit1 = 10;
        int digit2 = 5;
        int digit3 = -1;
        int min = digit1;
        int max = digit1;
        if (digit2 < min) {
            min = digit2;
        }
        if (digit3 < min) {
            min = digit3;
        }
        if (digit2 > max) {
            max = digit2;
        }
        if (digit3 > max) {
            max = digit3;
        }
        for (int i = max - 1; i > min; i--) {
            System.out.print(i + " ");
        }

        System.out.println("\n\nTASK 3 Вывод реверсивного числа и суммы его цифр");
        int number = 1234;
        int sumNumbers = 0;        
        System.out.print("Исходное число в обратном порядке: ");
        while (number != 0) {
            int reverseNumber = number % 10;
            System.out.print(reverseNumber);
            sumNumbers += reverseNumber;
            number = number / 10;
        }
        System.out.println("\nСумма цифр числа: " + sumNumbers);

        System.out.println("\nTASK 4 Вывод чисел в несколько строк");
        min = 1;
        max = 24;
        count = 0;
        for (int i = min; i < max; i++ ) {
            if (i % 2  !=0 && count % 5 == 0) {
                System.out.println();
            } 
            if (i % 2 != 0) {
                System.out.printf("%4d", i);
                count++;
            }
            if (i == max - 1 && count % 5 != 0) {
                count %= 5;
                while (count < 5) {
                    System.out.printf("%4d", 0);
                    count++;
                }
            }            
        }

        System.out.println("\n\nTASK 5 Проверка количества двоек числа на четность/нечетность");
        number = 3242592;
        int copyNumber = number;
        int countTwos = 0;
        while (copyNumber != 0) {
            int digit = copyNumber % 10;
            if (digit  == 2) {
                countTwos++;
            }
            copyNumber = copyNumber / 10;
        }
        if (countTwos % 2 == 0) {
            System.out.println("В " + number + " четное количество двоек - " + countTwos);
        } else {
            System.out.println("В " + number + " нечетное количество двоек - " + countTwos);
        }

        System.out.println("\nTASK 6 Отображение геометрических фигур");
        for (int i = 0; i < 50 ; i++) {
            if (i % 10 == 0) {
                System.out.println("");
            }
            System.out.print("*");
        }

        System.out.println("\n");
        int a = 0;
        count = 5;
        copyNumber = count;
        while (a < 15) {
            if (a == copyNumber) {
                System.out.println();
                count--;
                copyNumber = a;
                copyNumber += count;
            } 
            System.out.print("#");
            a++;
        }

        System.out.println("\n");
        a = 0;
        count = 1;
        copyNumber = count;
        do {
            if (a == copyNumber) {
                System.out.println();
                count++;
                copyNumber = a;
                copyNumber += count;
            }
            System.out.print("$");
            a++;
        } while (a <= 9);
        System.out.println();
        int b = a - count;
        a = 0;
        count = count - 1;
        copyNumber = count;
        do {
            if (a == copyNumber) {
                System.out.println();
                count--;
                copyNumber = a;
                copyNumber += count;
            } 
            System.out.print("$");
            a++;
        } while (a < b);

        System.out.println("\n\nTASK 7 Отображение ASCII-символов");
        int minSymbol = 15;
        int maxSymbol = 48;
        System.out.printf("%s%13s%15s\n","DECIMAL","CHARACTER","DESCRIPTION");
        for (int i = minSymbol; i <= maxSymbol; i++) {
            if (i % 2 != 0) {
                System.out.printf("%4d", i);
                System.out.printf("%12c",(char) i);
                System.out.printf("%12s", " ");
                System.out.printf("%.25s\n", Character.getName(i));
            }
        }
        int symbolLowercaseA = 97;
        int symbolLowercaseZ = 122;
        for (int i = symbolLowercaseA; i <= symbolLowercaseZ; i++) {
            if (i % 2 == 0) {
                System.out.printf("%4d", i);
                System.out.printf("%12c",(char) i);
                System.out.printf("%12s", " ");
                System.out.printf("%.25s\n", Character.getName(i));
            }
        }

        System.out.println("\nTASK 8 Проверка, является ли число палиндромом");
        number = 1234321;
        int reverseNumber = 0;
        copyNumber = number;
        while (copyNumber != 0) {
            reverseNumber = copyNumber % 10 + reverseNumber * 10;
            copyNumber = copyNumber / 10;
        }
        if (reverseNumber == number) {
            System.out.printf("Число %d является палиндромом", number);
        } else {
            System.out.printf("Число %d не является палиндромом", number);
        }

        System.out.println("\n\nTASK 9 Проверка, является ли число счастливым");
        number = 123456;
        reverseNumber = 0;
        copyNumber = number;
        count = 0;
        while (copyNumber !=0) {
            reverseNumber = copyNumber % 10 + reverseNumber * 10;
            copyNumber = copyNumber / 10;
            count++;
        }
        int halfCount = count / 2;
        int sumNumbers1 = 0;
        int sumNumbers2 = 0;
        while (count != 0) {
            if (count > halfCount) {
                copyNumber = reverseNumber % 10;
                reverseNumber = reverseNumber / 10;
                count--;
                sumNumbers1 += copyNumber;
            } else {
                copyNumber = reverseNumber % 10;
                reverseNumber = reverseNumber / 10;
                count--;
                sumNumbers2 += copyNumber;
            }
        }
        if (sumNumbers1 == sumNumbers2) {
            System.out.println("Число " + number + " является счастливым");
            System.out.println("Сумма цифр ABC = " + sumNumbers1 
                + ", а сумма цифр DEF = " + sumNumbers2);
        } else {
            System.out.println("Число " + number + " не является счастливым");
            System.out.println("Сумма цифр ABC = " + sumNumbers1 
                + ", а сумма цифр DEF = " + sumNumbers2);
        }

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