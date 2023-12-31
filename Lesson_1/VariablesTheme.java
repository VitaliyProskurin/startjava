public class VariablesTheme {   
    public static void main(String[] args) {
        System.out.println("TASK 1. Вывод характеристик компьютера:\n");
        
        String idCpu = "Intel Core i5 10400";
        System.out.println("Процессор: " + idCpu);

        int socket = 1200;
        System.out.println("Сокет: LGA " + socket);

        byte coreCpu = 6;
        byte threadsCpu = 12;
        System.out.println("Число ядер процессора: " + coreCpu + " потоков: " + threadsCpu);

        float frequencyCpu = 2.9f;
        double frequencyTurboCpu = 4.3d;
        System.out.println("Частота процессора: " + frequencyCpu + " Ггц," + " в режиме Turbo: " 
            + frequencyTurboCpu + " Ггц");

        short amountRam = 16; 
        System.out.println("Оперативная память: " + amountRam + " Гб");

        short frequencyRam = 2666; 
        String typeRam = "DDR4";
        System.out.println("Тип оперативной памяти: " + typeRam + ", частота оперативной памяти: " 
            + frequencyRam + " МГц");

        short amountStorage = 512;
        System.out.println("Общий объем накопителей SSD: " + amountStorage + " ГБ");

        long costPc = 30000L;
        char unitMonetary = 'р'; 
        System.out.println("Стоимость: " + costPc + unitMonetary);

        boolean isLike = false; 
        System.out.println("Нравится компьютер: " + isLike + "\n");

        System.out.println("TASK 2. Расчет стоимости товара со скидкой \n");
        int pricePen = 100;
        int priceBook = 200; 
        float price = (float) (pricePen + priceBook);
        float discount = (float) (price * 0.11);
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
        
        System.out.println("первоначальное значение: " + number1 + "\n"
            + "значение после инкремента на единицу: " + (++number1) + "\n"
            + "значение после декремента на единицу: " + (--number1) + "\n");
        System.out.println("первоначальное значение: " + number2 + "\n"
            + "значение после инкремента на единицу: " + (++number2) + "\n"
            + "значение после декремента на единицу: " + (--number2) + "\n");
        System.out.println("первоначальное значение: " + number3 + "\n"
            + "значение после инкремента на единицу: " + (++number3) + "\n" 
            + "значение после декремента на единицу: " + (--number3) + "\n");
        System.out.println("первоначальное значение: " + number4 +"\n"
            + "значение после инкремента на единицу: " + (++number4) +"\n" 
            + "значение после декремента на единицу: " + (--number4) + "\n");

        System.out.println("TASK 5 Перестановка значений переменных \n");
        
        System.out.println("C помощью третьей переменной: \n");
        int a = 2;
        int b = 5;
        int c;
        System.out.println("Исходное значение переменной a = " + a 
            + ", Исходное значение переменной b = " + b);
        c = a;
        a = b;
        b = c;
        System.out.println("Значение переменной a после перестановки: " + a 
            + ", Значение переменной b после перестановки: " + b + "\n");
        
        System.out.println("С помощью арифметических операций: \n");
        System.out.println("Исходное значение переменной a = " + a 
            + ", Исходное значение переменной b = " + b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("Значение переменной a после арифметических операций: " + a 
            + ", Значение переменной b после арифметических операций: " + b + "\n");
        
        System.out.println("С помощью побитовой операции ^ \n");
        System.out.println("Исходное значение переменной a = " + a 
            + ", Исходное значение переменной b = " + b);
        a = a ^ b ^ (b = a);
        System.out.println("Значение переменной a после побитовой операции ^: " + a 
            + ", Значение переменной b побитовой операции ^: " + b + "\n");

        System.out.println("TASK 6 Вывод символов и их кодов \n");
        //проинициализируйте переменные типа char символами (а не их кодами), найдя их в 
        //ASCII-таблице по кодам:
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
        System.out.printf("%d\t%c\n\n", ((int)tilde), tilde);
        
        System.out.println("TASK 7 Вывод в консоль ASCII-арт Дюка" + "\n");
        char slash = '/';
        char backslash = '\\';
        char underscore = '_';
        char leftParenthesis = '(';
        char rightParenthesis = ')';
        
        System.out.printf("    %c%c    \n", slash, backslash);
        System.out.printf("   %c  %c   \n", slash, backslash);
        System.out.printf("  %c%c%c %c%c  \n", slash, underscore, leftParenthesis, 
            rightParenthesis, backslash);
        System.out.printf(" %c      %c \n", slash, backslash);
        System.out.printf("%c%c%c%c%c%c%c%c%c%c" + "\n\n", slash, underscore, underscore, 
            underscore, underscore, slash, backslash, underscore, underscore, backslash);

        System.out.println("TASK 8 Вывод количества сотен, десятков и единиц числа" + "\n");
        int n = 123;
        int hundreds = n / 100;
        int ten = n / 10;
        int unity = n % 10;
        
        System.out.println("Число 123 содержит:"); 
        System.out.println("сотен - " + hundreds);
        System.out.println("десятков - " + ten);
        System.out.println("единиц - " + unity);
        System.out.println("Сумма его цифр = " + (hundreds + ten + unity));
        System.out.println("Произведение = " + (hundreds * ten * unity) + "\n");

        System.out.println("TASK 9 Вывод времени\n");
        int time = 86399;        
        System.out.println((time / 3600) + ":" + (time /60 %60) + ":" + (time % 60));
    }   
}