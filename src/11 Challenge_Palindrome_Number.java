import java.util.Scanner;

class isPalindromeNumber {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Check Palindrome Number: \n");
        System.out.print("Please enter number: \n");
        int num = userInput.nextInt();
        boolean isPalindrome = isPalindrome(num);
        System.out.print(" Is " + num + " a palindrome number? - " + isPalindrome);
    }

    // Palindrome Number

    public static boolean isPalindrome(int number){
        return number == reverseNum(number);
    }

    public static int reverseNum(int number) {
        int newNum = 0;
        while (number > 0){
            int digit = (number % 10);
            newNum =  (newNum * 10) + digit;
//            System.out.println(newNum);
            number /= 10;
        }
        return newNum ;
    }
}
