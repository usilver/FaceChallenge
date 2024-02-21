class isArraySorted {
    public static void main(String[] args) {
        int[] userArray = ArrayUtility.inputArray();
        boolean isIncreasing = isIncreasing(userArray);
        boolean isDecreasing = isDecreasing(userArray);
        if (isIncreasing || isDecreasing){
            System.out.println("Your array is sorted!");
        } else {
            System.out.println("Your array is not sorted!");
        }
    }

    public static boolean isIncreasing(int[] array){
        int i = 1;
        while (i < array.length){
            if (array[i] < array[i-1]){
                return false;
            }
            i++;
        }
        return true;
    }

    public static boolean isDecreasing(int[] array){
        int i = 1;
        while (i < array.length){
            if (array[i] > array[i-1]){
                return false;
            }
            i++;
        }
        return true;
    }
}
