import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    Calculator calculator = new Calculator();
    String command = null;

    System.out.println("Welcome! I'm a calculator.");

    while (command == null || !(command.equals("quit"))) {
      int num1;
      int num2;
      int result;

      System.out.println("Enter a Command (add, subtract, multiply, divide, fibonacci, binary, or quit): ");
      command=sc.next();

      if (command.equals("quit")) {
        return;
      }

      System.out.println("Enter a number: ");
      num1=sc.nextInt();

      switch (command) {
        case ("fibonacci"):
          result=calculator.fibonacciNumberFinder(num1);
          System.out.println("The fibonacci value of " + num1 + " is " + result);
          break;
        case ("binary"):
          String binaryResult=calculator.intToBinaryNumber(num1);
          System.out.println("The binary value of " + num1 + " is " + binaryResult);
          break;
          default:
            System.out.println("Enter another number: ");
            num2=sc.nextInt();
            switch (command) {
              case ("add"):
                result = calculator.add(num1, num2);
                System.out.println(num1 + " + " + num2 + " is " + result);
                break;
              case ("subtract"):
                result = calculator.subtract(num1, num2);
                System.out.println(num1 + " - " + num2 + " is " + result);
                break;
              case ("multiply"):
                result = calculator.multiply(num1, num2);
                System.out.println(num1 + " * " + num2 + " is " + result);
                break;
              case ("divide"):
                result = calculator.divide(num1, num2);
                System.out.println(num1 + " / " + num2 + " is " + result);
                break;
              default:
                System.out.println("Not a valid command");
            }
      }
    }


  }
}
