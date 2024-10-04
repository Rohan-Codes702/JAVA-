class phone {
    public void ring()
    {
        System.out.println("Ringing..");
    }
    public void cut()
    {
        System.out.println("Cut the call");
    }
}
class smart extends phone
{
    public void camera()
    {
        System.out.println("camera ");
    }
    public void android()
    {
        System.out.println("Android system: ");
    }
}

public class inheritance1 {
    public static void main(String[] args)
    {
        smart s=new smart();
        s.android();
        s.cut();
        s.ring();
        s.camera();
    }
}
