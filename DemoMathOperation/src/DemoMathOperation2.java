import java.net.SocketPermission;

public class DemoMathOperation2 {
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
    
    // ++x, x++, --x, x--
    //int k = 0;
    //k = k++ + 3; 
    // k++ + 3


    int k = 0; //******************************
    int o = k++ + 3; // ++ = + 1
    // 1. k + 3
    // 2. Assignment (assing to o)
    // 3. K + 1 
    //System.out.println(k); //3
    System.out.println(o);//3
    System.out.println(k);//1

    int u = 0;  //******************************
    int e = ++u + 3; // ++ = + 1
    // 1. u + 1
    // 2. U + 3
    // 3. Assignment (assing to e)
    System.out.println(e); // 4
    System.out.println(u); // 1

      // You pratice X-- and --X yourself, sane as above. ******************
      int h = 0; //******************************
      int s = h-- - 3; // -- = - 1
      // 1. h - 3
      // 2. Assignment (assing to o)
      // 3. h - 1 
      //System.out.println(h); // -1
      System.out.println(h);// -1
      System.out.println(s);// -3

      double d10 = 10.4;
      System.out.println(d10 <= 10.4); //true
      // same as int, support all basic operators

      //More than one event
      int j1 = 10;
      int j2 = 12;
      System.out.println(j1 > j2);// false
      // And(&&) Or (||)
      System.out.println(j1 > j2 || j1 < 11);// false || true -> true
      System.out.println(j1 > j2 && j1 < 11);// false && true -> false
      System.out.println(true && false); //false
      System.out.println(true && true);  //true
      System.out.println(false || true); // true
      System.out.println(true || true); //true
  }
}