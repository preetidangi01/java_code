import java.util.Scanner;
class Marksheet
{
	private String Name,Fname,Mname,Course,Branch;
	private int Roll,Year,Sem,Physics,Chemistry,Math,English,Hindi,Total;
	private double per;
	
	public void setName(String Name)
	{
		this.name=name;
	}
	public void setFname(String Fname)
	{
		this.Fname=Fname;
	}
	public void setMname(String Mname);
	{
		this.Mname=Mname;
	}
	public void setCourse(String Course)
	{
		this.Course=Course;
	}
	public void setBranch(String Branch)
	{
		this.Branch=Branch;
	}
	public String getName()
	{
		return this.Name;
	}
	public String getFname()
	{
		return this.Fname;
	}
	public String getMname()
	{
		return this.Mname;
	}
	public String getCourse()
	{
		return this.Course;
	}
	public string getBranch()
	{
		return this.Branch;
	}
	public void setRoll(int Roll)
	{
		this.Roll=Roll;
	}
	public void setYear(int Year)
	{
		this.Year=Year;
	}
	public void setSem(int Sem)
	{
		this.Sem=Sem;
	}
	public void setPhysics(int Physics)
	{
		this.Physics=Physics;
	}
	public void setChemistry(int Chemistry)
	{
		this.Chemistry=Chemistry;
	}
	public void setMath(int Math)
	{
		this.Math=Math;
	}
	public void setEnglish(int English)
	{
		this.English=English;
	}	
	public void setHindi(int Hindi)
	{
		this.Hindi=Hindi;
	}
	public void setTotal(int Total)
	{
		this.Total=Total;
	}
	public String getRoll()
	{
		return this.Roll;
	}
	public String getYear()
	{
		return this.Year;
	}
	public String getMname()
	{
		return Mname;
	}
	public String getCourse()
	{
		return Course;
	}
	public String getbranch()
	{
		return Branch;
	}
	public int getRoll()
	{
		return Roll;
	}
	public int getYear()
	{
		return Year;
	}
	public int getSem()
	{
		return Sem;
	}
	public int getPhysics()
	{
		return Physics;
	}
	public int getChemistry()
	{
		return Chemistry;
	}
	public int getMath()
	{
		return Math;
	}
	public int getenglish()
	{
		return English;
	}
	public int getHindi()
	{
		return Hindi;
	}
	public int getTotal()
	{
		return Total;
	}
	public void setPer(double Per)
	{
		this Per=Per;
	}
	public double getPer()
	{
		return this.Per;
	}
}
//BL
class Operation
{
	public void choice(Student student[], int n,operation ob2)
	{
		Scanner sc=new Scanner(System.in);
		int choice,searchRoll;
		boolean flag;
		String searchName;
		do
		{
			flag=true
			System.out.println("ENTER YOUR CHOICE");
			System.out.println("\t1 FOR SEARCH BY ROLL NUMBER");
			System.out.println("\t2 FOR SEARCH BY NAME");
			System.out.println("\t3 FOR SEARCH BY DIVISION");
			System.out.println("\t4 FOR ALL MARKSHEET");
			System.out.println("\t5 FOR EXIT");
			System.out.println("\tENTER YOUR CHOICE :");
			choice =sc.nextInt();
			sc.nextLine();
			switch(choice)
			{
				case 1:
					System.out.println("ENTER YOUR ROLL NUMBER :");
					searchRoll=sc.nextInt():
					for(int i=0; i<n;i++)
					{
						if(student[i].getRollNumber()==searchRoll)
						{
						ob2.display(student,i);
						flag= false;
						break;
					}
				}
				if(flag)
				{
					System.out.println("ENTER ROLL NUMBER NOT EXITS :");
				}
					break;
				case 2:
					System.out.println("ENTER YOUR NAME :");
					searchName=sc.nextLine();
					for(int i=0;i<n;i++)
					{
						if(student[i].getName().equals(searchName))
						{
							ob2.display(students,i);
							flag=false;
						}
					}
					if(flag)
					{
						System.out.println("ENTER NAME NOT EXITS :");
					}
						break;
				case 3:
					ob3.searchDivision(student,n,ob2);
					break;
					
				case 4:
					for(int i=0;i<n;i++)
					{
						ob2.display(student,i);
					}
						break;
			}
		}
		while(choice!=50);
	}
	public void searchDivision(Student student[],int n,operation ob2)
	{
		Scanner sc=new Scanner(System.in);
		boolean flag;
		int choice;
		do
		{
			flag= true;
			System.out.println("ENTER YOUR CHOICEm :");
			System.out.println("\t1 FOR FIRST DIVISION :");
			System.out.println("\t2 FOR SECOND DIVISION :");
			System.out.println("\t3 FOR THIRD DIVISION :");
			System.out.println("\t4 FOR EXITS :");
			System.out.println("\t5 ENTER YOUR CHOICE :");
			choice=sc.nextInt();
			switch(choice)
			{
				case 1:
					for(int i=0;i<n;i++)
					{
						System.out.println(student[i].getPer());
						if(student[i].getPer()>60&&student[i].getPer()<=100&&student[i]
						.getP()>=33&&student[i].getC()>=33&&student[i]
						.getM()>=33&&student[i].getH()>33&&stdent[i].getE()>33)
						{
							ob2.display(student,i);
							flag=false;
						}
					}
					if(flag)
					{
						System.out.println("FIRST DIVISION STUDENT NOT AVILABLE");
					}
						break;
				case 2:
					for(int i=0;i<n;i++)
					{
						if(student[i].getPer()>=45&&student[i].getPer()<60&&student[i]
						.getP()>33&&student[i].getC()>33&&student[i]
						.getM()>33&&student[i].getH()>33&&student[i].getE()>33)
						{
							ob2.display(student,i);
							flag=false;
						}
					}
					if(flag)
					{
						System.out.println("SECOND DIVISION STUDENT NOT AVILABLE");
					}
						break;
				case 3:
					for(int i=0;i<n;i++)
					{
						if(student[i].getPer()>=33&&student[i].getPer()<45&&student[i]
						.getP()>33&&student[i].getC()>33&&student[i]
						.getM()>33&&student[i].getH()>33&&student[i].getE()>33)
						{
							ob2.display(student,i)
							flag=false;
						}
					}
					if(flag)
					{
						System.out.println("THIRD DIVISION STUDENT NOT AVILABLE");
					}
						break;
				
			}	
		}
		while(choice!=4);
	}
	public void display(student std[],int i)
	{
		System.out.println("--------------------------------------------------------------------------------------");
		System.out.println("\t\t\tD.A.V.V.-INDORE");
		System.out.println("--------------------------------------------------------------------------------------");
		System.out.println("Roll No. :"+std[i].getRollNumber()"+\t\t\t\t\t\t"+"Course :"+std[i].getCourse());
		System.out.println("Name    :"+std[i].getName()"+\t\t\t\t\t\t"+"Branch :"+std[i].getBranch());
		System.out.println("FName   :"+std[i].getFname()"+\t\t\t\t\t\t" +"Sem   :"+std[i].getSem());
		System.out.println("Mname   :"+std[i].getMname()"+\t\t\t\t\t\t" +"Year  :"+std[i].getYear());
		System.out.println("--------------------------------------------------------------------------------------");
		System.out.println("|\tSUBCODE			SUBNAME			MAXMARKS		MINIMARKS		OBTMARKS");
		System.out.println("|\tBSC501			PHYSICS			  100			  33			"+std[i].getP());
		System.out.println("|\tBSC502			CHEMITRY		  100			  33			"+std[i].getC());
		System.out.println("|\tBSC503			MATHS			  100			  33			"+std[i].getM());
		System.out.println("|\tBSC504			HINDI			  100			  33			"+std[i].getH());
		System.out.println("|\tBSC505			ENGLISH			  100			  33			"+std[i].getE());
		System.out.println("---------------------------------------------------------------------------------------");
	}	if(std[i].getP()<33&&std[i].getC()<33&&std[i].getM()<33&&std[i].getH()<33&&std[i].getE()<33)
		{
			System.out.println("FAIL IN ALL SUBJECT");
		}
	
}