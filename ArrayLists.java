import java.util.ArrayList;
import java.util.Collections;
public class ArrayLists {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list);
        
        list.add(3,5);
        System.out.println(list);
        list.set(0, 9);
        System.out.println(list);
        list.remove(3);
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
    }

    
}
