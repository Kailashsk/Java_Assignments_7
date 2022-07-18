/*Create a class named 'Shape' with a method ‘print()’ to print "This is shape". 
Then create two other classes named 'Rectangle' and 'Circle' inheriting the 
Shape class, both having a method ‘print()’ to print "This is rectangular shape" 
and "This is circular shape" respectively.
Create a subclass 'Square' of 'Rectangle' having a method ‘print()’ to print 
"Square is a rectangle".
Now call the method ‘print()’ of 'Shape' and 'Rectangle' class by the object of 
'Square' class*/


class Shape{
    void print(){
      System.out.println("This is shape");
    }
  }
  
  class Rectangle extends Shape{
      void printr(){
      System.out.println("This is rectangular shape");
    }
  }
  
  class Circle extends Shape{
      void printc(){
      System.out.println("This is circular shape");
    }
  }
  
  class Square extends Rectangle{
      void prints(){
      System.out.println("Square is a rectangle");
    }
  }
  

  class a73{
    public static void main(String[] args){
      Square sq = new Square();  
      sq.print();
      sq.printr(); 
    }
  }
