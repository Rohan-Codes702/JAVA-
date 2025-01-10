package Oops;

abstract class Animal{
    abstract void sound();

    void eat()
    {
        System.out.println("Animal Eats the Food ");
    }
}

class cow extends Animal{
    void sound()
    {
        System.out.println("Sound of Cow id COw cow");
    }

}

public class Abstraction {
    public static void main(String[] args) {
        Animal al=new cow();
        al.eat();
        al.sound();



    }
}
