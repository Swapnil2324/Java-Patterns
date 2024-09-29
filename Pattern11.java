class Pattern11
{
    public static void main(String[] args) 
    {
        char ch='a';
        int no=1;
        for(int i=1;i<=4;i++)
        {
            for(int j=1;j<=4;j++)
            {
                if(i==1||i==3){
                    System.out.print(ch++ +" ");
                }else{
                    System.out.print(no++ +" ");
                }
            }
            System.out.println();
        }
    }
}