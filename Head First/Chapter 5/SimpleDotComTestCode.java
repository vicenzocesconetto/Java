public class SimpleDotComTestCode {

	static public void main (String[] args) {

		simpleDotCom dot = new simpleDotCom();

		int[] locations = {2, 3, 4};

		dot.setLocationCells(locations);

		String userGuess = "3";

		String result = dot.checkYourself(userGuess);

		String testResult = "failed!";

		if (result.equals("hit")) 
			testResult = "passed";

		System.out.println(testResult);
	}
}

class simpleDotCom {

	private int[] locationCells;

	int numOfHits = 0;

	public void setLocationCells(int[] locs) {
		locationCells = locs;
	}

	public String checkYourself (String stringGuess) {

		int guess = Integer.parseInt(stringGuess);

		String result = "miss";

		for(int cell : locationCells) {
			if (guess == cell) {
				result = "hit";

				++numOfHits;

				break;
			}
		}

		if (numOfHits == locationCells.length)
			result = "kill";

		System.out.println(result);

		return result;
	}
}