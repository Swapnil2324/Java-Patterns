class PatternStar24
{
    public static void main(String[] args) 
    {
        int num=1;
        for(int i=1;i<=4;i++)
        {
            for(int j=1;j<=(4-i);j++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print(num++ +" ");
            }
            
            System.out.println();
        }
        for(int i=3;i>=1;i--)
        {
            for(int j=1;j<=(4-i);j++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print(num++ +" ");
            }
            
            System.out.println();
        }    
    }
}