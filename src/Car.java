class Car implements Vehicle {

    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.honk();
        System.out.println(myCar.getType());
    }

    public void honk() {
        System.out.println("Tuut, tuut!");
    }

    public String getType() {
        return "CAR";
    }
}