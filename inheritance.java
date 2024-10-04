class animal
{
    void eat()
    {
        System.out.println("Animals action:");
        System.out.println("Eating:");
    }
}
class dog extends animal {
    void bark() {
        System.out.println("Dog-");
        System.out.println("Barking:");
    }

}
public class inheritance {
    public static void main(String[] args)
    {
        dog a= new dog();
        a.bark();
        a.eat();

    }
}
