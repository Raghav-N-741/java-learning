class Human
{
    private int age;   //makes it accessible only from this class
    String name;
    private int h;

    //default and parameterized constructor
    public Human()
    {
        age=12;
        name="Rags";
    }
    public void setH(int h) { //need to use because preference is always given for local variable
        this.h = h; // take the obj also as input and obj.age=age;
    }
    public int getAge()  //getter
    {
        return age;
    }
    public void setAge(int a)  //setter
    {
        age=a;
    }
    public void show()
    {
        System.out.println(name + " :"+age);
    }
}
public class Demo5 {
    public static void main(String args[])
    {
        Human ob1=new Human();
        ob1.show();
        ob1.name="Raghav";
        ob1.setAge(19);
        System.out.println(ob1.getAge());
        System.out.println(ob1.name);
        ob1.show();
    }
}
