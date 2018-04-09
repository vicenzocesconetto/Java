import java.util.ArrayList;

class DotComShip {
    private ArrayList<String> locations;
    private String siteName;


    void setSiteName(String siteName) {
        this.siteName = siteName;
    }

    void placeCoordinates(ArrayList<String> locations) {
        this.locations = locations;
    }

    public String checkGuess(String userGuess) {
        if(locations.remove(userGuess)) {
            if(locations.isEmpty()) {
                System.out.println("That's a kill. " + siteName + " is now bankrupt");
                return "kill";
            }
            else {
                System.out.println("Good shot");
                return "hit";
            }
        }
        return "miss";
    }
}