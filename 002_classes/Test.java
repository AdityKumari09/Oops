// classes name always initialize with Uppercase
class Pen{
    String color; //blueprint of class pen
    String type;

    public void write() //write() know as member/method of class
    {
        System.out.println("writing something");
    }

    public void printColor()
    {
        System.out.println(this.color);//this. -> helps to identify which obj is trying to acess this method 
    }
}

class Student{
    String name;
    int age;

    public void printInfo()
    {
        System.out.println(this.name);
        System.out.println(this.age);
    }

    /*------------------------------Constructor------------------------------------- */
    /*  Constructor calls only once in a class & don't need to write return type.
        If user don't call constructor then java automatically call the constructor itself.
    */

    //non-parametrized constructor
    Student()
    {
        System.out.println("constructor called");
    }


/*  Parameterized Constructor

    Student(String name, int age)
    {
        this.name = name;
        this.age = age;

        // here this.name/age -> is the name of object defined in class
        // name/age are the parameters defined in constructor
    }

*/

// copy constructor 
Student(Student s2)
{
    this.name = s2.name;
    this.age = s2.age;
}

}

public class Test
{
    public static void main(String[] args)
    {
        Pen pen1 = new Pen(); //pen1 is object of class Pen and Pen(): constructor
        pen1.color = "blue";
        pen1.type = "gel";

        Pen pen2 = new Pen();
        pen2.color = "black";
        pen2.type = "ballpoint";

        pen1.printColor();
        pen2.printColor();

        pen1.write();

        System.out.println("----------------------------------------------");

        Student s1 = new Student(); //name of constructor is always same as class name
        //Student s1 = new Student("Adity", 20); //passing arguments to parametrized constructors
        s1.name = "Adity";
        s1.age = 20;

        //calling copy constructor :
        Student s2 = new Student(s1);
        s2.printInfo();
    }
}

