public class DemoString {
  public static void main(String[] args) {
    System.out.println("Hello World");
    //"Hello world!!!" -> String value

    // String is not a primitive!!!
    String s;
    s = "abc";
    String s2 = "def"; //"def" is a String value, and then assign to String variable
    //String s3 = 3;
    String s4 = "3.333333";
    System.out.println(s);
    System.out.println(s2);
    System.out.println(s4);
    String s5 = "4" ;// append meaning, but not + 1
    s5 = s5 + 1; 
    System.out.println(s5); //"41"
    // In String, there is no -, *, /, %
    String s7 = "31";
    s7 = s7 + true;
    System.out.println(s7);
    //Example 1 
    int age = 40;
    String message = "I'm " + age + " years old.";
    System.out.println(message);
    //Example 2
    char grade = 'A';
    System.out.println("My grade of History is " + grade);
    // String + char -> String
    
    // +=
    String firstname = "Steven";
    String Lastname = "Lai";
    String fullName = ""; // empty String value
    fullName += firstname + " " + Lastname;
    // fullName = fullName + firstName + " " + lastName;
    System.out.println(fullName); // 
    // Primitive -> Math Operation, Comparsion
    // String -> Not Promitive, we use method (tool) to compare their values
    String s10 = "hello";
    String s20 = "hello";
    System.out.println(s10.equals(s20));// true
    boolean isValueSames = "abc".equals(s20); // false
    System.out.println(isValueSames);//
    // charAt()
    char result = s10.charAt(0); // 2nd char of string value h0,e1,l2,l3,o4
    System.out.println(result);
    char results = s10.charAt(1); // 2nd char of string value h0,e1,l2,l3,o4
    System.out.println(s10.charAt(4)=='l'); // false no (-1)
    // s10.charAt (1L) wrong
    // s10.charAt (1.0) wrong because of int
    // length()
    System.out.println(s10.length()); // 5
    System.out.println(s10.length() >=5); // true
    
  }

}
