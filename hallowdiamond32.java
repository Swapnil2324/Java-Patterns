class hallowdiamond32
{
    public static void main(String[] args) 
    {
        for(int i=4;i>=1;i--)
        {
            for(int j=1;j<=4;j++)
            {
                if(i==j)
                {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            for(int j=3;j>=1;j--)
            {
                if(i==j)
                {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
        for(int i=1;i<=4;i++)
        {
            for(int j=1;j<=4;j++)
            {
                if(i==j)
                {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            for(int j=3;j>=1;j--)
            {
                if(i==j)
                {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }    
    }
}