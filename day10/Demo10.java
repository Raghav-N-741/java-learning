interface A 
{
    void show();
}
interface B 
{
    void show1(int i);
}
interface C 
{
    int add(int a,int b);
}
public class Demo10 {
    public static void main(String[] args)
    {
        // A obj=new A()
        // {
        //     public void show()
        //     {
        //         System.out.println("In show");
        //     }
        // };
        A obj=() ->
        {
            System.out.println("In show");
            System.out.println("doing like this because of more than 1 statement");
        };
        obj.show();
        A obj1=() -> System.out.println("It has 1 line only so we can write like this");
        obj1.show();

        //for single parameter
        B obj2=i -> System.out.println(i);
        obj2.show1(7);

        // C obj3=(x, y) -> 
        // {
        //     return x+y;
        // };
        C obj3=(x,y) -> x+y;
        System.out.println(obj3.add(9,7));

    }

}
