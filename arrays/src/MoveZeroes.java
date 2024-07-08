
import java.util.Arrays;

public class MoveZeroes {
    public static void main(String[] args) {
        int[] arr = {1,2,0,4,5,0,0,6,0,7};
        moveZeroes(arr);
        Arrays.stream(arr).forEach(System.out::println);
    }
    static void moveZeroes(int[] arr){
        int n = arr.length;
        int j = 0;
        for(int i = 0 ; i<n ; i++){
            if (arr[i] != 0) {
                // Swap only when arr[i] is non-zero
                if (i != j) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
                j++;
            }
        }
    }
}
