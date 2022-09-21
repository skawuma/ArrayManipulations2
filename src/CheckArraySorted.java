import java.util.InputMismatchException;
import java.util.Scanner;

public class CheckArraySorted {
    public static boolean isSorted(int[] a,int n){
        for(int i=1;i<n;i++){
            if(a[i]<a[i-1]){
                return false;
            }
        }
        return true;
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
                boolean ans=isSorted(a,n);
                if(ans==true) {
                    System.out.println("Yes, the Array is Sorted");
                }
                else{
                    System.out.println("No, the Array is not Sorted");
                }
            }catch (InputMismatchException e) {

                System.out.println("Oops that was an invalid input!!! TRY AGAIN");

            }
        }
    }
}

