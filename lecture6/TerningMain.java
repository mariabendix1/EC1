public class TerningMain {
  public static void main(String[] args){
    // make a Terning
    Terning t1 = new Terning(6);

    // initialize distributions, where
    // distArray[0] = number of 1's
    // distArray[1] = number of 2's
    // ...and so on
    int[] distArray = new int[]{0,0,0,0,0,0};

    for (int i = 0; i < 6000; i++){
      t1.kast();
      for (int a = 0; a < 6; a++){
        // + 1 because t1's values are 1-6,
        // where a's values are 0-5
        if (t1.vaerdi() == a + 1){
          distArray[a] += 1;
        }
      }
    }
    // print distribution. Should be around 1000 each
    for (int i = 0; i < 6; i++){
      System.out.println(distArray[i]);
    }
  }
}
