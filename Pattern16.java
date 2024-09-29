
import java.util.Scanner;

class Pattern16
{
    public static void main(String[] args) 
    {
        System.out.print("Enter your name : ");
        String name=new Scanner(System.in).next();
        int len=name.length();
        for(int i=0;i<len;i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print(name.charAt(j)+" ");
            }
            System.out.println();
        }
    }
}