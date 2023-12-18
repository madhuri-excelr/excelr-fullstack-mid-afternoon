class Dog 
{   
	String name,breed,gender,color;
	int age;
	double height,weight;
	Dog(String dogname,String dogbreed,String doggender,String dogcolor,
		int dogage,double dogheight,double dogweight)
	{
       System.out.println(" intializing dog object: begins");
	   name=dogname;
	   breed=dogbreed;
	   gender=doggender;
	   color=dogcolor;
	   age=dogage;
	   height=dogheight;
	   weight=dogweight;
       System.out.println(" intializing dog object: completed");
	}
	void bark()
	{
		System.out.println(" This dog barks!");
	}
	void bite()
	{
		System.out.println(" This dog bites!!");
	}
	public static void main(String[] args) 
	{   
		System.out.println(" main begin");
		Dog d1=new Dog( "charlie" , "lab" , "male" , "brown" ,2 ,
			2.8 ,5.8 );
		Dog d2=new Dog(" pinky" , " lab" , " female" , " white",3,
			3.9, 5.9);
		System.out.println(" Name:"+d1.name+" Breed:"+d1.breed+" gender:"+
			d1.gender+" age:"+d1.age+" height:"+d1.height+" weight:"+
			d1.weight);
		d1.bite();
		System.out.println("-----------------------");
        System.out.println(" Name:"+d2.name+" Breed:"+d2.breed+" gender:"+
			d2.gender+" age:"+d2.age+" height:"+d2.height+" weight:"+
			d2.weight);
		d2.bark();
		System.out.println("main end");

}
}
