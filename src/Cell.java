import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.Rectangle;
import java.util.Random;

public class Cell extends Rectangle {
  static int size = 35;
  char col;
  int row;
  Random r = new Random(); // for random num
  Tile tile;

  public Cell(char inCol, int inRow, int x, int y) {
    super(x, y, size, size);
    col = inCol;
    row = inRow;

    // randomly decide the tile type
    int temp = r.nextInt(2);

    if(temp == 1) {
      tile = new Lava(this);
    } else {
      tile = new Grass(this);
    }
  }

  public void paint(Graphics g, Point mousePos) {
    if(contains(mousePos)) {
      g.setColor(Color.GRAY);
    } else {
      tile.paint(g); // instead of white put the biomes
    }
    g.setColor(Color.BLACK);
    g.drawRect(x, y, size, size);
  }

  public boolean contains(Point p) {
    if(p != null) {
      return super.contains(p);
    } else {
      return false;
    }
  }
}
