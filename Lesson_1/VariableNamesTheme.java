public class VariableNamesTheme {   
    public static void main(String[] args) {
        System.out.println("Именование переменных\n");
        System.out.println("Task 1. Разные переменные:");
        
        byte digit = 2;
        System.out.println("Цифра: " + digit);

        byte digit1 = 7;
        System.out.println("Цифра 1: " + digit1);

        //сумма чисел
        int sum = digit + digit1;
        System.out.println("Сумма чисел: " + sum);

        //произведение цифр
        int multiplicationDigits = digit * digit1;
        System.out.println("Произведение цифр: " + multiplicationDigits);

        //максимальное число
        long maxDigit = Long.MAX_VALUE;
        System.out.println("Максимальное число: " + maxDigit);
        
        //количество десятков
        long dozens = maxDigit / 10; 
        System.out.println("Количество десятков: " + dozens);
        
        double dogWeight = 25.550d; 
        System.out.println("Вес собаки: " + dogWeight);
        
        int originalNumber = 9999;
        System.out.println("Исходное число: " + originalNumber);
        
        byte depositPercent = 16;
        System.out.println("Процент по вкладу: " + depositPercent);
        
        char symbolAmpersand = '&'; 
        System.out.println("Переменная хранит символ: " + symbolAmpersand);
        
        String errorCode = "prog.java:8: error: ';' expected";
        System.out.println("Код ошибки: " + errorCode);
        
        String messageType = "send";
        System.out.println("Тип сообщения: " + messageType);
        
        int zerosNumber = 10;
        System.out.println("Число нулей: " + zerosNumber);
        
        int uniqueNumber = 3;
        System.out.println("Уникальное число: " + uniqueNumber);
        
        short randomNumber = 99;
        System.out.println("Случайное число: " + randomNumber);

        int mathExpression = 26 / 2;
        System.out.println("Математическое выражение: " + mathExpression);

        char selectionSymbol = '$';
        System.out.println("Выбор символа: " + selectionSymbol);

        String scoreGame = "1:0";
        System.out.println("Счет в игре: " + scoreGame);

        int maxLength = 250; 
        System.out.println("Максимальная длина (строки): " + maxLength);

        float menuItem = 1.2f;
        System.out.println("Пункт меню: " + menuItem);

        float costCofeeAway = 10.20f;
        System.out.println("Cтоимость кофе на вынос: " + costCofeeAway +"$");

        byte startDate = 1; 
        System.out.println("Дата начала :" + startDate);

        int endRange = 35894;
        System.out.println("Окончание диапазона: " + endRange);

        String fullNameEmployeeMonth = "Проскурин Виталий Владимирович";
        System.out.println("Полное имя работника месяца: " + fullNameEmployeeMonth);

        String ebookTitle = "Java begin";
        System.out.println("Заголовок электронной книги: " + ebookTitle);

        long size = 256L;
        System.out.println("Размер: " + size);

        int capacity = 348; 
        System.out.println("Вместимость: " + capacity);

        byte counter = 120;
        System.out.println("Счетчик: " + counter);

        String pathFile = "c:\\java\\StartJava";
        System.out.println("Путь до файла: " + pathFile);

        int  numbersEachRow= 1;
        System.out.println("Количество чисел в каждой строке: " + numbersEachRow + "\n");

        System.out.println("Task 2. Boolean-переменные:");

        boolean isEqualHundreds = true;
        System.out.println("Сотни равны?: " + isEqualHundreds);

        boolean isTurnedComputer = true;
        System.out.println("Компьютер включен?: " + isTurnedComputer);

        boolean hasEqualNumbers = false;
        System.out.println("Есть равные цифры?: " + hasEqualNumbers);

        boolean isCreated = true;
        System.out.println("(что-либо) создано?: " + isCreated);

        boolean isEmpty = false;
        System.out.println("(что-либо) пустое?: " + isEmpty);

        boolean isActive = true;
        System.out.println("(что-либо) активное?: " + isActive);

        boolean isNew = false;
        System.out.println("Новый?: " + isNew);

        boolean isValidEmail = true; 
        System.out.println("Электронная почта действительная?: " + isValidEmail);

        boolean hasUniqueStrings = false; 
        System.out.println("Имеются уникальные строки?: " + hasUniqueStrings + "\n");  
                
        System.out.println("Task 3. Аббревиатуры:");

        String oldUuid = "9cd1b0ca-7e09-4870-b1c6-117e7481421a";
        System.out.println("Cтарый universally unique identifier: " + oldUuid);

        String manufacturerRam = "samsung"; 
        System.out.println("Производитель оперативной памяти: " + manufacturerRam);

        String capacityHdd = "128GB"; 
        System.out.println("Ёмкость жесткого диска: " + capacityHdd);

        String http = "https://javaops.ru/view/login";
        System.out.println("Протокол передачи гипертекста: " + http);

        String shortUrl = "goo.gl"; 
        System.out.println("Сокращенный uniform resource locator: " + shortUrl);

        String newClientId = "clqnywz9p000108jpe78b348w";
        System.out.println("Новый идентификатор клиента: " + newClientId);

        char encodingAscii = 'A'; 
        System.out.println("Кодировка american standard code for information interchange: " 
            + encodingAscii);
    }
}