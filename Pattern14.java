class Pattern14
{
    public static void main(String[] args) 
    {
        for(int i=1;i<=4;i++)
        {
            char ch='a';
            for(int j=1;j<=i;j++)
            {
                System.out.print(ch++ +" ");
            }
            System.out.println();
        }    
    }
}