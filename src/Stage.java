import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Stage {
  Grid grid;
  List<Actor> actors;
  List<Button> buttons = new ArrayList<Button>();
  int money = 0;
  
  boolean isPlanting = false;

  public Stage() {
    grid = new Grid();
    actors = new ArrayList<Actor>();
    //actors.add(new Cat(grid.cellAtColRow(0, 0).get()));
    //actors.add(new Dog(grid.cellAtColRow(0, 15).get()));
    //actors.add(new Bird(grid.cellAtColRow(12, 9).get()));    
  }

  public void paint(Graphics g, Point mouseLoc) {
    grid.paint(g, mouseLoc);
    for(Actor a: actors) {
      a.paint(g);
    }

    // always visable UI
    g.drawString("Money: $" + String.valueOf(money), 740, 15);
    g.drawString("Placing: " + String.valueOf(money), 820, 15);

    Optional<Cell> underMouse = grid.cellAtPoint(mouseLoc);
    if(underMouse.isPresent()) {
      Cell hoverCell = underMouse.get();
      g.setColor(Color.DARK_GRAY);
      g.drawString(String.valueOf(hoverCell.tile), 740, 30);
      g.drawString(String.valueOf(hoverCell.col) + String.valueOf(hoverCell.row), 740, 45);

      if(hoverCell.hasPlant()) g.drawString("Planted in cell: " + String.valueOf(hoverCell.plant), 800, 30);
    }

    // TODO : make buttons
    buttons.add(new CarrotButton(740, 150, 0));

    for(Button b: buttons) {
      b.paint(g);
    }
  }

  public void mouseClicked(Point p) {
    Optional<Cell> selected =  grid.cellAtPoint(p);
    if(selected.isPresent()) {
      Cell cell = selected.get();
      if (cell.tilePlantable(true)) { // check if you can plant there
        cell.plant = new Carrot(cell);
      }
    }


  }
}
