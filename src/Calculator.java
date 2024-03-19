//using constructor
public class Calculator {
    int operand1;
    int operand2;
    int result;
    public Calculator(int operand1, int operand2){
        this.operand1= operand1;
        this.operand2= operand2;
    }
    public void add(){
        this.result= this.operand1 + this.operand2;
    }
    public void subtract(){
        this.result= this.operand1 - this.operand2;
    }
    public void multiply(){
        this.result= this.operand1 * this.operand2;
    }
    public void divide(){
        this.result= this.operand1 / this.operand2;
    }
    public void modulus(){
        this.result= this.operand1 % this.operand2;
    }
    public void display(){
        System.out.println(this.result);
    }
    public static void main(String []args){
        Calculator c1= new Calculator(10, 20);
        c1.add();
        c1.display();
        c1.subtract();
        c1.display();
        c1.multiply();
        c1.display();
        c1.divide();
        c1.display();
        c1.modulus();
        c1.display();
    }
}

//using getter and setter methods
// in the main method, we just call setter methods and pass the values
/*
public class Calculator {
    private int operand1;
    private int operand2;
    private int result;

    public void setOperand1(int operand1) {
        this.operand1 = operand1;
    }

    public int getOperand1() {
        return operand1;
    }

    public void setOperand2(int operand2) {
        this.operand2 = operand2;
    }

    public int getOperand2() {
        return operand2;
    }

    public int getResult() {
        return result;
    }

    public void add() {
        this.result = getOperand1() + getOperand2();
    }

    public void subtract() {
        this.result = getOperand1() - getOperand2();
    }

    public void multiply() {
        this.result = getOperand1() * getOperand2();
    }

    public void divide() {
        this.result = getOperand1() / getOperand2();
    }

    public void modulus() {
        this.result = getOperand1() % getOperand2();
    }

    public void display() {
        System.out.println(getResult());
    }

    public static void main(String[] args) {
        Calculator c1 = new Calculator();
        c1.setOperand1(10);
        c1.setOperand2(20);

        c1.add();
        c1.display();

        c1.subtract();
        c1.display();

        c1.multiply();
        c1.display();

        c1.divide();
        c1.display();

        c1.modulus();
        c1.display();
    }
}
*/