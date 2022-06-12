import java.util.Scanner;
public class calculate{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int x;
    int y;
    System.out.print("X input: ");
    x = scanner.NextLine();
    System.out.print("Y input: ");
    y = scanner.NextLine();
    double z = Math.sqrt((x*x)+(y*y));
    System.out.println("The hypotenuse of your triangle is " + z);
  }
}
