public class Getter_Setter {
    public static void main(String[] args) {
        
        Car52 car = new Car52("Charger", "Yellow", 10000);

        car.setColor("Blue");
        car.setPrice(5000);

        System.out.println(car.getColor() + " " + car.getModel() + " " + car.getPrice());
    }
}
