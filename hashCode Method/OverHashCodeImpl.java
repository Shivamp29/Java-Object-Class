
// Overridden implementation of hashCode()

class demo1{
    int id = 10 ;
    
    // overidding hashCode() method 
    public int hashCode()
    {
        return id;
    }
}

public class Main {

    public static void main(String[] args) {
        
        Object o1 = new Object();
        Object o2 = new Object();

        // geting hashCode values 
        int n1 = o1.hashCode();
        int n2 = o2.hashCode();

        System.out.println("hashCode of  n1 : "+n1);  
        System.out.println("hashCode of  n2 : "+n2);  

        demo1 d1 = new demo1() ;
        demo1 d2 = new demo1() ;

        // geting hashCode values
        int n3 = d1.hashCode();
        int n4 = d2.hashCode();

        System.out.println("hashCode of  d1 : "+n3); 
        System.out.println("hashCode of  d2 : "+n4);

    }
}
