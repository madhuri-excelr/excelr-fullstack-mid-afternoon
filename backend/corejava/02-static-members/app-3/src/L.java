class L 
{
	static int i = test();
	static
	{
		System.out.println("SBI begin");
		main(null);
		System.out.println("SBI end");
	}
	static int test()
	{
		System.out.println("test begin");
		main(null);
		System.out.println("test end");
		return 20;
	}
	public static void main(String[] args) 
	{
		System.out.println("main: "+i);
	}
	}

