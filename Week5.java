import java.util.Arrays;

public class Week5 {

  // transpose array
  public static int[][] transpose(int[][] inArray){
    // if input is n*m matrix, then output must be m*n matrix
    int[][] retArray = new int[inArray[0].length][inArray.length];
    for (int i = 0; i < inArray.length; i++){
      for (int j = 0; j < inArray[0].length; j++){
        retArray[j][i] = inArray[i][j];
      }
    }
    return retArray;
  }

  // adds 5 to each element of 2d array
  public static int[][] addFive(int[][] inArray){
    // two for-loops!
    // get length of array: array.length
    // get width of array: array[0].length
    for (int i = 0; i < inArray.length; i++){
      for (int j = 0; j < inArray[0].length; j++){
        inArray[i][j] = inArray[i][j] + 5;
      }
    }
    return inArray;
  }

  public static void main(String args[]){
    // how to declare a list of lists?
    int[][] myArray = {{1,2,3},{4,5,6},{7,8,9},{0,0,0}};
    System.out.println(myArray);
    System.out.println(Arrays.deepToString(myArray));

    int[][] fiveArray = addFive(myArray);
    System.out.println(Arrays.deepToString(fiveArray));

    int[][] tArray = transpose(myArray);
    System.out.println(Arrays.deepToString(tArray));

    int[] arrToSlice = slice({1,2,3,4,5});
    System.out.println(Arrays.deepToString(tArray));

  }
}

