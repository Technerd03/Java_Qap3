public class MovablePoint extends Point {
    private float xSpeed;
    private float ySpeed;
  
    // Constructor with specified x, y, xSpeed, and ySpeed
    public MovablePoint(int x, int y, float xSpeed, float ySpeed) {
      super(x, y); 
      this.xSpeed = xSpeed;
      this.ySpeed = ySpeed;
    }
  

    // Getter for xSpeed
    public float getXSpeed() {
      return xSpeed;
    }
  

    // Setter for xSpeed
    public void setXSpeed(float xSpeed) {
      this.xSpeed = xSpeed;
    }
  

    // Getter for ySpeed
    public float getYSpeed() {
      return ySpeed;
    }
  

    // Setter for ySpeed
    public void setYSpeed(float ySpeed) {
      this.ySpeed = ySpeed;
    }
  

    // Move the point by its speed values
    @Override
    public void move() {
      setX(getX() + (int) xSpeed); 
      setY(getY() + (int) ySpeed);
    }
  
    
    @Override
    public String toString() {
      return "MovablePoint(" + super.toString() + ", speed=(" + xSpeed + ", " + ySpeed + "))";
    }
  }