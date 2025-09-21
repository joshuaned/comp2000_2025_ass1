public class WaterCabbageButton extends Button {

    public WaterCabbageButton(int x, int y, int z) {
        super(x, y, z);
        plant = new WaterCabbage(this);
    }
}
