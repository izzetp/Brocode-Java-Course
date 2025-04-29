public class Arrays_Of_Objects {
    public static void main(String[] args) {
        
        Car0 car1 = new Car0("Mustang", "Red");
        Car0 car2 = new Car0("Corvette", "Blue");
        Car0 car3 = new Car0("Charger", "Yellow");

        Car0[] cars = {car1, car2, car3};

        for (int i = 0; i < cars.length; i++) {
            cars[i].drive();
        }

        for (Car0 car : cars) {
            car.color = "black";
        }

        for (Car0 car : cars) {
            car.drive();
        }
    }
}