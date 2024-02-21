import java.util.Scanner;

class AddOddNumberUpToN {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Add odd numbers from 1 to N");
        System.out.println("Please enter number:");
        int num = userInput.nextInt();
        int sum = addOddNum(num);
        System.out.println("Odd sum till " + num + " is " + sum);
    }

    // Sum of all odd numbers

    public static int addOddNum(int num) {
        int i = 1;
        int sum = 0;
        while(i < num){
            sum += i;
            i += 2;
        }
        System.out.println(sum);
        return sum;
    }

}
