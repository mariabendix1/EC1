public class Week4 {
  public static int factRec(int num){
    if (num == 1){
      return 1;
    }
    else{
      return num * factRec(num - 1);
    }
  }

  public static int myLength(String str){
    if (str.equals("")){
      return 0;
    }
    else {
      return 1 + myLength(str.substring(1));
    }
  }

  public static String revStr(String str){
    if (str.equals("")){
      return "";
    }
    else {
      return revStr(str.substring(1)) + str.substring(0,1);
    }
  }

  public static void main(String args[]){
    System.out.println("fact(" + 7 + ") = " + factRec(7));
    //String inputStr = "hejmeddigjeghedderkaj";
    String inputStr = args[0];

    int result1 = myLength(inputStr);
    System.out.println(result1);

    String result2 = revStr(inputStr);
    System.out.println(result2);
  }
}
