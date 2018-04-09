public class GuessGame {
	Player p1, p2, p3;

	public void StartGame () {
		p1 = new Player();
		p2 = new Player();
		p3 = new Player();

		int guessp1 = 0, guessp2 = 0, guessp3 = 0;

		boolean p1isRight = false, p2isRight = false, p3isRight = false;

		int targetNumber = (int) (Math.random() * 10);
		System.out.println("I'm thinking of a number between 0 and 9...");

		while (true) {
			System.out.println("Number to guess is " + targetNumber + '\n');

			p1.guess();
			guessp1 = p1.number;
			System.out.println("Player one guessed " + guessp1 + "\n");

			p2.guess();
			guessp2 = p2.number;
			System.out.println("Player two guessed " + guessp2 + '\n');

			p3.guess();
			guessp3 = p3.number;
			System.out.println("Player three guessed " + guessp3 + '\n');

			if (guessp1 == targetNumber)
				p1isRight = true;

			if (guessp2 == targetNumber)
				p2isRight = true;

			if (guessp3 == targetNumber)
				p3isRight = true;

			if (p1isRight || p2isRight || p3isRight) {
				System.out.println("We have a winner");
				System.out.println("Is Player one right? " + p1isRight);
				System.out.println("Is Player two right? " + p2isRight);
				System.out.println("Is Player three right? " + p3isRight);
				System.out.println("Game Over");
				break;
			}

			else {
				System.out.println("Nobody got it right, another round it is!");
			}
		}
	}
}