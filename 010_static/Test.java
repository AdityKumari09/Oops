class Student{
    String name;
    static String school; // if we want to make anything common or generalized.

    public static void changeSchool() { 
    //automatically change the school name for every obj which will be created
        school = "newschool";
        System.out.println("Changed school name: " + school);
    }
}

public class Test 
{
    public static void main(String[] args) {
        Student.school = "HMS";//we can acess static variable or method without creating obj.
        Student student1 = new Student();
        student1.name = "Adity";
        System.out.println("Student name & school : " + student1.name + ", " 
                            + student1.school);
        student1.changeSchool(); 

    }
}
