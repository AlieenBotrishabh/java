import java.util.Scanner;
public class reversestring 
{
    public static void reverse(String rev, int i)
    {
        if(i == 0)
        {
            System.out.println(rev.charAt(i));
            return;
        }
        System.out.print(rev.charAt(i));
        reverse(rev, i-1);
    }
    public static void main(String[] args) {
        Scanner ss  = new Scanner(System.in);
        String str = ss.nextLine();
        reverse(str, str.length() - 1);
        ss.close();
    }
}
