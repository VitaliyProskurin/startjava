import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        calculator.setInputA(scan.nextDouble());
        System.out.println("Введите знак математической операции: + - / * ^ %");
        calculator.setInputSign(scan.next().charAt(0));
        System.out.println("Введите второе число: ");
        calculator.setInputB(scan.nextDouble());
        calculator.calculation(calculator.getInputA(), calculator.getInputSign(), 
            calculator.getInputB());
        System.out.println("Результат: " + calculator.getResult());
        scan.nextLine();
        boolean isRepeat = true;
                
        do {
            System.out.println("\nХотите продолжить вычисления? [yes/no]: ");
            String option = scan.nextLine();
            switch(option) {
            case "no" :
                isRepeat = false;
                break;
            case "yes" :
                System.out.println("Введите первое число: ");
                calculator.setInputA(scan.nextDouble());
                System.out.println("Введите знак математической операции: + - / * ^ %");
                calculator.setInputSign(scan.next().charAt(0));
                System.out.println("Введите второе число: ");
                calculator.setInputB(scan.nextDouble());
                calculator.calculation(calculator.getInputA(), calculator.getInputSign(), 
                    calculator.getInputB());
                System.out.println("Результат: " + calculator.getResult());
                scan.nextLine();
                break;
            default :
                System.out.println("Введите верное значение");
            }
        } while (isRepeat);
    }
}