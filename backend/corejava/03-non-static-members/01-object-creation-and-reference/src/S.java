class S 
{   
	int i;
	 static void test(S obj)
	{
		 obj.i=20;
	}
	public static void main (String[] args)
	{
		S s1=new S();
		s1.i=10;
		System.out.println("before calling test(S):"+s1.i);
		s1.test(s1);
		System.out.println("after calling test(S):"+s1.i);
	}
}
