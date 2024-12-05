public class hanoitower {
    public static void A(int n,String source,String helper, String destination)
    {
        if(n == 1)
        {
            System.out.println(n+"transferred from"+source+""+destination);
            return;
        }
        A(n-1, source, destination, helper);
        System.out.println(n+"transferred from"+source+""+destination);
        A(n-1, helper, source, destination);
    }
    public static void main(String[] args) {
        int n = 2;
        A(n, "S","H", "D");
    }
    
}
