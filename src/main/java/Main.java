import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    System.out.println("Enter the Area:");
    Scanner input = new Scanner(System.in);
    String side1 = input.nextLine();
     double side = Double.parseDouble(side1);
     double area = (6.0 * side * side) / (4.0 * Math.tan(Math.PI / 6.0));
    System.out.println("The area of the hexagon is " + area);
  }
}