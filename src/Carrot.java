
import java.awt.Polygon;
import java.awt.Rectangle;
import java.util.ArrayList;

public class Carrot extends Plant {
    public Carrot(Rectangle x) {
        super(x, 15, 10, 15);
        color = color.ORANGE;

        display = new ArrayList<Polygon>();
        Polygon shape = new Polygon();
        shape.addPoint(cell.x + 10, cell.y + 10);
        shape.addPoint(cell.x + 30, cell.y + 10);
        shape.addPoint(cell.x + 20, cell.y + 30);

        display.add(shape);
    }
}
