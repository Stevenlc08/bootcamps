public class demoSwitch {
  public static void main(String[] args) {
    int age = 17;
    boolean isAdult = false;
    if (age >= 18) {
      isAdult = true;
    }
    System.out.println("isAdult= " + isAdult);
    // 1. if you don't break the switch case, the flow will go through all cases.
    // 2. "Switch" statment is only for finite scenario
    // 3. for case, you can only define one value for checking. No range checking.
    // 4. For "Switch", Java will
    switch (age) {
      case 18:
        isAdult = false;
        System.out.println("18");
        break;
      case 17:
      System.out.println("17");
      break;
      case 16:
      System.out.println("16");
      break;
    } System.out.println("isAdult= " + isAdult);
    
    //
    String day = "Tuesday";
    switch (day) {
      case "Monday":
        System.out.println("it is weekday");
          break;
        case "Tuesday":
        System.out.println("it is weekday"); //print
        break;
        case "Wednesday":
        System.out.println("it is weekday");//print
        break;
        case "Thursday":
        System.out.println("it is weekday");//print
        break;
        case "Friday":
        System.out.println("it is weekday");//print
        break;
        default:
        System.out.println("it is weekend");//print

    }



  }
  
}
