// import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.Scanner;
// import org.junit.jupiter.api.Test;

public class Main {
  public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
    
      int a = scanner.nextInt();
     
      for (int i = 1; i <= 5; i++){
        System.out.print(" ".repeat(a - i));
        System.out.println("*".repeat(i));
      }
    }
  

  // @Test
  // void addition() {
  //     assertEquals(2, 1 + 1);
  // }
}