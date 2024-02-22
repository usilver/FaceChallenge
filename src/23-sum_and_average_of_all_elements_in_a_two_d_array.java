class SumAverageIn2DArray {
    public static void main(String[] args) {
        System.out.println("Find Sum And Average");
        int[][] my2DArray = ArrayUtility.input2dArray();
        long sum = sum(my2DArray);
        float avg = average(my2DArray);
        System.out.println("Sum of All Elements is " + sum);
        System.out.println("Average of All Elements is " + avg);
    }

    // sum2DArray
    public static long sum(int[][] array2D){
        long sum = 0;
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

    //Count total number of elements
    public static int elementCounter(int[][] array2D){
        // Assuming array is homogeneous
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

    // Another way to count total elements

    public static int sizeCounter(int[][] array){
        int rows = array.length;
        int cols = array[0].length; // Assuming array is homogeneous
        int totalElement = rows * cols;
        return totalElement;
    }

    public static float average(int[][] array2D){
        long sum = sum(array2D);
        int counter = elementCounter(array2D);
        if (counter == 0){
            return 0;
            // counter will never be 0 or -ve.
        }
        return (float) sum / counter; // avg = sum/total
    }
}
