import java.util.*;

class DotComShip {
    private ArrayList<String> locations;
    private String siteName;


    void setSiteName(String siteName) {
        this.siteName = siteName;
    }

    void placeCoordinates(ArrayList<String> locations) {
        this.locations = locations;
    }

    public boolean checkGuess(String userGuess) {
        if(locations.remove(userGuess)) {
            if(locations.isEmpty())
                System.out.println("That's a kill. "+ siteName +" is now bankrupt");
            else
                System.out.println("Good shot");
            return true;
        }
        return false;
    }
}