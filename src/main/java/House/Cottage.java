package House;

public class Cottage extends House {
    String walls;
    String windows;
    String doors;
    String roof;
    String swimmingPool;
    String garden;

    public Cottage(CottageBuilder builder) {
        super(builder.walls, builder.windows, builder.doors, builder.roof, builder.swimmingPool, builder.garden);

    }

}
