package House;

public abstract class House {
    final String walls;
    final String windows;
    final String doors;
    final String roof;
    String swimmingpool;
    String garden;

    public House(String walls, String windows, String doors, String roof, String swimmingpool, String garden) {
        this.walls = walls;
        this.windows = windows;
        this.doors = doors;
        this.roof = roof;
        this.swimmingpool = swimmingpool;
        this.garden = garden;
    }

    @Override
    public String toString() {
        return "House{" +
                "walls='" + walls + '\'' +
                ", windows='" + windows + '\'' +
                ", doors='" + doors + '\'' +
                ", roof='" + roof + '\'' +
                ", swimmingpool='" + swimmingpool + '\'' +
                ", garden='" + garden + '\'' +
                '}';
    }
}
