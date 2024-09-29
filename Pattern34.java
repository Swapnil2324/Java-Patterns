class Pattern34
{
    public static void main(String[] args) 
    {
        for(int i=1;i<=5;i++)
        {
            int num=4;
            int num1=i;
            for(int j=1;j<=i;j++)
            {
                
                System.out.print(num1+" ");
                num1+=num;
                num--;
                
            }
            System.out.println("");
        }    
    }
}