public class Point {
    private int x; 
    private int y;
  
    // Constructor with specified x and y coordinates
    public Point(int x, int y) {
      this.x = x;
      this.y = y;
    }
  
    // Getter for x coordinate
    public int getX() {
      return x;
    }
  
    // Setter for x coordinate
    public void setX(int x) {
      this.x = x;
    }
  
    // Getter for y coordinate
    public int getY() {
      return y;
    }
  
    // Setter for y coordinate
    public void setY(int y) {
      this.y = y;
    }
  
    @Override
    public String toString() {
      return "Point(" + x + ", " + y + ")";
    }
  }