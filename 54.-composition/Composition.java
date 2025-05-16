public class Composition {
    public static void main(String[] args) {
        
        Car54 car = new Car54("Corvette", 2025, "v8");

        System.out.println(car.model);
        System.out.println(car.year);
        System.out.println(car.engine.type);

        car.start();
    }
}
