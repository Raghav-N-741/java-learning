Day 5
-Encapsulation
    .Hiding internal data/implementaion using private keyword and controlling the access through methods(using getters & setters)
    .for setters use this keyword or take object as input if same name for local and instance variable
    .| Modifier  | Same Class | Same Package | Subclass | Everywhere |
     | private   | YES        | NO           | NO       | NO         |
     | default   | YES        | YES          | NO       | NO         |
     | protected | YES        | YES          | YES      | NO         |
     | public    | YES        | YES          | YES      | YES        |
    .Defensive copying used sometimes when there are mutable objects
    .Immutable classes
        -add final keyword for class-prevents inheritance
        -make fields private so they are accesible only from that class
        -No setters
        -Initialize through constructors
-Constructor

-Static keyword
    .if a variable is declared static in a class then it is shared by all the objects..it belongs to the class not the object since it is static
    .static block-irrespective of the no of classes created this block is executed only once
when the class is loaded into the class loader if it was due to an object creation it is executed even before the constructor
    .since it is a static variable even though we can use ob1.age it is better to use classname.age
    .Static method: it can use static variable but cannot use instance varible directly it will
    need the particular object for which we need the instance varible 
    .Why main function is declared as static method:if not we would need an object of the class first to be created and then we need to call the main function but since it is static we don't need to create an object for the class we can just call the classname.main()
Additional points:
.Default value for string is null
.JVM has a space called class loader which contains all the classes that are loaded
.Class.forName("ClassName") is used to load the class in JVM's class loader so the static block runs once here
.every time an object is created 1. class loads & 2.objects are instantiated