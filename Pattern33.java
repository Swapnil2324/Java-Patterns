class Pattern33
{
    public static void main(String[] args) 
    {
        int a=0;
        for(int i=1;i<=4;i++)
        {
            a=a+i;
            int b=a;
            for(int j=1;j<=i;j++)
            {
                System.out.print(b-- +" ");
            }
            System.out.println("");
        }
    }
}