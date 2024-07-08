
import java.util.Arrays;

public class ResizeAnArray {
    public static void main(String[] args) {
        int arr[] = {1,3,4};
        arr = resizeAnArray(arr, 8);
        Arrays.stream(arr).forEach(System.out::println);
    }
    static int[] resizeAnArray(int[] arr, int capacity){
        int[] temp = new int[capacity];
        System.arraycopy(arr, 0, temp, 0, arr.length);
        arr = temp;
        return temp;
    }
}
