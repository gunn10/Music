package House;

public class CottageBuilder {
    String walls;
    String windows;
    String doors;
    String roof;
    String swimmingPool;
    String garden;

    public CottageBuilder(String walls, String windows, String doors, String roof) {
        this.walls = walls;
        this.windows = windows;
        this.doors = doors;
        this.roof = roof;
    }

    public CottageBuilder withSwimmingpool(String swimmingpool) {
        this.swimmingPool = swimmingpool;
        return this;
    }

    public CottageBuilder withGarden(String garden) {
        this.garden = garden;
        return this;
    }

    public Cottage build() {
        return new Cottage(this);
    }
}
