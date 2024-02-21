import java.util.Scanner;

class CreateTable {
    public static void main(String[] args) {
        greetUser();
//        multiplicationTable();

        Scanner userInput = new Scanner(System.in);
        System.out.print("Enter number:\n");
        int num = userInput.nextInt();
        findTable(num);


    }

    public static void greetUser(){
        System.out.println("Welcome to Counting Table World!");
    }

    public static void multiplicationTable(){
        Scanner userInput = new Scanner(System.in);
        System.out.println("Please enter table number: ");
        int numberTable = userInput.nextInt();
        int  i = 1;
        while (i < 11){
            System.out.println(STR."\{numberTable} * \{i} = \{numberTable * i}");
            i++;
        }
    }

    public static void findTable(int num){
        int i = 1;
        while(i < 11){
            System.out.println(num + " X " + i + " = " + num*i);
            i++;
        }
    }
}
