public class Demo7_1 {
    public static void main(String args[])
    {
        int n=7;
        // Integer num=new Integer(8); --->Boxing
        Integer num=8;   //----> Autoboxing
        int num1=num.intValue();  //  ---->unboxing
        int num2=num;          // ---->auto-unboxing
        System.out.println(n);
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num);


        String str="12";
        System.out.println(str+2);
        int num3=Integer.parseInt(str);
        System.out.println(num3+2);
    }
}
