class hallowtriangle29
{
    public static void main(String[] args) 
    {
        for(int i=4;i>=1;i--)
        {
            for(int j=1;j<=i;j++)
            {
                if(i==3&&j==2)
                {
                    System.out.print("  ");
                }else{
                    System.out.print("* ");
                }
            }
            for(int j=1;j<=4-i;j++)
            {
                System.out.print("  ");
            }
            for(int j=1;j<=4-i;j++)
            {
                System.out.print("  ");
            }
            for(int j=1;j<=i;j++)
            {
                if(i==3&&j==2)
                {
                    System.out.print("  ");
                }else{
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
        for(int i=2;i<=4;i++)
        {
            for(int j=1;j<=i;j++)
            {
                if(i==3&&j==2)
                {
                    System.out.print("  ");
                }else{
                    System.out.print("* ");
                }
            }
            for(int j=1;j<=4-i;j++)
            {
                System.out.print("  ");
            }
            for(int j=1;j<=4-i;j++)
            {
                System.out.print("  ");
            }
            for(int j=1;j<=i;j++)
            {
                if(i==3&&j==2)
                {
                    System.out.print("  ");
                }else{
                    System.out.print("* ");
                }
            }
            System.out.println();
        }     
    }
}