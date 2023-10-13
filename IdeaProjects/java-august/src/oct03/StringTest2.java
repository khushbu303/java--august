package oct03;

public class StringTest2 {
    // string is immutable but
    // stringBuffer and string Builder are mutable that means we can change
    // stringBuffer==> thread safe,slower,synchronized
    // stringBuilder==> not thread safe,fast,not synchronized
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("pharmacy");
        System.out.println(sb.reverse());
        StringBuilder sb1 = new StringBuilder("khushbu");
        System.out.println(sb1.reverse());
    }
}
