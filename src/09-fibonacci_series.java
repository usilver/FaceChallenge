import java.util.Scanner;

class FindFibonacciSeries {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Fibonacci Series:\n");
        int num = userInput.nextInt();
        System.out.print("Fibonacci Series up to " + num +  " is:\n");
        fibonacciSeries(num);
    }

    // fibonacci series

    public static void fibonacciSeries(int number){
        if(number < 0) return;
        System.out.print("0 ");
        if(number == 0) return;
        System.out.print("1 ");

        int first = 0, second = 1;
        while (first + second <= number){
            int third = first + second;
            System.out.print(third + " ");
            first = second;
            second = third;
        }
    }
}
