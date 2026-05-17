class Human
{
    String name;
    static int age; //since it is static variable it is shared by all the objects..it belongs to the class not the object since it is static
    static //irrespective of the no of objects created this block will be executed only once
    {
        age=19; //we can do  this in constructor also but then every time object is created we will be doing this again and again  unnecessarily
        //it is called first even before the constructor
    }
    public Human()
    {
        name="Rags";
    }
    public void show() //--this is an instance method
    {
        System.out.println(name + ": "+age);
    }
    public static void show1()
    {
        //we can use a static variable inside a static method but cannot use a non-static variable inside a static method
        //but if we know in which object we can then use it like obj1.name
        System.out.println("This is a static method");
    }
}
public class Demo5_1 {
    public static void main(String args[]) throws ClassNotFoundException//if not created as a static function then first we need to create
    //an object for Demo5_1 and  then call this function
    {
        Class.forName("Human"); //to load the class in class loader without creating an object so static block also runs once
        Human ob1=new Human();
        Human ob2=new Human();
        ob1.show();
        ob2.show();
        Human.age=50; //can use the object name also but this is better way
        ob1.show();

        Human.show1();
    }
    //every time an object is created 1. class loads & 2.objects are instantiated
    //Jvm has a space called class loader which contains all the class which are loaded
    //since classes are loaded only once at that time static block is executed
}
