package sep24;
import java.util.*;

public class Assignment02 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number you want to print product table");
        int number;
        int i = 1;
        number = scanner.nextInt();
        System.out.println("Multiplication table for number");
        do {
            int result = number * i;
            System.out.println(number + "*" + i + "=" + result);
            i++;
        }while (i <= 10);


        }
    }


