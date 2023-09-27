import java.util.Scanner;
class Array
{
	private int a[][];
	private int n;
	private int m;
	
	public void setData(int n,int m){
		this.a = new int[10][10];
		this.n=n;
		this.m=m;
	}
	// public int len()
	// {
		// return a.length;
		// return b.length;
	// }
	public void inputArray(Scanner sc)
	{
		System.out.println("Enter the element of an array");
		for(int i=0;i<this.n;i++)
		{
			for(int j=0;j<this.m;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
	}
	public void printArray()
	{
		System.out.println("This is your array... ");
		for(int i=0;i<this.n;i++)
		{
			for(int j=0;j<this.m;j++)
			{
				System.out.print(a[i][j]+" ");
			}
		System.out.println("");
		}
	}
	
	public void transpose()
	{
		System.out.println("Actual array.....");
		for(int i=0;i<this.n;i++)
		{
			for(int j=0;j<this.m;j++)
			{	
			System.out.print(a[i][j]);
			}
			System.out.println();
		}
		for(int i=0;i<this.n;i++)
		{
			for(int j=i+1;j<this.m;j++)
			{
				int temp = a[j][i];
				a[j][i]=a[i][j];
				a[i][j]= temp;
			}
		}
		System.out.println("trancposed array..");
		for(int i=0;i<this.n;i++)
		{
			for(int j=0;j<this.m;j++)
			{	
			System.out.print(a[i][j]);
			}
			System.out.println();
		}
	}
	public void pattern1()
	{
		System.out.println("Orijnal matrix is");
		for(int i=0;i<this.n;i++)
		{
			for(int j=0;j<this.m;j++)
			{
				System.out.print(a[i][j]+" ");
			}
				System.out.println();
		}
		System.out.println("After modifying matrix is...");
		System.out.println("2D matrix is");
		for(int i=0;i<this.n;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println("");
		}
	}
	public void pattern2()
	{
		System.out.println("Orijnal matrix is");
		for(int i=0;i<this.n;i++)//for rows
		{
			for(int j=0;j<this.m;j++)//for columns
			{
				System.out.print(a[i][j]);
			}
			System.out.println("");
		}
		System.out.println("2D matrix is");
		for(int i=0;i<this.n;i++)
		{
			for(int j=0;j<=i;j++)
			{
				if(j<i)
				{
					System.out.print(" ");
				}
				else
				{
					System.out.print(a[i][j]);
				}
			}
			System.out.println("");
		}
	}
	public void sumOfMetrix()
	{
		int sum=0;
		for(int i=0;i<this.n;i++)
		{
			for(int j=0;j<this.m;j++)
			{
				System.out.print(a[i][j]+" ");
				sum+=a[i][j];
			}
		System.out.println("");
		}
		System.out.println("sum of matrix is =  "+sum);
	}
	public void crossPettern()
	{
		int sum =0;
		for (int i=0;i<this.n;i++) 
		{
		 for (int j=0;j<this.m;j++) 
			{
                if (i==j || i+j==5-1) 
				{
                    System.out.print(a[i][j] + " ");
					sum+=a[i][j];
                } 
				else
				{
                    System.out.print("  ");
                }
            }
            System.out.println();
		}
            System.out.println("Sum of matrix is="+sum);
    }
	public void innerElement()
	{
		int sum=0;
		for (int i=0;i<this.n;i++) 
		{
            for (int j=0;j<this.m;j++) 
			{
                if (i==j || i+j==this.n-1) 
				{
                    System.out.print(a[i][j] + " ");
					sum+=a[i][j];
                } 
				else
				{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
		System.out.println("Sum :"+sum);
	}
	public void min()
	{
		int max=a[0][0],i,j=0;
		for(i=0;i<this.n;i++)
		{
			for( j=0;j<this.m;j++)
			{
				if(max<=a[i][j])
				max=a[i][j];
			}
		}
		System.out.println("Maximum value is " +max);
	}
	public void max()
	{
		int max=a[0][0],i,j=0;
		for(i=0;i<this.n;i++)
		{
			for( j=0;j<this.m;j++)
			{
				if(max>=a[i][j])
				max=a[i][j];
			}
		}
		System.out.println("Maximum value is " +max);
	}
}
class Test
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		Array ob = new Array();
		
		System.out.println("Please enter row count");
			int n =sc.nextInt();
		System.out.println("Please enter coloum count");
			int m =sc.nextInt();
			
			ob.setData(n,m);
			ob.inputArray(sc);
			
		boolean exit = false;
		do
		{
			System.out.println("your choices are..");
			System.out.println("press 1 for print an Array");
			System.out.println("press 2 for find transpose");
			System.out.println("press 3 for print pattern1");
			System.out.println("press 4 for print pattern2");
			System.out.println("press 5 for find sum of metrix");
			System.out.println("press 6 for print cross pettern");
			System.out.println("press 7 for print inner metrix");
			System.out.println("press 8 for find minimum");
			System.out.println("press 9 for find maximum");
			System.out.println("press 10 for Exit..");
			System.out.println("Enter your choice");
			int ch = sc.nextInt();
			
			switch(ch)
			{
				case 1 :
					ob.printArray();
					break;
				case 2 :
					ob.transpose();
					break;
				case 3 :
					ob.pattern1();
					break;
				case 4 :
					ob.pattern2();
					break;
				case 5 :
					ob.sumOfMetrix();
					break;
				case 6 :
					ob.crossPettern();
					break;
				case 7 :
					ob.innerElement();
					break;
				case 8 :
					ob.min();
					break;
				case 9 :
					ob.max();
					break;
				case 10 :
				
				exit = true;
		    }
		}
		while(!exit);
		
	}
}