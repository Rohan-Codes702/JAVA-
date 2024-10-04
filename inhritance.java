class base{
    public int x;
    public int getX()
    {
        return x;
    }
    public void setX(int x)
    {
        this.x=x;
    }

}
class derived extends base
{
    public int y;
    public int getY()
    {
        return y;
    }
    public void setY(int y)
    {
        this.y=y;
    }
}
public class inhritance {
    public static void main(String[] args)
    {
        base b=new base();
        b.setX(45);
        System.out.println(b.getX());

        derived d =new derived();
        d.setY(34);
        System.out.println(d.getY());
    }
}
