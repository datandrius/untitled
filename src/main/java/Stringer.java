/**
 * @author Satalia Team.
 */
public class Stringer {

  public String concatLines(String a, String b) {
    return concatMinusLines(a, b);
  }

  private String concatMinusLines(String a, String b) {
    return a + " - " + b;
  }


}
