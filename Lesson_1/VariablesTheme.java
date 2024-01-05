public class VariablesTheme {   
    public static void main(String[] args) {
        System.out.println("TASK 1. Вывод характеристик компьютера:");
        
        String idCpu = "Intel Core i5 10400";
        System.out.println("Процессор: " + idCpu);

        int socket = 1200;
        System.out.println("Сокет: LGA " + socket);

        byte coreCpu = 6;
        byte threadsCpu = 12;
        System.out.println("Число ядер процессора: " + coreCpu + " потоков: " + threadsCpu);

        float frequencyCpu = 2.9f;
        double frequencyTurboCpu = 4.3d;
        System.out.println("Частота процессора: " + frequencyCpu + " Ггц," 
                + " в режиме Turbo: " + frequencyTurboCpu + " Ггц");

        short amountRam = 16; 
        System.out.println("Оперативная память: " + amountRam + " Гб");

        short frequencyRam = 2666; 
        String typeRam = "DDR4";
        System.out.println("Тип оперативной памяти: " + typeRam 
                + ", частота оперативной памяти: " + frequencyRam + " МГц");

        short amountStorage = 512;
        System.out.println("Общий объем накопителей SSD: " + amountStorage + " ГБ");

        long costPc = 30000L;
        char unitMonetary = 'р'; 
        System.out.println("Стоимость: " + costPc + unitMonetary);

        boolean isLike = false; 
        System.out.println("Нравится компьютер: " + isLike);

        System.out.println("\nTASK 2. Расчет стоимости товара со скидкой");
        float costPen = 100;
        float costBook = 200; 
        float costGoods = costPen + costBook;
        float discountAmount = costGoods * 0.11f;
        float discountPrice = costGoods - discountAmount;
        
        System.out.println("Общая стоимость товаров без скидки: " + costGoods + " руб.");
        System.out.println("Сумма скидки: " + discountAmount + " руб.");
        System.out.println("Общая стоимость товаров со скидкой: " + discountPrice + " р");

        System.out.println("\nTASK 3 Вывод слова JAVA\n");
        System.out.println("   J    a  v     v  a");
        System.out.println("   J   a a  v   v  a a");
        System.out.println("J  J  aaaaa  V V  aaaaa");
        System.out.println(" JJ  a     a  V  a     a");

        System.out.println("\nTASK 4 Вывод min и max значений целых числовых типов");
        byte maxByte = 127;
        short maxShort = 32767;
        int maxInt = 2147483647;
        long maxLong = 9223372036854775807L;
        System.out.println("первоначальное значение: " + maxByte + "\n"
                + "значение после инкремента на единицу: " + (++maxByte) + "\n"
                + "значение после декремента на единицу: " + (--maxByte) + "\n");
        System.out.println("первоначальное значение: " + maxShort + "\n"
                + "значение после инкремента на единицу: " + (++maxShort) + "\n"
                + "значение после декремента на единицу: " + (--maxShort) + "\n");
        System.out.println("первоначальное значение: " + maxInt + "\n"
                + "значение после инкремента на единицу: " + (++maxInt) + "\n" 
                + "значение после декремента на единицу: " + (--maxInt) + "\n");
        System.out.println("первоначальное значение: " + maxLong +"\n"
                + "значение после инкремента на единицу: " + (++maxLong) +"\n" 
                + "значение после декремента на единицу: " + (--maxLong) + "\n");

        System.out.println("TASK 5 Перестановка значений переменных");
        System.out.println("C помощью третьей переменной:");
        int a = 2;
        int b = 5;
        int c = a;
        System.out.println("Исходное значение переменной a = " + a 
                + ", Исходное значение переменной b = " + b);
        a = b;
        b = c;
        System.out.println("Значение переменной a после перестановки: " + a 
                + ", Значение переменной b после перестановки: " + b);
        System.out.println("\nС помощью арифметических операций:");
        System.out.println("Исходное значение переменной a = " + a 
                + ", Исходное значение переменной b = " + b);
        a += b;
        b = a - b;
        a -= b;
        System.out.println("Значение переменной a после арифметических операций: " + a 
                + ", Значение переменной b после арифметических операций: " + b);
        
        System.out.println("\nС помощью побитовой операции ^:");
        System.out.println("Исходное значение переменной a = " + a 
                + ", Исходное значение переменной b = " + b);
        a = a ^ b ^ (b = a);
        System.out.println("Значение переменной a после побитовой операции ^: " + a 
                + ", Значение переменной b побитовой операции ^: " + b);

        System.out.println("\nTASK 6 Вывод символов и их кодов");
        System.out.printf("Код\tСимвол\n");
        char dollar = '$';
        System.out.printf("%d\t%c\n", ((int) dollar), dollar);
        char asterisk = '*';
        System.out.printf("%d\t%c\n", ((int) asterisk), asterisk);
        char atSign = '@';
        System.out.printf("%d\t%c\n", ((int) atSign), atSign);
        char verticalBar = '|';
        System.out.printf("%d\t%c\n", ((int) verticalBar), verticalBar);
        char tilde = '~';
        System.out.printf("%d\t%c\n", ((int) tilde), tilde);

        System.out.println("\nTASK 7 Вывод в консоль ASCII-арт Дюка\n");
        char slash = '/';
        char backslash = '\\';
        char underscore = '_';
        char leftParenthesis = '(';
        char rightParenthesis = ')';
        
        System.out.printf("    %c%c\n", slash, backslash);
        System.out.printf("   %c  %c\n", slash, backslash);
        System.out.printf("  %c%c%c %c%c\n", slash, underscore, leftParenthesis,
                rightParenthesis, backslash);
        System.out.printf(" %c      %c\n", slash, backslash);
        System.out.printf("%c%c%c%c%c%c%c%c%c%c\n", slash, underscore, underscore,
                underscore, underscore, slash, backslash, underscore, underscore, backslash);

        System.out.println("\nTASK 8 Вывод количества сотен, десятков и единиц числа");
        int number = 123;
        int hundreds = (number / 100) % 10;
        int tens = (number / 10) % 10;
        int ones = number % 10;        
        System.out.println("Число 123 содержит:"); 
        System.out.println("сотен - " + hundreds);
        System.out.println("десятков - " + tens);
        System.out.println("единиц - " + ones);
        System.out.println("Сумма его цифр = " + (hundreds + tens + ones));
        System.out.println("Произведение = " + (hundreds * tens * ones));

        System.out.println("\nTASK 9 Вывод времени");
        int time = 86399;        
        System.out.println((time / 3600) + ":" + (time / 60 % 60) + ":" + (time % 60));
    }   
}