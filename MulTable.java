import java.util.Scanner;
class MulTable
{
	public static void main(String [] args)
	{
	  Scanner sc=new Scanner(System.in);
	  System.out.println("enter number upto  which table to be displayed");
	  int no=sc.nextInt();
	
	   for(int i=1;i<=no;i++)
	   {
	       System.out.println("*********table for"+i+"*********");
	       int counter=1;   
	       while(counter<11)
	         {
	            System.out.println(i+"*"+counter+"= "+(i*counter));
	           counter++;  
 	          }
	        
	    }
	}
}