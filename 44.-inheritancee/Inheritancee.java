public class Inheritancee {
    public static void main(String[] args) {
        
        Dog dog = new Dog();
        Cat cat = new Cat();
        Plant plant = new Plant();

        dog.eat();
        cat.eat();

        System.out.println(dog.isAlive);
        System.out.println(cat.isAlive);
        System.out.println(plant.isAlive);

        plant.photosynthesize();
        
    }
}
