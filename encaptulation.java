class Students {
    private String name;
    private int marks;

    void setName(String name){
        this.name = name;

    }
    void setMarks(int marks){
        this.marks = marks;

    }

    String getName(){
        return name;
    }
    int getMarks(){
        return marks;
    }
}


public class encaptulation {
    public static void main(String[] args){
        Students s1 = new Students();

        s1.setName("Anu");
        s1.setMarks(80);

        System.out.println("Name: " + s1.getName());
        System.out.println("Mark: " + s1.getMarks());

    }
}
