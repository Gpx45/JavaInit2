/**
 * Created by Victor on 5/8/2017.
 */
public class UsingExceptions
{
    public static void main(String[] args)
    {
        try
        {
            method1(); // call method
        }
        catch (Exception e) // catch exception thrown in method1
        {

            System.err.printf("%s\n\n", e.getMessage());
            e.printStackTrace();

            // obtain stacktrace information
            StackTraceElement[] traceElements = e.getStackTrace();

            System.out.println("\nStack trace from getStackTrace:");
            System.out.println("Class\t\t\tFile\t\t\t\t\tLine\tMethod");

            // loop through traceElements to get exception description.
            for (StackTraceElement element : traceElements)
            {
                System.out.printf("%s\t", element.getClassName());
                System.out.printf("%s\t", element.getFileName());
                System.out.printf("%s\t", element.getLineNumber());
                System.out.printf("%s\n", element.getMethodName());
            }
        }
    }

    public static void method1() throws Exception
    {
        method2();
    }

    public static void method2() throws Exception
    {
        method3();
    }

    public static void method3() throws Exception
    {
        throw new Exception("Exception thrown in method3");
    }

}
