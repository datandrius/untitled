public class Hello {

  public static void main(String... args) {
    System.out.println("eighth line");
    System.out.println("feature line 1");
    System.out.println("feature line 2 version2");
    System.out.println(concatLines("pirma", "antra"));
    System.out.println(concat_Lines("pirma", "antra"));
  }

  private static String concatLines(String a, String b) {
    return a + " - " + b;
  }

  private static String concat_Lines(String a, String b) {
    return a + " - " + b;
  }
}
