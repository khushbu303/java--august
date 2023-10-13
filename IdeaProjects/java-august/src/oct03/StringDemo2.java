package oct03;

public class StringDemo2 {
    public static void main(String[] args) {
        String companyName = "pragra";
        char [] charArray = companyName.toCharArray();
        for(char elements: charArray){
            System.out.print( " " +elements);
        }
    }
}
