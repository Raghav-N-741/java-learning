interface A 
{
     int age=50; //final and static
     String name="Raghav";
     void show();
     void config();
}
interface X
{
    void run();
}
interface Y extends X
{

}
class B implements A,Y
{
    public void show()
    {
        System.out.println("In show");
    }
    public void config()
    {
        System.out.println("In config");
    }
    public void run()
    {
        System.out.println("In run");
    }
}
public class Demo9 {
    public static void main(String args[])
    {
        A obj=new B();
        obj.show();
        obj.config();

        X obj1=new B();
        obj1.run();
    }
}
