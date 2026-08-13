class person{
    protected String name;
    protected int age;

    person(String name, int age){
        this.name = name;
        this.age = age;
    }
}

class students1 extends person{
    private int rollno;
    private double mark;

    students1(String name, int age, int rollno, double mark){
        super(name, age);
        this.rollno = rollno;
        this.mark = mark;
    }

    public void display(){
            System.out.println("name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Roll No: " + rollno);
            System.out.println("mark: " + mark);

    }

}

public class StudentRecord {
    public static void main(String[] args){
        students1 s1 = new students1("Binitta Saji", 23,123, 99.9);

        s1.display();
    }
}
