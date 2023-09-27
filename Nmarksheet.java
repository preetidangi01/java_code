import java.util.Scanner;
class Nmarksheet
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int i=1;
		System.out.println("Enter how many Marksheet you have :");
		int no=sc.nextInt();
		
		while(i<=no)
		{
			sc.nextLine();
			System.out.println("Enter your name");
			String name=sc.nextLine();
			System.out.println("Enter your roll");
			String ro=sc.nextLine();
			System.out.println("Enter your Fname");
			String Fn=sc.nextLine();
			System.out.println("Enter your Mname");
			String Mn=sc.nextLine();
			System.out.println("Enter your Course");
			String co=sc.nextLine();
			System.out.println("Enter your branch");
			String bran=sc.nextLine();
			System.out.println("Enter your year");
			String yr=sc.nextLine();
			System.out.println("Enter your Sem");
			String sem=sc.nextLine();
			
			
			System.out.println("Enter physics marks");
			int p=sc.nextInt();
			System.out.println("Enter chemistry marks");
			int c=sc.nextInt();
			System.out.println("Enter maths marks");
			int m=sc.nextInt();
			System.out.println("Enter english marks");
			int e=sc.nextInt();
			System.out.println("Enter hindi marks");
			int h=sc.nextInt();
			
			
			int total=p+c+m+e+h;
			float per=(total)/5f;
			boolean x=false;
			
			
			System.out.println("\n\n\t\t\t\t\t\tRGPV-INDORE\n\n");
			System.out.println("\tStudent name:"+name+"\t\t\t\t\t Course:"+co);
			System.out.println("\tRoll number :"+ro+"\t\t\t\t\t\t Branch  :"+bran);
			System.out.println("\tFather name :" +Fn+"\t\t\t\t\t Sem  :"+sem);
			System.out.println("\tMother name :"+Mn+"\t\t\t\t\t Year    :"+yr);
			System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\n");
			System.out.println("\tSubCode  SubName  MaxMark  MinimumMax  ObtMarks\n");
			System.out.println("\tCSE-501  Physics    100        33\t"+p);
			System.out.println("\tCSE-502  Chemistry  100        33\t"+c);
			System.out.println("\tCSE-503  maths      100        33\t"+m);
			System.out.println("\tCSE-504  english    100        33\t"+e);
			System.out.println("\tCSE-505  hindi      100        33\t"+h);
			System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\n");
			
			
			System.out.println("\t Percantage :"+per);
		System.out.println("\t Grand total:"+total);
		
		if(p<=33)
		{	
			if(c<=33)
			{
				if(m<=33)
				{
					if(e<33)
					{
						if(h<=33)
						{
							System.out.println("\tfail in all subject");
						}
						else
						{
							System.out.println("fail in physics,chemistry,maths,english");
						}
					}
					else
					{
						if(h<=33)
						{
							System.out.println("fail in physics,chemistry,maths,hindi");	
						}
						else
						{
							System.out.println("fail in physics,chemistry,maths");
						}
					}
				}
				else
				{
					if(e<=33)
					{
						if(h<=33)
						{
							System.out.println("fail in physics,chemistry,english,hindi");
						}
						else
						{
							System.out.println("fail in physics,chemistry,english");
						}
					}
					else
					{
						if(h<=33)
						{
							System.out.println("fail in physics,chemistry,hindi");
						}
						else
						{
							System.out.println("fail in physics,chemistry");
						}
					}
				}
				
			}
			else
			{
				if(m<=33)
				{
					if(e<=33)
					{
						if(h<=33)
						{
							System.out.println("fail in physics,maths,english,hindi");
						}
						else
						{
							System.out.println("fail in physics,maths,english");
						}
					}
					else
					{
						if(h<=33)
						{
							System.out.println("fail in physics,maths,hindi");
						}
						else
						{
							System.out.println("fail in physics,maths");
						}
					}
				}
				else
				{
					if(e<=33)
					{
						if(h<=33)
						{
							System.out.println("fail in physics,english,hindi");
						}
						else
						{
							System.out.println("fail in physics,english");
						}
					}
					else
					{
						if(h<=33)
						{
							System.out.println("fail in physics,hindi");
						}
						else
						{
							System.out.println("\t\tfail in physics");
						}
					}
				}
			}
		}
		else
		{
			if(c<=33)
			{
				if(m<=33)
				{
					if(e<=33)
					{
						if(h<=33)
						{
							System.out.println("fail in chemistry,maths,english,hindi");
						}
						else
						{
							System.out.println("fail in chemistry,maths,english");
						}
					}
					else
					{
						if(h<=33)
						{
							System.out.println("fail in chemistry,maths,hindi");
						}
						else
						{
							System.out.println("fail in chemistry,maths");
						}
					}
				}
				else
				{
					if(e<=33)
					{
						if(h<=33)
						{
							System.out.println("fail in chemistry,english,hindi");
						}
						else
						{
							System.out.println("fail in chemisrtys,hindi");
						}
					}
					else
					{
						if(h<=33)
						{
							System.out.println("fail in chemisrtys,hindi");
						}
						else
						{
							System.out.println("\t\tfail in chemisrtys");
						}
					}
				}
			}
			else
			{	
				if(m<=33)
				{
					if(e<=33)
					{
						if(h<=33)
						{
							System.out.println("fail in maths,english,hindi");
						}
						else
						{
							System.out.println("fail in maths,english");
						}
					}
					else
					{
						if(h<=33)
						{
							System.out.println("fail in maths hindi ");
						}
						else
						{
							System.out.println("\t\tfail in maths");
						}
					}
				}
				else
				{
					if(e<=33)
					{
						if(h<=33)
						{
							System.out.println("fail in english,hindi");
						}
						else
						{
							System.out.println("\t\tfail in english");
						}
					}
					else
					{
						if(h<=33)
						{
							System.out.println("\t\tfail in hindi");
						}
						else
						{
							System.out.println("\t\t Pass in first divisionssss");
						}
						
					}
				}	
			}
		}	
		if(x==true)
			{
				if(per>60)
				{
					System.out.println("\tPassed by First division");
				}
				else if(per>45)
				{
					System.out.println("Passed by Second division");
				}
				else if(per>33)
				{
					System.out.println("Passed by Third division");
				}
				else
			
				System.out.println("\t\t Yor are Fail");
		        i++;
				
			}
			
		}
		
	}	
}