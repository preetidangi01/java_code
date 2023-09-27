import java.util.Scanner;
class Student
{
	private String name,fname,mname,course,branch;
	private int roll,year,sem,p,c,m,h,e,total;
	private double per;
	
	public void setName(String name)
	{
		this.name=name;
	}
	public void setFname(String fname)
	{
		this.fname=fname;
	}
	public void setMname(String mname)
	{
		this.mname=mname;
	}
	public void setCourse(String course)
	{
		this.course=course;
	}
	public void setBranch(String branch)
	{
		this.branch=branch;
	}
	public String getName()
	{
		return this.name;
	}
	public String getFname()
	{
		return this.fname;
	}
	public String getMname()
	{
		return this.mname;
	}
	public String getCourse()
	{
		return this.course;
	}
	public String getBranch()
	{
		return this.branch;
	}
	public void setRoll(int roll)
	{
		this.roll=roll;
	}
	public void setYear(int year)
	{
		this.year=year;
	}
	public void setSem(int sem)
	{
		this.sem=sem;
	}
	public void setP(int p)
	{
		this.p=p;
	}
	public void setC(int c)
	{
		this.c=c;
	}
	public void setM(int m)
	{
		this.m=m;
	}
	public void setH(int h)
	{
		this.h=h;
	}
	public void setE(int e)
	{
		this.e=e;
	}
	public int setTotal(int total)
	{
		return this.total=total;
	}
	public int getRollNumber()
	{
		return this.roll;
	}
	public int getYear()
	{
		return this.year;
	}
	public int getSem()
	{
		return this.sem;
	}
	public int getP()
	{
		return this.p;
	}
	public int getC()
	{
		return this.c;
	}
	public int getM()
	{
		return this.m;
	}
	public int getH()
	{
		return this.h;
	}
	public int getE()
	{
		return this.e;
	}
	public int getTotal()
	{
		return this.total;
	}
	public void setPer(double per)
	{
		this.per=per;
	}
	public double getPer()
	{
		return this.per;
	}
}
//BL CLASS
class operation
{
	public void choice(Student student[],int n,operation ob2) 
    { 
		Scanner sc = new Scanner(System.in); 
		int choice,searchRoll; 
        boolean flag; 
        String searchName; 
		do 
		{ 
			flag = true; 
			System.out.println("YOUR CHOICE"); 
			System.out.println("\t1 FOR SEARCH BY ROLL NUMBER"); 
			System.out.println("\t2 FOR SEARCH BY NAME"); 
			System.out.println("\t3 FOR SEARCH BY DIVISION"); 
			System.out.println("\t4 FOR ALL MARKSHEET"); 
			System.out.println("\t5 FOR EXIT"); 
			System.out.print("\tENTER YOUR CHOICE : "); 
			choice = sc.nextInt(); 
			sc.nextLine(); 
			switch(choice) 
			{ 
				case 1: 
					System.out.print("ENTER YOUR ROLL NUMBER : "); 
					searchRoll = sc.nextInt(); 
					for(int i=0;i<n;i++) 
					{ 
						if(student[i].getRollNumber()==searchRoll) 
						{ 
							ob2.display(student,i); 
							flag = false; 
							break; 
						} 
					} 
					if(flag)
					{
						System.out.print("ENTER ROLL NUMBER NOT EXITS: "); 
					}	
					break;
				case 2:
					System.out.print("ENTER YOUR NAME : "); 
					searchName = sc.nextLine(); 
					for(int i=0;i<n;i++) 
					{ 
						if(student[i].getName().equals(searchName)) 
						{ 
							ob2.display(student,i); 
							flag = false; 
						} 
					} 				
					if(flag)
					{
						System.out.print("ENTER NAME NOT EXITS: "); 
					}	
					break;
				case 3: 
						ob2.searchDivision(student,n,ob2); 
                        break; 
				case 4: 
					for(int i=0;i<n;i++) 
					{ 
						ob2.display(student,i); 
					} 
					break;	
			}
		}while(choice!=50);
	}
	public void searchDivision(Student student[],int n,operation ob2)
	{ 
		Scanner sc = new Scanner(System.in); 
		boolean flag; 
		int choice; 
		do 
		{ 
			flag = true; 
			System.out.println("YOUR CHOICE"); 
			System.out.println("\t1 FOR FIRST DIVISION"); 
			System.out.println("\t2 FOR SECOND DIVISION"); 
			System.out.println("\t3 FOR THIRD DIVISION"); 
			System.out.println("\t4 FOR EXIT"); 
			System.out.print("\tENTER YOUR CHOICE : "); 
			choice = sc.nextInt(); 
			switch(choice) 
			{ 
				case 1: 
					for(int i=0;i<n;i++) 
					{ 
						System.out.println(student[i].getPer());
						if(student[i].getPer()>=60&&student[i].getPer()<=100&&student[i].getP()>33&&student[i].getC()>33&&student[i].getM()>33&&student[i].getH()>33&&student[i].getE()>33) 
						{ 
							ob2.display(student,i); 
							flag = false; 
						} 
					} 
					if(flag) 
					{ 
						
						System.out.println("FIRST DIVISION STUDENT NOT AWAILAVEL"); 
					} 
					break; 
				case 2: 
					for(int i=0;i<n;i++) 
					{ 
						if(student[i].getPer()>=45&&student[i].getPer()<60&&student[i].getP()>33&&student[i].getC()>33&&student[i].getM()>33&&student[i].getH()>33&&student[i].getE()>33) 
						{ 
							ob2.display(student,i); 
							flag = false; 
						} 
					} 
					if(flag) 
					{ 
						System.out.println("SECOND DIVISION STUDENT NOT AWAILAVEL"); 
					}	 
					break; 
				case 3: 
					for(int i=0;i<n;i++) 
					{ 
						if(student[i].getPer()>=33&&student[i].getPer()<45&&student[i].getP()>33&&student[i].getC()>33&&student[i].getM()>33&&student[i].getH()>33&&student[i].getE()>33) 
						{ 
							ob2.display(student,i); 
							flag = false; 
						} 
					} 
					if(flag) 
					{ 
						System.out.println("THIRD DIVISION STUDENT NOT AWAILAVEL"); 
					}
			}
		}while(choice!=4); 
	}	
	public void display(Student std[], int i)
	{
		System.out.println("----------------------------------------------------------------------");
		System.out.println("\t\t\tS.S.I.S.M");
		System.out.println("----------------------------------------------------------------------");
		System.out.println("Roll no. :"+std[i].getRollNumber()+"\t\t\t\t\t\t" +"Course :"+std[i].getCourse());
		System.out.println("Name    :"+std[i].getName()+"\t\t\t\t\t\t" +"Branch :"+std[i].getBranch());
		System.out.println("FName   :"+std[i].getFname()+"\t\t\t\t\t\t" +"Sem    :"+std[i].getSem());
		System.out.println("MName   :"+std[i].getMname()+"\t\t\t\t\t\t" +"Year   :"+std[i].getYear());
		System.out.println("----------------------------------------------------------------------");
		System.out.println("|\tSUBCODE      SUBNAME       MAXMARKS      MINMARKS      OBTMARKS");
		System.out.println("|\tBSC101       PHYSICS        100            33            "+std[i].getP());
		System.out.println("|\tBSC102       CHEMISTRY      100            33            "+std[i].getC());			
		System.out.println("|\tBSC103       MATHS          100            33            "+std[i].getM());
		System.out.println("|\tBSC104       HINDI          100            33            "+std[i].getH());
		System.out.println("|\tBSC105       ENGLISH        100            33            "+std[i].getE());
		System.out.println("-----------------------------------------------------------------------\n");
		if(std[i].getP()<33 && std[i].getC()<33 && std[i].getM()<33 && std[i].getH()<33 && std[i].getE()<33 )
		{
			System.out.println("FAIL IN ALL SUBJECT");
		}
		else if((std[i].getP()<33 && std[i].getC()<33 && std[i].getM()<33 && std[i].getH()<33)||(std[i].getP()<33 && std[i].getC()<33 && std[i].getH()<33 && std[i].getE()<33)||(std[i].getC()<33 && std[i].getM()<33 && std[i].getH()<33 && std[i].getE()<33)|| (std[i].getC()<33 && std[i].getM()<33 && std[i].getE()<33 && std[i].getP()<33)||(std[i].getH()<33 && std[i].getM()<33 && std[i].getE()<33 && std[i].getP()<33))
		{
			System.out.println("Fail in 4 sub phy,math,hindi,eng ");
			if(std[i].getH()<33 && std[i].getM()<33 && std[i].getE()<33 && std[i].getP()<33)
			{
				System.out.println("Fail in 4 sub phy,math,hindi,eng ");
			}
			else if(std[i].getC()<33 && std[i].getM()<33 && std[i].getE()<33 && std[i].getP()<33)
			{
				System.out.println("Fail in 4 sub phy, che,math,eng ");
			}
			else if(std[i].getC()<33 && std[i].getM()<33 && std[i].getH()<33 && std[i].getE()<33)
			{
				System.out.println("Fail in 4 sub eng, che,math,hindi ");
			}
			else if(std[i].getP()<33 && std[i].getC()<33 && std[i].getH()<33 && std[i].getE()<33)
			{
				System.out.println("Fail in 4 sub phy, che,hindi,eng ");
			}
			else
			{
				System.out.println("Fail in 4 sub phy, che,hindi,math ");
			}
		}
		else if ((std[i].getP()<33&&std[i].getC()<33&&std[i].getM()<33)||(std[i].getP()<33&&std[i].getH()<33&&std[i].getE()<33)||(std[i].getP()<33&&std[i].getC()<33&&std[i].getH()<33)||(std[i].getP()<33&&std[i].getC()<33&&std[i].getE()<33)||(std[i].getP()<33&&std[i].getH()<33&&std[i].getM()<33)||(std[i].getP()<33&&std[i].getM()<33&&std[i].getE()<33)||(std[i].getC()<33&&std[i].getM()<33&&std[i].getH()<33)||(std[i].getC()<33&&std[i].getM()<33&&std[i].getE()<33)||(std[i].getC()<33&&std[i].getH()<33&&std[i].getE()<33)||(std[i].getM()<33&&std[i].getH()<33&&std[i].getE()<33))
		{ 
			System.out.println("Fail in three sub");
			if(std[i].getP()<33&&std[i].getC()<33&&std[i].getM()<33)
			{
				System.out.println("Fail in sub math,chem,eng");
			}
			else if(std[i].getP()<33&&std[i].getH()<33&&std[i].getE()<33)
			{
				System.out.println("Fail in sub phy,hindi,eng");
			} 
			else if(std[i].getH()<33&&std[i].getP()<33&std[i].getC()<33)
			{
				System.out.println("Fail in sub hindi,chem,phy");
			}
			else if(std[i].getC()<33&&std[i].getP()<33&&std[i].getE()<33)
			{
				System.out.println("Fail in sub chem,eng,phy");
			}
			else if(std[i].getP()<33&&std[i].getH()<33&&std[i].getM()<33)
			{  
				System.out.println("Fail in sub phy,hindi,math");
			}
			else if(std[i].getP()<33&&std[i].getM()<33&&std[i].getE()<33)
			{  
				System.out.println("Fail in sub phy,eng,math");
			}
			else if(std[i].getC()<33&&std[i].getH()<33&&std[i].getM()<33)
			{  
				System.out.println("Fail in sub chem,hindi,math");
			}
			else if(std[i].getC()<33&&std[i].getE()<33&&std[i].getM()<33)
			{  
				System.out.println("Fail in sub chem,eng,math");
			}
			else if(std[i].getC()<33&&std[i].getH()<33&&std[i].getE()<33)
			{  
				System.out.println("Fail in sub chem,hindi,eng");
			}
			else 
			{  
				System.out.println("Fail in sub math,hindi,eng");
			}
		}   
		else if((std[i].getP()<33&&std[i].getC()<33)||(std[i].getP()<33&&std[i].getM()<33)||(std[i].getP()<33&&std[i].getH()<33)||(std[i].getP()<33&&std[i].getE()<33)||(std[i].getC()<33&&std[i].getM()<33)||(std[i].getC()<33&&std[i].getE()<33)||(std[i].getM()<33&&std[i].getH()<33)||(std[i].getM()<33&&std[i].getE()<33)||(std[i].getH()<33&&std[i].getE()<33))
		{ 
				System.out.println("Fail in two subject");
			if(std[i].getP()<33&&std[i].getC()<33)
				System.out.println("Fail in phy,chem");
			else if(std[i].getP()<33&&std[i].getM()<33)
				System.out.println("Fail in phy,math");
			else if(std[i].getP()<33&&std[i].getH()<33)
				System.out.println("Fail in phy,hindi");
			else if(std[i].getP()<33&&std[i].getE()<33)
				System.out.println("Fail in phy,eng");
			else if(std[i].getC()<33&&std[i].getM()<33)
				System.out.println("Fail in chem,math");
			else if(std[i].getC()<33&&std[i].getE()<33)
				System.out.println("Fail in chem,eng");
			else if(std[i].getM()<33&&std[i].getH()<33)
				System.out.println("Fail in hindi,math");
			else if(std[i].getM()<33&&std[i].getE()<33)
				System.out.println("Fail in eng,math");
			else
				System.out.println("Fail in hindi,eng");
			}
		else if(std[i].getP()<33 || std[i].getC()<33 || std[i].getM()<33 || std[i].getH()<33 || std[i].getE()<33)
		{
			System.out.println("Fail in one subject");
			if(std[i].getP()<33)
				System.out.println("Fail in phy");
			else if(std[i].getC()<33)
				System.out.println("Fail in chem");
			else if(std[i].getM()<33)
				System.out.println("Fail in math");
			else if(std[i].getH()<33)
				System.out.println("Fail in hindi");
			else if(std[i].getE()<33)
				System.out.println("Fail in eng");
		}
		else 
		{
			System.out.println("pass in all subjact");
			
			System.out.println("Percentage= "+std[i].getPer());
		}
		if(std[i].getPer()>=60)
		{
			System.out.println("1st Division.....");
		}
		else if(std[i].getPer()>=45)
		{
			System.out.println("2nd Division.....");
		}
		else if(std[i].getPer()>=33)
		{
			System.out.println("3rd Division.....");
		}
		System.out.println("----------------------------------------------------------------");
	} 
}
class Test
{
	public int inputRoll(int n, Student a[],int x,Scanner sc)
	{
		int roll;
		boolean flag=false;
		
		System.out.println("Enter your roll no:");
		roll=sc.nextInt();
		for(int i=0; x>0&&i<x; i++)
		{
			if(a[i].getRollNumber()==roll)
			{
				System.out.println("Roll no already exist re-enter roll no");
				flag=true;
			}
		}
		if(flag)
		{
			roll = inputRoll(n,a,x,sc);
		}
		return roll;
	}
	public void input(int n,Student std[],int i,Test ob, operation op)
	{
		String name,fname,mname,course,branch;
		int roll ,year,sem,p,c,m,h,e,total;
		Scanner sc=new Scanner(System.in);
		roll = ob.inputRoll(n,std,i,sc);
		std[i].setRoll(roll);
		System.out.println("Enter your name:");
		name=sc.next();
		std[i].setName(name);
		System.out.println("Enter your Father's name:");
		fname=sc.next();
		std[i].setFname(fname);
		System.out.println("Enter your Mother's name:");
		mname=sc.next();
		std[i].setMname(mname);
		System.out.println("Enter your Course:");
		course=sc.next();
		std[i].setCourse(course);
		System.out.println("Enter your Branch");
		branch=sc.next();
		std[i].setBranch(branch);
		System.out.println("Enter your year:");
		year=sc.nextInt();
		std[i].setYear(year);
		System.out.println("Enter your sem:");
		sem=sc.nextInt();
		std[i].setSem(sem);
	  do
	   {
		   System.out.println("Enter the Mark of phycics");
		   p=sc.nextInt();
		   std[i].setP(p);
		   if(p<0||p>100)
			System.out.println("Invalid Mark of phycics");
	   }
	   while(p<0||p>100);
		 
		do
		{
			System.out.println("Enter marks of chemistry");
			c = sc.nextInt();
			std[i].setC(c);
			if(c<0||c>100)
				System.out.println("Invalid Mark of chemistry");
		}
		while(c<0||c>100);
		
		do
		{
			System.out.println("Enter marks of mathes");
			m = sc.nextInt();
			std[i].setM(m);
			if(m<0||m>100)
				System.out.println("Invalid Mark of Mathes");
		}
		while(m<0||m>100);
				
		do
		{
			System.out.println("Enter marks of Hindi");
			h = sc.nextInt();
			std[i].setH(h);
			if(h<0||h>100)
			    System.out.println("Invalid Mark of Hindi");
		}
		while(h<0||h>100);
					
		do
		{
			System.out.println("Enter marks of English");
			e = sc.nextInt();
			std[i].setE(e);
			if(e<0||e>100)
			    System.out.println("Invalid Mark of English");
		}
		while(e<0||e>100);
		std[i].setTotal(std[i].getP()+std[i].getC()+std[i].getM()+std[i].getE()+std[i].getH());
		std[i].setPer(std[i].getTotal()/5.0);
	}
	
	public static void main(String args[])
	{
		Test ob=new Test();
		Scanner sc=new Scanner(System.in);
		operation op = new operation();
		System.out.println("How many record you want to enter:");
		int n=sc.nextInt();
		Student s[]= new Student[n];
		for(int i=0;i<n;i++)
		{
			s[i]=new Student();
			ob.input(n,s,i,ob,op);
		}
		op.choice(s,n,op);
	}
}