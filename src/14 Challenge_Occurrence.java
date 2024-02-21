import java.util.Scanner;

class CheckElementOccurrence {
    public static void main(String[] args) {
        System.out.println("Check Occurrence");
        int[] userArray = ArrayUtility.inputArray();
        int occurrence = occurrence(userArray);
        System.out.println("This number has occurred for " + occurrence + " times");
    }

    // Occurrence Method

    public static int occurrence(int[] array){
        Scanner checkOccurrence = new Scanner(System.in);
        System.out.print("Please enter a number to check occurrence: ");
        int checkNum = checkOccurrence.nextInt();

        int i = 0;
        int counter = 0;
        while (i < array.length){
            if (array[i] == checkNum){
                counter ++;
            }
            i++;
        }
        return counter;
    }
}
