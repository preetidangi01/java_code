import java.util.Scanner;
class Snakeleader
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
	    System.out.println("Snake & ladder");
		System.out.println("player 1 \n player 2");
		int sum1=0,sum2=0,i=1;
		do
		{
		    if(i%2==0)
			{
			    int k=(int)(Math.random()*6+1);
				if(sum2<=100)
			    {
				sum2=sum2+k;
				System.out.println("player 2="+k);
				System.out.println("sum2="+sum2);
				if(sum2==28)
				{
					System.out.println("climbing ladder from 28 to 77");
					sum2=sum2+49;
					System.out.println("sum2="+sum2);
				}
				else if(sum2==2)
				{
					System.out.println("climbing ladder from 2 to 23");
					sum2=sum2+21;
					System.out.println("sum2="+sum2);
				}
				else if(sum2==44)
				{
					System.out.println("climbing ladder from 44 to 58");
					sum2=sum2+14;
					System.out.println("sum2="+sum2);
				}
				else if(sum2==80)
				{
					System.out.println("climbing ladder from 80 to 97");
					sum2=sum2+17;
					System.out.println("sum2="+sum2);
				}
				else if(sum2==7)
				{
				    System.out.println("climbing ladder from 7 to 29");
					sum2=sum2+25;
					System.out.println("sum2="+sum2);
				}
				else if(sum2==70)
				{
				    System.out.println("climbing ladder from 70 to 90");
					sum2=sum2+20;
					System.out.println("sum2="+sum2);
				}
				else if(sum2==22)
				{
				    System.out.println("climbing ladder from 22 to 41");
					sum2=sum2+19;
					System.out.println("sum2="+sum2);
				}
				
				else if(sum2==39)
				{
					System.out.println("Snake bite fall from 39 to 3");//39 to 3
					sum2=sum2-36;
					System.out.println("sum2="+sum2);
				}
				else if(sum2==50)
				{
					System.out.println("Snake bite fall from 50 to 34");//50 to 34
					sum2=sum2-16;
					System.out.println("sum2="+sum2);
				}
				else if(sum2==90)
				{
					System.out.println("Snake bite fall from 90 to 68");//90 to 68
					sum2=sum2-22;
					System.out.println("sum2="+sum2);
				}
				else if(sum2==99)
				{
					System.out.println("Snake bite fall from 99 to 26");//99 to 26
					sum2=sum2-73;
					System.out.println("sum2="+sum2);
				}
				else if(sum2==35)
				{
					System.out.println("Snake bite fall from 35 to 5");//99 to 26
					sum2=sum2-30;
					System.out.println("sum2="+sum2);
				}
				else if(sum2==97)
				{
					System.out.println("Snake bite fall from 97 to 86");//99 to 26
					sum2=sum2-11;
					System.out.println("sum2="+sum2);
				}
			}
				if(sum2==100)
				{
				   System.out.println("player 2 win= "+sum2);
				   break;
				}
			}
			else
			{
			    int k=(int)(Math.random()*6+1);
				if(sum1<=100)
				{
				sum1=sum1+k;
				System.out.println("player 1="+k);
				System.out.println("sum1="+sum1);
				if(sum1==28)
				{
					System.out.println("climbing ladder from 28 to 77");
					sum1=sum1+49;
					System.out.println("sum1="+sum1);
				}
				else if(sum1==2)
				{
					System.out.println("climbing ladder from 2 to 23");
					sum1=sum1+21;
					System.out.println("sum1="+sum1);
				}
				else if(sum1==44)
				{
					System.out.println("climbing ladder from 44 to 58");
					sum1=sum1+14;
					System.out.println("sum1="+sum1);
				}
				else if(sum1==80)
				{
					System.out.println("climbing ladder from 80 to 97");
					sum1=sum1+17;
					System.out.println("sum1="+sum1);
				}
				else if(sum1==7)
				{
				    System.out.println("climbing ladder from 7 to 29");
					sum1=sum1+25;
					System.out.println("sum1="+sum1);
				}
				else if(sum1==70)
				{
				    System.out.println("climbing ladder from 70 to 90");
					sum1=sum1+20;
					System.out.println("sum1="+sum1);
				}
				else if(sum1==22)
				{
				    System.out.println("climbing ladder from 22 to 41");
					sum1=sum1+19;
					System.out.println("sum1="+sum1);
				}
				else if(sum1==39)
				{
					System.out.println("Snake bite fall from 39 to 3");//39 to 3
					sum1=sum1-36;
					System.out.println("sum1="+sum1);
				}
				else if(sum1==50)
				{
					System.out.println("Snake bite fall from 50 to 34");//50 to 34
					sum1=sum1-16;
					System.out.println("sum1="+sum1);
				}
				else if(sum1==90)
				{
					System.out.println("Snake bite fall from 90 to 68");//90 to 68
					sum1=sum1-22;
					System.out.println("sum1="+sum1);
				}
				else if(sum1==99)
				{
					System.out.println("Snake bite fall from 99 to 26");//99 to 26
					sum1=sum1-73;
					System.out.println("sum1="+sum1);
				}
				else if(sum1==35)
				{
					System.out.println("Snake bite fall from 35 to 5");//99 to 26
					sum1=sum1-30;
					System.out.println("sum1="+sum1);
				}
				else if(sum1==97)
				{
					System.out.println("Snake bite fall from 97 to 86");//99 to 26
					sum1=sum1-11;
					System.out.println("sum1="+sum1);
				}
			}
				if(sum1>=100)
				{
				   System.out.println("player 1 win="+sum1);
				   break;
				}
			}
			i++;
		 }
		 while(i<=sum1||i<=sum2);
	}	
}