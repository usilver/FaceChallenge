import java.util.Scanner;

public class Challenge12_Triangle_Star_Patterns {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        System.out.print("Triangle Pattern\n");
        System.out.print("Please enter length of pattern: \n");
        int length = userInput.nextInt();
        patternOne(length);
        System.out.println();
        patternTwo(length);
        System.out.println();
        patternThree(length);
    }

    public static void patternOne(int num){
        int outer_index = 0;
        while (outer_index < num){
            System.out.print("*");
            int inner_index = 0;
            while (inner_index < outer_index){
                System.out.print(" *");
                inner_index++;
            }
            System.out.println();
            outer_index++;
        }
    }


    public static void patternTwo(int num){
        while (0 < num){
            System.out.print("*");
            int inner_index = num -1;
            while (inner_index > 0){
                System.out.print(" *");
                inner_index--;
            }
            System.out.println();
            num--;
        }
    }

    public static void patternThree(int num){
        int outer_index = num;

        while (outer_index > 0){

            // this loop print spaces
            int i = 0 ;
            while (i < outer_index -1){
                System.out.print("  ");
                i++;
            }

            // this loop print stars
            int inner_index = 0;
            while (inner_index < num - outer_index) {
                System.out.print(" *");
                inner_index++;
            }
            System.out.println();
            outer_index--;
        }
    }

}
