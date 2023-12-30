public class VariablesTheme {   
    public static void main(String[] args) {
        //TASK 1 Вывод характеристик компьютера
        String idCpu = "Intel Core i5 10400"; //процессор
        int socket = 1200; //сокет
        byte coreCpu = 6; //ядра процессора
        byte threadsCpu = 12; //потоки процессора
        float frequencyCpu = 2.9f; //базовая частота процессора
        double frequencyTurboCpu = 4.3d; //частота в режиме турбо буст 
        short amountRam = 16; //Объем оперативной памяти
        short frequencyRam = 2666; //Частота оперативной памяти
        String typeRam = "DDR4"; //тип оперативной памяти
        short amountStorage = 512; //Объем накопителя
        long costPc = 30000L; //стоимость пк
        char unitMonetary = 'р'; //символ рубля
        boolean isLike = false; //нравится ПК
        System.out.println("TASK 1. Вывод характеристик компьютера:\n");
        System.out.println("Процессор: " + idCpu);
        System.out.println("Сокет: LGA " + socket);
        System.out.println("Число ядер процессора: " + coreCpu + " потоков: " + threadsCpu);
        System.out.println("Частота процессора: " + frequencyCpu + " Ггц," + " в режиме Turbo: " + frequencyTurboCpu + " Ггц");
        System.out.println("Оперативная память: " + amountRam + " Гб");
        System.out.println("Тип оперативной памяти: " + typeRam + ", частота оперативной памяти: " + frequencyRam + " МГц");
        System.out.println("Общий объем накопителей SSD: " + amountStorage + " ГБ");
        System.out.println("Стоимость: " + costPc + unitMonetary);
        System.out.println("Нравится компьютер: " + isLike + "\n");

        //TASK 2 Расчет стоимости товара со скидкой
        int pricePen = 100, priceBook = 200; // ручка стоит 100 руб., а книга — 200 руб.
        float price = (float) (pricePen + priceBook); //общая сумма
        float discount = (float) (price * 0.11); //сумма скидки
        float priceDiscont = (float) (price - discount); //общую стоимость товаров со скидкой
        System.out.println("TASK 2. Расчет стоимости товара со скидкой \n");
        System.out.println("Общая стоимость товаров без скидки: " + price + " руб.");
        System.out.println("Сумма скидки: " + discount + " руб.");
        System.out.println("Общая стоимость товаров со скидкой: " + priceDiscont + " руб. \n");

        //TASK 3 Вывод слова JAVA
        System.out.println("TASK 3 Вывод слова JAVA \n");
        System.out.println("   J    a  v     v  a       ");
        System.out.println("   J   a a  v   v  a a      ");
        System.out.println("J  J  aaaaa  V V  aaaaa     ");
        System.out.println(" JJ  a     a  V  a     a \n");

        //TASK 4 Вывод min и max значений целых числовых типов
        byte number1 = 127;
        short number2 = 32767;
        int number3 = 2147483647;
        long number4 = 9223372036854775807L;
        System.out.println("TASK 4 Вывод min и max значений целых числовых типов \n");
        System.out.println("первоначальное значение: " + number1 + ", значение после инкремента на единицу: " + (++number1) + ", значение после декремента на единицу: " + (--number1));
        System.out.println("первоначальное значение: " + number2 + ", значение после инкремента на единицу: " + (++number2) + ", значение после декремента на единицу: " + (--number2));
        System.out.println("первоначальное значение: " + number3 + ", значение после инкремента на единицу: " + (++number3) + ", значение после декремента на единицу: " + (--number3));
        System.out.println("первоначальное значение: " + number4 + ", значение после инкремента на единицу: " + (++number4) + ", значение после декремента на единицу: " + (--number4) + "\n");

        //TASK 5 Перестановка значений переменных
        int a = 2, b = 5, c;        
        System.out.println("TASK 5 Перестановка значений переменных \n");
        System.out.println("C помощью третьей переменной: \n");
        System.out.println("Исходное значение переменной a = " + a + ", Исходное значение переменной b = " + b);
        c = a;
        a = b;
        b = c;
        System.out.println("Значение переменной a после перестановки: " + a + ", Значение переменной b после перестановки: " + b + "\n");
        System.out.println("С помощью арифметических операций: \n");
        System.out.println("Исходное значение переменной a = " + a + ", Исходное значение переменной b = " + b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("Значение переменной a после арифметических операций: " + a + ", Значение переменной b после арифметических операций: " + b + "\n");
        System.out.println("С помощью побитовой операции ^ \n");
        System.out.println("Исходное значение переменной a = " + a + ", Исходное значение переменной b = " + b);
        a = a^b^(b = a);
        System.out.println("Значение переменной a после побитовой операции ^: " + a + ", Значение переменной b побитовой операции ^: " + b + "\n");

        //TASK 6 Вывод символов и их кодов
        //проинициализируйте переменные типа char символами (а не их кодами), найдя их в ASCII-таблице по кодам:
        char dollar = '$';//код 36
        char asterisk = '*';//код 42
        char atSign = '@';//код 64
        char verticalBar = '|';//код 124
        char tilde = '~';//код 126
        System.out.println("TASK 6 Вывод символов и их кодов \n");
        System.out.printf("Код\tСимвол\n");
        System.out.printf("%d\t%c\n", ((int)dollar), dollar);
        System.out.printf("%d\t%c\n", ((int)asterisk), asterisk);
        System.out.printf("%d\t%c\n", ((int)atSign), atSign);
        System.out.printf("%d\t%c\n", ((int)verticalBar), verticalBar);
        System.out.printf("%d\t%c\n\n", ((int)tilde), tilde);

        //TASK 7 Вывод в консоль ASCII-арт Дюка
        char slash = '/';
        char backslash = '\\';
        char underscore = '_';
        char leftParenthesis = '(';
        char rightParenthesis = ')';
        System.out.println("TASK 7 Вывод в консоль ASCII-арт Дюка \n");
        System.out.printf("    %c%c    \n", slash, backslash);
        System.out.printf("   %c  %c   \n", slash, backslash);
        System.out.printf("  %c%c%c %c%c  \n", slash, underscore, leftParenthesis, rightParenthesis, backslash);
        System.out.printf(" %c      %c \n", slash, backslash);
        System.out.printf("%c%c%c%c%c%c%c%c%c%c\n", slash, underscore, underscore, underscore, underscore, slash, backslash, underscore, underscore, backslash);

        //TASK 8 Вывод количества сотен, десятков и единиц числа
        int n = 123;
        int hundreds = n / 100;
        int ten = n / 10;
        int unity = n %10;
        System.out.println("TASK 8 Вывод количества сотен, десятков и единиц числа\n");
        System.out.println("Число 123 содержит:"); 
        System.out.println("сотен - " + hundreds);
        System.out.println("десятков - " + ten);
        System.out.println("единиц - " + unity);
        System.out.println("Сумма его цифр = " + (hundreds + ten + unity));
        System.out.println("Произведение = " + (hundreds * ten * unity) + "\n");

        //TASK 9 Вывод времени
        int time = 86399;
        System.out.println("TASK 9 Вывод времени\n");
        System.out.println((time/3600) + ":" + (time /60 %60) + ":" + (time%60));

    }   
}