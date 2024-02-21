import java.util.Scanner;

class FindFactorial {
    public static void main(String[] args) {
        long num = 479001600;
        System.out.println((num*13));
        Scanner userInput = new Scanner(System.in);
        System.out.println("Find factorial");
        System.out.println("Please enter number:");
        int factorialNum = userInput.nextInt();
        long getFactorial = findFactorial(factorialNum);
        System.out.println("Value of " + factorialNum + "! is" + " = " + getFactorial);
    }


    public static long findFactorial(int factorialNum){
        long factorialCal = 1;
        while(factorialNum > 0){
            factorialCal *= factorialNum;
            factorialNum--;
        }
        if (factorialNum < 0){
            return 0;
        }


        return factorialCal;
    }

}
