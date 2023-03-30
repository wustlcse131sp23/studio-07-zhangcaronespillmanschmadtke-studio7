package studio7;

public class DiceRoll {

	private static int sides = 6;
	
	public static void diceRoll()
	{
		int roll = (((int)(Math.random() * sides)) + 1);
		System.out.println(roll);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		diceRoll();
	}

}
