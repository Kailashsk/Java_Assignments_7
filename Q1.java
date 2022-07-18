/*Create a class named 'Member' having the following data members:
Name, Age, Phone number, Address and Salary.
It also has a method named 'printSalary()' which prints the salary of the 
members. Two classes 'Employee' and 'Manager' inherit the 'Member' class. 
The 'Employee' and 'Manager' classes have data members 'specialization' 
and 'department' respectively. 
Now, assign name, age, phone number, address and salary to an employee 
and a manager by making an object of both of these classes and print the 
same.*/


class Member{
    String Name,Address;
    int Age,Salary;
    String PhoneNo;

    Member(String Name,int Age,String PhoneNo,String Address,int Salary)
    {
        this.Name=Name;
        this.Age=Age;
        this.PhoneNo=PhoneNo;
        this.Address=Address;
        this.Salary=Salary;
    }
 

    void printSalary(){
    System.out.println("Salary "+Salary);
    }

    void show(){
        System.out.println("Name "+Name);
        System.out.println("Age "+Age);
        System.out.println("PhoneNo "+PhoneNo);
        System.out.println("Address "+Address);
        System.out.println("Salary "+Salary);
        }
}

class Employee extends Member
{
    String specialization;
    Employee(String Name,int Age,String PhoneNo,String Address,int Salary,String specialization)
    {
        super(Name,Age,PhoneNo,Address,Salary);
        this.specialization=specialization;
    }
}

class Manager extends Member
{
    String department;
    Manager(String Name,int Age,String PhoneNo,String Address,int Salary,String specialization)
    {
        super(Name,Age,PhoneNo,Address,Salary);
        this.department=department;
    }

}


public class a71 {
    
    public static void main(String[] args) {
        Employee emp=new Employee("Kailash", 23, "7978763604", "Sbp", 28000, "MCA");
        emp.printSalary();
        emp.show();

        Manager mgr=new Manager("Kailash", 23, "7978763604", "Sbp", 28000, "MCA");
        emp.printSalary();
        emp.show();
    }
}
