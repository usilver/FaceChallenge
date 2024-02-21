public class Challenge13_Average {
    public static void main(String[] args) {
        System.out.println("Welcome to Array sum and average");
        int[] userArray = ArrayUtility.inputArray();
        long sumArrayList = sumArrayList(userArray);
        double avgArrayList = avgArrayList(userArray);
        System.out.println("Sum of the " + userArray.length + " elements is " + sumArrayList);
        System.out.println("Average of the " + userArray.length + " elements is " + avgArrayList);
    }

    // Sum
    public static long sumArrayList(int[] array){
        long sum = 0;
        int i = 0;
        while (i < array.length){
            sum += array[i];
            i++;
        }
        return sum;
    }

    // Average

    public static double avgArrayList(int[] array){
        double sum = sumArrayList(array);
        return (sum / array.length);
    }
}
