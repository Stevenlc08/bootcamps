public class JavaQuest5 {
  /**
   * Expected output:
   * The index of the last character of c is 11
   */
  public static void main(String[] args) {
    String str = "coding bootcamp."; // You should not change this line
    char target = 'c'; // Update this target to test the logic
    // if not found, print "Not Found."
    int lastIndex = str.lastIndexOf(target);
    if (lastIndex == -1){
      System.out.println ("not found");
    } else {
      System.out.println("The index of the last character of " + target + " is " + lastIndex);
    }
  }
}

