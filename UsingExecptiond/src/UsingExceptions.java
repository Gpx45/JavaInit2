/**
 * Created by Victor on 5/8/2017.
 */
public class UsingExceptions
{
    public static void main(String[] args)
    {
        try
        {
            throwException(); //call method throwException.
        }
        catch (Exception exception)
        {
            System.err.println("Exception handled in main");
        }

        doesNotThrowException();

    }

    public static void throwException() throws Exception
    {
        try
        {
            System.out.println("Method throwException");
            throw new Exception(); // generate exception

            // code here would not be reached and would cause a compilation error.
        }
        catch(Exception exception)
        {
            System.err.println(
                    "Exception handled in method throwException");
            throw exception; // rethrow further processing.
            // code here would not be reached and would cause a compilation error.
        }
        finally
        {
        System.err.println("Finally executed in throwException");
        }

        // code here would not be reached and would cause a compilation error.
    }

    public static void doesNotThrowException()
    {
        try
        {
            System.out.println("Method doesNotThrowException");
        }
        catch (Exception exception)
        {
            System.err.println(exception);
        }
        finally
        {
            System.err.println(
                    "Finally executed in doesNotThrowException");
        }

        System.out.println( "End of method doesNotThrowException" );
    }




}