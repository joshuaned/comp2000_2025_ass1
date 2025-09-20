import java.awt.Color;
import java.awt.Graphics;

public abstract class Tile {
    // var
    Color color;
    Cell cell;

    // method
    public void paint(Graphics g) {
        g.setColor(color);
        g.fillRect(cell.x, cell.y, 35, 35);
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName();
    }
}
