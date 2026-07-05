class Student {
    String name;
    int age;
    int roll_no;
}
public class SimpleClass {
    public static void main(String[] args){
        Student s1 = new Student();

        s1.name = "Binitta";
        s1.age = 23;
        s1.roll_no = 123;

        System.out.println("name: " + s1.name);
        System.out.println("age: " + s1.age);
        System.out.println("Roll no: " + s1.roll_no);



    }
}
