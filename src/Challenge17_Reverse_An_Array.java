public class Challenge17_Reverse_An_Array {
    public static void main(String[] args) {
        int[] myArray = ArrayUtility.inputArray();
        reverseArray(myArray);
        ArrayUtility.displayArray(myArray);
        ArrayUtility.displayArray(myArray);
    }

    // First Method

    public static void reverseArray(int[] array){
        int i = 0;
        while (i < array.length / 2){
            int swap = array[i];
            array[i] = array[(array.length - 1) - i];
            array[(array.length - 1) - i] = swap;
            i++;
        }
    }

    // Second Method

    public static int[] reverse2Array(int[] array){
        int i = array.length-1;
        int[] reversedArray = new int[i];
        while (i > 0){
            int j = 0;
            while (j < array.length){
                reversedArray[j] = array[i];
                j++;
            }
            i--;
        }
        return reversedArray;
    }
}
