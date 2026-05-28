import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Demo12
{
    public static void main(String[] args)
    {
        // Comparator<Integer> com=new Comparator<Integer>() { 
        //     public int compare(Integer i,Integer j)
        //     {
        //         if(i%10>j%10) return 1;
        //         return -1; //if returned 1 it will swap if returned -1 it will not swap
        //     }
        // };
        Comparator<Integer> com=(i,j) -> i%10>j%10 ? 1 : -1; 
        List<Integer> nums=new ArrayList<Integer>();
        nums.add(72);
        nums.add(38);
        nums.add(99);
        System.out.println(nums.get(2));
        System.out.println(nums.indexOf(3));
        for(int n:nums)
        {
            System.out.println(n);
        }
        //Custom sort
        Collections.sort(nums,com);
        System.out.println(nums); //Can directly print a collection

        Map<String,Integer> mpp=new HashMap<>();
        mpp.put("Rags",69);
        mpp.put("hav",9);
        mpp.put("A",7);
        System.out.println(mpp.get("Rags"));
        for(String a:mpp.keySet())
        {
            System.out.println(a + ":" + mpp.get(a));
        }
    }
}