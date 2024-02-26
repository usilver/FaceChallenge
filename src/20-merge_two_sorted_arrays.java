class MergeTwoSortedArrays {
    public static void main(String[] args) {
        int[] arr1 = ArrayUtility.inputArray();
        // sorted array: increasing/decreasing order
        int[] arr2 = ArrayUtility.inputArray();
        int[] mergedArr = merge(arr1, arr2);
        System.out.println("Your merged array is : ");
        ArrayUtility.displayArray(mergedArr);
        System.out.println();

        // another easy solution for merging two sorted arrays
        int[] mergedNewArray = mergeSortedArrays(arr1, arr2);
        ArrayUtility.displayArray(mergedNewArray);
    }

    public static int[] merge(int[] arr1, int[] arr2){
        int newSize = arr1.length + arr2.length;
        int[] mergedArr = new int[newSize];

        int i = 0, j = 0, k = 0;
        while (i < arr1.length || j < arr2.length){
            if (j == arr2.length || (i < arr1.length && arr1[i] < arr2[j])){
                //Find simple logic to solve this problem.
                mergedArr[k] = arr1[i];
                i++;
                k++;
            } else {
                mergedArr[k] = arr2[j];
                k++;
                j++;
            }
        }
        return mergedArr;
    }

    // another logic to merge sorted arrays: ChatGPT
    public static int[] mergeSortedArrays(int[] array1, int[] array2){
        int i = 0, j = 0, k = 0;
        int newArraySize = array1.length + array2.length;
        int[] newArray = new int[newArraySize];
        // ex. int[] array1 = {1, 2, 3}; int[] array2 = {4, 5, 6}
        // ex. int[] array1 = {11, 12, 13, 14, 15}; int[] array2 = {4, 5, 6}
        while (i < array1.length && j < array2.length){
            if (array1[i] < array2[j]){
                newArray[k++] = array1[i++];
            } else {
                newArray[k++] = array2[j++];
            }
        }
        // add remaining elements from array1
        while (i < array1.length){
            newArray[k++] = array1[i++];
        }
        // add remaining elements from array2
        while(j < array2.length){
            newArray[k++] = array2[j++];
        }
        return newArray;
    }
}
