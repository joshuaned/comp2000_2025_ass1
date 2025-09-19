import java.awt.Color;
import java.awt.Graphics;

public abstract class Tile {
    // var
    boolean isDecay;
    boolean isGrowth;
    Color color;
    Cell p;
    int size = 30;

    // constructor
    public Tile(boolean x, boolean y) {
        isDecay = x;
        isGrowth = y;
    }

    // method
    public void paint(Graphics g) {
        g.setColor(color);
        g.fillRect(p.x, p.y, size, size);
    }
}
