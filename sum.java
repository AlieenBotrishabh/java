public class sum {
    public static void sum1(int n, int sum, int i)
    {
        if(i == n)
        {
            sum = sum + i;
            System.out.println(sum);
            return;
        }
        sum = sum + i;
        sum1(n, sum, i+1);
    }
    public static void main(String[] args) {
        sum1(5, 0, 1);
    }
}
