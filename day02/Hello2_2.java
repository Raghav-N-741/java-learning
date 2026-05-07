
public class Hello2_2 {
    public static void main(String a[])
    {
        //Type conversion
        byte n1=127;
        System.out.println(n1);
        int n2=257;
        n1=(byte)n2; //Since n2 is out of range of byte it uses modulo operation
        System.out.println(n1);

        float f=5.6f;
        int t=(int)f;
        System.out.println(t);
        
        //Type promotion
        byte x=10,y=30;
        int result=x*y;
        System.out.println(result);

        //switch statement
        int x1=3;
        switch(x1)
        {
            case 1:
                System.out.println("H");
                break;
            case 3:
                System.out.println("I");
                break;
            default:
                System.out.println("Hi");
        }

    }
}
