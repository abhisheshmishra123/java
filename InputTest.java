import java.util.Scanner;//package
class InputTest
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any integer value");
		int a=sc.nextInt();
		System.out.println("enter any float value:");
		float b=sc.nextFloat();
		System.out.println("enter any double value:");
		double d=sc.nextDouble();
		System.out.println("enter any string value:");
		String s=sc.next();
		System.out.println("enter any character value:");
		char c=sc.next().charAt(1);
		System.out.println("value of a="+a);
		System.out.println("value of b="+b);
		System.out.println("value of d="+d);
		System.out.println("value of s="+s);
		System.out.println("value of c="+c);

	}
}