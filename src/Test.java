public class Test {
    int a;

    Test() {
        a = 10;
    }

    Test(int z) {
        a = z;
    }

    void print() {
        System.out.println(a);
    }

    void main(String[] args) {
        Test obj = new Test();
        Test obj1 = new Test(20);
        obj.print();
        obj1.print();
    }
}
