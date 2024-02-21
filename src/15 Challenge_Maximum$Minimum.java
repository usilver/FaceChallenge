class Maximum$Minimum {
    public static void main(String[] args) {
        int[] userArray = ArrayUtility.inputArray();
        if (userArray.length == 0) return;
        int maximum = maximum(userArray);
        int minimum = minimum(userArray);

        System.out.println("Maximum value in array is " + maximum);
        System.out.println("Minimum value in array is " + minimum);
    }

    // Maximum Value

    public static int maximum(int[] array){
        if (array.length == 0){
            return Integer.MIN_VALUE;
        }
        int max = Integer.MIN_VALUE;
        int i = 0;
        while (i < array.length){
            if (max < array[i]){
                max = array[i];
            }
            i++;
        }
        return max;
    }

    // Minimum Value

    public static int minimum(int[] array){
        int min = Integer.MAX_VALUE;
        int i = 0;
        while (i < array.length){
            if (min > array[i]){
                min = array[i];
            }
            i++;
        }
        return min;
    }
}
