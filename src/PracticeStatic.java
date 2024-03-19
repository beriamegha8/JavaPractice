class yay{
    static int count= 0;
    int a= 10;

    public yay(int a){
        System.out.println("New obj created");
        this.a= a;
        count++;
    }

    static int returnCount(){
        return count;
    }
}
public class PracticeStatic {
    public static void main(String []args){
        yay p1= new yay(10);
        yay p2= new yay(20);

        System.out.println(p1.a);
        System.out.println(yay.returnCount());

        System.out.println(p2.a);
        System.out.println(yay.returnCount());

        p1.a= 100;

        System.out.println(p1.a);
        System.out.println(yay.returnCount());

        System.out.println(p2.a);
        System.out.println(yay.returnCount());
    }
}
