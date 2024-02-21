import java.util.Scanner;

public class Challenge7_isPrimeNumber {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Check Prime Number\n");
        System.out.print("Please enter number:\n");
        int userNum = userInput.nextInt();
        boolean isPrime = isPrime(userNum);
        System.out.print("Is " + userNum + " a prime number? - " + isPrime);
    }

    // Prime Number

    public static boolean isPrime(int num){
        boolean prime = true;
        int i = 2;
        while(i < num){
            if (num % i == 0) {
                return false;
            }
            i++;
        }
        return prime;
    }
}
