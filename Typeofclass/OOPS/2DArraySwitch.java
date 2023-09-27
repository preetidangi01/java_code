import java.util.Scanner;
class Array
{
	private int row;
	private int col;
	private int a[][];
	private int b[][] = new int[5][5];
	Scanner sc = new Scanner(System.in);
	private int row1;
	private int col1;
	public void setData(int a[][], int row, int col)
	{
		this.a=a;
        this.row=row;
		this.col =col;  
	}
	public void setData1(int b[][], int row1, int col1)
	{
		this.b=b;
       	this.row1=row1;
		this.col1 =col1;  
	}
	public int[][] input1()
	{
		for(int i=0;i<this.row1; i++)
	    {
			for(int j=0;j<this.col1; j++)
	            b[i][j] = this.sc.nextInt();
	    }
			
	  	return b;
	}
	public int[][] print()
	{
     	System.out.println("Actual matrix :"); 
	    for(int i=0; i<this.row; i++)
	    {
	        for(int j=0; j<this.col; j++)
	        {
				System.out.print("\t"+a[i][j]);
	        }
	         	System.out.println();
	    }
	    return a;
	}
	public int max()
	{
	    int max=a[0][0];
	    for(int i=0; i<this.row; i++)
	  	{
	        for(int j=0; j<this.col; j++)
	     	{
	       		if(max<a[i][j])
	         	max = a[i][j];
	     	}
	  	}
	  	return max;
	}
	public int min()
	{
	       	int min = a[0][0];
	       	for(int i=0; i<this.row; i++)
	      	{
	         	for(int j=0; j<this.col; j++)
	         	{
	            	if(min>a[i][j])
	            	min = a[i][j];
	         	}
	      	}
		return min;
	}
	public void colascending()
	{
	    for(int i=0;i<this.row;i++)
        {
            for(int j=0;j<(this.col-1);j++)
            {  
                for(int k=0;k<(this.col-1);k++)
                {
                    if(a[k][i]>a[k+1][i]) 
                    {
                        int temp=a[k+1][i];
                        a[k+1][i]=a[k][i];
                        a[k][i]=temp; 
                    }
						
                }
               	
			} 
	    }
	    System.out.println("After arranging");
	    this.print();
	}
	public void add()
	{
	    int c [][] = new int[100][100];
	    System.out.println("Enter number of rows of second matrix");
	    this.row1 = this.sc.nextInt();
	    System.out.println("Enter number of column of second matrix");
	    this.col1 = this.sc.nextInt();
	  	
			
	    if(this.row==this.row1 && this.col==this.col)
	    {  
			this.b =this.input1();
		 	this.a = this.print(); 
			this.a=b;
		 	this.a = this.print();
		 
		 	System.out.println("Sum of A and B Matrix = ");
            for(int i=0; i<this.row; i++)
            {
                for(int j=0; j<this.col; j++)
                {
                    c[i][j] = a[i][j] + this.b[i][j];
                    System.out.print(" \t"+c[i][j]);
                }
                System.out.println("");
            }        
	    }
	    else 
	    System.out.println("\t\tplease enter same dimension");
	}
	public int secmax()
	{
		int max = a[0][0];
        int max2 =a[0][1]; 
	    for(int i=0; i<this.row; i++)	
	    {
	        for(int j=0; j<this.col; j++)
	        {
	            if(max<a[i][j])
	            {
	                max2  = max;
	                max = a[i][j];
	            }
	            else if(max==max2 || (max>a[i][j])&&(max2<a[i][j]))
	            max2 = a[i][j];
	           	
			}
	    }
		return max2;
	}
	public int upper ()
	{
	   	int sum = 0;
	     
	    if(this.col!=this.row)
		{
	        System.out.println("Please enter same dimension");
	    }
	    else
	    {
		    System.out.println("your pattern is :");
	        for(int i=0; i<this.row; i++)
	        {
	            for(int k =0; k<=i-1; k++)
	                System.out.print("\t"+" ");

				for(int j = i; j<this.col; j++)
	            {
	               	System.out.print("\t"+a[i][j]);
	               	sum = sum+a[i][j];
	            }
		     	System.out.println();
	        }
	   }
	   return sum;
	}
	public int lower()
	{
	    int sum =0;
	    if(row!=col)
	    {
	        System.out.println("Please enter same dimension");
	    }
	    else
	    {
	        System.out.println("your pattern is :");
	        for(int i=0; i<row; i++)
	        {
	            for(int j =0; j<=i; j++)
	            {
	               	sum = sum+a[i][j];
	               	System.out.print(a[i][j]+"\t");
	            }
	            System.out.println();
	        }
	      	
		}
	    return sum;
	}
	public void multi()
	{
	    int b[][] = new int[100][100];
	    int c [][] = new int[100][100];
	    System.out.println("Enter number of rows of second matrix");
	    int row1 = this.sc.nextInt();
	    System.out.println("Enter number of column of second matrix");
	    int col1 = this.sc.nextInt();
	  	this.setData1(b, row1, col1);
			
	    if(row==col1)
	    {  
			this.input1();
			//int az[][] = this.sc.print(); 
			//int ax[][] = this.sc.print();
		 
		 	System.out.println("multiply of A and B Matrix = ");
            for(int i=0; i<row; i++)
            {
                for(int j=0; j<col1; j++)
                {
					c[i][j]=0;
                    for(int k=0;k<col;k++)
                    {
                        c[i][j]=c[i][j]+a[i][k]*b[k][j];
					}
                }
			}      
		 	this.a=c;
		 	a=this.print();          
	    }
	    else 
	    System.out.println("\t\tplease enter same dimension");
	}
	public int cross()
	{
		int sum = 0;
	    for(int i=0; i<row; i++)
	    {
	       	for(int j =0; j<col; j++)
	       	{
	         	if(j==i||i+j==(row-1))
	         	{
	           		sum = sum+a[i][j];
	           		System.out.print(a[i][j]+" ");
	         	}
	         	else
	         	System.out.print("  ");
	       	}
	       	System.out.println();
	    }
	    return sum;
	}
	public void swas()
	{
		System.out.println("Your pattern is:");
		for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            { 
                int x=row/2;
                if(i==j||i+j==(row-1)||i+j==x+i)
                {	
                    System.out.print("\t"+a[i][j]);
                }              
                else
                System.out.print("\t");
            }
            System.out.println();
        }
	}
	public void square()
	{
		System.out.println("Your pattern is:");
		for(int i=0; i<row; i++)
	    {
	        for(int j=0; j<col; j++)
	        {
	            if(i!=0 && j!=0 && i!=row-1 && j!=col-1)
	            {
	              	System.out.print(a[i][j]+"\t");
	            }
	            else
	            System.out.print("\t");
	        }
	        System.out.println();
	    }
	}
}
class Test
{
	public static void main(String args[])
	{
		Array ob = new Array();
		Scanner sc = new Scanner(System.in);
		int ch;
	    do
	    {
   	        System.out.println("your choices are:");
	        System.out.println("press 1 for print an array");
	        System.out.println("press 2 to find maximum element in an array");
	        System.out.println("press 3 to find minimum element in an array");
		    System.out.println("press 4 to arrange column in ascending order");
		    System.out.println("press 5 to get the sum of 2 matrix");
		    System.out.println("press 6 to find second maximum element in an array");
	    	System.out.println("press 7 for upper triangular matrix ");
		    System.out.println("press 8 for lower triangular matrix");
		    System.out.println("press 9 for multiplication of 2 matrix ");
		    System.out.println("press 10 for cross pattern");
		    System.out.println("press 11 for pattern");
		    System.out.println("press 12 for square");
		    System.out.println("press 13  to exit");
	        System.out.println("Enter your choice");
            ch = sc.nextInt();
			int a[][] = new int[5][5];
			System.out.println("Enter number of rows");
	        int row = sc.nextInt();
	        System.out.println("Enter number of column");
	        int col = sc.nextInt();
			System.out.println("Enter your elements");	
	        for(int i=0;i<row; i++)
	        {
				for(int j=0;j<col; j++)
					a[i][j] = sc.nextInt();
	        }
			switch(ch)
	        {
				case 1 :   	 
					ob.setData(a,row,col);
					int k[][]=ob.print();
					break;
				case 2 :    
					ob.setData(a,row,col);
					int w[][]=ob.print();
					System.out.println("Maximum number of array is:"+ob.max());
					break;
				case 3 :    
					ob.setData(a,row,col);
					int x[][]=ob.print();
					System.out.println("Minimum number of array is:"+ob.min());
					break;
				case 4 :     
					ob.setData(a,row,col);
					int y[][]=ob.print();
					ob.colascending();
					break; 
				case 5 :     
					ob.setData(a,row,col);
					ob.add();
					break;
				case 6 :  
					ob.setData(a,row,col);
					int zs[][]=ob.print();
					System.out.println("Minimum number of array is:"+ob.secmax());
					break;
				case 7 :    
					ob.setData(a,row,col);
					System.out.println("Sum of matrix is :"+ob.upper());
					break;
				case 8 : 
					ob.setData(a,row,col);
					System.out.println("Sum of matrix is :"+ob.lower());
					break;
				case 9 :     
					ob.setData(a,row,col);
					ob.multi();
					break;
				case 10 :  
					ob.setData(a,row,col);
					int ms[][]=ob.print();
					System.out.println("Sum  of pattern is:"+ob.cross());
					break;
				case 11 : 
					ob.setData(a,row,col);
					int sm[][]=ob.print();
					ob.swas();
					break;
				case 12 : 
					ob.setData(a,row,col);
					int sh[][]=ob.print();
					ob.square();
					break;
			}
		}
		while(ch!=13); 
	}
}
