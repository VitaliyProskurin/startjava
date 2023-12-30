public class VariableNamesTheme {   
    public static void main(String[] args) {
        System.out.println("Именование переменных\n");
        System.out.println("Task 1. Разные переменные:");
        //цифра
        byte digit = 2;
        System.out.println("Цифра: " + digit);

        //цифра
        byte digit1 = 7;
        System.out.println("Цифра 1: " + digit1);

        //сумма чисел
        int summ = digit + digit1;
        System.out.println("Сумма чисел: " + summ);

        //произведение цифр
        int multiplicationDigit = digit * digit1;
        System.out.println("Произведение цифр: " + multiplicationDigit);

        //максимальное число
        long maxDigit = Long.MAX_VALUE;
        System.out.println("Максимальное число: " + maxDigit);
        
        //количество десятков
        long dozens = maxDigit / 10; 
        System.out.println("Количество десятков: " + dozens);
        
        //вес собаки
        double dogWeight = 25.550d; 
        System.out.println("Вес собаки: " + dogWeight);
        
        //исходное число
        int originalNumber = 9999;
        System.out.println("Исходное число: " + originalNumber);
        
        //процент по вкладу
        byte depositPercentage = 16;
        System.out.println("Процент по вкладу: " + depositPercentage);
        
        //(переменная хранит символ) &
        char symbol = '&'; 
        System.out.println("Переменная хранит символ: " + symbol);
        
        //код ошибки
        String errorCode = "prog.java:8: error: ';' expected";
        System.out.println("Код ошибки: " + errorCode);
        
        //тип сообщения 
        String messageType = "send";
        System.out.println("Тип сообщения: " + messageType);
        
        //число нулей
        int zeroNumber = 10;
        System.out.println("Число нулей: " + zeroNumber);
        
        //уникальное число
        int uniqueNumber = 3;
        System.out.println("Уникальное число: " + uniqueNumber);
        
        //случайное число
        short randomNumber = 99;
        System.out.println("Случайное число: " + randomNumber);

        //математическое выражение
        int expressionMathematical = 26 / 2;
        System.out.println("Математическое выражение: " + expressionMathematical);

        // выбор (чего-либо)
        char choiceSymbol = '$';
        System.out.println("Выбор символа: " + choiceSymbol);

        //счет (в игре)
        String scoreGame = "1:0";
        System.out.println("Счет в игре: " + scoreGame);

        //максимальная длина (строки)
        int maxLength = 250; 
        System.out.println("Максимальная длина (строки): " + maxLength);

        //пункт меню
        float itemMenu = 1.2f;
        System.out.println("Пункт меню: " + itemMenu);

        //стоимость кофе на вынос
        float costCofee = 10.20f;
        System.out.println("Cтоимость кофе на вынос: " + costCofee +"$");

        //дата начала (чего-либо)
        byte startDate = 1; 
        System.out.println("Дата начала :" + startDate);

        //окончание диапазона
        int endRange = 35894;
        System.out.println("Окончание диапазона: " + endRange);

        //полное имя работника месяца
        String employeeOfTheMonth = "Проскурин Виталий Владимирович";
        System.out.println("Полное имя работника месяца: " + employeeOfTheMonth);

        //заголовок электронной книги
        String titleEbook = "Java begin";
        System.out.println("Заголовок электронной книги: " + titleEbook);

        //размер
        long size = 256L;
        System.out.println("Размер: " + size);

        //вместимость (чего-либо)
        int capacity = 348; 
        System.out.println("Вместимость: " + capacity);

        //счетчик
        byte counter = 120;
        System.out.println("Счетчик: " + counter);

        //путь до файла
        String pathFile = "c:\\java\\StartJava";
        System.out.println("Путь до файла: " + pathFile);

        //количество чисел в каждой строке
        int rowNumbers = 1;
        System.out.println("Количество чисел в каждой строке: " + rowNumbers + "\n");

        System.out.println("Task 2. Boolean-переменные:");

        //сотни равны?
        boolean isEqualHundreds = true;
        System.out.println("Сотни равны?: " + isEqualHundreds);

        //компьютер включен?
        boolean isTurnedComputer = true;
        System.out.println("Компьютер включен?: " + isTurnedComputer);

        //есть равные цифры?
        boolean isEqualNumbers = false;
        System.out.println("Есть равные цифры?: " + isEqualNumbers);

        //(что-либо) создано?
        boolean isCreated = true;
        System.out.println("(что-либо) создано?: " + isCreated);

        //(что-либо) пустое?
        boolean isEmpty = false;
        System.out.println("(что-либо) пустое?: " + isEmpty);

        //(что-либо) активное?
        boolean isActive = true;
        System.out.println("(что-либо) активное?: " + isActive);

        //новый?
        boolean isNew = false;
        System.out.println("Новый?: " + isNew);

        //электронная почта действительная?
        boolean isValidEmail = true; 
        System.out.println("Электронная почта действительная?: " + isValidEmail);

        //имеются уникальные строки?
        boolean isUniqueStrings = false; 
        System.out.println("Имеются уникальные строки?: " + isUniqueStrings + "\n");  
                
        System.out.println("Task 3. Аббревиатуры:");

        //старый universally unique identifier
        String oldUuid = "9cd1b0ca-7e09-4870-b1c6-117e7481421a";
        System.out.println("Cтарый universally unique identifier: " + oldUuid);

        //производитель оперативной памяти
        String manufacturerRam = "samsung"; 
        System.out.println("Производитель оперативной памяти: " + manufacturerRam);

        //емкость жесткого диска
        String hardDiskSpace = "128GB"; 
        System.out.println("Ёмкость жесткого диска: " + hardDiskSpace);

        //протокол передачи гипертекста
        String http = "https://javaops.ru/view/login";
        System.out.println("Протокол передачи гипертекста: " + http);

        //сокращенный uniform resource locator
        String abbreviatedUrl = "goo.gl"; 
        System.out.println("Сокращенный uniform resource locator: " + abbreviatedUrl);

        //новый идентификатор клиента
        String newClientId = "clqnywz9p000108jpe78b348w";
        System.out.println("Новый идентификатор клиента: " + newClientId);

        // кодировка american standard code for information interchange
        char encodingAscii = 'A'; 
        System.out.println("Кодировка american standard code for information interchange: " + encodingAscii);
    }
}