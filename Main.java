import java.util.Scanner;
/** this program will print a line of stars the length depends on what the user inputed.
 *
 * @author Isaac
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // TODO code application logic here
    Scanner input = new Scanner (System.in);
    System.out.println("Please enter a number from 1-10");
    int num = input.nextInt();
    
    for  (int count = 1; count < num + 1 ; count++){
    int star = count;
    System.out.print("*");
    }
  }
}
