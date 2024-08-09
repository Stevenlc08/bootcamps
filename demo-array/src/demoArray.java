import java.util.Arrays;

public class demoArray {
  public static void main(String[] args) {
    // 8 primitives + String
    int x = 3;
    int x2 = 6;
    int x3 = -4;
    int max;
    if (x > x2) {
      if (x > x3) {
        max = x;
      } else {
        max = x3;
      }
    } else { // x2 > x
      if (x2 > x3) {
        max = x2;
      } else {
        max = x3;
      }
      System.out.println(" max = " + max);
    }
    // how about we compare 10 numbers?
    // you have to define the length of array before you use it.
    int [] arr = new int[3];       //4 means the length of array.   arr = array 
    arr[0] = 3;
    arr[1] = 6;
    arr[2] = -4;
    //print out all numbers from the array
    System.out.println(arr[0]); //3
    System.out.println(arr[1]); //6
    System.out.println(arr[2]); //-4
    System.out.println(arr.length); // 3

    // for loop -> print the values in array
    for ( int i = 0 ; i < arr.length; i++ ) { //0 1 2
     // System.out.println(i);
      System.out.println(arr[i]); // 3 6 -4 
    }
    //declare an arry for double
    //for loop

    double [] arr2 = new double[4];
    arr2[0] = 3.0;
    arr2[1] = 4.0;
    arr2[2] = - 11.0f; // floet -> double
    arr2[3] = 10; //int -> double
    for ( int i = 0 ; i < arr2.length; i++) {
     // System.out.println(i);
      System.out.println(arr2[i]);
    }
    // char[], boolean[], short[], long[], float[], String[], byte[]
    //Example 1
    int[] arr3 = new int[3];
    arr3[0] = 3;
    arr3[1] = 6;
    arr3[2] = -4;
    //Find the max num from the array
    // loop
    int s = arr3[0];
    int s2 = arr3[1];
    int s3 = arr3[2];
    int max2 = -2100000000;
    for ( int i = 0; i < arr3.length; i++){
      if (arr3[i] > max2 ) {
        max2 = arr3[i];
      }
      }
        System.out.println(" max = " + max2);


    int[] arr4 = new int[3];
    arr4[0] = 3;
    arr4[1] = 6;
    arr4[2] = -4;
    int d = arr4[0];
    int d2 = arr4[1];
    int d3 = arr4[2];
    int min = 2100000000;
    for ( int i = 0; i < arr4.length; i++){
      if (arr4[i] < min ) {
         min = arr4[i];
      }
      }
    
    System.out.println(" min = " + min);


      // Example 3
      String [] strings = new String[3];
      strings[0] = "abcd";
      strings[1] = "abcdcde";
      strings[2] = "12344556778";

      String long2 = "";
      for ( int i = 0 ; i < strings.length ; i++){
        if (strings[i].length() > long2.length() ) {
           long2 = strings[i]  ;
      }
    }
      System.out.println("long= " + long2);

      //Example 4
      // prices.length = quantities.length
      double [] prices = new double[4];
      prices[0] = 10.3;
      prices[1] = 7.7;
      prices[2] = 1.5;
      prices[3] = 2.3;
      int[] quantities = new int[4];
      quantities[0] = 10;
      quantities[1] = 2;
      quantities[2] = 5;
      quantities[3] = 4;
      double totalAmount = 0.0;
      for (int i = 0; i < prices.length; i++){
        totalAmount += prices[i] * quantities[i];
      }
        System.out.println("Total Amount=" + totalAmount);

        //Example 5
        //Average
        int[] scores = new int[5];
        scores[0] = 79;
        scores[1] = 70;
        scores[2] = 50;
        scores[3] = 100;
        scores[4] = 90;
        // loop
        double Average = 0.0;
        double sum = 0;
        for ( int i = 0; i < scores.length; i++){
        sum += scores[i];
      }    Average = sum / scores.length;
           
            System.out.println(Average);
            
            
            
            
            
        int[] scores1 = new int[5];
            scores1[0] = 79;
            scores1[1] = 70;
            scores1[2] = 50;
            scores1[3] = 100;
            scores1[4] = 90;
            double Averages = 0;
            int sums = 0;
            for ( int i = 0 ; i < scores1.length; i++){
              sums += i;
              Averages = sums / scores1.length;             
            }
            System.out.println(Average);

        String [] arr5 = new String[3];

        String [] arr6 = new String[] {"abc","def","ijk"}; // length 3

        String [] arr7 = {"abc","def","ijk"};

        //Example 6 *******

        int[] arr8 = new int[] {100, -20, 40, 33, 90, 44};
        //Find all numbers that > 40 and divided by 3
        int[] answers = new int [7];
        int idx = 0;
        for ( int i = 0; i < arr8.length; i++){
          if (arr8[i] > 40 && arr8[i] % 3 == 0){
            answers[idx++] = arr8[i]; //
  }
}
        // Print out array  
        System.out.println(Arrays.toString(answers));
        // Example 7
        char[] arr9 = new char[2];
        arr9[0] = 'h';
        arr9[1] = 'a';
        // swap
        char temp;

        temp = arr9[0];

        arr9[0] = arr9 [1];

        arr9[1] = temp;

        System.out.println(arr9[0]);
        System.out.println(arr9[1]);

        //Example 8
        // loop + swap
        char[] arr10 = new char[] { '9','4','3','2','1','0'};
        // Move the first character to the tail
        char temp2;
        temp2 = arr10[0];
        arr10[0] = arr10[1];
        arr10[1] = arr10[2];
        arr10[2] = arr10[3];
        arr10[3] = arr10[4];
        arr10[4] = arr10[5];
        arr10[5] = temp2;

        System.out.println(arr10);





  
  
  }
}


        

    


  



