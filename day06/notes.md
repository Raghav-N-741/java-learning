Day 06
-Naming convention:
    .Java follows Camel Casing
    .Class & interface : First letter Capital eg: Calc, Runnable
    .variable & methods: First letter small eg: mark, show()
    .constants: All are capitals eg: PIE,BRAND
    .More than 1 word : eg: showMyMarks()   
-Object:
    . Human ob1=new Human() --reference  object
    .new Human() -- anonymous object
-Inheritance:
    .definiton: A class can reuse fields and methods of another class
    .A child class does not directly inherit the parent class's constructors & private members
    .parent/super/base class has child/sub/derived class
    .child/sub/derived class is  parent/super/base class
    .public class AdvCalc extends Calc //even if we don't have a Calc.java file we can use this we just need a Calc.class file
    .Types:
        -Single level inheritance : b extends a
        -Multi level inheritance :  c extends b extends a
        -Multiple inheritance : c extends b,a does not work in Java due to ambiguity 
        -Hierarchical inheritance: b extends a,c extends a
    .Whenever we create an object of a class the super classes constructors are also called that too before the class for which we have created an object
    .Evey constructor in Java has a method super() even if we don't mention it,it calls the parent classes constructor
    .Every class in Java extends the Object class
    .this keyword is used in a class's parameterized constructor to call the class's default constructor
    .Method Overriding:
        -same name and parameters bt different definiton in child class
    .Runtime polymorphism: 
        -Upcasting-A child object can be treated as a parent type
        -for overriden methods,Method call depends on OBJECT,not reference type .
        -variables are resolved using REFERENCE TYPE methods are resolved using OBJECT TYPE
        -methods runtime,variables compile time
-Packages: 
    .folder is refered as a package
    .suppose you want to move a file to a folder called tools
        write package tools; inside the file and to use that file in the main function in the main class use import tools.fileName;
    .Java has some in-built packages like java.util
    .in java all the in-built class we use belongs to a  package
    .By default every java file have java.lang.* imported so that only we can use System and String

-Additional points
    .Every time we compile the java file we get class files for all the classes mentioned in the program that we are using that is if we are creating objects of those classess
    
