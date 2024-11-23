# equals() Method :

  - equals method is present in Object class
  - equals method is used to compare the objects based on their hashCode value
  - declaration of equals method

        public boolean equals( Object arg );

  - the return type of the equals method is " boolean "
  - it returns the true if the both objects has the same hashCode value otherwise return false

  - as we know that each object has unique hashCode value so we have to iverride the equals method

  - there are two implementations available for the equals method
      1. default implementation
      2. Overridden implementation

  1. Default Implementation
       - default implementation is works as same as the == symbol i.e. it compares the address
       - ex.
             check the code " defaultImpl.java "
      
  2. Overridden Implementation
       - it is nothing but a programmer can override the equals method to give his own implementation to compare to objects.
       - this implementation returns the programmer defined output
       - this implementaion is also used for " Content Based Comparison "
       - ex.
             1. for overridden impl check " OveriddenImpl.java "
             2. for content based comparison check "ContentBasedComparison.java "

**Difference between == and equals()**

1. ==
     - it compares the addresses
     - it is  relational operator
     - it can not be overidden
  
2. equals()
     - default implementation compares the hashCode values
     - it is method of object class
     - it allows us to override
