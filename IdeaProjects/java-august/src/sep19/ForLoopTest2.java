package sep19;
import java.util.*;

public class ForLoopTest2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int luckyNumber = 17;
        int userNumber;

        for (int i = 1; i <= 5; i++) {
            System.out.println("Please Enter a Number ");
            userNumber = scanner.nextInt();

            if (userNumber != luckyNumber) {
                System.out.println("Retry your luck");
                {
                    continue;
                }
            } else
                System.out.println("Congratulation you won");

            break;

        }
    }
}