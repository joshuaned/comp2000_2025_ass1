import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

public class Button extends Rectangle {
    Plant plant;
    boolean isClicked = false;
    int index;

    public Button(int x, int y, int z) {
        super(x, y, 140, 60);
        index = z;
    }

    public void paint(Graphics g) {
        // TODO: paint the button, make it display the text, also display the poly
        if (isClicked) {
            g.setColor(Color.GRAY);
        } else {
            g.setColor(Color.WHITE);
        }
        g.fillRect(x, y, width, height);
        g.setColor(Color.BLACK);
        g.drawRect(x, y, width, height);

        g.drawString(String.valueOf(plant), x + width/3, y + height/4);
        g.drawString("$ " + String.valueOf(plant.price), x + width/3, y + height/2);
        g.drawString("Type: " + (plant.waterPlant ? "Water" : "Land"), x + width/3, y + height/4*3 - 3);
        g.drawString("Growth time: " + String.valueOf(plant.growthTimeMax), x + width/3, y + height - 3);
        plant.paint(g);
    }

    public void mouseClicked() {
        isClicked = !isClicked; // toggle button
    }
}
