import java.util.Scanner;

public class Challenge8_Reverse_Num_Digits {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Reverse Any Number\n");
        int num = userInput.nextInt();
        int reverseNum = reverseNum(num);
        System.out.print("The reverse of " + num + " is " + reverseNum);
    }

    // Reverse num digit

    public static int reverseNum(int number){
        int newNum = 0;
        while(number > 0){
            int digit = (number % 10);
            newNum = newNum * 10 + digit;
            number /= 10;
        }
        return newNum;
    }
}
