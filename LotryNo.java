import java.util.Scanner;
import java.lang.Math;
class LotryNo
{
	public static void main(String [] args)
	{
	 Scanner sc=new Scanner(System.in);
	 System.out.println("enter name");
	 String Name=sc.nextLine();
	 System.out.println("Hey....\n"+Name+" congratulation u have lotry no of"+( (int)(Math.random()*1000))+"\n...........beat of luck..........");
	}
}