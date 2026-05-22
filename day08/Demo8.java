abstract class Car
{
    // public void drive()
    // { }   this is allowed but instead of opening the curly braces and not defining
    //the method we can just declare  it and no one will be able to create an object for it.
    public abstract void drive();
    public abstract void fly();
    public void playMusic()
    {
        System.out.println("play music");
    }
}
abstract class WagonR extends Car  // ---->Abstract Class
{
    public void drive()
    {
        System.out.println("Driving..");
    }

}
class UpdatedWagonR extends WagonR // ---->Concrete class
{
    public void fly()
    {
        System.out.println("I am flying");
    }
}

abstract class AB 
{
    abstract public void show();
}


public class Demo8 {
    public static void main(String args[])
    {
        Car obj= new UpdatedWagonR();
        obj.drive();
        obj.playMusic();

        AB ob1=new AB()
        {
            public void show()
            {
                System.out.println("Insider the inner class");
            }
        };
        ob1.show();
    }
}
