package abstractfunctions;
abstract class Shapes  
{ 
	  // declare fields 
	  String objectName; 
	      
	  Shapes(String name) 
	  { 
	      this.objectName = name; 
	  } 
	  abstract public double area(); 
	  abstract public void draw(); 
} 
