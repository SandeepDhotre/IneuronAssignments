import java.util.Scanner;
//Guesser Class1
class Guesser1{
	int guessNum;
	//Method1
	public int guessNumber() {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("Hey Guesser kindly guess the number between 1 and 10 range only:- ");
			guessNum = sc.nextInt();
			if(guessNum >= 1 && guessNum <= 10) 
			break;
		}
		return guessNum;
	}
}
//Player Class2
class Player1{
	int pguessNum;
	//Method2
	public int guessNumber() {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("Hey Player kindly guess the number between 1 to 10 range only:- ");
			pguessNum = sc.nextInt();
			if(pguessNum >= 1 && pguessNum <= 10) 
			break;
		}
		return pguessNum;
	}
}
//Umpire Class3
class Umpire1{
	int numFromGuesser;
	int numFromPlayer1;
	int numFromPlayer2;
	int numFromPlayer3;
	//Method3 - Collecting number form guesser.
	public void collectNumFromGuesser() {
		Guesser1 g = new Guesser1();
		numFromGuesser=g.guessNumber();
	}
	//Method4 - Collecting numbers form players.
	public void collectNumFromPlayer() {
		Player1 p1 = new Player1();
		Player1 p2 = new Player1();
		Player1 p3 = new Player1();
		numFromPlayer1=p1.guessNumber();
		numFromPlayer2=p2.guessNumber();	
		numFromPlayer3=p3.guessNumber();
	}
	//Method5 - Comprare Guessing Number.
	public void compare() {
		boolean p1result = (numFromGuesser==numFromPlayer1);
		boolean p2result = (numFromGuesser==numFromPlayer2);
		boolean p3result = (numFromGuesser==numFromPlayer3);
		if(p1result) {
			if(p2result && p3result) {
				System.out.println("All players are the winners.");
			}else if(p2result) {
				System.out.println("Player 1 and Player 2 are the winners.");
			}else if(p3result) {
				System.out.println("Player 1 and Player 3 are the winners.");
			}else{
				System.out.println("Player 1 is the winner.");
			}
		}else if(p2result) {
			if(p3result) {
				System.out.println("Player 2 and Player 3 are the winners.");
			}else {
				System.out.println("Player 2 is the winner.");
			}
		}else if(p3result){
			System.out.println("Player 3 is the winner.");
		}else {
			System.out.println("Ohh.. Lost the Game. Please try again.");
		}
	}
}
//Main Class4		
public class NumberGuessingGame {
	public static void main(String[] args) {
		Umpire1 u = new Umpire1();
		u.collectNumFromGuesser();
		u.collectNumFromPlayer();
		u.compare();
	}
}