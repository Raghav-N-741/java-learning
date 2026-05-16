public class Demo1 {
    public static void main(String args[])
    {
        String a="Raghav";
        String b=new String("Rag");

        System.out.println(a.hashCode());
        System.out.println(b.hashCode());

        System.out.println("hello "+a);
        System.out.println(a.concat(" N"));
        //String methods
        System.out.println(a.charAt(2));
        System.out.println(a.indexOf("a"));
        System.out.println(a.substring(2,4)); //ends one before the last index
        String arr[]=a.split("a"); //can use a limit to the no of elements in array and last element will be the remaining string which may contain the splitting terms also
        for(String i:arr) System.out.println(i);
        String r="          Rag     ";
        System.out.println(r);
        System.out.println(r.trim()); //Removes whitespace from both ends of string but does not change original string it just gives a copy

        //String buffer ---used when we need a mutable string
        StringBuffer sb1=new StringBuffer();
        System.out.println(sb1.capacity());
        StringBuffer sb2=new StringBuffer("Raghav");
        System.out.println(sb2.capacity());
        sb1.append("Rags");
        System.out.println(sb1);
    
        sb1.setLength(2);
        sb1.ensureCapacity(5);
    
        String s3=sb1.toString();
    }
}
