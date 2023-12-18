class E 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		int i=0;
		do
		{ 
			
			System.out.println("begin:"+i);
			i++;
			if(i >2);
			{
				continue;
			}
			System.out.println("end:"+i);
		}
		while(i<10);
		System.out.println("main end");
	}   

}
