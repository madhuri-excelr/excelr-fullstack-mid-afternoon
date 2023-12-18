class G 
{
	public static void main(String[] args) 
	{
	 System.out.println("main begin");
	 test();
	 System.out.println("main end");
		{
			System.out.println("from test 1 begin");
			if (true)
			{
				for(int i=1;i<=5;i++)
				{
					int j=0;
					while(j<=1)
					{
						int k=10;
						do
						{
							System.out.println("from do-while body");
							k++;
						}
						while (k<=2);
						i++;
					}
				}
			}
		System.out.println("from test 1 end");
		}
	}
}


			



	
