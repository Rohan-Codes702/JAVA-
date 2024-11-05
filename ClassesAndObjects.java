package BasicJava.java;

public class ClassesAndObjects {
    public static class Name//Creating an class
    {
        int id=1;
        String Name="Rohan";
    }

    public static void main(String[] args)
    {

        Name n=new Name();//Object
        System.out.print("Id:"+n.id);
        System.out.print("Name:"+n.Name);

    }
}
