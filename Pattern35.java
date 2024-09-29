class Pattern35
{
    public static void main(String[] args) {
        int num=1;
        for(int i=1;i<=4;i++)
        {
            int a=num;
            for(int j=1;j<=i;j++)
            {
                System.out.print(a+" ");
                a+=2;
            }
            num++;
            System.out.println("");
        }
    }
}