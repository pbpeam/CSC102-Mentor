import java.util.Scanner;

/**
 * Example of a boring program with only main method taught in school.
 */
public class BoringProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter amount of numbers: ");
        int amt = sc.nextInt();
        int[] input = new int[amt];

        System.out.print("Enter " + amt + " numbers: ");
        for(int i = 0; i < amt; ++i)
            input[i] = sc.nextInt();

        // Insertion sort implementation
        int temp;
        for (int i = 1; i < input.length; i++) {
            for(int j = i ; j > 0 ; j--){
                if(input[j] < input[j-1]){
                    temp = input[j];
                    input[j] = input[j-1];
                    input[j-1] = temp;
                }
            }
        }

        System.out.print("Result: ");
        for(int i : input) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
