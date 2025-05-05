public class Method_Overriding {
    public static void main(String[] args) {
        
        Dogg dog = new Dogg();
        Catt cat = new Catt();
        Fish fish = new Fish();

        dog.move();
        cat.move();
        fish.move();
    }
}