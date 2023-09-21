package sep19;
import java.util.*;

public class OddNumberProblem {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int number;
        int sum = 0;

        number = scanner.nextInt();
        System.out.println("Print Odd numbers");

        for(int i = 1; i <= 100; i++){
        if(i% 2 !=0){
            continue;}
        System.out.println(i);
        sum = sum +i;

        }
        System.out.println(sum);


    }
}
