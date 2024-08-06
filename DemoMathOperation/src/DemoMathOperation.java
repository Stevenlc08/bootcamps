import java.net.SocketPermission;

public class DemoMathOperation {
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
    System.out.println(0 / 10); //0
    //System.out.println(10 / 0);
    //as developer, you should avoid divided by zero

    int j = 2; 
    System.out.println(10 / j); //5
    //You should avoid j become 0, before you decided to "10/j"
  }
}