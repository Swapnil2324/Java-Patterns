class Pattern10
{
    public static void main(String[] args) 
    {
        int num=1;
        for(int i=1;i<=4;i++)
        {
            for(int j=1;j<=4;j++)
            {
                System.out.print(num+" ");
                num+=2;
            }
            System.out.println();
        }
    }
}