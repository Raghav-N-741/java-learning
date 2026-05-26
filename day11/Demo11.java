import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Demo11
{
    public static void main(String[] args) throws IOException
    {
        System.out.println("Enter a no: ");
        int num=0;
        //try with resources
        try(BufferedReader br=new BufferedReader(new InputStreamReader(System.in)))
        {
            num=Integer.parseInt(br.readLine());
        }
        
        //3.
        Scanner sc=new Scanner(System.in);
        num=sc.nextInt();
        sc.close();


        // //2.
        // InputStreamReader in =new InputStreamReader(System.in);
        // BufferedReader bf=new BufferedReader(in);
        // try
        // {
        //     num=Integer.parseInt(bf.readLine());
        // }
        // catch(IOException e)
        // {
        //     System.out.println("Entered a wrong type of no try again "+e);
        // }
        System.out.println(num);
        // try
        // {
        //     bf.close();
        // }
        // catch(IOException e)
        // {
        //     System.out.println("something not right"+e);
        // }


        //1.
        // try
        // {
        //     num=System.in.read();
        // }
        // catch(IOException e)
        // {
        //     System.out.println("Entered a wrong type of no try again "+e);
        // }
        //System.out.println(num-48);
    }
}