import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;
import java.util.List;

public abstract class Plant {
    int growthTimeMax;
    int growthTime = 0;
    Cell cell;
    Color color;
    List<Polygon> display;

    public void paint(Graphics g) {
        // draw the plant
        for(Polygon p: display) {
            g.setColor(color);
            g.fillPolygon(p);
            g.setColor(color.GRAY);
            g.drawPolygon(p);
        }
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName();
    }
}
