public class Bike implements Vehicle{

    @Override
    public void honk() {
        System.out.println("wuuuu, wuuu!");
    }

    @Override
    public String getType() {
        return "Bike";
    }
}
