public class VariableNamesTheme {   
    public static void main(String[] args) {
        System.out.println("Именование переменных\n");
        System.out.println("Task 1. Разные переменные:");
        byte digit = 2; //цифра
        byte digit1 = 7; //цифра
        int summ = digit + digit1; //сумма чисел
        int multiplicationDigit = digit * digit1; //произведение цифр
        long maxDigit = Long.MAX_VALUE; //максимальное число
        long dozens = maxDigit / 10; //количество десятков
        double dogWeight = 25.550d; //вес собаки
        int originalNumber = 9999; //исходное число
        byte depositPercentage = 16; //процент по вкладу
        char symbol = '&'; //(переменная хранит символ) &
        String errorCode = "prog.java:8: error: ';' expected"; //код ошибки
        String messageType = "send"; //тип сообщения
        int zeroNumber = 10; //число нулей
        int uniqueNumber = 3; //уникальное число
        short randomNumber = 99; //случайное число
        int expressionMathematical = 26 / 2; //математическое выражение
        char choiceSymbol = '$'; // выбор (чего-либо)
        String scoreGame = "1:0"; //счет (в игре)
        int maxLength = 250; //максимальная длина (строки)
        float itemMenu = 1.2f; //пункт меню
        float costCofee = 10.20f;//стоимость кофе на вынос
        byte startDate = 1; //дата начала (чего-либо)
        int endRange = 35894; //окончание диапазона
        String fullName = "Проскурин Виталий Владимирович"; //полное имя работника месяца
        String titleEbook = "Java begin"; //заголовок электронной книги
        long size = 256L; //размер
        int capacity = 348; //вместимость (чего-либо)
        byte counter = 120; //счетчик
        String pathFile = "c:\\java\\StartJava"; //путь до файла
        int rowNumbers = 1; //количество чисел в каждой строке
        System.out.println("Цифра: " + digit);
        System.out.println("Цифра 1: " + digit1);
        System.out.println("Сумма чисел: " + summ);
        System.out.println("Произведение цифр: " + multiplicationDigit);
        System.out.println("Максимальное число: " + maxDigit);
        System.out.println("Количество десятков: " + dozens);
        System.out.println("Вес собаки: " + dogWeight);
        System.out.println("Исходное число: " + originalNumber);
        System.out.println("Процент по вкладу: " + depositPercentage);
        System.out.println("Переменная хранит символ: " + symbol);
        System.out.println("Код ошибки: " + errorCode);
        System.out.println("Тип сообщения: " + messageType);
        System.out.println("Число нулей: " + zeroNumber);
        System.out.println("Уникальное число: " + uniqueNumber);
        System.out.println("Случайное число: " + randomNumber);
        System.out.println("Математическое выражение: " + expressionMathematical);
        System.out.println("Выбор символа: " + choiceSymbol);
        System.out.println("Счет в игре: " + scoreGame);
        System.out.println("Максимальная длина (строки): " + maxLength);
        System.out.println("Пункт меню: " + itemMenu);
        System.out.println("Cтоимость кофе на вынос: " + costCofee +"$");
        System.out.println("Дата начала :" + startDate);
        System.out.println("Окончание диапазона: " + endRange);
        System.out.println("Полное имя работника месяца: " + fullName);
        System.out.println("Заголовок электронной книги: " + titleEbook);
        System.out.println("Размер: " + size);
        System.out.println("Вместимость: " + capacity);
        System.out.println("Счетчик: " + counter);
        System.out.println("Путь до файла: " + pathFile);
        System.out.println("Количество чисел в каждой строке: " + rowNumbers + "\n");

        System.out.println("Task 2. Boolean-переменные:");
        boolean isEqualHundreds = true; //сотни равны?
        boolean isTurnedComputer = true; //компьютер включен?
        boolean isEqualNumbers = false; //есть равные цифры?
        boolean isCreated = true; //(что-либо) создано?
        boolean isEmpty = false; //(что-либо) пустое?
        boolean isActive = true; //(что-либо) активное?
        boolean isNew = false; //новый?
        boolean isValidEmail = true; //электронная почта действительная?
        boolean isUniqueStrings = false; //имеются уникальные строки?
        System.out.println("Сотни равны?: " + isEqualHundreds);
        System.out.println("Компьютер включен?: " + isTurnedComputer);
        System.out.println("Есть равные цифры?: " + isEqualNumbers);
        System.out.println("(что-либо) создано?: " + isCreated);
        System.out.println("(что-либо) пустое?: " + isEmpty);
        System.out.println("(что-либо) активное?: " + isActive);
        System.out.println("Новый?: " + isNew);
        System.out.println("Электронная почта действительная?: " + isValidEmail);
        System.out.println("Имеются уникальные строки?: " + isUniqueStrings + "\n");
        
        System.out.println("Task 3. Аббревиатуры:");
        String uui = "9cd1b0ca-7e09-4870-b1c6-117e7481421a"; //старый universally unique identifier
        String mr = "samsung"; //производитель оперативной памяти
        String hdc = "128GB"; //емкость жесткого диска
        String htp = "https://javaops.ru/view/login"; //протокол передачи гипертекста
        String url = "goo.gl"; //сокращенный uniform resource locator
        String cuid = "clqnywz9p000108jpe78b348w"; //новый идентификатор клиента
        char ascii = 'A'; // кодировка american standard code for information interchange
        System.out.println("Cтарый universally unique identifier: " + uui);
        System.out.println("Производитель оперативной памяти: " + mr);
        System.out.println("Ёмкость жесткого диска: " + hdc);
        System.out.println("Протокол передачи гипертекста: " + htp);
        System.out.println("Сокращенный uniform resource locator: " + url);
        System.out.println("Новый идентификатор клиента: " + cuid); 
        System.out.println("Кодировка american standard code for information interchange: " + ascii);
    }
}