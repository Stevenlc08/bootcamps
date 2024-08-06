import java.net.SocketPermission;

public class Demo {
  public static void main(String[] args){
    int x = 10 + 3; 
    System.out.println(x); // 13
    x = x + 3 - 9;
    System.out.println(x); // 7
    x = x -5 * 2; // 5 * 2 first
    System.out.println(x); //-3
    x = (x-1) / 2; //(-3 - -1) / 2
    System.out.println(x); // -2
    // Speical operation -> % 餘數
    int remainder = 5 % 2;
    System.out.println(remainder); // 1
    int remainder2 = 10 % 2;
    System.out.println(remainder2); // 0
    int remainder3 = 6 % 2;
    System.out.println(remainder3);
    System.out.println(0 / 10); //0
    //System.out.println(10 / 0);
    //as developer, you should avoid divided by zero

    int j = 2; 
    System.out.println(10 / j); //5
    //You should avoid j become 0, before you decided to "10/j"
    //double
    //+, -, *, /, %
    // / zero
    // double/int = double/double
    double f = 7.999999999999999;
    System.out.println(f);
    f = f - 9.999999;
    System.out.println(f);
    f = f + 111.1111111;
    System.out.println(f);
    f = f / 2;
    System.out.println(f);
    f = f * 2;
    System.out.println(f);
    f = f % 2;
    System.out.println(f);
    f = f / 0;
    System.out.println(f); //infinity
    double d1 = 10.0 % 3.5;
    System.out.println(d1); // 0.3
    double d2 = 0.2 + 0.1;
    System.out.println(d2); // 0.300000000000004 ? why?
    // + 1 operations
    int a =1;
    a = a + 1;
    a++;
    ++a;
    a +=1;
    System.out.println(a); //5
    // + 2 operations
    int b = 1;
    b = b + 2;
    b += 2;
    System.out.println(b); //5
    // - 1 operations
    int c = 1;
    c = c - 1;
    c -= 1; // equals to "a = a - 1"
    --c;
    c--; // -3
    System.out.println(c);
    // * 2 operations 
    b = b * 2;
    b *= 2;
    System.out.println(b); // 20
    // Divide 3 operations
    int r = 99;
    r = r / 3;
    r /= 3;
    System.out.println(r); // 11

    // Example 1
    int apples = 3;
    int oranges = 10;
    double pricePerApple = 3.3;
    double pricePerOrange = 5.5;
    double totalAmount = apples * pricePerApple + oranges * pricePerOrange;
    System.out.println(totalAmount); // 3 * 3.3 + 10 * 5.5 = 64.9
    // int * double + int * double
    // double * double + double * double
    // 3.0 * 3.3 + 10.0 * 5.5
    //***************************************************************
    // Example 2  **************************************************
    //int maths = 90;
    //int english = 78;
    //int history = 62;
    //double averageScore = (maths + english + history) / 3;
    // ( int + int + int )/ 3
    // int / int 
    //double result = 76.0
    //  230 / 3 --> 76.6666
    //System.out.println(averageScore); // 76.0
    int maths = 90;
    int english = 78;
    int history = 62;
    double averageScore = (maths + english + history) / 3.0;
    // ( int + int + int )/ 3
    // int / double
    //double / double  ********************************* 3.0 
    //  230 / 3 --> 76.6666
    System.out.println(averageScore); // 76.666666666667
    // 3 is a int value, 3.0 is a double value.
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
    System.out.println(result);
    System.out.println(3 > 2);
    
    System.out.println(2 > 3);
    int z = 200;
    System.out.println(z > 199);
    
    int age2 = 66;
    boolean isElderly = age2 > 65; //event or definition
    System.out.println(isElderly);// true

  }
}