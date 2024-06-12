public class Demo {

    public static void main(String[] args) {
      // Create Point and MovablePoint objects
      Point p1 = new Point(3, 4);
      MovablePoint mp1 = new MovablePoint(0, 0, 1.5f, 2.0f);
  

      // Print initial states
      System.out.println("Point p1: " + p1);
      System.out.println("MovablePoint mp1: " + mp1);
  
      
      // Move mp1 and print its new state
      mp1.move();
      System.out.println("MovablePoint mp1 after move: " + mp1);
    }
  }