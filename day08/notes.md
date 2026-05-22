-Day 08
-Abstract keyword:
    .abstract methods can belong to only abstract class
    .whichever class is extending the abstract class will contain the abstract methods definition
    .the child class must contain the parent classes abstract method for sure
    .You cannot create object of an abstract class but refrence can be abstract type and object can be concrete type when creating an object
    .It is not compulsory to have an abstract method in an abstract class but an abstract method can be present only in an abstract class 
    .Say there are 2 methods in the abstract class and I am not able to implement all of them in a child class then i need to declare the child class also as an abstract class and its child class must contain the implementation
    .The child class of an abstract class is called concrete class
    .abstract class can have constructors because child class objects still need parent initialization
 -Inner Class:
    .we can make an inner class static because of which we can access everything in that inner class without evening creating an object for that inner class then  A.B obj1=new A.B();
    .Eg b is an inner class of A then we can define an object like A.B ob1=obj.new B();   
    .Anonymous inner class:
        -If i want to change the behaviour of a method in class but without creating a child class and overriding it then we use this
        - inner class without a name
        -eg A ob1=new A()
            {
                //give the updated behaviours
            }; we are not creating an object for class A this is an object of this anonymous class
            