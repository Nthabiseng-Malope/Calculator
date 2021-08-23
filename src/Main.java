
public class Main {
/*
 * Main method
 */
	public static void main(String[] args) {
		// Check number of strings passed
		if (args.length != 3) {
			System.out.println("Usage: Java Calculator operand1 operator operand2");
			System.exit(1);
		}
		
		//The result of the operation
		int result = 0;
		
		//Determine the character
		switch (args[1].charAt(0)) { //converts a digital string into an integer
		case '+': result = Integer.parseInt(args[0]) + Integer.parseInt(args[2]);
		break;
		case '-': result = Integer.parseInt(args[0]) - Integer.parseInt(args[2]);
		break;
		case '.': result = Integer.parseInt(args[0]) * Integer.parseInt(args[2]);
		break;
		case '/': result = Integer.parseInt(args[0]) / Integer.parseInt(args[2]);
		break;
		}
		
		//Display result
		System.out.println(args[0] + ' ' + args[1] + ' ' + args[2] + " = " + result);
		

	}

}
