
package assignments;

import java.util.Scanner;

public class main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            // creating an array of 10 employees
            Employee[] employees;
            employees = new Employee[10];
            
            
            // reading the data by scanner
            for(int a=0 ; a <10 ; a++)
            {
                Employee e = new Employee();
                System.out.println("everyone in a single line Enter the name , the department and the salary of the employee");
                System.out.println();
                
                String name = scanner.nextLine();
                
                Double bonus = scanner.nextDouble();
                Double salary = scanner.nextDouble();
                String department = scanner.nextLine();
                e.setName(name);
                e.setDepartment(department);
                e.setSalary(salary);
       
                employees[a] = e ;   
            }
            
            
            // sorting the employee by salary
            System.out.println("\n the employees sorten by salary");
            for (int d=0 ; d < employees.length ; d++)
            {
                for (int f = d+1 ; f <employees.length ; f++)    
                {
                    if (employees[d].getSalary()<employees[f].getSalary())
                    {
                        Employee e = employees[d];
                        employees[d] = employees[f];
                        employees[f] = e ;
                    }
                }
   
            System.out.println(Employee.counter);
                
            }
  
        }   
}
