interface Animal{
    int eyes = 2;
    void walk(); // by default public and abstract
}

interface Herbivore{
    void eat(); 
}

class Horse implements Animal, Herbivore{ //multiple inheritance
    public void walk() //here we need to specify public otherwise it default
    {
        System.out.println("walks on 4 legs");
    }

    public void eat(){ /* here if you don’t define the method, your class remains 
                        incomplete, and the compiler throws an error */
        System.out.println("horse eats plant");
    }
}

class Chicken implements Animal{
    public void walk(){
        System.out.println("walks on 2 leg");
    }
}

public class Test {
    public static void main(String[] args) {
        {
            Horse horse = new Horse();
            horse.walk();
            horse.eat();
            System.out.println("Horse eyes: " + horse.eyes);

            System.out.println("-------------------------------------------");

            Chicken chicken = new Chicken();
            chicken.walk();
            System.out.println("Chicken eyes: " + chicken.eyes);
        }
    }
}
