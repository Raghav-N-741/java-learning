class RaghavException extends Exception
{
    public RaghavException(String a)
    {
        super(a);
    }
}
class AB 
{
    public void show() throws ClassNotFoundException
    {
        Class.forName("Helo");
    }
}
public class Demo10_2 {
    public static void main(String[] args)
    {
        int i=20,j=0;
        try
        {
            j=18/i;
            if(j==0)
                throw new RaghavException("I built this shit");
            if(j==0)
                throw new ArithmeticException("Don't use a greater value for div mate");
        }
        catch(RaghavException e)
        {
            System.out.println("this is mine  " + e);
        }
        catch(ArithmeticException e)
        {
            j=18/1;
            System.out.println("This is the default value" + e);
        }
        catch(Exception e)
        {
            System.out.println("There is something wrong" + e);
        }
        System.out.println(j);


        //throws
        AB o=new AB();
        try
        {
            o.show();
        }
        catch(ClassNotFoundException e)
        {
            System.out.println("Oops no such class exists " + e);
        }
    }
}
