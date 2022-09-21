import java.util.InputMismatchException;
import java.util.Scanner;
public class AverageofInputArray {
    public static double average(int[] a) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        double avg = sum / a.length;
        return avg;
    }

    public static void main(String[] args) {
        while (true) {
            try {
                Scanner s = new Scanner(System.in);
                System.out.println("Please enter The Size of your preffered ArraySize");
                int n = s.nextInt();
                System.out.println("enter random numbers of array size " + n);
                int[] a = new int[n];

                for (int i = 0; i < a.length; i++) {
                    a[i] = s.nextInt();
                }
                System.out.println("The  average of your Array is " + average(a));
                // }
            } catch (InputMismatchException e) {

                    System.out.println("Oops that was an invalid input!!! TRY AGAIN");

            }

        }
    }
}