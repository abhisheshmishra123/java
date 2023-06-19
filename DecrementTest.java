class DecrementTest
{
	public static void main(String[] args)
	{
		int a=10;
		int b=a-- + ++a+ --a +a++ + --a + a--;
		// b=10(a=9)+10(a=10)+9(a=9)+9(a=10)+9(a=9)+9(a=8)
		System.out.println("value of a="+a);//8
		System.out.println("value of b="+b);//56
		

	}
}