import java.util.Scanner;

public  class ArrayUtility {
    public static int[] inputArray() {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Please enter number of elements: ");
        int sizeArray = userInput.nextInt();
        if (sizeArray >= 0){
            int[] myArray = new int[sizeArray];
            int i = 0;
            while (i < sizeArray){
                System.out.print("Please enter element " + (i + 1) + " : ");
                myArray[i] = userInput.nextInt();
                i++;
            }
            return myArray;
        }
        return new int[]{}; // taking extra space. fix this in future
    }


    public static void displayArray(int[] numArray){
        int i = 0;
        while (i < numArray.length){
            System.out.print(numArray[i] + " ");
            i++;
        }
    }


    public static int[][] input2dArray() {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Please enter number of row: ");
        int rows = userInput.nextInt();
        System.out.print("Please enter number of column: ");
        int columns = userInput.nextInt();
        if (rows < 0 || columns < 0){
            int[][] invalid = new int[1][1];
            invalid[0][0] = 0;
            return invalid;
        }
        int[][] numArray = new int[rows][columns];

        int i = 0;
        while (i < rows){
            int j =0;
            while (j < columns){
                System.out.print("Please enter element row: " + (i +1) + ", "
                + "column: " + (j + 1) + ": ");
                numArray[i][j] = userInput.nextInt();
                j++;
            }
            i++;
        }
        return numArray;
    }

}
