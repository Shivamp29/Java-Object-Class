/* 

  2. Content Based Comparison

*/

class Demo1
{
	int x = 20 ;
	public boolean equals(Object o1) 
  {
		Demo1 d1 = (Demo1) o1;
		if(this.x == d1.x)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}

public class ContentBasedComparison 
{
	public static void main(String[] args) {
			Demo1 d1 = new Demo1();
			Demo1 d2 = new Demo1();
			
			System.out.println(d1.hashCode());
			System.out.println(d2.hashCode());
			
			System.out.println(d1.equals(d2));
			System.out.println(d2.equals(d1));
		}
}
