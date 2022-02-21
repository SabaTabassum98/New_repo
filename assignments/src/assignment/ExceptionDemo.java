package assignment;

import java.util.Scanner;

public class ExceptionDemo {
	static void canVote(int age) throws InvalidAgeException{
		if(age<18 && age>=0)
			System.out.println("you are not an adult!");
		else if(age<0)
			throw  new InvalidAgeException(age);
		else
		   System.out.println("you can vote!");
	}
	public static void main (String[] args){
		int voter1 =0;
		int voter2 = 0;
		Scanner scan = new Scanner(System.in);
		try {
		System.out.println("Please Enter the Age of First Voter");
		voter1 = Integer.parseInt(scan.next());
		System.out.println("Please Enter the Age of Second Voter");
		voter2 = Integer.parseInt(scan.next());
		
	/*	if(voter1<0) {
			throw new InvalidAgeException(voter1);
		}else if(voter2<0) {
			throw new InvalidAgeException(voter2);
		}else {*/
		System.out.print("Voter 1 : ");
		canVote(voter1);
		System.out.print("Voter 2 : ");
		canVote(voter2);
//		}
		}
		catch(NumberFormatException e) {
		System.out.println("Please Enter a valid input from 0-150");
		}
		catch(InvalidAgeException e) {
			System.out.println(e);
		}
		}

}

class InvalidAgeException extends Exception{
	
	public InvalidAgeException(int age) {
		System.out.println("Please Enter a valid input from 0-150");
	}
}
