import javax.swing.SortingFocusTraversalPolicy;

/**
 * Lernziel: Überladene Methoden
 * - `print(...)`, `println(...)`, `printf(...)` kennenlernen
 *
 * @see <a href="https://docs.oracle.com/en/java/javase/index.html">https://docs.oracle.com/en/java/javase/index.html</a>
 *
 * @see PrintSystemOutSystemErr
 */
public class OverloadedMethods {
  /*
   * Java erlaubt Methoden, die gleich heißen, aber eine unterschiedliche Parameterliste haben.
   * Diese Methoden nennen wir *überladen*.
   */
  public static void main( String[] args ) {
    System.out.print("Hallo");
    System.out.print(' ');
    System.out.print("Welt");
    System.out.println();
    System.out.printf("Hallo%nWelt%n");
    System.out.println("1+1=2");
    System.out.printf("%d+%d=%d%n", 1, 1, 1+1);
    System.out.printf("%dx%f=%f%n", 1, 0.5, 1 * 0.5);
    System.out.printf("Hallo %s, heute ist der %s.", "Joseph", "08.08.2022");
  }
}
