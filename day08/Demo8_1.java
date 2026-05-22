class A 
{
    int age;
    public void show()
    {
        System.out.println("in show");
    }
    class B 
    {
        public void config()
        {
            System.out.println("In config");
        }
    }
}
class C 
{
    public void show()
    {
        System.out.println("In C show");
    }
}
public class Demo8_1 {
    public static void main(String[] args)
    {
        A obj=new A();
        obj.show();
        A.B obj2=obj.new B();
        obj2.config();

        C obj3=new C() //-->this is an anonymous innner class and this is created 
        //inside Demo8_1 class not inside class C
        {
            public void show()
            {
                System.out.println("In new show ABCD");
            }
        };
        obj3.show();
    }
}
