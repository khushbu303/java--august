package oct28;

import java.util.LinkedList;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        List<CustomizedDemo> list = new LinkedList<>();
        list.add(new CustomizedDemo("khushbu",101,"canada"));
        list.add(new CustomizedDemo("Himanshu",021,"USA"));
        list.add(new CustomizedDemo("krisha",3,"India"));
        System.out.println(list);

    }
}
