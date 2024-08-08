public class DemoForLoop {
  public static void main(String[] args) {
    int x = 3;
    x *= 3;
    x *= 3;
    x *= 3; //81
    System.out.println(x);

    int y = 3;
    for (int i = 0 ; i < 3 ; i++) {
       // (counter initialization ; continue condition; counter +1)
       y = y * 3;      
    }
    System.out.println(y); //81
    // Step 1: int i = 0
    // Step 2: i < 3 ? true / false ?
    // Step 3: y = y * 3
    // Step 4: i++ -> 1
    // Step 5: i < 3 true
    // Step 6: y = y * 3
    // Step 7: i++ -> 2
    // Step 8: i < 3 true
    // Step 9: y = y * 3
    // Step 10: i++ -> 3
    // Step 11: i < 3 -> false
    // Step 12: Exit the loop

    

  }
}