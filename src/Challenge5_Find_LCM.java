import java.util.Scanner;

public class Challenge5_Find_LCM {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Find LCM\n");
        System.out.print("Please enter number:\n");
        int numOne = userInput.nextInt();
        System.out.print("Please enter number:\n");
        int numTwo = userInput.nextInt();
        int numLCM = findLCM(numOne, numTwo);
        System.out.println("LCM of " + numOne + " and " + numTwo + " is " + numLCM);
    }

    // Least Common Multiple of two numbers: LCM

    public  static int findLCM(int a, int b){
        int i = 1;
        while (true){
            int factor = a * i;
            if (factor % b == 0){
                return factor;
            }
            i++;
        }

    /*
    while(i <= b){
            int factor = a * i;
            if(factor % b == 0){
                return factor;
            }
            i++;
        }
        return 0; // unreachable
    */
    }
}
