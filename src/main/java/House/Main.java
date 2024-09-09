package House;

public class Main {
    public static void main(String[] args) {
        House cottage = new CottageBuilder("Brick walls", "Large windows", "Wooden doors", "roof")
                .withSwimmingpool("I want swimming pool")
                .build();
        System.out.println(cottage);

    }
}
