package oct28;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestCollectionDemo {
    // collections: framework or API to manupliate the group of object
    // only works on object
    public static void main(String[] args) {
        /*
        its a interface which provide multiple other interfaces
        interfaces:
        List     Set     Queue     Map
        In Array there will be a fixed size while in ArrayList we can add multiple
        lAZY INITIALIZATION:  when an arraylist is created an array of size zero is created. only whenthe first element
        is inserted then index size will change zero this is called "Lazy Initialization" and it will save memory
        (n + n/2 +1)
        (10+ 10/2 +1)
        what should we use to insert 100s of records?== "linked list"
        For retrival/serach we use "ArrayList"
                 */
        ArrayList arrayList = new ArrayList();
        arrayList.add("Khushbu");
        arrayList.add("vancouver");
        arrayList.add(true);
        arrayList.add(12);
        System.out.println(arrayList);
        Object i = arrayList.get(1);
        System.out.println(i);

    }
}
