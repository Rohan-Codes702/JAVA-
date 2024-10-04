class stack{
    int size;
    int top;
    int []a;

    public boolean isfull()
    {
        if(this.top==size)
        {
            return true;
        }
        return false;
         }
    public boolean isempty()
    {
        if (this.top==-1)
        {
            return true;
        }
        return false;
    }
    public void push(int num)
    {
        if (isfull())
        {
            System.out.println("Stack was overfull:");
        }
        this.top++;
        this .a[this.top]=num;
        System.out.println(num+"pushed");
    }
    public int pop()
    {
        if (isempty())
        {
            return -1;
        }
        int num=this.a[this.top];
        this.top--;
        return num;
    }
}

public class stackarray {
    public static void main(String[] args) {
        stack s = new stack();
        s.size = 50;
        s.top = -1;
        s.a = new int[s.size];
        s.push(12);
        s.push(13);
        s.push(14);
        s.push(15);
        s.push(16);
        System.out.println("poped element are;" + s.pop());
        System.out.println("poped element are;" + s.pop());
        System.out.println("poped element are;" + s.pop());
        System.out.println("poped element are;" + s.pop());
        System.out.println("poped element are;" + s.pop());
    }
}
