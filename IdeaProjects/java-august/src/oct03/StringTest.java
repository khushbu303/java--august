package oct03;

public class StringTest {
    public static void main(String[] args) {
        String s1= "pragra";  //string is arrays of character
        String s2 = "khushbu";
        char c = s2.charAt(4);
        System.out.println(c);
       char ch= s1.charAt(1);  //in string if we take char of array with help of this method we can find on which index char is present
       System.out.println(ch);
       int i = s1.compareTo(s2);// this methods works under ASCII value which has value to the number and we can compare which one is grater or smaller

        System.out.println(i);
    }
}
