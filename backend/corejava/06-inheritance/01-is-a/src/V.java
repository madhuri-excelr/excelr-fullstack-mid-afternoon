class S 
{
	static 
	{
		System.out.println("S-SIB-1");
	}

	S()
	{
		  System.out.println("S()");
	}

	{
		System.out.println("S-IIB-1");
	}

	S(int i)
	{    
		this();
		System.out.println("S(int)");
	}

	{

      System.out.println("S-IIB-2");
    }

    static 
	{
		System.out.println("S-SIB-2");
	}

	}
	class T extends S
	{

	static 
	{
		System.out.println("T-SIB-1");
	}

	T()
		
	{  
		{
		super(10);
		System.out.println("T()");
		}

		{
		System.out.println("T-IIB-1");
		}

		T(int i)
		{
			this();
			System.out.println("T(int)");
		}

		{
			System.out.println("T-IIB-2");
		}

    static 
	{
		System.out.println("T-SIB-2");
	}
	}
	class U extends T
		{
	static 
	{
		System.out.println("U-SIB-1");
	}

	U()
		
	{  
		{
		super(10);
		System.out.println("U()");
		}

		{
		System.out.println("U-IIB-1");
		}

		U(int i)
		{
			this();
			System.out.println("U(int)");
		}

		{
			System.out.println("U-IIB-2");
		}

    static
		
	{
		System.out.println("U-SIB-2");
	}
	}
	class V extends U
		{
	static 
	{
		System.out.println("V-SIB-1");
	}

	V()
		
	{  
		{
		super(10);
		System.out.println("V()");
		}

		{
		System.out.println("V-IIB-1");
		}

		V(int i)
		{
			this();
			System.out.println("V(int)");
		}

		{
			System.out.println("V-IIB-2");
		}

    static
		
	{
		System.out.println("V-SIB-2");
	}
	}
	
public static void main(String[] args)
{

	System.out.println("main begin");
	S obj = new S();
    System.out.println("-----------");
    S obj = new S(10);
    System.out.println("-----------");
    T obj = new T();
    System.out.println("-----------");
    T obj = new T(100);
    System.out.println("-----------");
     U obj = new U();
    System.out.println("-----------");
     U obj = new U(1000);
    System.out.println("-----------");
     V obj = new V();
    System.out.println("-----------");
     V obj = new V(10000);
    System.out.println("-----------");
    System.out.println("main end");
}
static
{
	System.out.println("");
}
		}
	}
	}
	

