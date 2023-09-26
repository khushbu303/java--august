package sep24;
import java.util.*;

public class Assignment03 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int i;
        int num;
        num = scanner.nextInt();
        System.out.println("Enter a number you want a Cube of:" );

        for(i=1; i <=num; i++) {
            System.out.println(" Cube of " + i + " is : "+(i*i*i));


        }

    }
}
