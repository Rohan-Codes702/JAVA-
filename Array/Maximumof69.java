package Array;

public class Maximumof69 {
    private static Integer Interger;

    public static void main(String[] args) {
        int num=6999;

        char []ch=String.valueOf(num).toCharArray();

        for (int i=0;i<ch.length;i++){
            if (ch[i]=='6'){
                ch[i]='9';
            }
        }
        String s=new String(ch);
        System.out.println(Interger.parseInt(s));
    }
}
