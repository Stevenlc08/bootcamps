public class pratice {
  public static void main(String[] args) {
    // Example 3
    // Print all odd numbers between 0 - 10
    // Loop and if
    for (int i = 0; i < 11; i++) {
      if (i % 2 == 1) {
        System.out.println(i);
      }
    }

    String str2 = "abcdefghijk"; // the index of last character 'k' is length() -// 1
    // "acegik"
    // Loop, if, charAt, length
    String str3 = "";
    for (int i = 0; i < str2.length(); i++) {
      if (i % 2 == 0) {
        str3 += str2.charAt(i);
      }
    }
    System.out.println(str3);

    String s2 = "bbaeaaacceee";
    char target = 'e';
    int sum = 0;
    for (int i = 0; i < str2.length() + 1; i++) {
      if (s2.charAt(i) == target) {
        sum++;
      }
    }
    System.out.println("The number of character " + target + " is " + sum);

    // Example 7 - counting
    // 1 - 100
    // how many numbers can be divided by 3 or divided by 4?
    int count2 = 0;
    for (int i = 1; i < 101; i++) {
      if (i % 3 == 0 || i % 4 == 0) {
        count2++;
      }
    }
    System.out.println(count2);
    // Example 8
    // 1 - 50
    // Find the total number, which sum up all odd numbers and subtract all even
    // numbers between 1 - 50
    int total = 0;
    for (int i = 1; i < 51; i++){
      if ( i % 2 == 1){
        total += i;
      } else {
        total -= i;
      }
    }
      System.out.println(total);

    // Example 9
    String s3 = "abcdxyjzijkj";
    // Print the index of j. If j is not found, print -1
    boolean found = false;
    int pos = -1;
    for (int i = 0; i < s3.length(); i++){
      if (s3.charAt(i) == 'j'){
        found = true;
        pos = i;
      }
    }
    System.out.println("Position of j="+ pos);
    }
}  
