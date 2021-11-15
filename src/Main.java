import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        Calculator calculator;
        double num1;
        double num2;
        Logs logs = new Logs();

        num1 = scanner.nextDouble();

        logs.write("num 1 entered " + num1);

        String command = scanner.next();

        logs.write("command entered " + command);

        if(command.equals("!"))
        {
            calculator = new Calculator(num1);
        }
        else
        {
            num2 = scanner.nextDouble();
            calculator = new Calculator(num1, num2);
            logs.write("num 2 entered " + num2);
        }

        switch (command){
            case "+":{
                calculator.sum();
                logs.write("+ command");
                break;
            }

            case "-":{
                calculator.dif();
                logs.write("- command");
                break;
            }

            case "*":{
                calculator.mul();
                logs.write("* command");
                break;
            }

            case "/":{
                calculator.div();
                logs.write("/ command");
                break;
            }

            case ">":{
                calculator.isBigger();
                logs.write("> command");
                break;
            }

            case "<":{
                calculator.isSmaller();
                logs.write("< command");
                break;
            }

            case ">=":{
                calculator.isBiggerOrEq();
                logs.write(">= command");
                break;
            }

            case "<=":{
                calculator.isSmallerOrEq();
                logs.write("<= command");
                break;
            }

            case "!":{
                calculator.fuct();
                logs.write("! command");
                break;
            }
        }

        System.out.println("Result: " + calculator.getRes());
        logs.write("Result: " + calculator.getRes());
        logs.getLogs().close();
    }
}
