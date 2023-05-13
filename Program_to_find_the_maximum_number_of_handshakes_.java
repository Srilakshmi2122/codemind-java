import java.util.*;
public class Handshakes
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,t;
        n=sc.nextInt();
        t=((n-1)*n)/2;
        System.out.println(t);
    }
}