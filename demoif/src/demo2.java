public class demo2 {
  public static void main(String[] args) {
    String s1 = "hello";
    System.out.println(s1.contains("ll"));//true
    System.out.println(s1.contains("lll"));//false
    s1 = "helloll";
    System.out.println(s1.contains("ll"));//true
  }
}
