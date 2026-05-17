class Student
{
    int rollno;
    String name;
}
public class Demo {
    public static void main(String args[])
    {
        System.out.println(Math.random());
        System.out.println(Math.random());
        System.out.println(Math.random());

        int nums[][]=new int[3][4]; // 2D array declaration
        System.out.println(nums[0][0]);
        int num1[][]=new int[3][]; //jagged array
        num1[0]=new int[3];
        num1[1]=new int[5];
        num1[2]=new int[2];
        for(int i=0;i<num1.length;i++)
        {
            for(int j=0;j<num1[i].length;j++)
            {
                num1[i][j]=(int)(Math.random()*10);
            }
        }
        for(int n[]:num1)  //for each loop(or called as enhanced for loop)-----works for array and array type of data
        {
            for(int m:n)
            {
                System.out.print(m+ " ");
            }
            System.out.println();
        }

        Student students[]=new Student[3];  //This just creates an array that can hold 3 student references not the actual value
        //1 way
        students[0]=new Student(); //now also students[0] is a reference variable only it stores the address in heap memory where it is actually stored
        students[1]=new Student(); 
        //2nd way
        Student s=new Student();
        s.name="Raghav";
        s.rollno=198;
        students[2]=s; //it stores the same reference as s
        students[0].name="Ra";
        students[1].name="gh";
        students[1].rollno=15;
        for(Student sa:students)
        {
            System.out.println(sa.name + " " + sa.rollno);
        }


    }
}
