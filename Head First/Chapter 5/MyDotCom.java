import java.util.Scanner;

public class MyDotCom {

	public static void main (String[] args) {

		System.out.println("What length do you want the grid to be?");

		Scanner input = new Scanner(System.in);

		// int gridLength = input.nextInt();

		// System.out.println("Your input was " + gridLength);

		Ship theSite = new Ship();

		theSite.createLocation(input.nextInt());

		while (theSite.isShipAlive()) {

			System.out.println("Guess the enemy ship's location");

			// int userGuess = input.nextInt();	

			if (theSite.isShipHit(input.nextInt()))
				System.out.println("The enemy ship has been hit");
			else
				System.out.println("Miss.");
			
		}

		System.out.println("That's a kill!");

		System.out.println("The enemy ship has been destroyed\nVictory is ours");
	}
}

class Ship {
	boolean[] positionsAlive = new boolean[3];

	int[] cellLocations = new int[3];

	void createLocation(int gridLength) {
		cellLocations[0] = (int) (Math.random() * (gridLength-2));
		cellLocations[1] = cellLocations[0] + 1;
		cellLocations[2] = cellLocations[1] + 1;
		// System.out.println("First position is " + cellLocations[0] + " second is " + cellLocations[1] + " third is " + cellLocations[2]);

		for (int i = 0; i < positionsAlive.length ; ++i) {
			positionsAlive[i] = true;
			// System.out.println("positionsAlive["+ i + "] is =" + positionsAlive[i]);
		}
	}

	boolean isShipAlive() {
		for (boolean cell : positionsAlive) {
			if (cell)
				return true;
		}
		return false;
	}

	boolean isShipHit(int userGuess) {
		// System.out.println("Your guess was " + userGuess);
		for (int pos = 0; pos < 3 ; ++pos) {
			if (cellLocations[pos] == userGuess && positionsAlive[pos]) {
				positionsAlive[pos] = false;
				// System.out.println("You hit position " + pos);
				return true;
			}
		}

		return false;
	}
}