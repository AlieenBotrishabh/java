import java.util.HashMap;
import java.util.Map;
public class Hashmap {
    public static void printMap(HashMap<String, Integer> data, String s1, String s2)
    {
        for(Map.Entry<String, Integer> e: data.entrySet())
        {
            int a = e.getValue();
            int b  = e.getValue();
            if(e.getKey().equalsIgnoreCase(s1) || e.getKey().equalsIgnoreCase(s2))
            {
                int c = a + b;
                System.out.println(c);
            }
        }
    }
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        map.put("I", 1);
        map.put("V", 5);
        map.put("X",10);
        printMap(map, "X", "V");
    }
    
}
