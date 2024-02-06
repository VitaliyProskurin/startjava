public class Calculator {

    private char sign;
    private double result;
    private double a;
    private double b;

    public double getResult() {
        return result;
    }

    public double getInputA() {
        return a;
    }

    public void setInputA(Double a) {
        this.a = a;
    }

    public double getInputB() {
        return b;
    }

    public void setInputB(Double b) {
        this.b = b;
    }

    public char getInputSign() {
        return sign;
    }

    public void setInputSign(char sign) {
        switch(sign) {
        case '+' :
            this.sign = sign;
            break;
        case '-' :
            this.sign = sign;
            break;
        case '*' :
            this.sign = sign;
            break;
        case '/' :
            this.sign = sign;
            break;
        case '^' :
            this.sign = sign;
            break;
        case '%' :
            this.sign = sign;
            break;
        default:
            System.out.println("Не правильный оператор");
        }
    }

    public void calculation(double a, char sign, double b) {
        switch(sign) {
        case '+' :
            result = a + b;
            break;
        case '-' :
            result = a - b;
            break;
        case '*' :
            result = a * b;
            break;
        case '/' :
            result = a / b;
            break;
        case '^' :
            result = a;
            for (int i = 1; i < b; i++) {
            result *= a;
            }
            break;
        case '%' :
            result = a % b;
            break;
        default:
            System.out.println("Не выбран оператор");
        }
    }
}