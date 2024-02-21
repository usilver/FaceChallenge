import java.util.Scanner;

class FindOccurrenceOfAnElement {
    public static void main(String[] args) {
        int[] userArray = ArrayUtility.inputArray();
        Scanner userInput = new Scanner(System.in);
        System.out.print("Please enter a number you want to find: ");
        int findNum = userInput.nextInt();
        int occurrence = occurrence(userArray, findNum);
        System.out.println("The number " + findNum + " has " + occurrence + " times occurrence in the array list.");
    }

    // Occurrence method

    public static int occurrence(int[] array, int num){
        int occurr = 0;
        int i = 0;
        while (i < array.length){
            if (array[i] == num){
                occurr++;
            }
            i++;
        }
        return occurr;
    }
}
