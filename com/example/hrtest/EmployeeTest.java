package com.example.hrtest;
import java.util.Scanner;
import com.example.hr.Employee;
public class EmployeeTest {
         public static void main(String[] args) {
  			Employee em = new Employee();
  			Scanner sc = new Scanner(System.in);
  			 System.out.println("Enter name");
  			 String name = sc.nextLine();
  			System.out.println("Enter id");
             int id = sc.nextInt();
             System.out.println("Enter salary");
             double salary = sc.nextDouble();
             
             em.studentDetails(name);
             em.studentDetails(id);
             em.studentDetails(salary);
             
			em.printName();
			em.printSalary();
		}
}
