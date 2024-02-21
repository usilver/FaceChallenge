public class Challenge21_Sum_And_Average_Of_All_Elements_In_A_2D_Array {
    public static void main(String[] args) {
        System.out.println("Find Sum And Average");
        int[][] my2DArray = ArrayUtility.input2dArray();
        int sum = sum(my2DArray);
        float avg = average(my2DArray);
        System.out.println("Sum of All Elements is " + sum);
        System.out.println("Average of All Elements is " + avg);
    }

    // sum2DArray
    public static int sum(int[][] array2D){
        int sum = 0;
        int i = 0;
        while (i < array2D.length){
            int j = 0;
            while (j < array2D[i].length){
                sum += array2D[i][j];
                j++;
            }
            i++;
        }
        return sum;
    }

    public static int elementCounter(int[][] array2D){
        int totalElement = 0;
        int i = 0;
        while (i < array2D.length){
            int j = 0;
            while (j < array2D[i].length){
                totalElement += j;
                j++;
            }
            i++;
        }
        return totalElement;
    }

    public static float average(int[][] array2D){
        int sum = sum(array2D);
        int counter = elementCounter(array2D);
        if (counter == 0){
            return 0;
            // counter will never be 0 or -ve.
        }
        return (float) sum / counter; // avg = sum/total
    }
}
