public class Car54 {
    
    String model;
    int year;
    Engine engine;

    Car54(String model, int year, String engineType) {
        this.model = model;
        this.year = year;
        this.engine = new Engine(engineType);
    }

    void start() {
        this.engine.start();
        System.out.println("The " + this.model + " is running");
    }
}
