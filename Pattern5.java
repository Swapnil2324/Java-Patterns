
import java.util.Scanner;

class Pattern5
{
    public static void main(String[] args )
    {
        System.out.print("Enter your name : ");
        String name=new Scanner(System.in).next();
        int len=name.length();
        System.out.println();
        for(int i=0;i<len;i++)
        {
            for(int j=0;j<len;j++)
            {
                System.out.print(name.charAt(i)+" ");
            }
            System.out.println();
        }
    }
}