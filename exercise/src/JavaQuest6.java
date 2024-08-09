public class JavaQuest6 {
  /**
   * Expected output:
   * 0 1 1 2 3 5 8 13 21 ...
   * 
   */
  public static void main(String[] args) {
    int first = 0;
    int second = 1;
    int third;
    for (int i = 0; i <= 8; i++) {
      System.out.print(first + " ");
      third = first + second;
      first = second;
      second = third;
    }
  }
}
