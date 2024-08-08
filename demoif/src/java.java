public class java {
  public static void main(String[] args) {
    int age = 17;
    boolean isCitizen = false;
    if (age < 18 && isCitizen == false) {
      System.out.println("Not eligible to void");
    } else if (isCitizen == false) {
      System.out.println("Not eligible to void, no citizen");
    } else if (age < 18 && isCitizen == true) {
      System.out.println("Not eligible to void, <18");
    } else {
      System.out.println("Eligible to vote");
    }
  }
}
  

