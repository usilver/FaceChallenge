import java.util.Scanner;

class SearchElementIn2DArray {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Welcome to 2D Search");
        int[][] num2DArray = ArrayUtility.input2dArray();
        System.out.print("Please enter a number you want to find: ");
        int num = userInput.nextInt();
        boolean isFound = search(num2DArray, num);
        if (isFound){
            System.out.println("Your number was found!");
        } else {
            System.out.println("Your number was not found!");
        }
    }

    public static boolean search(int[][] array, int num){
        int i = 0;
        while (i < array.length){
            int j = 0;
            while (j < array[i].length){
                if (array[i][j] == num){
                    return true;
                }
                j++;
            }
            i++;
        }
        return false;
    }
}
