public class CarrotButton extends Button {
    
    public CarrotButton(int x, int y) {
        super(x, y);
        plant = new Carrot(this);
    }
    
}
