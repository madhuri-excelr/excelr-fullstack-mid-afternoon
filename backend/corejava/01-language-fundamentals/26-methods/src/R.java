class R 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		System.out.println(test()+test());
		System.out.println("Hello World!");
	}
	static int test()
	{
		System.out.println("from test");
		return 100;
		}
}	
