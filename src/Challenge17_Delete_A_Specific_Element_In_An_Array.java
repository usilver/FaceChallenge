import java.util.Scanner;

public class Challenge17_Delete_A_Specific_Element_In_An_Array {
    public static void main(String[] args) {
        System.out.println("Welcome to delete check post in an Array!");
        Scanner userInput = new Scanner(System.in);
        int[] myArray = ArrayUtility.inputArray();
        System.out.print("Enter the number you want to delete: ");
        int deleteNum = userInput.nextInt();
        int[] deleteNumber = deleteNumber(myArray, deleteNum);
        ArrayUtility.displayArray(deleteNumber);
    }

    public static int[] deleteNumber(int[] numArray, int numDelete){
        int numDeleteOccurrence = Challenge14BySir.occurrence(numArray, numDelete);
        int newArraySize = numArray.length - numDeleteOccurrence;
        int[] newArray = new int[newArraySize];
        if (numDeleteOccurrence == 0){
            return numArray;
        }
        int i = 0, j = 0;
        while (i < numArray.length){
            if (numArray[i] != numDelete){
                newArray[j] = numArray[i];
                j++;
            }
            i++;
        }
        return newArray;
    }
}
