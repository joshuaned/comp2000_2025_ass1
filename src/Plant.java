public class Plant {
    int growthTimeMax;
    int growthTime;
    Cell cell;

    @Override
    public String toString() {
        return this.getClass().getSimpleName();
    }
}
