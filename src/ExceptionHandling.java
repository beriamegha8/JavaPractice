public class ExceptionHandling {
    public static void main(String[] args)  {
        int a = 10;
        int b = 0;
        try {
            int c = a / b;
            System.out.println(c);
            //System.out.println(a); //This line will not be executed as the code will throw an exception
            //System.out.println(b); //so any line after that will not be executed, so we only put the sus lines in try catch block
        }
        //catch (Exception e)- Exception is a parent class of ArithmeticException
        catch (ArithmeticException e) {
            //System.out.println("Divide by zero error");
            System.out.println(e.getMessage());
            //e.printStackTrace(); //This will print the stack trace of the exception (exact line number with the error)
        }
        finally {
            System.out.println("Finally block");
        }
        System.out.println(a);
        System.out.println(b);
        System.out.println("End of program");
    }
}
