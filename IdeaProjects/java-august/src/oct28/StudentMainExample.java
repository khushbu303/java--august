package oct28;
import java.util.Iterator;
import java.util.List;
import java.util.LinkedList;
public class StudentMainExample {
    public static void main(String[] args) {
        List<StudentCustomizedExample> list = new LinkedList<>();
        list.add(new StudentCustomizedExample("sravani", 34));
        list.add(new StudentCustomizedExample("khushbu", 30));
        list.add(new StudentCustomizedExample("rutu", 40));
        list.add(new StudentCustomizedExample("himanshu", 35));
        System.out.println(list);
        Iterator<StudentCustomizedExample> iterator = list.iterator();
        for (StudentCustomizedExample e:list){
            if(e.getAge()>30){
                System.out.println(e.getAge());
            }


        }

    }
}