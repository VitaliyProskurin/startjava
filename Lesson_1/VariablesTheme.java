public class VariablesTheme {   
    public static void main(String[] args) {
        System.out.println("TASK 1. Вывод характеристик компьютера:\n");
        //процессор
        String idCpu = "Intel Core i5 10400";
        System.out.println("Процессор: " + idCpu);

        //сокет
        int socket = 1200;
        System.out.println("Сокет: LGA " + socket);

        //ядра процессора, потоки
        byte coreCpu = 6;
        byte threadsCpu = 12;
        System.out.println("Число ядер процессора: " + coreCpu + " потоков: " + threadsCpu);

        //базовая частота процессора, частота в режиме турбо буст
        float frequencyCpu = 2.9f;
        double frequencyTurboCpu = 4.3d;
        System.out.println("Частота процессора: " + frequencyCpu + " Ггц," + " в режиме Turbo: " + frequencyTurboCpu + " Ггц");

        //Объем оперативной памяти
        short amountRam = 16; 
        System.out.println("Оперативная память: " + amountRam + " Гб");

        //Частота оперативной памяти, тип оперативной памяти, 
        short frequencyRam = 2666; 
        String typeRam = "DDR4";
        System.out.println("Тип оперативной памяти: " + typeRam + ", частота оперативной памяти: " + frequencyRam + " МГц");

        //Объем накопителя
        short amountStorage = 512;
        System.out.println("Общий объем накопителей SSD: " + amountStorage + " ГБ");

        //стоимость пк
        long costPc = 30000L;
        char unitMonetary = 'р'; //символ рубля 
        System.out.println("Стоимость: " + costPc + unitMonetary);

        //нравится ПК
        boolean isLike = false; 
        System.out.println("Нравится компьютер: " + isLike + "\n");

        System.out.println("TASK 2. Расчет стоимости товара со скидкой \n");
        // ручка стоит 100 руб., а книга — 200 руб.
        int pricePen = 100, priceBook = 200; 
        //общая сумма
        float price = (float) (pricePen + priceBook);
        //сумма скидки
        float discount = (float) (price * 0.11);
        //общую стоимость товаров со скидкой
        float priceDiscont = (float) (price - discount);
        
        System.out.println("Общая стоимость товаров без скидки: " + price + " руб.");
        System.out.println("Сумма скидки: " + discount + " руб.");
        System.out.println("Общая стоимость товаров со скидкой: " + priceDiscont + " руб. \n");

        System.out.println("TASK 3 Вывод слова JAVA \n");        
        System.out.println("   J    a  v     v  a       ");
        System.out.println("   J   a a  v   v  a a      ");
        System.out.println("J  J  aaaaa  V V  aaaaa     ");
        System.out.println(" JJ  a     a  V  a     a \n");

        System.out.println("TASK 4 Вывод min и max значений целых числовых типов \n");
        
        byte number1 = 127;
        short number2 = 32767;
        int number3 = 2147483647;
        long number4 = 9223372036854775807L;
        
        System.out.println("первоначальное значение: " + number1 + ", значение после инкремента на единицу: " + (++number1) + ", значение после декремента на единицу: " + (--number1));
        System.out.println("первоначальное значение: " + number2 + ", значение после инкремента на единицу: " + (++number2) + ", значение после декремента на единицу: " + (--number2));
        System.out.println("первоначальное значение: " + number3 + ", значение после инкремента на единицу: " + (++number3) + ", значение после декремента на единицу: " + (--number3));
        System.out.println("первоначальное значение: " + number4 + ", значение после инкремента на единицу: " + (++number4) + ", значение после декремента на единицу: " + (--number4) + "\n");

        System.out.println("TASK 5 Перестановка значений переменных \n");
        
        System.out.println("C помощью третьей переменной: \n");
        int a = 2, b = 5, c;        
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

        System.out.println("TASK 6 Вывод символов и их кодов \n");
        //проинициализируйте переменные типа char символами (а не их кодами), найдя их в ASCII-таблице по кодам:
        System.out.printf("Код\tСимвол\n");

        //код 36
        char dollar = '$';
        System.out.printf("%d\t%c\n", ((int)dollar), dollar);

        //код 42
        char asterisk = '*';
        System.out.printf("%d\t%c\n", ((int)asterisk), asterisk);

        //код 64
        char atSign = '@';
        System.out.printf("%d\t%c\n", ((int)atSign), atSign);

        //код 124
        char verticalBar = '|';
        System.out.printf("%d\t%c\n", ((int)verticalBar), verticalBar);
        
        //код 126
        char tilde = '~';
        System.out.printf("%d\t%c\n\n", ((int)tilde), tilde);
        
        System.out.println("TASK 7 Вывод в консоль ASCII-арт Дюка \n");
        char slash = '/';
        char backslash = '\\';
        char underscore = '_';
        char leftParenthesis = '(';
        char rightParenthesis = ')';
        
        System.out.printf("    %c%c    \n", slash, backslash);
        System.out.printf("   %c  %c   \n", slash, backslash);
        System.out.printf("  %c%c%c %c%c  \n", slash, underscore, leftParenthesis, rightParenthesis, backslash);
        System.out.printf(" %c      %c \n", slash, backslash);
        System.out.printf("%c%c%c%c%c%c%c%c%c%c" + "\n\n", slash, underscore, underscore, underscore, underscore, slash, backslash, underscore, underscore, backslash);

        System.out.println("TASK 8 Вывод количества сотен, десятков и единиц числа\n");
        int n = 123;
        int hundreds = n / 100;
        int ten = n / 10;
        int unity = n %10;
        
        System.out.println("Число 123 содержит:"); 
        System.out.println("сотен - " + hundreds);
        System.out.println("десятков - " + ten);
        System.out.println("единиц - " + unity);
        System.out.println("Сумма его цифр = " + (hundreds + ten + unity));
        System.out.println("Произведение = " + (hundreds * ten * unity) + "\n");

        System.out.println("TASK 9 Вывод времени\n");
        int time = 86399;        
        System.out.println((time/3600) + ":" + (time /60 %60) + ":" + (time%60));
    }   
}