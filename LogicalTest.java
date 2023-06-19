class LogicalTest
{
	public static void main(String args[])
	{
		int a=7,b=9,c=3;
		System.out.println(a>b&&a>c);//false
		System.out.println(4>3 && 6>9);//false
		System.out.println((4>8)&&(6>9));//false
		System.out.println(a>c||a>b);//true
		System.out.println(7>9||5>9);//false
		System.out.println(7>5||4>3);//true
		System.out.println(!(a>b&&a>c));//true
		
	}
}