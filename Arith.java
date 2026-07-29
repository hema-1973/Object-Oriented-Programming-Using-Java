import java.util.*;
interface Calculator
{
  void add(int a, int b);
  void sub(int a, int b);
  void mul(int a, int b);
  void div(int a, int b);
}
class Arithmetic implements Calculator
{
   public void add(int a, int b)
   {
      System.out.println("Addition = " + (a+b));
    }
   public void sub(int a, int b)
   {
      System.out.println("Subtraction = " + (a-b));
    }
   public void mul(int a, int b)
   {   
      System.out.println("Multiplication = " + (a*b));
    }
    public void div(int a, int b)
   {   if(b==0)
           System.out.println("Division not possible");
       else
           System.out.println("Division = " + (a/b));
    }
}
class Arith
{
   public static void main(String args[])
   {
      Scanner sc = new Scanner(System.in);
      Calculator c = new Arithmetic();
      System.out.print("Enter First Number: ");
      int a = sc.nextInt();
      System.out.print("Enter Second Number:");
      int b = sc.nextInt();
      System.out.println("\n ArithmeticOperations");
      c.add(a, b);
      c.sub(a, b);
      c.mul(a, b);
      c.div(a,b);
    }
}
