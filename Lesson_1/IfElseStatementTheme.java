public class IfElseStatementTheme {   
    public static void main(String[] args) {
        System.out.println("TASK 1 Перевод псевдокода на язык Java (это название задачи)");
        boolean isMale = true;
        if (!isMale) {
            System.out.println("Вы женщина");
        } else {
            System.out.println("Поздравляем, Вы мужчина");
        }
        
        int age = 35;
        if (age > 18) {
            System.out.println("Поздравляем, Вы уже взрослый!");
        } else {
            System.out.println("Вы еще молодой");
        }
        
        float height = 1.81f;
        if (height < 1.8) {
            System.out.println("Рост " + height + " ниже 1.8");
        } else {
            System.out.println("Рост " + height + " выше 1.8");
        }

        char firstLetterName = "Виталий".charAt(0);
        if (firstLetterName == 'М') {
            System.out.println("Первая буква имени " + firstLetterName);
        } else if (firstLetterName == 'I') {
            System.out.println("Первая буква имени " + firstLetterName);
        } else {
            System.out.println("Первая буква имени " + firstLetterName);
        }
        
        System.out.println("\nTASK 2 Поиск большего числа");
        int a = 130;
        int b = 245;
        if (a == b) {
            System.out.println("Число " + a + " равно числу " + b);
        } else if (a > b) {
            System.out.println("Число " + a + " больше " + b);
        } else {
            System.out.println("Число " + a + " меньше " + b);
        }

        System.out.println("\nTASK 3 Проверка числа");
        int digit = 11;
        String parityOddNumber = "нечетным";
        String positiveNegativeNumber = " отрицательным, ";
        if (digit == 0) {
            positiveNegativeNumber = " нулем";
            parityOddNumber = "";
        } else if (digit > 0 && digit % 2 == 0) {
            parityOddNumber = "чётным";
            positiveNegativeNumber = " положительным, ";
        } else if (digit > 0) {
            positiveNegativeNumber = " положительным, ";
        } else if (digit % 2 == 0) {
            parityOddNumber = "чётным";
        }
        System.out.println(digit + " является" + positiveNegativeNumber + parityOddNumber);

        System.out.println("\nTASK 4 Поиск одинаковых цифр в числах");
        int number1 = 123;
        int number2 = 456;
        int hundredsNumber1 = number1 / 100;
        int hundredsNumber2 = number2 / 100;
        int tensNumber1 = (number1 / 10) % 10;
        int tensNumber2 = (number2 / 10) % 10;
        int onesNumber1 = number1 % 10;
        int onesNumber2 = number2 % 10;
        boolean isEqualHundredsNumbers = hundredsNumber1 == hundredsNumber2;
        boolean isEqualTensNumbers = tensNumber1 == tensNumber2;
        boolean isEqualOnesNumbers = onesNumber1 == onesNumber2;
        if (isEqualHundredsNumbers || isEqualTensNumbers || isEqualOnesNumbers) {
            if (isEqualHundredsNumbers){
                System.out.println("Исходные числа " + number1 + ", " + number2 
                + "\nодинаковые в них цифры " + hundredsNumber1 + "\nномер разряда: 1");
            }
            if (isEqualTensNumbers) {
                System.out.println("Исходные числа " + number1 + ", " + number2 
                + "\nодинаковые в них цифры " + tensNumber1 + "\nномер разряда: 2");
            }
            if (isEqualOnesNumbers) {
                System.out.println("Исходные числа " + number1 + ", " + number2 
                + "\nодинаковые в них цифры " + onesNumber1 + "\nномер разряда: 3");
            }
        } else {
            System.out.println("равных чисел нет");
        }
        

        System.out.println("\nTASK 5 Определение символа по его коду");
        char symbol = '\u0057';
        if (symbol >= 'a' && symbol <= 'z') {
            System.out.println("Символ " + symbol + " является маленькой буквой");
        } else if (symbol >= 'A' && symbol <= 'Z') {
            System.out.println("Символ " + symbol + " является большой буквой");
        } else if (symbol >= '0' && symbol <= '9') {
            System.out.println("Символ " + symbol + " является цифрой");
        } else {
            System.out.println("Символ " + symbol + " не буква и не цифра");
        }

        System.out.println("\nTASK 6 Подсчет суммы вклада и начисленных банком %");
        int depositAmount = 301000;
        double depositPercent = 0.05;
        double depositSum = 0; 
        double percentSum = 0;
        if (depositAmount >= 100000 && depositAmount <= 300000) {
            depositPercent = 0.07;
        } else {
            depositPercent = 0.1;
        }
        percentSum = depositAmount * depositPercent; 
        depositSum += percentSum;        
        System.out.println("Сумма вклада: " + depositAmount + " руб.\n" 
                + "Сумма начисленного %: " + percentSum + " руб.\n" 
                + "Итоговая сумма: " + depositSum + " руб.");
        
        System.out.println("\nTASK 7 Определение оценки по предметам");
        int historyPercent = 59;
        int historyGrade = 2;
        if (historyPercent > 60 && historyPercent <= 73) {
            historyGrade = 3;
        } else if (historyPercent > 73 && historyPercent <= 91) {
            historyGrade = 4;
        } else {
            historyGrade = 5;
        }
        int programmingPercent = 92;
        int programmingGrade = 2;
        if (programmingPercent > 60 && programmingPercent <= 73) {
            programmingGrade = 3;
        } else if (programmingPercent > 73 && programmingPercent <= 91) {
            programmingGrade = 4;
        } else {
            programmingGrade = 5;
        }
        System.out.println("История " + historyGrade);
        System.out.println("Программирование " + programmingGrade);
        System.out.println("Средний бал оценок по предметам " + (historyGrade + programmingGrade) / 2 );
        System.out.println("Средний % по предметам " + (historyPercent + programmingPercent) / 2);

        System.out.println("\nTASK 8 Расчет годовой прибыли");
        int productMonthSales = 30000;
        int roomMonthRent = 2000;
        int costProduction = 8000;
        int profitYear = (productMonthSales - (roomMonthRent + costProduction)) * 12;
        if (profitYear < 0) {
            System.out.println("Прибыль за год: " + profitYear + " руб.");
        } else if (profitYear > 0) {
            System.out.println("Прибыль за год: +" + profitYear + " руб.");
        } else {
            System.out.println("Прибыль за год 0 руб.");
        }
    }
}