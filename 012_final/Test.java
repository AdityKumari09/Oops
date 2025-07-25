final class Vehicle{ //final class(can't be extended)
    final int maxSpeed = 120; //final variable(can't be reassigned)

    public final void showSpeed(){ //final method(can't be overridden in subclass)
        System.out.println("Max speed :- " + maxSpeed + " km/h");
    }
}

public class Test {
    public static void main(String[] args) {
        Vehicle v = new Vehicle();
        // v.maxSpeed = 150; //Error: cannot reassign a value to final variable
        v.showSpeed();
    }
}
