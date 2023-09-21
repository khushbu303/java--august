package sep19;

import java.util.*;

public class EvenNumberProblem {
    public static void main(String[] args){
       int number;
       int sum = 0;

        Scanner scanner = new Scanner(System.in);
         number = scanner.nextInt();
        System.out.println("Print Even numbers");
        for(int i=1; i <= 100; i++){
            if(i%2 ==0){
                continue;}
                System.out.println(i);
            sum= sum +i;

            }
        System.out.println(sum);

        }

    }

