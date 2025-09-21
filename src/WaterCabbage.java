import java.awt.Polygon;
import java.awt.Rectangle;
import java.util.ArrayList;

public class WaterCabbage extends Plant {

    public WaterCabbage(Rectangle x) {
        cell = x;
        growthTimeMax = 30;
        price = 10;
        color = color.CYAN;
        waterPlant = true; // this is a water plant

        display = new ArrayList<Polygon>();
        Polygon shape = new Polygon();
        shape.addPoint(cell.x + 10, cell.y + 10);
        shape.addPoint(cell.x + 30, cell.y + 10);
        shape.addPoint(cell.x + 20, cell.y + 30);

        display.add(shape);
    }
}
