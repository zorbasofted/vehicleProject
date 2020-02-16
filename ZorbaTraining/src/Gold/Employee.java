package Gold;

public class Employee {
    // instance variable
    public  long empId=345;
    public  double empSalary=10000;
    public  float  empTax= 9.5f;
    public  int  empDaysOfWork=24;

    private float calculatePF(){
        float p=  10.5f;
        float pfRate= p*.5f;
        // System.out.println("The PF of the Employee is :"+pfRate);
        return pfRate;
    }

    public static void main(String [] Args){
        Employee emp = new Employee();
        emp.getPF();
    }

    public void getPF(){

        System.out.println("The CalculatePF is "+calculatePF());

    }

}
