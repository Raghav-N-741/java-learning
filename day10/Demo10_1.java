public class Demo10_1 {
    public static void main(String args[])
    {
        int i=5; //Normal statement
        int j=0;
        int arr[]=new int[2];
        try
        {
            j=16/i; //critical statement 
            System.out.println(arr[3]);
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Index is large");
            System.out.println(e);
        }
        catch(Exception e)
        {
            System.out.println("something is wrong");
            System.out.println(e);
        }
        System.out.println(j);
    }
}
