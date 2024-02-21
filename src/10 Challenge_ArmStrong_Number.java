import java.util.Scanner;

class isArmStrongNumber {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Check Armstrong Number:\n");
        int num = userInput.nextInt();
        boolean isArmstrong = isArmstrong(num);
        System.out.println("Is " + num + " an Armstrong Number? - " + isArmstrong);
    }

//    ArmStrong Number

    public static boolean isArmstrong(int number){
        int noOfDigits = noOfDigits(number);
        int finalNumber = 0;
        int copyNum = number;
        while (number > 0){
            int digitOfNumber = number % 10;
            finalNumber += power(digitOfNumber, noOfDigits);
            number /= 10;
        }
//        System.out.println(number);
        return finalNumber == copyNum;
    }


    public static int power(int num1, int num2){
        int i = 0;
        int power = 1;
        while (i < num2){
            power *= num1;
            i++;
        }
        return power;
    }
    public static int noOfDigits(int number){
        int noOfDigits = 0;
        while (number > 0){
            noOfDigits++;
            number /= 10;
        }
        return noOfDigits;
    }
}
