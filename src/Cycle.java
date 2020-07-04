public class Cycle implements Vehicle {
    public void honk() { System.out.println("trinn, trinn!");}
        public String getType() {
            return "Cycle";
        }
        private int max_speed;
        private int max_price;
        private String Brand;

        Cycle (int a,int b,String c) {
            this.max_speed = a;
            this.max_price = b;
            this.Brand = c;
        }
    public String getCategory() {
        return "Cycle";
    }


}
