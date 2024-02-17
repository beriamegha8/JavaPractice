class student{
    String name;
    int age;
    int id;

    float fees;

    student(String name,int age,int id){
        this.name=name;
        this.age=age;
        this.id=id;
    }
    student(String name,int age,int id,float fees){
        //using the parent cons on invoked the class cont
        this(name,age,id);
        this.fees=fees;


    }
    void display(){
        System.out.println(name + " " + age +  " "+ " " + id + " "+ fees );
    }
}
public class PracticeJava {
    public static void main(String[] args) {
        student obj=new student("zaid",20,101);
        student obj1=new student("Raj",12,102,5000);
        obj.display();
        obj1.display();

    }

}
