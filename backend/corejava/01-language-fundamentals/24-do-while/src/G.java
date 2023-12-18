class G 
{
	public static void main(String[] args) 
	{   
		System.out.println("main begin");
		int i =0;
		do
		{
			System.out.println("loop1 begin :"+i);
			int j=0;
			do
			{
				System.out.println("loop2 begin:"+j);
				j++;
				System.out.println("loop2 end :"+j);

			}
			while (j<2);
			i++;
			System.out.println("loop1 end :"+i);

		}
		while (i<2);
		System.out.println("main end");
	}
}
