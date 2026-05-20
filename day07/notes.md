-Day07:
-Access Modifier:
                        Private         Protected        Public      Default
    .Same class            Yes              Yes            Yes          Yes
    .Same package           No              Yes            Yes          Yes
      subclass                      
    .Same package           No              Yes            Yes          Yes
      non-subclass
    .Different package      No              Yes            Yes          No
      subclass
    .Different package      No              No             Yes          No
      non-subclass 
-Polymorphism:
    -Many behaviour 
    -Types:
        .Compile time/early binding polymorphism Eg: Overloading
        .Run time/late binding polymorphism :
            -Eg:Overriding
            -Dynamic Method Dispatch the name for the overall process of deciding which method from which class should be run during runtime
-final keyword:
    .variable: makes a variable constant
    .class: stops inheritance after making the class final
    .method: that method cannot be overrided
-Object Class:
    .Every time we try to print the object System.out.println(obj1) the system automatically calls obj1.toString();
    .The default behaviour in Object class of .equals() method is to compare the references are pointing to the same object in memory or not but this is overriden by classes like String,wrapper classes(Integer,Double,Long,Character),Collections
-Typecasting:
    .eg:double to int:
      double a=4.6
      int b=(int) a;
    .in objects 2 types: upcasting & downcasting 
-Wrapper Class:
    .Wrapper classes are classes that wrap primitive data types into objects.
    .Needed because certain frameworks or features like collections does not work for primitive type
    .int--Integer ,char -- Character,  double -- Double etc for every primitive type java has a class for it

-Additional Points:
    .import java.util.*; import all the files and programs  in util folder only
    .You can have only 1 public class in a file
    .== checks the reference point .equals() checks the value
    .Whenever we override .equals method we should override  .hashCode method also because collections like HashMap and HashSet depends on hashcode
    .Whenver there is a line in your IDE for a particular syntax it means the syntax is deprecated in newer Java versions Eg: Integer num=new Integer(8); has been deprecated (and marked for removal later) because Java prefers autoboxing or Integer.valueOf().

    