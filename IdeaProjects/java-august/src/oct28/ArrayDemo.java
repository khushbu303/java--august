package oct28;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ArrayDemo {
    public static void main(String[] args) {
      /*  List<Integer> myList = new LinkedList<>();
        myList.add(10);
        myList.add(20);
        myList.add(30);
        myList.add(40);
        System.out.println(Collections.min(myList));
        System.out.println(Collections.max(myList));
        System.out.println(Collections.frequency(myList,40));

*/
        int[] numbers = {1,2,3,56,767,56};
        Arrays.sort(numbers);
        for (int i:numbers) {
            System.out.println(i);
            int j =Arrays.binarySearch(numbers,56);
            System.out.println(j);
        }

    }
}
