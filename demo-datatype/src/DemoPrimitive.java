public class DemoPrimitive {
  public static void main(String[] args){
    // every line of java code must end with;
    int x = 100;
    // Declaration 聲名 & Assignment 
    // "int" is a type that can store an integer 整數
    // Assignmnet
    int y;
    y = -13;
    System.out.println(y); // -13
    // Re-assignment
    y = 9;
    System.out.println(y); // 9
    System.out.println(x); // 100
    System.out.println(20);// 20
    System.out.println(x); // 100
    int age = 30;
    System.out.println(age); //30
    //int q = 30.5; // 30.5 is number with decimal, q is declared by int, so cannot store decimal place.
    double q = 30.5;
    System.out.println(q); // 30.5
    //double u = 10; // 10 is int value 右邊,
    // when int value assigned to double type variable(變量), java will help auto-convert int value to double value (10->10.0)
    // Finally, assignment -> 10.0 -> u 
    //double i = 10.0;
    // 10.0 is a double value, assign to variable i 
    //int k = 10.3; error
    // 10.3 is a double value, you cannot assign double value to int type variable
    // because the level of double type is higer than int type
    // char -> Character
    //char c = 'i'; // you can put 'i', '9', '.', at least one character. 
    //System.out.pintln(i);
    double d1 = 3.3; // by default 3.3 is double value *******
    double d2 = 3.3d; // "d" is to describe 3.3 is a double value
    float f1 = 3.3f; // 3.3 is double, which is higher than float
    //float is lower level type comparing with double ******
    float f2 = 3.3f; // assign float value to float variable ******
    double d3 = 3.3f; 
    // 3.3f is a float value, lower value can be assigned to higher type

    int h = 4; // by default is int value 
    long l1 = 4; //long is high level type than int: 4 int value to 4 long value
    long l2 = 4L; // 4L is long value
    double d4 = 3.3f;
    float f5 = 3.3f;
  }
}