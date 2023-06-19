class IncrementTest
{
	public static void main(String args[])
	{
		int a=5;
		int b=a++ + ++a + ++a;
		  //b=5(a=6)+7(a=7)+8(a=8)
		int c=++a+a++;
		//  c=9(a=9)+9(a=10)
		System.out.println("value of a="+a);//10
		System.out.println("value of b="+b);//20
		System.out.println("value of c="+c);//18
		
	}
}