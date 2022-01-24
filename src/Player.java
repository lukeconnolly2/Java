import java.util.ArrayList;
import java.util.Arrays;

public class Player{
    private String name;
    private ArrayList<String> pieces = new ArrayList<String>(Arrays.asList("I1", "I2", "I3", "I4", "I5", "V3", "L4", "Z4", "O4", "L5", "T5", "V5", "N", "Z5", "T4", "P", "W", "U", "F", "X", "Y"));

    public Player(String name){
        this.name = name;
    }

    public ArrayList<String> getPieces() {
        return pieces;
    }

    public String getName() {
        return name;
    }

    public void usePiece(String p){
        this.pieces.remove(p);
    }


}
