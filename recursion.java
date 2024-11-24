import java.util.Scanner;

public class recursion {
    public static void print(int n)
    {
        if(n == 0)
        {
            return;
        }
        System.out.println(n);
        print(n-1);
    }
    public static void main(String args[])
    {
        Scanner ss = new Scanner(System.in);
        int n;
        System.out.println("Enter the input");
        n = ss.nextInt();
        print(n);
        ss.close();
    }
}