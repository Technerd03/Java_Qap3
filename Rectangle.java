public class Rectangle extends Shape {

  private double width;
  private double length;

  // No-arg constructor with default width and length (1.0)
  public Rectangle() {
    super(); 
    this.width = 1.0;
    this.length = 1.0;
  }


  // Constructor with specified width, length, color, and filled value
  public Rectangle(double width, double length, String color, boolean filled) {
    super(color, filled); 
    this.width = width;
    this.length = length;
  }


  // Constructor with specified width and length (uses default color and filled)
  public Rectangle(double width, double length) {
    this(width, length, "green", true); 
  }


  // Getter for width
  public double getWidth() {
    return width;
  }


  // Setter for width
  public void setWidth(double width) {
    this.width = width;
  }


  // Getter for length
  public double getLength() {
    return length;
  }

  
  // Setter for length
  public void setLength(double length) {
    this.length = length;
  }


  // Calculate and return the area of the rectangle
  public double getArea() {
    return width * length;
  }


  // Calculate and return the perimeter of the rectangle
  public double getPerimeter() {
    return 2 * (width + length);
  }


  @Override
  public String toString() {
    return "A Rectangle with width=" + width + " and length=" + length + ", " + super.toString();
  }
}