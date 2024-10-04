public class integer {
 public static void main(String[] args)
 {
   int []marks={1,2,3,4,5,6,7,8,9,};
   int num=51;
   boolean isinarray=false;
   for(int element:marks)
   {
     if(num==element)
     {
       isinarray=true;
       break;
     }
   }
   if(isinarray)
   {
       System.out.println("Value is present in the array");
   }
   else
   {
       System.out.println("value is not presentt in array");

   }
 }
}
