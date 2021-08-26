import java.util.HashMap;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {

        Cell stemCell= new Cell();
        Cell bloodCell= new Cell();
        Cell liverCell= new Cell();
        Cell intestinalCell= new Cell();
        Cell muscleCell= new Cell();

        HashMap<String, Cell> map=new HashMap<>();
        map.put("stem",stemCell);
        map.put("blood",bloodCell);
        map.put("liver",liverCell);
        map.put("muscle",muscleCell);
        map.put("intestinal", intestinalCell);

        HashSet<Cell> set=new HashSet<>();
        set.add(stemCell);
        set.add(bloodCell);
        set.add(muscleCell);
        set.add(intestinalCell);
        set.add(liverCell);
    }
}
