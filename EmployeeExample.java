class Employee
{
    private int employeeId;
    private String name;
    private double salary;
public Employee(int employeeId,String name,double salary)
{
this.employeeId=employeeId;
this.name=name;
this.salary=salary;
}
public int getEmployeeId()
{
return employeeId;
}
public String getName()
{
return name;
}
public double getsalary()
{
return salary;
}
public void increasesalary(double percentage)
{
if(percentage>0)
{
salary+=salary*(percentage/100);
System.out.println("salary increased by "+ percentage +"% new salary:$"+salary);
}
else 
{
System.out.println("Invalid percentage.salary remains unchanged .");
}
}
}
public class EmployeeExample
{
    public static void main(String [] args)
    {
        Employee employee1= new Employee(1,"Selvamathi",50000.0);
        Employee employee2= new Employee (2,"Gripsy",60000.0);
        System.out.println("Employee1:ID-"+employee1.getEmployeeId()+",Name-"+employee1.getName()+",salary-$"+employee1.getsalary());
        System.out.println("Employee2:ID-"+employee2.getEmployeeId()+",Name-"+employee2.getsalary());
      employee1.increasesalary(10);
      employee2.increasesalary(-5);
      System.out.println("updated Employee1;salary-$"+employee1.getsalary());
      System.out.println("updated Employee2:salary -$"+employee2.getsalary());
    }
}



  OUTPUT 
    Employee1:ID-1,Name-Selvamathi,salary-$50000.0
Employee2:ID-2,Name-60000.0
salary increased by 10.0% new salary:$55000.0
Invalid percentage.salary remains unchanged .
updated Employee1;salary-$55000.0
updated Employee2:salary -$60000.0
BUILD SUCCESSFUL (total time: 0 seconds