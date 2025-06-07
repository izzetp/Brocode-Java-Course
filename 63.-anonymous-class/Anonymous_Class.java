public class Anonymous_Class {
    public static void main(String[] args) {
        
        Dog63 dog = new Dog63();

        Dog63 dog1 = new Dog63();
        Dog63 dog2 = new Dog63(){
            @Override
            void speak() {
                System.out.println("SCobby Doo says *Ruh Roh*");
            }
        };

        dog.speak();

        dog1.speak();
        dog2.speak();
    }
}
