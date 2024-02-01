package studio2;

import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in  = new Scanner(System.in);	
		System.out.println("How much money are you starting with?");
		int startAmount = in.nextInt();
		System.out.println("What is your chance of winning?");
		double winChance = in.nextDouble();
		System.out.println("What is your win limit?");
		int winLimit = in.nextInt();
		while (startAmount > 0 && startAmount < winLimit) 
		{
			if (Math.random() > winChance)
			{
				System.out.println("You win!");
				startAmount++;
			}
			else
			{
				System.out.println("You lose.");
				startAmount--;
			}
		}
		if (startAmount == 0)
		{
			System.out.println("You lost everything.");
		}
		else
		{
			System.out.println("You won everything!");
		}
	}

}
