class Employee 
{   
	String employeeName, companyName;
	int rollNum;
	double age;

	Employee(String employeeName, int rollNum, double age)
	{
		this.employeeName = employeeName;
		this.rollNum = rollNum;
		this.age = age;
	}
	{
		this.companyName = "xyz";
	}
	public static void main(String[] args) 
	{   
		Employee emp1 = new Employee("john",101,32);
		System.out.println("--------------");
		Employee emp1 = new Employee("Sharma",102,30);
		System.out.println("--------------");
		Employee emp1 = new Employee("Adam",103,45);
		System.out.println("--------------");
		Employee emp1 = new Employee("David",104,60);
      }
}

