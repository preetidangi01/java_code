import java.util.Scanner;
class Marksheet
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your Name");
		String nm=sc.nextLine();
		System.out.println("enter your Roll number");
		String roll=sc.nextLine();
		System.out.println("enter your Father name");
		String Fn=sc.nextLine();
		System.out.println("enter your Mother name ");
		String Mn=sc.nextLine();
		System.out.println("enter your course name");
		String co=sc.nextLine();
		System.out.println("enter your branch name");
		String bran=sc.nextLine();
		System.out.println("enter your year");
		String yr=sc.nextLine();
		System.out.println("enter your sem");
		String sem=sc.nextLine();
		System.out.println("enter your physics marks");
		int p=sc.nextInt();
		System.out.println("enter your chemistry marks");
		int c=sc.nextInt();
		System.out.println("enter your maths");
		int m=sc.nextInt();
		System.out.println("enter your english marks");
		int e=sc.nextInt();
		System.out.println("enter your hindi");
		int h=sc.nextInt();
		
		int total=p+c+m+h+e;
		float per=(total)/5f;
		boolean x=false;
		
		
		System.out.println("\n\n\t\t\t\t\t\tRGPV-INDORE\t\t\t\t\t");
		System.out.println("\tStudents Name   :"+nm+"\t\t\t\t\t\tCourse	:"+co);
		System.out.println("\tRoll number	:"+roll+"\t\t\t\t\t\tBranch  :"+bran);
		System.out.println("\tFather name	:"+Fn+"\t\t\t\t\tSem	:"+sem);
		System.out.println("\tMother name	:"+Mn+"\t\t\t\t\t\tYear	:"+yr);
		System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t");
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
							System.out.println("\t\t Pass");
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
			{
				System.out.println("\t\t Yor are Fail");
			}
		}
	}	
}