import java.util.Scanner;

public class stringoccurence 
{
    public static int first = -1;
    public static int last = -1;
        public static void ocuurence(String str, int i, char element)
        {
            if(i == str.length())
            {
                System.out.println(first);
                System.err.println(last);
                return;
            }
            char currelement = str.charAt(i);
            if(currelement == element)
            {
                if(first == -1)
                {
                    first = i;
                }
                else
                {
                    last = i;
                }

                ocuurence(str, i+1, element);
            }
        }
        public static void main(String[] args)
        {
            Scanner ss = new Scanner(System.in);
            String str = ss.nextLine();
            ocuurence(str, 0, 'a');
            ss.close();
        }
}
