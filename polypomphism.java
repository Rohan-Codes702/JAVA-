class bike
{
    void run()
    {
        System.out.println("avrage of bikes");
    }

}
class spelender extends bike
{
    void run()
    {
        System.out.println("Average of the splender is 65km/hr");
    }
}
class shine extends bike
{
    void run()
    {
        System.out.println("Average of the Shine is 60km/hr");
    }
}

public class polypomphism {
    public static void main(String[] args)
    {
        bike b= new spelender();
        b.run();
        bike c=new shine();
        c.run();

    }
}

