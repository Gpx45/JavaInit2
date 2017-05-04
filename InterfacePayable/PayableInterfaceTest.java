


public class PayableInterfaceTest
{
  public static void main(String[] args)
  {
    //create four element Payable array.
    Payable[] payableObjects = new Payable[4];
      //populate array with  objects that implement Payable
      payableObjects[0] = new Invoice("01234", "seat", 2, 375.00);
      payableObjects[1] = new Invoice("5678", "tire", 4, 79.95);
      payableObjects[2] = new SalariedEmployee("John", "Smith", "111-11-1111", 800.00);
      payableObjects[3] = new SalariedEmployee("Jenny", "Berriees", "222-22-2222", 800.00);

      System.out.println(
      "Invoices and Emplyees processed polymorphically:\n");
      //generically proccess each element in array payables
      for (Payable currentObject : payableObjects)
      { //output currentObject and its appropiate payment amout.
        System.out.printf("%s \n%s: $%,.2f\n\n",
          currentObject.toString(),
          "payment due", currentObject.getPaymentAmount());
      }
  }
}
