public class Square extends Rectangle {

    // Constructor with specified side length
    public Square(double side) {
      super(side, side); 
    }
  
    
    @Override
    public String toString() {
      return "A Square with side=" + super.getWidth() + ", which is a subclass of " + super.toString();
    }
  

    // Override setWidth() and setLength() to maintain square geometry
    @Override
    public void setWidth(double width) {
      super.setWidth(width);
      super.setLength(width);
    }
  

    @Override
    public void setLength(double length) {
      super.setLength(length);
      super.setWidth(length); 
    }
  }