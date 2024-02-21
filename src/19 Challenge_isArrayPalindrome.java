class checkPalindromeArray {
    public static void main(String[] args) {
        int[] myArray = ArrayUtility.inputArray();
        boolean isArrayPalindrome = isArrayPalindrome(myArray);
        boolean isPalindromeArray = isPalindromeArray(myArray);
        System.out.println( "Is Array palindrome? - "+ isPalindromeArray);
        System.out.println("Is Array palindrome? - "+ isArrayPalindrome);
    }

    public static boolean isArrayPalindrome(int[] array){
        int[] reverseArray = new int[array.length];
        int i = array.length - 1;
        while (i > 0){
            int j = 0;
            while (j < array.length){
                reverseArray[j] = array[i];
                j++;
            }
            if (array[i] != reverseArray[i]){
                return false;
            }
            i--;
        }
        return true;
    }

    public static boolean isPalindromeArray(int[] array){
        int i = 0;
        while (i < array.length/2){
            if (array[i] != array[(array.length - 1) -i]){
                return false;
            }
            i++;
        }
        return true;
    }
}
