import java.awt.Color;

public class Water extends Tile {
    public Water(Cell x) {
        super(x, Color.BLUE);
        isWater = true;
    }
}
