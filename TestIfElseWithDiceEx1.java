package tw.larry.myproject.flowcontrol;

public class TestIfElseWithDiceEx1 {

	public static void main(String[] args) {
		int diceNumber = (int) (Math.random() * 6) + 1;
		
		System.out.println("DiceNumber = " + diceNumber);
		
		int myLuckyNumber = 6;
		if (myLuckyNumber == diceNumber) {
			System.out.println("You Win!!");
		} else {
			System.out.println("Please try again.");
		}
		System.out.println("Finished");
	}

}
