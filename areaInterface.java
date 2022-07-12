import java.util.Scanner;
interface shape
{
double pi = 3.14;
double area(double x,double y);
double perimeter(double x,double y);
}
class circle implements shape{
public double area(double x,double y)
{
return(pi*x*x);
}
public double perimeter(double x,double y)
{
return(2*pi*x);
}
}
class rect implements shape{
public double area(double x,double y)
{
return(x*y);
}
public double perimeter(double x,double y)
{
return(2*(x+y));
}
}

class interfacepgm
{
public static void main(String arg[])
{
Scanner scan = new Scanner(System.in);
while(true){
System.out.println("1:Area&Perimeter of circle");
System.out.println("2:Area &Perimeter of Rectangle");
System.out.println("3:Exit");
System.out.println("Enter your choice::");
int choice = scan.nextInt();
switch(choice){
case 1:
 shape obj=new circle();
 System.out.println("Area of circle is:"+obj.area(2.0,1.0));
 System.out.println("Perimeter of circle is:"+obj.perimeter(2.0,1.0));
break;
case 2:
 shape obj2=new rect();
 System.out.println("Area of recangle is:"+obj2.area(3.0,2.0));
 System.out.println("Perimeter of rectangle is:"+obj2.perimeter(3.0,2.0));
break;
case 3: 
 System.out.println("Exiting the application");
 System.exit(0);
default: System.out.println("Incorrect input!!! Please re-enter choice from our 
menu");
}
}
}}
