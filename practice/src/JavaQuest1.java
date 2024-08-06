package questions;
/**
 * Expected Output:
 * 
 * I am going to add two numbers together:
 * The first one: 31
 * The second one: 42
 * The sum is 73
 * The subtraction reuslt is 11
 * The another sum result is 130
 * The variable varB is false
 * The variable varC is true
 * The variable fnumber is -130.2
 * The variable dnumber is -20.5
 * The variable reminder is 1
 * The variable result is 3
 */
// Primitive types and operators
public class JavaQuest1 {

  public static void main(String[] args) {

    System.out.println("I am going to add two numbers together:");
    int first = 31;
    int second = 42;
    System.out.println(first);
    System.out.println(second);
    System.out.println(first + second);
    System.out.println(second - first);

    byte b1 = 60;
    byte b2 = 70;
    // code here with tips, pls fix ...
    // sum = b1 + b2;
    System.out.println(b1+b2);

    // declare two boolean variable with true and false value
    boolean varB = false;
    boolean varC = true;

    System.out.println(varB);
    System.out.println(varC);

    // Reading Example
    float fnumber = -130.20f; // By default, numbers are treated as double in Java.
    // Use suffix 'f' with value to make it float.
    double dnumber = -20.50;
    System.out.println(fnumber);
    System.out.println(dnumber);

    // Find reminder. Declare variable a & reminder
    int a = 7;
    int b = 3;
    // Fix it ...
    int reminder = a - b;
    System.out.println(a % b);

    // declare a variable x and assign value to it.
    int e = 7;
    int o = 8;
    int y = 4;
    int x = 2;
    // code here ... define the x and assign value to it
    int result = e - o * x / y;
    System.out.println(result);
  }
}
