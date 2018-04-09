public class PhraseOMatic {

	public static void main (String[] args) {

		String[] wordListOne = {"24/7", "multi-tier", "30,000 foot", "B2B", "web-based",
		"win-win", "front-end", "six-sigma", "smart", "pervasive", "critical-path", "dynamic"};

		String[] wordListTwo = {"empowered" , "sticky", "oriented", "centric", "value-added",
		"distributed", "clustered", "branded", "outside-the-box", "positioned", "networked", "focused",
		"leveraged", "aligned", "targeted", "shared", "cooperative", "accelerated"};

		String[] wordListThree = {"process", "tipping-point", "solution", "architecture", "core competency",
		"strategy", "mindshare", "portal", "space", "vision", "paradigm", "mission"}; 

		System.out.println("What we need is a " + wordListOne[(int)(wordListOne.length * Math.random())] + " "
		 + wordListTwo[(int) (wordListTwo.length * Math.random())] + " " 
		 + wordListThree[(int) (wordListThree.length * Math.random())] + ".");
	}
}