import java.util.Scanner;
 public class FindConsecutiveOnes
{
   public static int findConsecutiveOnesCount(int arr[],int size)
   {
      int max_count=0,count=0,i;
	  for(i=0;i<size;i++)
	  {
	        if(arr[i]==1)
			   count++;
			else
			{
			   if(count>max_count)
			      max_count=count;
				count=0;
			}
	  }
	  if(count>max_count)
	    max_count=count;
		
	  return max_count;
   }
   public static void main(String args[])
   {
       Scanner sc=new Scanner(System.in);
	   int n,x[],i;
	   n=sc.nextInt();
	   x=new int[n];
	   for(i=0;i<n;i++)
	      x[i]=sc.nextInt();
		  
	  int result=findConsecutiveOnesCount(x,n);
	  	  System.out.println(result);
   }
}
