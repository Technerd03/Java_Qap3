public class Demo {

    public static void main(String[] args) {
      // Create shapes and print their details
      Shape S = new Shape("Red", true);
      Circle C = new Circle(5.0);
      Circle C1 = new Circle(5.0, "blue", true);
      Rectangle R = new Rectangle(2.0, 3.0);
      Rectangle R1 = new Rectangle(2.0, 3.0, "green", false);
      Square Sq = new Square(4.0);
      Square Sq1 = new Square(4.0, "yellow", true);
  
      
      System.out.println(S.toString());
      System.out.println(C.toString());
      System.out.println("Area of Circle C: " + C.getArea());
      System.out.println("Perimeter of Circle C: " + C.getPerimeter());
      System.out.println(C1.toString());
      System.out.println("Area of Circle C1: " + C1.getArea());
      System.out.println("Perimeter of Circle C1: " + C1.getPerimeter());
      System.out.println(R.toString());
      System.out.println("Area of Rectangle R: " + R.getArea());
      System.out.println("Perimeter of Rectangle R: " + R.getPerimeter());
      System.out.println(R1.toString());
      System.out.println("Area of Rectangle R1: " + R1.getArea());
      System.out.println("Perimeter of Rectangle R1: " + R1.getPerimeter());
      System.out.println(Sq.toString());
      System.out.println("Area of Square Sq: " + Sq.getArea());
      System.out.println("Perimeter of Square Sq: " + Sq.getPerimeter());
      System.out.println(Sq1.toString());
      System.out.println("Area of Square Sq1: " + Sq1.getArea());
      System.out.println("Perimeter of Square Sq1: " + Sq1.getPerimeter());
    }
  }