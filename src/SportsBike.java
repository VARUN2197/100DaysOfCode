
public class SportsBike extends Bike {

    private String Brand;
    private String model;
    private int bhp;
    private int engine;

    SportsBike(String Brand, String model, int bhp, int engine) {
        this.Brand = Brand;
        this.model = model;
        this.bhp = bhp;
        this.engine = engine;
    }

    public String getCategory() {
        return "SportsBike";
    }

    public static void main(String[] args) {
        SportsBike myBike = new SportsBike("Yamaha", "R15", 25, 150);
        myBike.honk();
        System.out.println(myBike.getType());
        System.out.println(myBike.getCategory());
        System.out.println(myBike.warranty);
<<<<<<< Updated upstream
        System.out.println("Harshil");
=======

        Cycle Cycle1 = new Cycle(10,1000,"Honda");
        Cycle1.honk();
        System.out.println(Cycle1.getType());
        System.out.println(Cycle1.getCategory());

>>>>>>> Stashed changes
    }

}
