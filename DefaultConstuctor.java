package Oops;


class name{
    String Name;

    name(){
        Name="Rohan";
    }
    void dispaly()
    {
        System.out.println("Name OF Student is:"+Name);
    }

}

public class DefaultConstuctor {
    public static void main(String[] args) {
        name n=new name();
        n.dispaly();

    }
}
