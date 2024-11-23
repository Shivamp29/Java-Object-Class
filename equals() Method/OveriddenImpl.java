/*

  1. Overidden Implementation of the equals() method
  
*/

class Demo1 
{
  // overriding hashCode() Method
	public int hashCode() {
		return 10;
  }
  
  // overriding equals() method
	public boolean equals(Object o1) {
		return this.hashCode()==o1.hashCode();
	}
}
public class OveriddenImpl 
{
	public static void main(String[] args) 
  {
			Demo1 d1 = new Demo1();
			Demo1 d2 = new Demo1();

      // getting hashCodes 
			System.out.println(d1.hashCode());
			System.out.println(d2.hashCode());

      // checking equality
			System.out.println(d1.equals(d2));
			System.out.println(d2.equals(d1));
		}
}
