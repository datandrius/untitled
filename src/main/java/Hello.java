public class Hello {

  public static void main(String... args) {
    System.out.println("feature line 2 version2");
    System.out.println(new Stringer().concatLines("1", "1"));
    System.out.println(new Stringer().concatLines("2", "2"));
    System.out.println(new Stringer().concatLines("4", "4"));
    System.out.println(new Stringer().concatLines("5", "5"));
  }
}
