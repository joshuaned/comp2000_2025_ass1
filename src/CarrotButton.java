public class CarrotButton extends Button {
    
    public CarrotButton(int x, int y, int z) {
        super(x, y, z);
        plant = new Carrot(this);
    }
    
}
