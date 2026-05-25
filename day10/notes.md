-Day10:
-Annotations:
    .a supplement to the compiler or runtime
    .a metadata 
    .Eg: @Override if it is not happening then it will show an error
    .Eg: @Deprecated for a class so if someone tries to use that class then they will get to know that this class is deprecated
    .Eg: @FunctionalInterface
-Interface(continue):
    .Types:
        -Normal interface -->interface  with 2 or more methods
        -Functional interface (SAM-Single abstract method) :
            .only 1 method
            .to specify it use the annotation @FunctionalInterface 
            .can use lambda expression
        -Marker interface/tagging interface -->interface with no methods,a blank interface
-Lambda Expression:
    .Got introduced in Java 8
    .can use them only with functional interface
-Exceptions:
    -Error types:
        .Compile time error eg:syntactical error which will be informed during compile time
        .Runtime error --> execution is stopped in between
        .Logical error --> a bug 
    -Runtime errors are called exceptions and we need to handle them
    -Statements can be of 2 types: -Normal  -Critical
    -Exception class is the parent class for the all the other exception classes like ArithmeticException class it extends RuntimeException which extends Exception like that
    -Exception  class extends Throwable
    -The hierarchy of classes
     .Object class --> Throwable
     .Throwable is split into 2 as:
        .Error -->you can't handle when it happens the execution will stop eg:when threads die,IO error,out of memory etc.
        .Exception ->you can and handle these
    .Exception  can be split as RuntimeException,SQLException,IOException etc
    .RuntimeException: ArithmeticException,ArrayIndexOutOfBounds exception,NullPointerException
    .All the runtimeexceptions are called unchecked exception but all the other exceptions in exception are called checked exception eg: when loading the class using class.forName it is a checked exception
    -Eg: ArithmeticException,ArrayIndexOutOfBoundsException,NullPointerException when we try to get the length of the string when the string is null
    .throw and throws keyword:
        .throw: used to throw the exception eg: throw new ArithmeticException();
        .throws: used in methods when we don;t want to deal with the exception there itself
            .throws does NOT cause propagation.Propagation already happens automatically by JVM.
          throws is mainly used for: Checked exceptions,Informing the caller,Compile-time checking/documentation
    .We can build custom exceptions  by creating class that extend Exception / RuntimeException
-Additional points:
    .bugs: not a compile time or a runtime issue but a logical issue
    .Serialization and Deserialization: Serialization in Java is the process of converting an object's state into a byte stream eg say in your harddrive. Deserialization is the exact reverse process, where the byte stream is used to recreate the actual Java object back into memory.
    .Statements can be of 2 types: -Normal  -Critical
    .Classes which ends with 'able' mostly are interface eg: runnable,serializable but throwable is a class
