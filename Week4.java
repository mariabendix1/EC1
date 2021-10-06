public class Week4 {
  /*-----------*/
  /* FIBONACCI */
  /*-----------*/
  /* The Fibonacci sequence is defined as follows:
       fib(0) = 1
       fib(1) = 1
       fib(n) = fib(n-2) + fib(n-1)

     Some examples are:
       fib(0) = 1
       fib(1) = 1
       fib(2) = fib(1) + fib(0) = 2
       fib(3) = fib(2) + fib(1) = 3
       fib(4) = fib(3) + fib(2) = 5
  */
  // Loop version
  public static int fibLoop(int num){

    int res = 1;
    int prev = 0;
    int cur = 1;
    for (int i = 0; i < num; i++){
      res = cur + prev;
      prev = cur;
      cur = res;
    }
    return res;
  }

  // Recursive version
  public static int fibRec(int num){
    if (num < 2){
      return 1;
    }
    else{
      return fibRec(num - 1) + fibRec(num - 2);
    }
  }

  // Loop version of factorial calculation
  public static int factLoop(int num){
    int res = 1;
    while (num > 1){
      res = res * num;
      num = num - 1;
    }
    return res;
  }

  // Recursive version of factorial calculation
  public static int factRec(int num){
    if (num == 1){
      return 1;
    }
    else{
      return num * factRec(num - 1);
    }
  }

  // takes string as input, outputs length as int
  // recursive
  public static int myLength(String str){
    if (str.equals("")){
      return 0;
    }
    else {
      return 1 + myLength(str.substring(1));
    }
  }

  // takes string as input, outputs reversed string
  // recursive
  public static String revStr(String str){
    if (str.equals("")){
      return "";
    }
    else {
      return revStr(str.substring(1)) + str.substring(0,1);
    }
  }

  public static void main(String args[]){
    // test two different fact methods
    System.out.println("Rec:  fact(" + 7 + ") = " + factRec(7));

    System.out.println("Loop: fact(" + 7 + ") = " + factLoop(7));

    // test two different fib methods
    System.out.println("Here are the first 6 Fibonacci numbers");
    System.out.println("Rec: " + fibRec(1) + ", " + fibRec(2) + ", " + fibRec(3) + ", " +
                                 fibRec(4) + ", " + fibRec(5) + ", " + fibRec(6));

    System.out.println("Loop: " + fibLoop(1) + ", " + fibLoop(2) + ", " + fibLoop(3) + ", " +
                                  fibLoop(4) + ", " + fibLoop(5) + ", " + fibLoop(6));

    String inputStr = "hej med dig";
    // test length
    int result1 = myLength(inputStr) ;
    System.out.println("myLength, expected: " + inputStr.length() + ", actual: " + result1);

    String result2 = revStr(inputStr);
    System.out.println("revStr: " + result2);
  }
}

