package oct03;

public class Problem {
    public static void main(String[] args) {
        String s1 = "pragra";
        char[] ch = s1.toCharArray();
        for (int i = ch.length; i >= 0; i--) {
            System.out.print(" " + ch[i]);
        }

    }
}
