import java.util.*;
public class RogersIVR {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your input");
        int input = scanner.nextInt();
        switch (input) {
            case 1:
                System.out.println("Press 1 for English");
                break;
            case 2:
                System.out.println("Press 2 for French");
                break;
            case 3:
                System.out.println("Press 3 for Spanish");
                break;
        }
              switch (input) {
                   case 1:
                       System.out.println("Enter the service");
                        input = scanner.nextInt();
                       if(input == 1){
                           System.out.println("New Connection, Existing Connection, Bill Payment ");
                           String option = scanner.next();
                           System.out.println("Entered value : "+option);
                           if(option.equalsIgnoreCase("New")) {
                               System.out.println("New Customer");
                           }
                           else if(option == "Existing Connection"){
                               System.out.println("Existing customer");
                           }
                           else if(option == "Bill Payment"){
                               System.out.println(" inquiry regarding payment");
                           }
                       }



            case 2:
                System.out.println(" Press 4 For Mobile");
                break;

            case 3:
                System.out.println("Press 5 For Cable");
                  break;






                        }

                    }
                }


