import java.util.Scanner;

class MyException extends Exception
{
 public MyException(String str)
 {
  System.out.println(str);
 }
}

public class SignException 
{
 public static void main(String[] args)
 {
  Scanner sc = new Scanner(System.in);
  System.out.print("Input number :: ");
  
  try 
  {
   int num = sc.nextInt();
   if(num < 0)
    throw new MyException("Number is negative");
   else
    throw new MyException("Number is positive");
  }
  catch (MyException m) 
  {
   System.out.println(m);
  }
 }

}
