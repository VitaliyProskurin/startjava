public class IfElseStatementTheme {   
    public static void main(String[] args) {
        System.out.println("TASK 1 Перевод псевдокода на язык Java (это название задачи)");
        /* 
        ЕСЛИ(!мужскойПол) {
        сообщение
        } ИНАЧЕ {
        сообщение
        }
        */
        boolean isMale = true;
        if (!isMale) {
            System.out.println("Вы женщина");
        } else {
            System.out.println("Поздравляем, Вы мужчина");
        }
        /*
        ЕСЛИ(возраст > 18) {
        сообщение
        } ИНАЧЕ {
        сообщение
        }
        */
        int age = 35;
        if (age > 18) {
            System.out.println("Поздравляем, Вы уже взрослый!");
        } else {
            System.out.println("Вы еще молодой");
        }
        /*
        ЕСЛИ(рост < 1.8) {
        сообщение
        } ИНАЧЕ {
        сообщение
        }
        */
        float height = 1.81f;
        if (height < 1.8) {
            System.out.println("Рост " + height + " ниже 1.8");
        } else {
            System.out.println("Рост " + height + " выше 1.8");
        }
        /*
        перваяБукваИмени = "Имя".charAt(0);
        ЕСЛИ(перваяБукваИмени == 'M') {
        сообщение
        } ИНАЧЕ ЕСЛИ(перваяБукваИмени == 'I') {
        сообщение
        } ИНАЧЕ {
        сообщение
        }
        */
        char firstLetterName = "Виталий".charAt(0);
        if (firstLetterName == 'М') {
            System.out.println("Первая буква имени " + firstLetterName + "\n");
        } else if (firstLetterName == 'I') {
            System.out.println("Первая буква имени " + firstLetterName + "\n");
        } else {
            System.out.println("Первая буква имени " + firstLetterName + "\n");
        }
        
        System.out.println("TASK 2 Поиск большего числа");
        /*двум переменным присвойте любые целые числа
        найдите, какое из значений больше другого
        выведите в консоль:
        числа, указав какое из них больше другого
        информацию об их равенстве, если они равны
        для себя проверьте, правильно ли работает программа, если значения переменных поменять 
        местами, а также при их равенстве
        */
        int number1 = 130;
        int number2 = 245;
        if (number1 == number2) {
            System.out.println("Число " + number1 + " равно числу " + number2 + "\n");
        } else if (number1 > number2) {
            System.out.println("Число " + number1 + " больше " + number2 + "\n");
        } else {
            System.out.println("Число " + number1 + " меньше " + number2 + "\n");
        }
        
        System.out.println("TASK 3 Проверка числа");
        /*присвойте переменной любое целое число
        определите, являться ли оно:
        нулем
        четным (нечетным)
        отрицательным (положительным)
        ограничения:
        если число равно 0, то данная программа должна отобразить соответствующее сообщение и сразу завершиться
        остальные проверки реализуйте во вложенных if-else
        не используйте return
        если число != 0, то не нужно выводить эту информацию
        проверки и части выводимого текста не должны дублироваться
        отобразите результат в следующем формате:
        -10 является отрицательным и четным
        */
        int a = 10;
        if (a == 0) {
            System.out.println("Число является " + a + "\n");
        } else if (a < 0) {
            if (a % 2 == 0) {
                System.out.println(a + " является отрицательным и четным" + "\n");
            } else {
                System.out.println(a + " является отрицательным и нечетным" + "\n");
            }
            
        } else if (a > 0) {
            if (a % 2 == 0) {
                System.out.println(a + " является положительным и четным" + "\n");
            } else {
                System.out.println(a + " является положительным и нечетным" + "\n");
            }
        }
        System.out.println("TASK 4 Поиск одинаковых цифр в числах");
        /*
        Поиск одинаковых цифр в числах
        двум переменным присвойте любые целые трехзначные числа
        если у чисел есть одинаковые цифры, стоящие в одном и том же разряде, отобразите в консоль:
        исходные числа
        одинаковые в них цифры
        номера разрядов
        если равных цифр нет, то отобразите один раз соответствующее сообщение
        если все цифры в разрядах разные, то поразрядная проверка выполняться уже не должна
        для себя проверьте, правильно ли работает программа для чисел 123 и 223
        */
        int numbers1 = 123;
        int numbers2 = 223;
        int hundredsNumber1 = (numbers1 / 100) % 10;
        int hundredsNumber2 = (numbers2 / 100) % 10;
        int tensNumber1 = (numbers1 / 10) % 10;
        int tensNumber2 = (numbers2 / 10) % 10;
        int onesNumber1 = numbers1 % 10;
        int onesNumber2 = numbers2 % 10;
        boolean isEqualHundreds = hundredsNumber1 == hundredsNumber2;
        boolean isEqualTens = tensNumber1 == tensNumber2;
        boolean isEqualOnes = onesNumber1 == onesNumber2;
        if (numbers1 == numbers2) {
            System.out.println("Исходные числа: " + numbers1 + ", " + numbers2 + "\n" 
                    + "одинаковые в них цифры " + numbers1 + "\n" 
                    + "номера разрядов одинаковые\n");
        } else if (isEqualHundreds) {
            if (isEqualTens) {
                    System.out.println("Исходные числа: " + numbers1 + ", " + numbers2 + "\n" 
                    + "одинаковые в них цифры " + hundredsNumber1 + tensNumber1 + "\n" 
                    + "номера разрядов 1,2 одинаковые\n");    
            } else if (isEqualOnes) {
                System.out.println("Исходные числа: " + numbers1 + ", " + numbers2 + "\n" 
                    + "одинаковые в них цифры " + hundredsNumber1 + onesNumber1 + "\n" 
                    + "номера разрядов 1,3 одинаковые\n");
            } else {
                System.out.println("Исходные числа: " + numbers1 + ", " + numbers2 + "\n" 
                    + "одинаковые в них цифры " + hundredsNumber1 + "\n" 
                    + "номер разряда 1 одинаковый\n");
            }            
        } else if (isEqualTens) {
            if (isEqualOnes) {
                System.out.println("Исходные числа: " + numbers1 + ", " + numbers2 + "\n" 
                    + "одинаковые в них цифры " + tensNumber1 + onesNumber1 + "\n" 
                    + "номера разрядов 2,3 одинаковые\n");    
            } else {
                System.out.println("Исходные числа: " + numbers1 + ", " + numbers2 + "\n" 
                    + "одинаковые в них цифры " + tensNumber1 + "\n" 
                    + "номер разряда 2 одинаковый\n");
            }            
        } else if (isEqualOnes) {
            System.out.println("Исходные числа: " + numbers1 + ", " + numbers2 + "\n" 
                    + "одинаковые в них цифры " + onesNumber1 + "\n" 
                    + "номер разряда 3 одинаковые\n");
        }
        System.out.println("TASK 5 Определение символа по его коду");
        /*
        присвойте переменной типа char код '\u0057'
        программа должна определить — это буква, цифра или другой символ. 
        Используйте таблицу символов
        в if используйте символы, а не их коды
        использовать методы классов Java запрещено
        выведите в консоль сам символ и информацию о нем:
        маленькая буква
        большая буква
        цифра
        не буква и не цифра
        формат вывода следующий:
        Символ Такой-то является большой буквой
        для себя проверьте, правильно ли работает программа для кода '\u005E' и '\u0031'
        */
        char uppercaseW = '\u0057';
        if (uppercaseW >= 'a' && uppercaseW <= 'z') {
            System.out.println("Символ " + uppercaseW + " является маленькой буквой\n");
        } else if (uppercaseW >= 'A' && uppercaseW <= 'Z') {
            System.out.println("Символ " + uppercaseW + " является большой буквой\n");
        } else if (uppercaseW >= '0' && uppercaseW <= '9') {
            System.out.println("Символ " + uppercaseW + " является цифрой\n");
        } else {
            System.out.println("Символ " + uppercaseW + " не буква и не цифра\n");
        }
        System.out.println("TASK 6 Подсчет суммы вклада и начисленных банком %");
        /*
        сумма вклада равна 301 000 руб.
        если она:
        меньше 100 000, то банк начисляет 5% годовых
        от 100 000 до 300 000, то — 7%
        больше 300 000, то — 10%
        отобразите в консоли:
        сумму вклада
        сумму начисленного % (не путайте с процентной ставкой)
        итоговую сумму с %
        */
        int depositAmount = 301000;
        double depositPercent;
        double depositSum; 
        if (depositAmount < 100000) {
            depositPercent = depositAmount * 0.05;
            depositSum = depositAmount + depositPercent;
        } else if (depositAmount >= 100000 && depositAmount <= 300000) {
            depositPercent = depositAmount * 0.07;
            depositSum = depositAmount + depositPercent;
        } else {
            depositPercent = depositAmount * 0.1;
            depositSum = depositAmount + depositPercent;
        } 
        System.out.println("Сумма вклада: " + depositAmount + " руб.\n" 
                + "Сумма начисленного %: " + depositPercent + " руб.\n" 
                + "Итоговая сумма: " + depositSum + " руб.\n");
        System.out.println("TASK 7 Определение оценки по предметам");
        /*
        студент получил итоговые % по предметам:
        история 59%
        программирование 92%
        определите оценки по каждому предмету:
        <= 60% — 2
        > 60% — 3
        > 73% — 4
        > 91% — 5
        выведите в консоль:
        предмет и напротив оценку
        средний балл оценок по предметам
        средний % по предметам
        */
        byte historyPercent = 59;
        byte programmingPercent = 92;
        byte historyGrade;
        byte programmingGrade;
        if (historyPercent <= 60) {
            historyGrade = 2;
        } else if (historyPercent > 60 && historyPercent <= 73) {
            historyGrade = 3;
        } else if (historyPercent > 73 && historyPercent <= 91) {
            historyGrade = 4;
        } else {
            historyGrade = 5;
        }
        if (programmingPercent <= 60) {
            programmingGrade = 2;
        } else if (programmingPercent > 60 && programmingPercent <= 73) {
            programmingGrade = 3;
        } else if (programmingPercent > 73 && programmingPercent <= 91) {
            programmingGrade = 4;
        } else {
            programmingGrade = 5;
        }
        System.out.println("История " + historyGrade);
        System.out.println("Программирование " + programmingGrade);
        System.out.println("Средний бал оценок по предметам " + (historyGrade + programmingGrade) / 2 );
        System.out.println("Средний % по предметам " + (historyPercent + programmingPercent) / 2 + "\n");

        System.out.println("TASK 8 Расчет годовой прибыли");
        /*
        Подсчитайте годовую прибыль:
        ежемесячно товар продается на 13 000 руб.
        аренда помещения — 5 000 руб./месяц
        себестоимость производства — 9 000 руб./месяц
        формат вывода на консоль следующий:
        Прибыль за год: -1 000 руб.
        или
        Прибыль за год: +3 000 руб.
        если прибыль положительная, то рядом с числом необходимо отображать +
        при этом +0 быть не должно
        */
        int productMonthSales = 10000;
        int roomMonthRent = 5000;
        int costProduction = 8000;
        int profitYear = (productMonthSales - (roomMonthRent + costProduction)) * 12;
        if (profitYear == 0) {
            System.out.println("Прибыль за год: " + profitYear);
        } else if (profitYear < 0) {
            System.out.println("Прибыль за год: " + profitYear + " руб.\n");
        } else {
            System.out.println("Прибыль за год: +" + profitYear + " руб.\n");
        }        
    }
}