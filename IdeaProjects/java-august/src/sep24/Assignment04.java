package sep24;
import java.util.*;

public class Assignment04 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int i =1;
        int n;
        int sum = 0;
        n = scanner.nextInt();
        System.out.println("Print First n natural numbers");
         for(i=1;i<=n;i++) {
             System.out.println(i);
             sum = sum +i;
         }
         System.out.println("Print sum of first n natural numbers " +n+ " numbers :" +sum);
    }


    }

