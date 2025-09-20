import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

public class Button extends Rectangle {
    Plant plant;

    public Button(int x, int y) {
        super(x, y, 100, 50);
    }

    public void paint(Graphics g) {
        // TODO: paint the button, make it display the text, also display the poly
        g.setColor(Color.WHITE);
        g.fillRect(x, y, width, height);
        g.setColor(Color.BLACK);
        g.drawRect(x, y, width, height);

        g.drawString(String.valueOf(plant), x + width/3, y + height/4);
        plant.paint(g);
    }
}
