

public class CommissionEmployeeTest
{
  public static void main(String[] args)
  {
    "Sue", "Jones", "222-222-2222", 10000, .06);
    CommissionEmployee employee = new CommissionEmployee(

    System.out.println("Employee information obtained by get methods: \n");
    System.out.printf("%s %s \n","First name is", employee.getFirstName());
    System.out.printf("%s %s \n","Last name is", employee.getLastName());
    System.out.printf("%s %s \n","Social Security Number is",
    employee.getSocialSecurityNumber());
    System.out.printf("%s %.2f\n","Gross Sales is", employee.getGrossSales());
    System.out.printf("%s %.2f\n","Commission Rate is", employee.getCommissionRate());

    employee.setGrossSales(500);
    employee.setCommissionRate(.1);

    System.out.printf("\n%s:\n\n%s\n","Updated employee information obtained by toString"
    , employee);


  }




}
