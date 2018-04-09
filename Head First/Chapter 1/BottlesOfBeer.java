
public class BottlesOfBeer {

	public static void main (String[] args) {

		int BottlesOfBeer = 99;

		while (BottlesOfBeer > 2) {
			System.out.println(BottlesOfBeer + " bottles of beer on the wall, " + BottlesOfBeer + " bottles of beer.");

			System.out.println("Take one down and pass it around, " + (BottlesOfBeer-1) + " bottles of beer on the wall.\n");

			--BottlesOfBeer;
		}

		System.out.println(BottlesOfBeer + " bottles of beer on the wall, " + BottlesOfBeer + " bottles of beer.");

		System.out.println("Take one down and pass it around, " + (BottlesOfBeer-1) + " bottle of beer on the wall.\n");

		--BottlesOfBeer;
			
		System.out.println(BottlesOfBeer + " bottle of beer on the wall, " + BottlesOfBeer + " bottle of beer.");

		System.out.println("Take one down and pass it around, no more bottles of beer on the wall.\n");
		
		System.out.print("No more bottles of beer on the wall, no more bottles of beer. \nGo to the store and buy some more, 99 bottles of beer on the wall.");

	}
}