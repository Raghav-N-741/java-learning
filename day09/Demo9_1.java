enum Status
{
    Running,Failed,Pending,Raghav,Success;
}
enum Lap
{
    Mac(2000),idea(5000),thinkpad(7000);
    private int price;

    private Lap(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    
}
public class Demo9_1 {
    public static void main(String args[])
    {
        Status s=Status.Raghav;
        Status[] t= Status.values();
        System.out.println(s);
        System.out.println(s.ordinal());
        System.out.println(t);
        for(Status j:t) System.out.println(j);
        
        if(s==Status.Raghav) System.out.println("yes");
        switch(s)
        {
            case Running:
                System.out.println("All Good");
                break;
            case Failed:
                System.out.println("Try again");
                break;
            default:
                System.out.println("Success");
        }

        Lap l=Lap.Mac;
        Lap[] la=Lap.values();
        for(Lap x:la) System.out.println(x + ":" +x.getPrice());
        System.out.println(l);
        System.out.println(l + ":" + l.getPrice());

 
    }
}
