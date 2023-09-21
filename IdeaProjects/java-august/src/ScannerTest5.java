import java.util.Scanner;
public class ScannerTest5 {
    public static void main(String[] args){
        System.out.println("Welcome to my calculator");
        System.out.println("Press 1 for Addition");
        System.out.println("Press 2 for Subtraction");
        System.out.println("Press 3 for Multiplication");
        System.out.println("Press 4 for Division");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your input");
        int input = scanner.nextInt();
          System.out.println("Enter the first number");
          int num1 = scanner.nextInt();

        System.out.println("Enter the second number");
        int num2 = scanner.nextInt();
           if(input == 1) {
               int sum = num1 + num2;

               System.out.println("sum of " + num1 + " and " + num2 + " is " + sum);
           }

               else if(input == 2) {
               System.out.println("Calculating Subtraction");

               int sub = num1 - num2;
               System.out.println("sum of " + num1 + " and " + num2 + " is " + sub);
           }

                   else{
                       System.out.println("wrong input");

               }
               }

           }



