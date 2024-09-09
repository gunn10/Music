package House;

public class Mansion extends House{
    String walls;
    String windows;
    String doors;
    String roof;
    String swimmingpool;
    String garden;

    public Mansion(MansionBuilder mansionBuilder){
        super( mansionBuilder.swimmingpool,  mansionBuilder.doors, mansionBuilder.garden,  mansionBuilder.roof,  mansionBuilder.walls,  mansionBuilder.windows);

    }

}
