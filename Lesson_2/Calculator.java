public class Calculator {

    private char sign;
    private int result;
    private int a;
    private int b;

    public void setSign(char sign) {
        this.sign = sign;
    }

    public int getResult() {
        return result;
    }

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }
 
    public void calculate() {
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