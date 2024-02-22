class DiagonalSum2dArray {
    public static void main(String[] args) {
        System.out.println("Welcome to Diagonal Sum");
        int[][] numArray = ArrayUtility.input2dArray();
        long sum = sumOfDiagonals(numArray);
        System.out.println("Sum of diagonals is " + sum);
    }

    public static long sumOfDiagonals(int[][] array){
        long leftSum = sumOfLeftDiagonals(array);
        long rightSum = sumOfRightDiagonals(array);
        long sum = leftSum + rightSum;
        if (array.length % 2 != 0){
            int ind = array.length / 2;
            sum -= array[ind][ind];
        }
        return sum;
    }
    public static long sumOfLeftDiagonals(int[][] array){
        long leftSum = 0;
        int i = 0;
        while (i < array.length){
            leftSum += array[i][i];
            i++;
        }
        return leftSum;
    }
    public static long sumOfRightDiagonals(int[][] array){
        long rightSum = 0;
        int i = 0;
        while (i < array.length){
            int cols = array.length -1; // last index
            rightSum += array[i][cols - i]; // row+1 then col-1
            i++;
        }
        return rightSum;
    }
}
