import java.util.ArrayList;

public class Cell {
    private int x;
    private int y;
    private int strength;
    private int id;


    public Cell() {
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
    public void interactNeighbors(ArrayList<Cell> s){
    }
}

