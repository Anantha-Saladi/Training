package abstractfunctions;
class Rectangle extends Shapes
{ 
	  int length, width; 
	      
	  Rectangle(int length, int width, String name) 
	  { 
	        super(name); 
	        this.length = length; 
	        this.width = width; 
	  } 
	  public void draw()  
	  { 
	        System.out.println("Rectangle has been drawn ");  
	  }
	  public double area()  
	  { 
	        return (double)(length*width); 
	  } 
}  

