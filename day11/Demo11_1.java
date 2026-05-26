class A extends Thread
{
    public void run()
    {
        for(int i=1;i<=1000;i++)
        {
                System.out.println("hi" + i);
                try  
                {
                    Thread.sleep(10);
                } catch (Exception e) {
                    System.out.println("Not right");
                }
        }
    }
}
public class Demo11_1 {
    public static void main(String args[])
    {
        A ob1=new A();
        Runnable ob2=() ->   //we are first writing it as an anonymous inner class and then since it is only 1 method we are making it as lambda expression
        {
                for(int i=1;i<=1000;i++)
            {
            System.out.println("hello" + i);
            try  {
                Thread.sleep(10);
            } catch (Exception e) {
                System.out.println("Not right");
            }
            }
        };
        Thread t2=new Thread(ob2);
        //System.out.println(ob1.getPriority());
        // or ob1.setPriority(7);
        //t2.setPriority(Thread.MAX_PRIORITY);
        ob1.start();
        t2.start();
    }
}
