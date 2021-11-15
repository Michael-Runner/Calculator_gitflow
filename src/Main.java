import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Calculator calculator;
        double num1;
        double num2;

        num1 = scanner.nextDouble();
        String command = scanner.next();

        if(command.equals("!"))
        {
            calculator = new Calculator(num1);
        }
        else
        {
            num2 = scanner.nextDouble();
            calculator = new Calculator(num1, num2);
        }

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

            case ">=":{
                calculator.isBiggerOrEq();
                break;
            }

            case "<=":{
                calculator.isSmallerOrEg();
                break;
            }

            case "!":{
                calculator.fuct();
                break;
            }
        }

        System.out.println("Result: " + calculator.getRes());
    }
}
