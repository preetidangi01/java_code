class Test 
{
	public static void main(String args[])
	{
	 int n=6;
	 for(int i=0;i<=n;i++)
	 {
	 for(int j=0;j<=n;j++)
	 {
	 	if((j==3&&i>=0) || (i==3&&j>=0)||(j==0&&i<=2) || (i==0&&j>=4) || (i==6&&j<=2)||(j==6&&i>=3))
		System.out.print("*"+" ");
	 	else
	 		System.out.print(" "+" ");
	 }
	 System.out.println("");
	}
    }
}
