public class Polymorphism {
    public static void main(String[] args) {
        
        Car2 car = new Car2();
        Bike2 bike = new Bike2();
        Boat2 boat = new Boat2();

        car.go();
        bike.go();
        boat.go();
    }
}
