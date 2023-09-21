package sep19;
import java.util.*;


public class WhileLoopProblem2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int number;
        int i = 1;
        number = scanner.nextInt();
        System.out.println("Multiplicatin table for number 5");
        while(i<=10){
            int result = number * i;
            System.out.println(number + "*" + i + " =" + result);
            i++;
        }

    }
}
