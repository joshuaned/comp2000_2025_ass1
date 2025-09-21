public class WaterCabbageButton extends Button {

    public WaterCabbageButton(int x, int y) {
        super(x, y);
        plant = new WaterCabbage(this);
    }
}
