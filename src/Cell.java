import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Cell {
    private int x;
    private int y;
    private int strength;
    private int id;
    private HashMap<String, Integer> chemicals=new HashMap<>();
    private HashSet<String> signalMolecules=new HashSet<>();

    public Cell() {
        this.x = 0;
        this.y =0;
        this.strength = 0;
        this.id = 0;

    }

    public Cell(int x, int y, int strength, int id) {
        if (x < 0 || y < 0 || strength < 0 || id < 0) {
            return;
        }
        this.x = x;
        this.y = y;
        this.strength = strength;
        this.id = id;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        if (x >= 0)
            this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        if (y >= 0)
            this.y = y;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        if (strength >= 0)
            this.strength = strength;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        if (id >= 0)
            this.id = id;
    }
    private void interactNeighbors(ArrayList<Cell> neighbors){
    }
}

