class A 
{
    int a;
    String b;
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + a;
        result = prime * result + ((b == null) ? 0 : b.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        A other = (A) obj;
        if (a != other.a)
            return false;
        if (b == null) {
            if (other.b != null)
                return false;
        } else if (!b.equals(other.b))
            return false;
        return true;
    }

    public String toString()
    {
        return "Hi Raghav";
    }
}
class B 
{
    public void show1()
    {
        System.out.println("In B");
    }
}
class C extends B
{
    public void show2()
    {
        System.out.println("In C");
    }

}
public class Demo7 {
    public static void main(String[] args)
    {
        A ob1=new A();
        System.out.println(ob1); //Op: Hi Raghav

        B obj=(B) new C(); //Upcasting
        obj.show1();
        C obj1=(C) obj; //Downcasting
        obj1.show1();
        obj1.show2();
    }
}
