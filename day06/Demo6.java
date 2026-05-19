import tools.AdvCalc;

class A 
{
    public A()
    {
        System.out.println("In A");
    }
    public A(int n)
    {
        System.out.println("In A int");
    }

    public void show()  //method overriding eg:
    {
        System.out.println("in show of A");
    }
  
}
class B extends A
{
    public B()
    {
        super(3);
        System.out.println("In B");
    }
    public B(int n)
    {
        this();
        System.out.println("In B int");
    }

    public void show()
    {
        System.out.println("In B show");
    }
}
public class Demo6 {
    public  static void main(String[] args)
    {
        AdvCalc ob1=new AdvCalc();
        System.out.println(ob1.add(5,2));
        System.out.println(ob1.multi(5,3));

        B obj=new B(5);
        
        A obj1=new A();
        obj.show();
        obj1.show();
    }
}
 