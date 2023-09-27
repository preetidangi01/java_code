import java.util.Scanner;
class Student
{
	private String name,fname,mname,course,branch;
	private int roll,year,sem,p,c,m,h,e,total;
	private double per;
	public void inputRoll(int n, Student a[],int x,Scanner sc)
	{
		
		boolean y=false;
		System.out.println("Enter your roll no:");
		this.roll=sc.nextInt();
		for(int i=0; i<x; i++)
		{
			if(a[i].roll==this.roll)
			{
				System.out.println("Roll no already exist re-enter roll no");
				y=true;
			}
		}
		if(y)
		{
			this.inputRoll(n,a,x,sc);
		}
	}
	public void input(int n,Student a[],int x)
	{
		Scanner sc=new Scanner(System.in);
		this. inputRoll(n,a,x,sc);
		System.out.println("Enter your name:");
		this.name=sc.next();
		System.out.println("Enter your Father's name:");
		this.fname=sc.next();
		System.out.println("Enter your Mother's name:");
		this.mname=sc.next();
		System.out.println("Enter your Course:");
		this.course=sc.next();
		System.out.println("Enter your Branch");
		this.branch=sc.next();
		System.out.println("Enter your year:");
		this.year=sc.nextInt();
		System.out.println("Enter your sem:");
		this.sem=sc.nextInt();
		do
		{
			System.out.println("Enter the Mark of phycics");
			this.p=sc.nextInt();
			if(this.p<0||this.p>100)
			{
				System.out.println("Invalid Mark of phycics");
			}
		}
		while(this.p<0||this.p>100);
		do
		{
			System.out.println("Enter marks of chemistry");
			this.c = sc.nextInt();
			if(this.c<0||this.c>100)
			{
				System.out.println("Invalid Mark of chemistry");
			}
		}
		while(this.c<0||this.c>100);
		do
		{
			System.out.println("Enter marks of mathes");
			this.m = sc.nextInt();
			if(this.m<0||this.m>100)
			{
				System.out.println("Invalid Mark of Mathes");
			}
		}
		while(this.m<0||this.m>100);
		do
		{
			System.out.println("Enter marks of Hindi");
			this.h = sc.nextInt();
			if(this.h<0||this.h>100)
			{
			    System.out.println("Invalid Mark of Hindi");
			}
		}
		while(this.h<0||this.h>100);
		do
		{
			System.out.println("Enter marks of English");
			this.e = sc.nextInt();
			if(this.e<0||this.e>100)
			{
			    System.out.println("Invalid Mark of English");
			}
		}
		while(this.e<0||this.e>100);
	
			total=(p+c+m+h+e);
			per=(total)/5;
			System.out.println("Percentage= "+per);
	}
	public void display(int x)
	{
	  System.out.println("\t\t\tRGPV");
	  System.out.println("----------------------------------------------------------------------");
	  System.out.println("Roll no. :"+roll+"\t\t\t\t\t\t" +"Course :"+course);
      System.out.println("Name    :"+name+"\t\t\t\t\t\t" +"Branch :"+branch);
	  System.out.println("FName   :"+fname+"\t\t\t\t\t\t" +"Sem    :"+sem);
	  System.out.println("MName   :"+mname+"\t\t\t\t\t\t" +"Year   :"+year);
	  System.out.println("----------------------------------------------------------------------");
	  System.out.println("|\tSubCode      SubName       MaxMarks      MinMarks      ObtMark");
	  System.out.println("|\tcs101       Physics        100            33            "+p );
	  System.out.println("|\tcs102       Chemistry      100            33            "+c );			
	  System.out.println("|\tcs103       Maths          100            33            "+m );
	  System.out.println("|\tcs104       Hindi          100            33            "+h );
	  System.out.println("|\tcs105       English        100            33            "+e );
	  System.out.println("-----------------------------------------------------------------------\n");
		
		if(p<33 && c<33 && m<33 && h<33 && e<33 )
		{
			System.out.println("fail in all subjects");
		
			else if((p<33 && c<33 && m<33 && h<33)||(p<33 && c<33 && h<33 && e<33)||(c<33 && m<33 && h<33 && e<33)|| (c<33 && m<33 && e<33 && p<33)||(h<33 && m<33 && e<33 && p<33))
			{
				System.out.println("Fail in 4 sub phy,math,hindi,eng ");
			}
			if(h<33 && m<33 && e<33 && p<33)
			{
				System.out.println("Fail in 4 sub phy,math,hindi,eng ");
			}
			else if(c<33 && m<33 && e<33 && p<33)
			{
				System.out.println("Fail in 4 sub phy, che,math,eng ");
			}
			else if(c<33 && m<33 && h<33 && e<33)
			{
				System.out.println("Fail in 4 sub eng, che,math,hindi ");
			}
			else if(p<33 && c<33 && h<33 && e<33)
			{
				System.out.println("Fail in 4 sub phy, che,hindi,eng ");
			}
			else
			{
				System.out.println("Fail in 4 sub phy, che,hindi,math ");
			}
		}	
		else if ((p<33&&c<33&&m<33)||(p<33&&h<33&&e<33)||(p<33&&c<33&&h<33)||(p<33&&c<33&&e<33)||(p<33&&h<33&&m<33)||(p<33&&m<33&&e<33)||(c<33&&m<33&&h<33)||(c<33&&m<33&&e<33)||(c<33&&h<33&&e<33)||(m<33&&h<33&&e<33))
		{ 
				System.out.println("Fail in three sub");
			if(p<33&&c<33&&m<33)
		    {
				System.out.println("Fail in sub math,chem,eng");
			}
			else if(p<33&&h<33&&e<33)
			{
				System.out.println("Fail in sub phy,hindi,eng");
			} 
			else if(h<33&&p<33&c<33)
			{
				System.out.println("Fail in sub hindi,chem,phy");
			}
			else if(c<33&&p<33&&e<33)
			{
				System.out.println("Fail in sub chem,eng,phy");
			}
			else if(p<33&&h<33&&m<33)
			{  
				System.out.println("Fail in sub phy,hindi,math");
			}
			 else if(p<33&&m<33&&e<33)
			{  
				System.out.println("Fail in sub phy,eng,math");
			}
			 else if(c<33&&h<33&&m<33)
			{  
				System.out.println("Fail in sub chem,hindi,math");
			}
			 else if(c<33&&e<33&&m<33)
			{  
				System.out.println("Fail in sub chem,eng,math");
			}
			 else if(c<33&&h<33&&e<33)
			{  
				System.out.println("Fail in sub chem,hindi,eng");
			}
			 else //if(m<33&&h<33&&e<33)
			{  
				System.out.println("Fail in sub math,hindi,eng");
			}
		}   
		else if((p<33&&c<33)||(p<33&&m<33)||(p<33&&h<33)||(p<33&&e<33)||(c<33&&m<33)||(c<33&&e<33)||(m<33&&h<33)||(m<33&&e<33)||(h<33&&e<33))
		{ 
				System.out.println("Fail in two subject");
			if(p<33&&c<33)
				System.out.println("Fail in phy,chem");
			else if(p<33&&m<33)
				System.out.println("Fail in phy,math");
			else if(p<33&&h<33)
				System.out.println("Fail in phy,hindi");
			else if(p<33&&e<33)
				System.out.println("Fail in phy,eng");
			else if(c<33&&m<33)
				System.out.println("Fail in chem,math");
			else if(c<33&&e<33)
				System.out.println("Fail in chem,eng");
			else if(m<33&&h<33)
				System.out.println("Fail in hindi,math");
			else if(m<33&&e<33)
				System.out.println("Fail in eng,math");
			else if(h<33&&e<33)
				System.out.println("Fail in hindi,eng");
		}
		else if(p<33 || c<33 || m<33 || h<33 || e<33)
		{
				System.out.println("Fail in one subject");
			if(p<33)
			{
					System.out.println("Fail in phy");
				else if(c<33)
					System.out.println("Fail in chem");
				else if(m<33)
					System.out.println("Fail in math");
				else if(h<33)
					System.out.println("Fail in hindi");
				else if(e<33)
					System.out.println("Fail in eng");
			}
			else 
			{
				System.out.println("Pass in all Subject");
			}
		}
		else 
		{
			System.out.println("pass in all subjact");
			total=(p+c+m+h+e);
			per=(total)/5;
			System.out.println("Percentage= "+per);
		}
		if(per>=60)
			System.out.println("1st Division.....");
		else if(per>=45)
			System.out.println("2nd Division.....");
		else if(per>=33)
			System.out.println("3rd Division.....");
			System.out.println("----------------------------------------------------------------");
	}		
}
class Test
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("How many record you want to enter:");
		int n=sc.nextInt();
		Student s[]= new Student[n];
		for(int i=0;i<n;i++)
		{
			s[i]=new Student();
			//s[i].inputRoll(n,s,sc);
			s[i].input(n,s,i);
		}
		for(int i=0; i<n; i++)
		{
			for(int x=i;x<=i;x++)
			{
				s[i].display(x);
			}
		}	
	}
}