import java.util.Scanner;

class Player
{
	Scanner sc=new Scanner(System.in);
	int play()
	{
		return sc.nextInt();
	}
}

class Guesser
{
	Scanner sc=new Scanner(System.in);
	int guess()
	{
		return sc.nextInt();
	}
}

public class Umpire
{
	int GuesserNo;
	int pl1;
	int pl2;
	int pl3;
	Umpire()
	{
		int minguess;
		int maxguess;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Guesser please enter your minmum range");
		minguess=sc.nextInt();
		System.out.println("Guesser please enter your maximum range");
		maxguess=sc.nextInt();
		System.out.println("Guesser guess the number now....");
		Guesser g=new Guesser();
		GuesserNo=g.guess();
		while(GuesserNo>maxguess || GuesserNo<minguess)
		{
			System.out.println("Guesser kindly guess the number between the range from "+minguess+" to "+maxguess);
			GuesserNo=sc.nextInt();
		}
		
		
		System.out.println("Player1 guess the number....");
		Player p1=new Player();
		pl1=p1.play();
		while(pl1>maxguess || pl1<minguess)
		{
			System.out.println("Player1 kindly guess the number from "+minguess+" to "+maxguess);
			pl1=p1.play();
		}
		
		
		System.out.println("Player2 guess the number....");
		Player p2=new Player();
		pl2=p1.play();
		while(pl2>maxguess || pl2<minguess)
		{
			System.out.println("Player2 kindly guess the number from "+minguess+" to "+maxguess);
			pl2=p2.play();
		}
		
		
		System.out.println("Player3 guess the number....");
		Player p3=new Player();
		pl3=p3.play();
		while(pl3>maxguess || pl3<minguess)
		{
			System.out.println("Player3 kindly guess the number from "+minguess+" to "+maxguess);
			pl3=p3.play();
		}
		
		
	}
	void calculate()
	{
		if(pl1==GuesserNo)
		{
			if(pl2==GuesserNo && pl3==GuesserNo)
			{
				System.out.println("All Players WON the MATCH");
			}
			else if(pl2==GuesserNo)
			{
				System.out.println("Player1 and Player2 WON the MATCH");
			}
			else if(pl3==GuesserNo)
			{
				System.out.println("Player1 and Player3 WON the MATCH");
			}
			else
			{
				System.out.println("Player1 WON the MATCH");
			}
		}
		else if(pl2==GuesserNo)
		{
			if(pl3==GuesserNo)
			{
				System.out.println("Player2 and Player3 WON the MATCH");
			}
			else
			{
				System.out.println("Player2 WON the MATCH");
			}
		}
		else if(pl3==GuesserNo)
		{
			System.out.println("Player3 WON the MATCH");
		}
		else
		{
			System.out.println("No Player WON the MATCH, GAME LOST!.....");
		}
	}
	
	public static void main(String[] args) 
	{
		Umpire u=new Umpire();
		u.calculate();
	}
}
