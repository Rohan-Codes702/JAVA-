class polygons
{
    void shape()

    {
        System.out.println("drawawing shapes");
    }
}
class cir extends polygons
{
    void shape()

    {
        System.out.println("1.Circle is polygons");
    }
}
class rectangle extends polygons
{
    void shape()

    {
        System.out.println("2.Rectangle");
    }
}
class square extends polygons
{
    void shape()

    {
        System.out.println("3.Square");
    }
}
class pentagone extends polygons
{
    void shape()

    {
        System.out.println("4.Pentagone");
    }
}
class Hexagone extends polygons
{
    void shape()

    {
        System.out.println("5.Hexagone");
    }
}
class octagone extends polygons
{
    void shape()

    {
        System.out.println("6.Octagone");
    }
}
public class poly{
    public static void main(String[] args)
    {
        polygons b =new cir();
        b.shape();
        polygons c=new Hexagone();
        c.shape();
        polygons d=new octagone();
        d.shape();
        polygons e=new pentagone();
        e.shape();
        polygons f=new rectangle();
        f.shape();
        polygons g=new square();
        g.shape();

    }
}
