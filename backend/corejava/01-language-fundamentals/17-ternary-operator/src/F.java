class F 
{
	public static void main(String[] args) 
	{   
		int firstNum = 10;
		int secondNum = 2;
		int thirdnum = 20;

		int min = (firstNum < secondNum) < ((firstNum<thirdnum) ?
			      firstNum : secondNum) : secondNum ;
			

	    System.out.println("Minimum b/w" + firstNum +"and"+ secondNum+
		"and"+thirdNum+"is"+min);
	}
}
