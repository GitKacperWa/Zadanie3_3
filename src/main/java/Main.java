// import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.Scanner;
// import org.junit.jupiter.api.Test;

public class Main {
  public static void main(String[] args) {
    System.out.println("Wpisz podstawę trójkąta: ");
    Scanner scanner = new Scanner(System.in);

    int a = scanner.nextInt();
    
    for (int i = 1; i <= a; i++){
      if (i == a){
        System.out.println("*".repeat(i));
      } else if (i == a - (a-1) || i == a - a - (a-2)){
        System.out.println("*".repeat(i));
      } else {
        System.out.println("*".repeat(1) + " ".repeat(i-2) + "*".repeat(1));
      }
    }
  }

  // @Test
  // void addition() {
  //     assertEquals(2, 1 + 1);
  // }
}