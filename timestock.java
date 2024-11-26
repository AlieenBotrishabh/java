public class timestock {
    public int maxprofit(int[] nums)
    {
        int maxprofit = 0;
        int minprice = nums[0];
        int n = nums.length;
        for(int i = 1;i < n;i++)
        {
                int cost = nums[i] - minprice;
                maxprofit = Math.max(maxprofit, cost);
                minprice = Math.min(minprice, nums[i]);

        }
        return maxprofit;
    }
    public static void main(String[] args) {
        timestock ss = new timestock();
        int nums[] = {7,1,5,3,6,4};
        System.out.println("Best time to sell the stock is");
        System.out.println(ss.maxprofit(nums));
    }
    
}
