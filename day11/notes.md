-Day11:
-Ways to take input from user:
    .Using System.in.read() but it read only integer values 1 at a time and give the ASCII value
    .InputStreamReader in=new InputStreamReader(System.in);
     BufferReader bf=new BufferReader(in);
     int num=Integer.parseInt(bf.readLine());
    .Scanner sc=new Scanner(System.in);
-Threads:
    .Smallest unit of an execution inside a process
    .Light weight
    .Share resources
    .Run parallely with other threads
    .In every thread we need to have a run method
    .scheduler gives priority value for each thread from 1-10 1 is least priority and 10 is the max
    .you can see the current priority of a thread by thread.getPriority();
    .still we are only suggesting the scheduler to assign a particular priority for a particular thread
    .Creating a thread:
        -Create a class that extends the Thread class
        -Create a class that implements the Runnable interface and create a reference variable for the Runnable interface and an object for the class pass this variable to an object of a thread as parameterized constructor 
    .It is better to make a method that you think could do some mutation thread safe as threads and mutability together is not a good thing
    .Thread States:
        -New -Runnable -Running -Waiting/Blocked -Dead
    .Daemon thread:
        .Daemon thread-background helper thread,user thread-main worker thread
        .Every thread by default is a user threat it is changed to daemon thread using threadname.setDaemon(true);
        .When the user threads are all done the JVM will kill all the daemon threads and exit but it always waits for the user threats to complete
    .Thread pool:
        -Instead of creating new threads repeatedly created a fixed no of workers threads and reuse them
        -Java provides thread pools using ExecutorService
        -Eg:ExecutorService service=Executors.newFixedThreadPool(3);
            service.execute(task);
            service.shutdown(); --finish current task & don't accept new tasks
    .Volatile keyword fixes visibility but not atomicity
Additiona points:
.println() is a method of PrintStream class..so to use that we need to create an object of printstream but we don't need to do that because it is already created 'out' object as static variable inside System class
.variables declared in a try block are block sccoped
.int num=System.in.read(); (for 0 it is 48) it gets an input and gives it ASCII value  and it reads only 1 character at a time
.Classes like Scanner & BufferReader are resources so it should be closed after their use
.If you want to write  try but not catch like you want to do this but not handle if an error occurs they you can use try with finally
.finally is also used whenever we want to close a resource
.try with resource :
     try(BufferedReader br=new BufferedReader(new InputStreamReader(System.in)))
        {
            num=Integer.parseInt(br.readLine());
        } this will close the bufferReader automatically because BufferReader extends Reader extends Closable extends AutoClosable
.A method is called thread safe if only one thread can work with it at 1 point keyword:synchronized