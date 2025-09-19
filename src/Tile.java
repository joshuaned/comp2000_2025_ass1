
import java.awt.Graphics;

public abstract class Tile {
    // var
    boolean isDecay;
    boolean isGrowth;
    int size = 30;

    // constructor
    public Tile(boolean x, boolean y) {
        isDecay = x;
        isGrowth = y;
    }

    // method
    public void paint(Graphics g) {
        g.fillRect(size, size, size, size);
    }
}
