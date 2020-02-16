package Silver;

import Gold.Employee;

public class MainProgram {

    public static void main(String [] args){
        Employee emp = new Employee();
        System.out.println("The Id of the employee is:"+emp.empId);
        System.out.println("The Salary of the employee is:"+emp.empSalary);
        System.out.println("The percentage  of Tax the  employee need to pay:"+emp.empTax);
        System.out.println("The total number  of working days is :"+emp.empDaysOfWork);
        // System.out.println("The pFRate  is :"+emp.getPF());


    }

}

