import java.util.Scanner;

class Pattern4
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your name : ");
        String name=sc.next();
        System.out.println();
        int len=name.length();
        for(int i=0;i<len;i++)
        {
            for(int j=0;j<len;j++)
            {
                System.out.print(name.charAt(j)+" ");
            }
            System.out.println();
        }
    }
}