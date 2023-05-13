import java.util.Scanner;
 public class Sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        float x,y,z;
        x=sc.nextFloat();
        y=sc.nextFloat();
        z=(x+y)/2;
        System.out.format("%.4f",z);
        sc.close();
    }
}