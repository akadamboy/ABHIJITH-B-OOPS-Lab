import java.util.Scanner;
public class employee
{
int eNo;
String name;
float Salary;

public void getInput()
{
	Scanner in =  new Scanner(System.in);
	System.out.println("Enter the employee id:");
	empid = in.nextInt();
	System.out.println("Enter the employee name:");
	name = in.next();
	System.out.println("Enter the salary:");
	salary = in.nextFloat();
}

public void display()
{
System.out.println("Enter the employee id:");
System.out.println("Enter the employee name:");
System.out.println("Enter the employee salary:");
}

public static void main(String[] args)
{
employee e[]= new employee[5];

for (int i=0;i<5;i++)
{
	e[i] = new Employee();
	e[i].getInput();
}

for(int i=0;i<5;i++)
{
e[i].display();
}
}

}

