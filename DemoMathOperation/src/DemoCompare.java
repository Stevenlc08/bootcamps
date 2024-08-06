public class DemoCompare {
  public static void main(String[] args) {
    // Primitives:
    // int, long, float, double
    // char, byte, short, boolean 
    
    // assign int value to byte variable
    // int value -> byte value (implicitly)
    // byte & short ********

    // Integer: byte -> short -> int -> long ************
    byte b1 = 3; // from -128 to 127

    int i2 = 3;
    //byte b2 = i2; //java does not allow higher level type to lower level type
    
    //Assign byte variable to int variable
    int i3 = b1; // ok
    b1 = -128;
    //b1 = -129; // out of range   ?
    b1 = 127;
    //b1 = 128; // out of range   ?


    short s1 = 3; // from -32,768 to 32,767 
    //short s2 = -43768;
    short s3 = -32767;
    short s4 = 32700;
    //short s5 = 32777;
    //s1 = i2 //i2 is higer level type than s1

    int i1 = 3; // from -2.1 b to 2.1 b 
    int i9 = -2000000000;
    
    //int i4 = 3L //explicitly assign long value
    long l1 = 3; // from -2^63 to 2^63
    
    // 3 is int Value
    boolean b11 = false;
    b11 = true; 
    boolean result = 3 > 2;
    System.out.println(result); // true
    System.out.println(3 > 2);  // true
    
    System.out.println(2 > 3);  // true
    int i9z = 200;
    System.out.println(i9z > 199); // true
    
    int age2 = 66;
    boolean isElderly = age2 > 65; //event or definition
    System.out.println(isElderly);// true

    int age3 = 77;
    boolean isElderly2 = age3 > 85;
    System.out.println(isElderly2);// false
    // >, <, >=, <=
    System.out.println(3 >= 2);// true
    int k = 10;
    int y = 11;
    boolean isYLargeThanX = y > k;
    System.out.println(isYLargeThanX); // true
    System.out.println( k + 3 < y + 2); // false
    boolean result3 = k + 3 < y + 2; // false

    // ==, != question
    // Single "=" -> Assignment
    int x2 = 3;
    // Double "=" -> Compare if they are equal
    System.out.println(x2 ==4);// false
    System.out.println(x2 !=3); // false
  }
}
