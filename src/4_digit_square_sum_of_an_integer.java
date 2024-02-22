import java.util.Scanner;

class DigitSquareSumOfAnInteger {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Please enter number");
        int num4Sum = userInput.nextInt();
        int getNum4Sum = digitSum(num4Sum);
        long getSquareDigitSum = squareDigitSum(num4Sum);
        System.out.println("The digit sum of " + num4Sum + " is " + getNum4Sum);
        System.out.println("The Square digit sum of " + num4Sum + " is " + getSquareDigitSum);
    }


    // Sum of the digits of an integer

    public static int digitSum(int num4Sum){
        int addDigits = 0;
        while(num4Sum > 0){
            addDigits += num4Sum% 10;
            num4Sum /= 10;
        }
        return addDigits;
    }

    // Sum of the square of the digits of an integer

    public static long squareDigitSum(int num4Sum){
        long sum = 0;
        while(num4Sum > 0){
            sum += (num4Sum % 10)*(num4Sum % 10);
            num4Sum/= 10;
        }

        return sum;
    }
}
