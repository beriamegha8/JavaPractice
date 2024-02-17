//Java program to convert primitive into objects
//autoboxing example of int to Integer
public class WrapEx {
    public static void main(String[] args){
        //Converting int into Integer
        int a=20;
        System.out.println("Value of a without autoboxing: "+a);
        Integer i=Integer.valueOf(a);//converting int into Integer explicitly
        System.out.println("Value of i without autoboxing: "+i); //i, here is automatically unboxed to integer string + int = string
        System.out.println("Value of a after autoboxing: "+ String.valueOf(a)); //a here is explicitly unboxed to integer
        Integer j=a;//autoboxing, now compiler will write Integer.valueOf(a) internally
        System.out.println("Value of j after autoboxing: "+j);

        int x= i.intValue();//converting Integer to int explicitly
        int y= j;//unboxing, now compiler will write a.intValue() internally
        float y2= j;//unboxing, now compiler will write a.intValue() internally
        long y3= j;//unboxing, now compiler will write a.intValue() internally
        double y4= j;//unboxing, now compiler will write a.intValue() internally

        float f1= j.floatValue();//converting Integer to float explicitly
        float f2= j;//unboxing, now compiler will write a.floatValue() internally

        System.out.println(f1+" "+f2);
        System.out.println(x+" "+y);
    }
}
