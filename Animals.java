class animal{

    public void makeSound(){
        System.out.print("Animal makes sound");
    }
}

class dog extends animal{
    @Override
    public void makeSound(){
        System.out.println("Dog barks");
    }
}
class cat extends animal{
    @Override
    public void makeSound(){
        System.out.println("Cat meows");
    }
}

public class Animals {
    public static void main(String[] args){

    cat c1 = new cat();
    dog d1 = new dog();
    c1.makeSound();
    d1.makeSound();
}
}
