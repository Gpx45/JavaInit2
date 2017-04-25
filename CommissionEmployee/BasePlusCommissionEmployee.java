
public class BasePlusCommissionEmployee
{
  private String firstName, lastName, socialSecurityNumber;
  private double grossSales, commissionRate, baseSalary;

  public BasePlusCommissionEmployee(String first, String last, String ssn,
  double sales, double rate, double salary)
  {
    firstName = first;
    lastName = last;
    socialSecurityNumber = ssn;
    setGrossSales(sales);
    setCommissionRate(rate);
    setBaseSalary(salary);
  }

  public void setFirstName(String first)
  {
      firstName = first;
  }

  public String getFirstName()
  {
    return firstName;
  }

  public void setLastName(String last)
  {
    lastName = last;
  }

  public String getLastName()
  {
    return lastName;
  }

  public void setSocialSecurityNumber(String ssn)
  {
    socialSecurityNumber = ssn;
  }

  public String getSocialSecurityNumber()
  {
    return socialSecurityNumber;
  }

  public void setGrossSales(double sales)
  {
    if (sales >= 0.0)
    grossSales = sales;
    else
    throw new IllegalArgumentException(
    "Gross Salary must be >= 0.0");
  }

  public double getGrossSales()
  {
    return grossSales;
  }

  public void setCommissionRate(double rate)
  {
    commissionRate = rate;
  }

  public double getCommissionRate()
  {
    return commissionRate;
  }

  public void setBaseSalary(double salary)
  {
    if (salary >= 0.0)
    baseSalary = salary;
    else
    throw new IllegalArgumentException(
    "Base salary must be >= 0.0");
  }

  public  double getBaseSalary()
  {
    return baseSalary;
  }

  public double earnings()
  {
    return baseSalary + (commissionRate * grossSales);
  }

  @Override
  public String toString()
  {
    return String.format("%s: %s %s\n%s: %s\n%s: %.2f\n%s: %.2f\n ",
    "base-salaried commission employee", firstName, lastName,
    "social security number", socialSecurityNumber,
    "gross sales", grossSales, "commission rate", commissionRate,
    "base salary", baseSalary);
  }
}
