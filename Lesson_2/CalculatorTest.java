import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scan = new Scanner(System.in);
        String choice;
        do {
            System.out.println("Введите первое число: ");
            calculator.setA(scan.nextInt());
            System.out.println("Введите знак математической операции: + - / * ^ %");
            calculator.setSign(scan.next().charAt(0));
            System.out.println("Введите второе число: ");
            calculator.setB(scan.nextInt());

            calculator.calculate();
            System.out.println("Результат: " + calculator.getResult());
            scan.nextLine();

            do {
                System.out.println("\nХотите продолжить вычисления? [yes/no]: ");
                choice = scan.nextLine();
            } while (!choice.equals("no") && !choice.equals("yes"));
        } while (choice.equals("yes"));
    }
}