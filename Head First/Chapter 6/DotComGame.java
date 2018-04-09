import java.util.ArrayList;
import java.util.Scanner;

class DotComGame {

    private ArrayList<DotComShip> dotComList = new ArrayList<DotComShip>(); // the array with all the ships
    private int numberOfGuesses = 0; // the number of guesses the user made in order to kill all the ships
    private ArrayList<String> sites = new ArrayList<String>(); // the possible site names
    private final int gridSize = 49; // the size of the matrix which the grid is = width * height
    private final int gridWidth = 7; // the grid width
    private final int dotComSize = 3; // the amout of positions on the grid the ship occupies
    private final int numberOfDotComs = 3; // amout of dot coms to be placed for the game
    private int[] gridLocations = new int[49]; // to keep track of the used positions;


    private DotComGame() {
        sites.add("go2.com");
        sites.add("pets.com");
        sites.add("altavista.com");
        sites.add("etoys.com");
        sites.add("aol.com");
        sites.add("napster.com");
        sites.add("yahoo.com");
        sites.add("askjeeves.com");
        sites.add("broadcast.com");
    }

    private void setUp() {
        System.out.println("Sink-a-dot-Com game!");
        System.out.println("Make 3 dot Coms' market cap dive!\nJust do it like Battleship");
        System.out.println("The grid is "+ gridWidth + "x7 going from 0 through 6 horizontally and A through G vertically");
        System.out.println("Guess the positions like this 'a6'. Get it? Doesn't matter, let's begin!\n");

        for (int i = 0; i < gridSize; ++i)
            gridLocations[i] = 1;

        for (int i = 0; i < numberOfDotComs; i++) {
            DotComShip iterator = new DotComShip();
            iterator.setSiteName( sites.remove ( (int) ( Math.random()*sites.size() ) ) );
            iterator.placeCoordinates( deployDotCom() );
            dotComList.add(iterator);
        }

    }

    private ArrayList<String> deployDotCom() {

        int verticalOrHorizontal = (int) (Math.random() * 10);       // Vertical <= 5, horizontal > 5
        int increment = 1;                                          // the increment that decides if its vertical( = 1) or horizontal( = gridWidth)
        char[] vericalCoordinates = {'a','b','c','d','e','f','g'};  // vertical positions "enumeration"
        ArrayList<String> coordinates = new ArrayList<String>();

        if (verticalOrHorizontal <= 5)
            increment = gridWidth;                                  // if its vertical, increasing by seven makes it go vertical.


        int[] position = new int[dotComSize];                            // store the current attempt to place the current dot com ship
        boolean success = false;

        while (!success) {

            position[0] = (int) ((gridSize-1)* Math.random());

            if(gridLocations[position[0]] != 0) {               // if this position is available
                //////////// I am fully aware there could be a better looping here. I'll do that later. :)
                position[1] = position[0] + increment;

                if(gridLocations[position[1]] != 0 && position[1] < gridSize && (position[0] % gridWidth <= position[1] % gridWidth) ) {
                    position[2] = position[1] + increment;

                    if (gridLocations[position[2]] != 0 && position[2] < gridSize && (position[1] % gridWidth <= position[2] % gridWidth)  ) {
                        success = true;


                        for (int k = 0; k < dotComSize; ++k) {
                            gridLocations[position[k]] = 0;
                            String helper = vericalCoordinates[(position[k]/gridWidth)] + Integer.toString(position[k]%gridWidth);
                            coordinates.add(helper);
                        }

                    }
                }
            }
        }

        return coordinates;
    }

    private void play() {
        Scanner reader = new Scanner(System.in);

        while (!dotComList.isEmpty()) {
            checkHit(reader.nextLine());
            ++numberOfGuesses;
        }
        finishGame();
    }

    private void checkHit(String userGuess) {
        boolean hitmark;
        for (DotComShip current :dotComList) {
            hitmark = current.checkGuess(userGuess);
            if(hitmark)
                break;
        }
        if(!hitmark)
            System.out.println("You missed");
    }

    private void finishGame() {
        System.out.println("All Dot Coms are bankrupt! Their market cap is now worthless");
        if (numberOfGuesses <= 18) {
            System.out.println("It took you " + numberOfGuesses + " guesses");
            System.out.println("You got out before your options sank!");
        }
        else {
            System.out.println("Took you long enough. " + numberOfGuesses + " guesses.");
            System.out.println("Fish are dancing with your stocks.");
        }
    }

    public static void main(String[] args) {
        DotComGame game = new DotComGame();
        game.setUp();
        game.play();
    }

}
