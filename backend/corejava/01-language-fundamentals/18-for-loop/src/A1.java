class  A1
{	
	public static void main(String[] args) 
	{   
	int n=5;
	for (int i=n;i>=1;i--)
	{
	for (int j=n-1;j>=i;j--)
	{
		printf(" ");
	}
	 for (k=1;k<=i;k++)
		{
		 printf("%d",k);
		}
		printf("\n");	
	}
	return 0;
}
}
