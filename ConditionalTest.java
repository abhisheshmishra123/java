//WAP to find the greater number among two number using ternory/conditional operator
class ConditionalTest
{
	public static void main(String args[])
	{
		System.out.println("enter Fisrt number:");
		int a=Integer.parseInt(System.console().readLine());
		System.out.println("enter Second number:");
		int b=Integer.parseInt(System.console().readLine());
		int result=(a>b)?a:b;

		System.out.println("greater number="+result);
		System.out.println("greater number="+(a>b?a:b));

	}
}