import java.util.Scanner;

class FindGCF {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Find GCF\n");
        System.out.print("Please enter number:\n");
        int numOne = userInput.nextInt();
        System.out.print("Please enter number:\n");
        int numTwo = userInput.nextInt();
        int gcf = gcf(numOne, numTwo);
        System.out.print("GCF of " + numOne + " and " + numTwo + " is " + gcf);
    }

    // Find GCF

    public static int gcf(int num1, int num2){

        int gcf = 1;
        int least = least(num1, num2);
        int i = 2;
        while(i <= least){
            if(num1 % i == 0 && num2 % i == 0){
                gcf = i;
            }
            i++;
        }
        return gcf;
    }

    public static int least(int num1, int num2){
        if(num1 < num2){
            return num1;
        } else {
            return num2;
        }
    }
}
