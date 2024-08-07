public class classPractice {
  public static void main(String[] args){

    byte a = -128;
    byte b = 127;
    System.out.println( a + b );

    short c = -32000;
    short e = 0;
    System.out.println("e = " + 32000);

    int f = 1228;
    int g = 1338;
    int h = f + g;
    System.out.println("h = " + h);

    long i = 1000;
    long j = 2000;
    long k = j % i; 
    System.out.println("k = " + k);

    boolean a1 = true;
    boolean a2 = false;
    boolean a3 = a1 && a2;
    boolean a4 = a1 || a2;
    System.out.println("a3 is "+ a3);
    System.out.println("a4 is "+ a4);

    char b1 = 'H';
    char b2 = 'K';
    System.out.println("b3 is born in " + b1 + b2);

    double c1 = 18.5;
    double c2 = 0.8;
    double c3 = c1 * c2;
    System.out.println("The price is $"+ c3 );

    float d1 = 1000.2f;
    float d2 = 10.2f;
    double d3 = d1 + d2;
    System.out.println("d3 is " + d3);

    int e1 = 123;
    double e2 = 132.3;
    double e3 = e1 / e2;
    System.out.println("e3 =" + e3);

    int g1 = 1;
    int g2 = 2;
    System.out.println(g1 == g2 );



  }
}
