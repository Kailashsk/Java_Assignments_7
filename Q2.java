/*Create a class named 'Rectangle' with two data members 'length' and 
'breadth' and two methods to print the area and perimeter of the rectangle 
respectively. Its constructor having parameters for length and breadth is used 
to initialize length and breadth of the rectangle. 
Let class 'Square' inherit the 'Rectangle' class with its constructor having a 
parameter for its side (suppose s) calling the constructor of its parent class as 
'super(s,s)'. 
Print the area and perimeter of a rectangle and a square.
*/


class Rectangle{
    int length,breadth;


    Rectangle(int length,int breadth)
    {
        this.length=length;
        this.breadth=breadth;
    }

    void area()
    {
        System.out.println("Area :"+length*breadth);
    }

    void perimeter()
    {
        System.out.println("Perimeter :"+2*(length+breadth));
    }
}

class Squre extends Rectangle{
    Squre(int s){
        super(s, s);
    }
}



public class a72 {
    
    public static void main(String[] args) {
        Rectangle r=new Rectangle(4, 5);
        r.area();
        r.perimeter();

        Rectangle sq=new Squre(2);
        sq.area();
        sq.perimeter();
    }
}
