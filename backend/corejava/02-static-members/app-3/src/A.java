class A 
{   
	static 
	{
       System.out.println("A-SBI1");
	}
	static
	{
		System.out.println("A-SBI2");
	}
	public static void main(String[] args) 
	{
		System.out.println("A-main");
	}
	static
	{
		System.out.println("A-SBI3");
	}
	static
	{
		System.out.println("A-SBI4");
	}
}

