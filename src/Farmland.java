import java.awt.Color;

public class Farmland extends Tile {
    public Farmland(Cell x) {
        super(x, Color.YELLOW);
        growthBoost = 1.5f; // crops will grow 1.5x faster on farmland
    }
}
