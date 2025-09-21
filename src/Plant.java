import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;
import java.awt.Rectangle;
import java.util.List;

public abstract class Plant {
    float growthTimeMax = 30;
    float growthTime = 0;
    int price = 0;
    int sellValue = 0;
    boolean waterPlant = false;
    boolean isGrown = false;

    Rectangle cell;
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

        grow();
    }

    public void grow() {
        if(growthTime >= growthTimeMax * 60) {
            isGrown = true;
            return;
        } else if (isGrown) {
            return;
        }

        growthTime += 1;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName();
    }
}
