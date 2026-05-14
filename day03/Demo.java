//Class and objects
class Calculator
{
    int d=5;
    public int add(int a,int b)
    {
        //a,b are  local variables, d is an instance variable
        return a+b;
    }
    //Method Overloading
    public int add(int a,int b,int c)
    {
        return a+b+c;
    }
}
public class Demo {
    public static void main(String a[]) 
    {
        //n1,n2 are primitive variables
        //cal is a reference variable
        
        int n1=4,n2=5;
        Calculator cal=new Calculator();
        Calculator cal1=new Calculator();


        int r=cal.add(n1, n2);
        System.out.println(r);



        cal1.d=7;
        System.out.println(cal.d);
        System.out.println(cal1.d);

    }
}

