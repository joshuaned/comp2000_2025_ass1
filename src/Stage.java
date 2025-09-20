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
    Optional<Cell> underMouse = grid.cellAtPoint(mouseLoc);
    if(underMouse.isPresent()) {
      Cell hoverCell = underMouse.get();
      g.setColor(Color.DARK_GRAY);
      g.drawString(String.valueOf(hoverCell.tile), 740, 30);
      g.drawString(String.valueOf(hoverCell.col) + String.valueOf(hoverCell.row), 740, 45);

      if(hoverCell.hasPlant()) g.drawString("Planted in cell: " + String.valueOf(hoverCell.plant), 800, 30);
      g.drawString("Placing: ", 800, 45);
    }

    // TODO : make buttons
    buttons.add(new CarrotButton(740, 150));

    for(Button b: buttons) {
      b.paint(g);
    }

    // TODO: planting and collection system
  }
}
