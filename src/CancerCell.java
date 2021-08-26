import java.util.ArrayList;

public class CancerCell extends Cell{

    public CancerCell(int x, int y) {
        super(x, y, 1, 3);
    }

    @Override
    public void interactNeighbors(ArrayList<Cell> neighbors) {
    }
}
