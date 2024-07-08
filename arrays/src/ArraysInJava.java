
import java.util.Arrays;

public class ArraysInJava {
    public static void main(String[] args) throws Exception {
        int[] arr = new int[6];
        arr[0] = 0;
        arr[1] = 1;
        arr[2] = 2;
        arr[3] = 3;
        arr[4] = 4;
        arr[5] = 5;
        // arr[6] = 6;
        Arrays.stream(arr).forEach(System.out::println);
        
        int[] arr2 = {1,2,3,4,5,6};
        Arrays.stream(arr2).forEach(System.out::println);
        

    }
}
