class Pattern7
{
    public static void main(String[] args)
    {
        char ch='a';
        for(int i=1;i<=4;i++)
        {
            for(int j=1;j<=4;j++)
            {
                System.out.print(ch++ +" ");
            }
            System.out.println();
        }
    }
}