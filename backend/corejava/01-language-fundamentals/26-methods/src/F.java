class F	
{
	public static void main(String[] args) 
	{
		int i =2;
		switch (i)
		{
		case 1 :
			if (true)
			{
			System.out.println("from case 1");
			}
			break;
		case 2 :
			for (int j=1;j<=5 ;j++ )
             {
			System.out.println("from case 2:"+j);
             }
			 break;
        case 3 :
			int k=10;
		while(k<=15)
			{
			System.out.println("from case 3:"+k);
			k++;
			}
			break;
		}
	}
}
