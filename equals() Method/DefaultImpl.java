/*

  1. Default Implementaion of euals method
  
*/

class Demo1 
{
	
}
public class DefaultImpl
{
	public static void main(String[] args) 
      	{
    		Demo1 d1 = new Demo1();
    		Demo1 d2 = new Demo1();
    			
		// using == operator
    		System.out.println(d1==d2);
    			
    		// using equals() method
    		System.out.println(d1.equals(d2));
    		System.out.println(d2.equals(d1));
	}
  }


