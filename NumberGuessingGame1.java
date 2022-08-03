import java.util.Scanner;
//Guesser Class1
class Guesser2{
	int guessNum;
	//Method1
	public int guessNumber() {
		Scanner sc = new Scanner(System.in);
		while("I AM THE BEST"!="YOU ARE THE BEST") {
		System.out.print("Hey Guesser kindly guess the number between 1 to 10 range only:- ");
		guessNum = sc.nextInt();
		if(guessNum >= 1 && guessNum <= 10) 
			break;
		}
		return guessNum;
	}
}
//Player Class2
class Player2{
	int pguessNum;
	//Method2
	public int guessNumber() {
		Scanner sc = new Scanner(System.in);
		while("I AM THE BEST"!="YOU ARE THE BEST") {
		System.out.print("Hey Player kindly guess the number between 1 to 10 range only:- ");
		pguessNum = sc.nextInt();
		if(pguessNum >= 1 && pguessNum <= 10) 
			break;
		}
		return pguessNum;
	}
}
//Umpire Class3
class Umpire2{
	int numFromGuesser;
	int numFromPlayer1;
	int numFromPlayer2;
	int numFromPlayer3;
	//Method3 - Collecting numbers from Guesser and Players.
	public void collectNumFromGuesserAndPlayer() {
		Guesser2 g = new Guesser2();
		Player2 p1 = new Player2();
		
		numFromGuesser=g.guessNumber();
		numFromPlayer1=p1.guessNumber();
		numFromPlayer2=p1.guessNumber();	
		numFromPlayer3=p1.guessNumber();
	}
	//Method4 - Compare Guessing Number.
	public void compare() {
		boolean p1result = (numFromGuesser==numFromPlayer1);
		boolean p2result = (numFromGuesser==numFromPlayer2);
		boolean p3result = (numFromGuesser==numFromPlayer3);
		//ternary operator to compare
		String finalresult = (p1result && p2result && p3result) ? "All Players are the winners." : 
							(p1result && p2result) ? "Player 1 and Player 2 are the winners." : 
								(p1result && p3result) ? "Player 1 and Player 3 are the winners." : 
									(p1result) ? "Player 1 is the winner." : 
										(p2result && p3result) ? "Player 2 and Player 3 are the winners." : 
											(p2result) ? "Player 2 is the winner." : 
												(p3result) ? "Player 3 is the winner." : 
													"Ohh.. Lost the game. Please try again.";
		System.out.println("\n"+finalresult);
	}
}
//Main Class4
public class NumberGuessingGame1 {
	public static void main(String[] args) {
		Umpire2 u = new Umpire2();
		u.collectNumFromGuesserAndPlayer();
		u.compare();
	}
}