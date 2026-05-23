-Day09
-Interface
    .Say we have an abstract class but it contains only abstract methods then we can just make that an interface instead
    .It is not a class
    .By default every method is public abstract so no need to mention that
    .keyword used: implements
    .we can declare variables and methods but not define it
    .all the variables in an interface are by default static and final
    .a class can implement multiple interfaces
    . class -class -->extends
      class -interface -->implements
      interface -interface -->extends
    .even if no class implements it a .class is created for it and even if we don't create object for the implemented class .class is created for them too
-Enumeration(enums)
  .named constants which we create
  .It is a class but we cannot extend it with other class so as usual we can define methods,constructors,variables
  .Unlike other classes it does not extend Object class instead Enum class
  .their values are also numbered from start as index 0,1,...
  .we can use enum_name.values() to get the entire list but we need to store it as an array eg:Status[] s=Status.values();
  .switch case also supports enum and in if else for comparing we can use eg: s==Status.Running 
  .all same to class but one difference is cannot extend like class
