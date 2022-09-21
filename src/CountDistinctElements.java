import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Arrays;

public class CountDistinctElements {
    public static int countDigits(int[] a,int n){
        int count=0;boolean isDistinct=true;
        for(int i=0;i<n;i++){
            for(int j=i-1;j>=0;j--){
                if(a[i]==a[j]){
                    isDistinct=false;
                    break;
                }
            }
            if(isDistinct==true){
                count++;
            }
            isDistinct=true;
        }
        return count;
    }

    public static void main(String[] args) {
        while (true) {
            try {
                Scanner s = new Scanner(System.in);
                System.out.println("Please enter The Size of your preffered ArraySize");
                //creates an array in the memory of length n
                int n = s.nextInt();
                System.out.println("enter random numbers of array size " + n);
                int[] a = new int[n];

                for (int i = 0; i < a.length; i++) {
                    //reading the number of elements from the that we want to enter
                    a[i] = s.nextInt();
                }
                // accessing array elements using the for loop
               // for(int i= 0;i<n;i++) {
                //    System.out.println(a[i]);
               // }
                System.out.println(Arrays.toString(a));
                System.out.println("The number of   distinct elements in your Array are " + countDigits(a,n));
            }catch (InputMismatchException e) {

                System.out.println("Oops that was an invalid input!!! TRY AGAIN");

            }
        }
    }
}
