public class DemoForLoop {
  public static void main(String[] args) {
    //int x = 3;
    //x *= 3;
    //x *= 3;
    //x *= 3; //81
    //System.out.println(x);

    //int y = 3;
    //for (int i = 0 ; i < 3 ; i++) {
       // (counter initialization ; continue condition; counter +1)
     //  y = y * 3;      
   // }
   // System.out.println(y); //81
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
    //for (int i = 0; i<5 ;i++ ) {
     // System.out.println("hello world");}
    //Example 2
    // We can use i for other purpose.
      //for (int i = 0; i < 6; i++ ) {
       // System.out.println(i);
      
    //Example 3
    //print 0 - 10
    //int i = 0
    //for (int i = 0; i < 11 ; i++ ) {
      //if ( i % 2 == 1 ){
      //System.out.println(i);
    //}
// }
   //Example 4
   // Approach 
   for (int i = 10; i > 0; i--){
    if (i % 2 == 0) {
      System.out.println(i);
    }
   }
   // Approach 2
   for (int i = 0; i < 10; i++){
    if (i % 2 == 0) {
      System.out.println(10 - i);
    }
   }
   //Example 5
   //
   String str2 = "";
   String str = "abcdefghijk"; // the index of last character is str.length() - 1
   for (int i = 0; i < str.length(); i++){
    if (i % 2 == 0) {
      str2 += str.charAt(i);
   //"acegik"
      // Step 1: int i = 0
      // Step 2: 1 < 10  true
      // Step 3: 
    }
  }
  System.out.println(str2);

  // Example 6 - counting
    String s2 = "bbaasssddeeerr";
    char target = 'e';
    int count = 0;
    for (int i = 0; i < s2.length(); i++){
      if ( s2.charAt(i) == target){
        count++;
      }
    }
    System.out.println("The number of charater" + target + " is " + count);


  //The number of character e is 3

    //Exmaple 7 - counting
    //1 - 100
    //how many number can be divided by 3 or divided by 4
    int numb = 0;
    for ( int i = 1; i < 101 ; i++){
    if (i % 3 ==0 || i % 4 == 0) {
      numb++;
  }
}
    System.out.println("The number is " + numb);
  // 1- 50
  // Find the total num.,which sum up all odd numbers and subtract all even numbers between 1-50
     int total = 0;
     
  for ( int i = 1; i < 51 ; i++ ){
    if ( i % 2 == 1 ){
      total += i;
    } else {
      total -= i;
    }
  System.out.println(total);
  }

  //Example 9 
      String s3 = "abcdxyzijk";
      // Print the index of j. If j is not found, print -1
      char target2 = 'j';
      boolean found = false;
      int pos = -1;
        for (int i = 0; i < s3.length(); i++){
      if ( s3.charAt(i) != 'j') {
        found = true;
        pos = i;
      }
    }
    int idx = -1;
    if (found) {
       idx = pos;
    }
    System.out.println("Position of j =" + idx);

    // Alternative
    System.out.println(s3.indexOf('j'));
    s3 = "abc";
    System.out.println(s3.indexOf('j'));
    //Example 10
    String s5 = "hello";
    //check if the last character is o => true
    char targetEndWith = 'o';
    System.out.println(s5.charAt(s5.length()-1 )== targetEndWith);

    // endWith(), starsWith()
    System.out.println(s5.endsWith("o"));
    System.out.println(s5.startsWith("he"));
    System.out.println(s5.startsWith("eh"));

    //substring
    String s6 = "abcdefghik";
    //Find "def"
    System.out.println(s6.contains("def"));//true
    //Find the index between 2 and 4
    System.out.println(s6.substring(2,5)); // cde
    System.out.println(s6.indexOf("abc")); // 0
    System.out.println(s6.substring(0,3)); // abc

    //Example 11
    String s7 = "abcdefghik";
    String subs = "def";
    //for loop
    //Found or not found
    for (int i = 0 ; i < s7.length() ; i++){
     for (int j = 0 ; j < subs.length() ; i++){
    } 
  }



    //Nested Loop

    for (int i = 0; i < 3; i++) {       //outer loop
      for (int j = 0; j < 2; j++) {     //inner loop
        System.out.println("i=" + i + ",j=" + j);
      }
    }
    //Example 12
    //break
    for (int i = 0; i < 5; i++){
      System.out.println("hello");
      if (i >= 3) {
        break;
      }
    }
    //Example 13
    // break - searching 
    String s8 = " ijkdef";
    for(int i = 0; i < s8.length(); i++){
      if (s8.charAt(i) == 'k') {
        found = true;
        break;// break the loop
      }
    }
    //Example 14
    // continue - skip some patterns
    //for (int i = 0; i < 50; i ++){ // 0 -49
       //if ( i % 2 ==1) {}
      //if (1 % 2 == 0) 
      //{
        //continue; // skip the rest of code for current iteration
      //}
    //  if ( i > 30 ){
     //   break;
      //}
      //System.out.printlc(i); // odd number adn < 30

      //Example 15
      // ******
     // for ( int i = 0; i < 5; i++) {
       //  System.out.print("*");
      //}
      //System.out.println("");

      for (int i = 0; i < ; i--){
        for (int j = 1 ; j <= i ; j++){
          System.out.print("*");
        }
        System.out.println("");
       }






  }
}  