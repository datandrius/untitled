public class Hello {

  public static void main(String... args) {
    System.out.println("First line on github");
    System.out.println("Second line on github");
    System.out.println("Third line on github");
    System.out.println("Third line v2 mod 2 on PC");
    System.out.println("Fourth line");
    System.out.println("Fifth line");
    System.out.println("Sixth line");
    System.out.println("seventh line");
    System.out.println("eighth line");
    System.out.println("feature line 1");
    System.out.println("feature line 2 version2");
    System.out.println(concatLines("pirma", "antra"));
  }

  public static String concatLines(String a, String b) {
    return a + " " + b;
  }
}
