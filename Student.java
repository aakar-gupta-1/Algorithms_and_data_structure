//returns the percentage and name of the student
import java.io.*;

class Student
{
    private String name;
    private int phy;
    private int che;
    private int comp;
    private int math;
    private int eng;
    private double per;

    public void input()throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the name of the Student.");
        name=br.readLine();
        System.out.println("Enter the marks of Physics.");
        phy=Integer.parseInt(br.readLine());
        System.out.println("Enter the marks of Chemistry.");
        che=Integer.parseInt(br.readLine());
        System.out.println("Enter the marks of Computers.");
        comp=Integer.parseInt(br.readLine());
        System.out.println("Enter the marks of Mathematics.");
        math=Integer.parseInt(br.readLine());
        System.out.println("Enter the marks of English.");
        eng=Integer.parseInt(br.readLine());
    }
    public String nam()
    {
        return name;
    }

    public double per()
    {
        per=(phy+che+comp+math+eng)/5;
        return per;
    }

    public void print()
    {
        System.out.println("The percentage of "+name+" is " + per);
    }
    
    public static void main()throws IOException
    {
        double temp;
        Student a=new Student();
        a.input();
        temp=a.per();
        a.print();
    }
}