import java.util.HashSet;
import java.util.Iterator;
public class hashing {
    public static void main(String args[])
    {
        HashSet<Integer> list = new HashSet<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list);

        if(list.contains(6))
        {
            System.out.println("6 is present");
        }
        else
        {
            System.out.println("6 is not present");
        }
        Iterator<Integer> i = list.iterator();
        while(i.hasNext())
        {
            System.out.println(i.next());
        }

    }
    
}
