class Counter
{
    int count;
    public synchronized void incr()
    {
        count++;
    }
}
public class Demo11_2 {
    //Thread safety 
    public static void main(String[] args) throws InterruptedException {
        Counter c=new Counter();
        Runnable ob1=() ->
            {
                for(int i=0;i<1000;i++)
                {
                    c.incr();
                }
            };
        Thread a=new Thread(ob1);
        Runnable ob2=() ->
        {
            for(int i=0;i<1000;i++)
            {
                c.incr();
            }
        };
        Thread b=new Thread(ob2);
        a.start();
        b.start();


        a.join(); //main thread waits for this thread to come back and join
        b.join();
        System.out.println(c.count);
    }
}
