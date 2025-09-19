import java.awt.Color;
import java.awt.Graphics;

public abstract class Tile {
    // var
    boolean isDecay;
    boolean isGrowth;
    Color color;
    Cell cell;
    int size = 15;

    // constructor
    public Tile(boolean x, boolean y) {
        isDecay = x;
        isGrowth = y;
    }

    // method
    public void paint(Graphics g) {
        g.setColor(color);
        g.fillRect(cell.x, cell.y, 35, 35);

        // print type
        // TODO change to poly symbol
        if(isDecay) {
            g.setColor(color.BLACK);
        } else {
            g.setColor(color.GREEN);
        }
        g.fillRect(cell.x, cell.y, size, size);
    }
}
