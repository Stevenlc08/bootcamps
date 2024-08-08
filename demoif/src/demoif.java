public class demoif{
  public static void main(String[] args){
    //1. Else-if (Avoid event overlap)
    int number = -3;
    if (number > 0) {
      System.out.println("The number is positive.");
    } else if (number == 0) {
      System.out.println("The number is zero");
    } else {
      System.out.println("The number is negative");
    }

    // Example 2 (Avoid overlap)
    int score = 85;
    if (score >= 90) {
      System.out.println("A");
    } else if (score >= 80 && score < 90 ) {
      System.out.println("B");
    } else {
      System.out.println("F");
    }

    //Example 3
    int a = 10;
    int b = 20;
    // "b is larger than a"
    if (a > b) {
      System.out.println("a is larger than b.");
    } else {
      System.out.println("b is larger than a");
    }

    //Example 4
    int c = 10;
    int d = 20;
    // "20 is larger than 10"
    if (d > c) {
      System.out.println(d + " is lagre than " + c + "." );
    } else {
      System.out.println(c + " is larger than " + d + "." );
    }

    //Ans
    int e = 10;
    int f = 20;
    int max;
    int min;
    if (e > f) {
      max = e;
      min = f;
    } else {
      max = f;
      min = e;
    }
    System.out.println(max + " is larger than "+ min + ".");

    //Example 5
    String day = "Wednesday";
    String d11 = "Monday";
    String d12 = "Tuesday";
    String d13 = "Wednesday";
    String d14 = "Thursday";
    String d15 = "Friday";

    //"Wednesday is Weekday."
    
    if ( day.equals(d11)|| day.equals(d12) 
    || day.equals(d13) || day.equals(d14) 
    || day.equals(d15)){
      System.out.println(day+ " is weekday.");
    } else {
      System.out.println(day+ " is weekend.");
    }

    //Example 6
    int num = 7;
    if (num % 2 < 1 ) {
      System.out.println(num + " is an even number.");
    } else  {
      System.out.println(num + " is an odd number");
    }
    //Example 6
    String str = ""; //emtpy string
    //The last character of str is o,
    //This is an empty String,

    if (str.length() == 0){
      System.out.println("This is an empty String");
    } else {
      System.out.println("The last character of str is " + str.charAt(str.length()-1));
  }

    //Example 7
    String s = "abd";
    //output cba
   // String s = "abd";
    int numA = s.length();
    char ch1 = s.charAt(numA-1);
    char ch2 = s.charAt(numA-2);
    char ch3 = s.charAt(numA-3);
    System.out.println(ch1+""+ch2+""+ch3);
    
    //Example 8
    //Leap Year
    //1. Divided by 4
    //2. Not Divided by 100
    //3. or divided by 400

    int year = 2016;
    if ( year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
      System.out.println(year + " is a leap year"); 
    } else {
      System.out.println(year + " is not a leap year"); 
    } 

    //Example 9
    int age = 18;
    boolean isCitizen = true;
    if (age < 18 && isCitizen == false) {
      System.out.println("Not eligible to void");
    } else if (isCitizen == false) {
      System.out.println("Not eligible to void, no citizen");
    } else if (age < 18 && isCitizen == true) {
      System.out.println("Not eligible to void, <18");
    } else {
      System.out.println("Eligible to vote");
    }
      


    //Exmaple 10
    double totalPurchase = 189.9;
    double discount1 = 0.8;
    double discount2 = 0.9;
    double amountToPay = totalPurchase * discount1;
    double amountToPay2 = totalPurchase * discount2;
    if (totalPurchase>=500.0){
    System.out.println("Discount amount = " + discount1);
    System.out.println("Discount amount = " + amountToPay);
    } else if (totalPurchase >=200.0 && totalPurchase <500.0)
    { System.out.println("Discount amount = " + discount2);
      System.out.println("Discount amount = " + amountToPay2);
    } else 
    { System.out.println("Discount amount = " + "no discount" );
      System.out.println("Discount amount = " + totalPurchase);
    }
    //Exmaple 10
   // double totalPurchase = 199;
   // double discount = 1.0;
    //if (totalPurchase < 200) {
     // System.out.println("Discount amount =" + " no discount " );
     // System.out.println("Discount amount = " + totalPurchase);}
     // else if (totalPurchase >= 500){discount = 0.8;
   // } else if (totalPurchase >= 200){discount = 0.9;
   // } 
    //double amountToPay = totalPurchase * discount;
    //{ System.out.println("Discount amount= " + discount);
      //System.out.println("Discount amount= " + amountToPay);
    //}  
    
    //Example 11
    char v = 'o';
    if (v == 'a'|| v == 'e' || v == 'i' || v == 'o' || v == 'u')
    {System.out.println(v + " is vowel");
    } else 
    {System.out.println(v + " is consonant");
    }
    
    //Exmaple 12
    String password = "Admin1234567#";
    // # ! @ $ -> special character
    // password lenght >= 12
    boolean strongpw = true;
    
    //It is a strong password.
    //It is a week password. No special character.
    //It is a week password. Length < 12.
    if ((password.contains("#")||password.contains("!")||password.contains("@")
    ||password.contains("$"))&&(password.length()>12)){
    System.out.println("It is a strong password.");
    } else if (password.length()<12){
      System.out.println("It is a week password. Length < 12.");
    } else {
      System.out.println("It is a week password. No special character.");
    }

  }
}

