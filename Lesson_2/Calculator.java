public class Calculator {

    private char sign;
    private double result;
    private double a;
    private double b;

    public void setSign(char sign) {
        this.sign = sign;
    }

    public double getResult() {
        return result;
    }

    public void setA(Double a) {
        this.a = a;
    }

    public void setB(Double b) {
        this.b = b;
    }
 
    public void calculation() {
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
                result = 1;
                for (int i = 1; i <= b; i++) {
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