import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double num1 = scanner.nextDouble();
        String command = scanner.next();
        double num2 = scanner.nextDouble();

        Calculator calculator = new Calculator(num1, num2);

        switch (command){
            case "+":{
                calculator.sum();
                break;
            }

            case "-":{
                calculator.dif();
                break;
            }

            case "*":{
                calculator.mul();
                break;
            }

            case "/":{
                calculator.div();
                break;
            }

            case ">":{
                calculator.isBigger();
                break;
            }

            case "<":{
                calculator.isSmaller();
                break;
            }
        }

        System.out.println("Result: " + calculator.getRes());
    }
}
