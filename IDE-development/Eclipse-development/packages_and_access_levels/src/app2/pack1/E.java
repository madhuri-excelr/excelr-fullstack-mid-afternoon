package app2.pack1;
class D
 {  
	private void test1()
	 {
		System.out.println("from D.test1()");
	 }
	 void test2()
	 {
        System.out.println("from D.test2()");
	 }
 }
 class E //extends D
 {
     public static void main(String[] args)
	 {
		 E obj = new E();
		 //obj.test1();
		 obj.test2();
         System.out.println("done");
	 }
 }
 
	