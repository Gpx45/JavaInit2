/**
 * Created by Victor on 5/9/2017.
 */
public class UsingChainedExceptions
{
        public static void main(String[] args) {
            try
            {
                method1();
            }
            catch (Exception e) {
                e.printStackTrace();
            }
        }
    // call method2; throw exceptions back to main
        public static void method1() throws Exception
        {
            try
            {
                method2();
            }
            catch (Exception e)
            {
                throw new Exception("Exception thrown in method1", e);
            }
        }

    // call method3; throw exceptions back to method1
        public static void method2() throws Exception
        {
            try
            {
                method3();
            }
            catch (Exception e)
            {
                throw new Exception("Exception thrown in method2", e);
            }
        }

    // throw Exception back to method2
        public static void method3() throws Exception
        {
            throw  new Exception("Exception thrown in method3");
        }

    }

