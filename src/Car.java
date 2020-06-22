class Car implements Vehicle {

    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.honk();
        System.out.println(myCar.getType());
    }

    @Override
    public void honk() {
        System.out.println("Tuut, tuut!");
    }

    @Override
    public String getType() {
        return "CAR";
    }
}