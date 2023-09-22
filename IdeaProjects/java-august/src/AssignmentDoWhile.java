import java.util.*;
public class AssignmentDoWhile {
    public static void main(String[] args){
        int num1,num2,result;
        int option;
        Scanner scanner = new Scanner(System.in);
        do{
            System.out.println("\no.1 for Addition\no.2 for Subtraction\no.3 for Multiplication\no.4 for Exit\n");
            System.out.println("Enter your choice");
            option = scanner.nextInt();
            switch(option){
                case 1:
                    System.out.println("Enter two Numbers");
                    num1 = scanner.nextInt();
                    num2 = scanner.nextInt();
                    result = num1 + num2;
                    System.out.println(result);
                    break;
                case 2:
                    System.out.println("Enter two Numbers");
                    num1 = scanner.nextInt();
                    num2 = scanner.nextInt();
                    result = num1 - num2;
                    System.out.println(result);
                    break;
                case 3:
                    System.out.println("Enter two Numbers");
                    num1 = scanner.nextInt();
                    num2 = scanner.nextInt();
                    result = num1 * num2;
                    System.out.println(result);
                    break;
                case 4:
                    System.out.println("Enter two Numbers");
                    num1 = scanner.nextInt();
                    num2 = scanner.nextInt();
                    result = num1 / num2;
                    System.out.println(result);
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Wrong choice");
            }
        }
        while(option!=5);

    }
}
