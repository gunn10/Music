package House;



public class MansionBuilder {
    String walls;
    String windows;
    String doors;
    String roof;
    String swimmingpool;
    String garden;


    MansionBuilder withWalls(String walls){
        this.walls=walls;
        return this;
    }
    MansionBuilder withWindows(String windows){
        this.windows=windows;
        return this;
    }
    MansionBuilder withDoors(String doors){
        this.doors=doors;
        return this;
    }
    MansionBuilder withRoof(String roof){
        this.roof=roof;
        return this;
    }
    MansionBuilder withSwimmingpool(String swimmingpool){
        this.swimmingpool=swimmingpool;
        return this;
    }
    MansionBuilder withGarden(String garden){
        this.garden=garden;
        return this;
    }
    public Mansion build(){

        return new Mansion(this) ;
    }

}
