package abstractfunctions;
class Circle extends Shapes
{ 
      
    double pi = 3.14; 
    int radius; 
    Circle(int radius, String name) 
    { 
        super(name); 
        this.radius = radius; 
    } 
    public void draw() 
    { 
          System.out.println("Circle has been drawn ");  
    } 
    public double area()  
    { 
        return (double)((pi*radius*radius)/2); 
    } 
  
    public static void main (String[] args)  
    { 
      
        // creating the Object of Rectangle class and using shape class reference. 
        Shapes rect = new Rectangle(4,3, "Rectangle"); 
        rect.draw();
        System.out.println("Area of rectangle: " + rect.area());   
        // creating the Objects of circle class 
        Circle circle = new Circle(4, "Cicle"); 
        circle.draw();
        System.out.println("Area of circle: " + circle.area()); 
      
    } 
} 
