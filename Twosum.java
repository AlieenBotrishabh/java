import java.util.HashMap;
import java.util.Map;

public class Twosum {
    public static void main(String[] args) {
        //Using the concept of Hash Tables

        int i;
        Map<Integer, Integer> hash = new HashMap<>();
        int nums[] = {2, 7, 11, 15};
        int target = 9;
        int n = nums.length;
        for(i = 0;i < n;i++)
        {
            hash.put(nums[i], i);
        }
        for(i = 0;i < n;i++)
        {
            int complement = target - nums[i];
            if(hash.containsKey(complement) && hash.get(complement) != i)
            {
                System.out.println(hash.get(complement));
            }
        }
    }
}
