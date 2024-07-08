
// import java.lang.reflect.Array;
import java.util.Arrays;

public class ReverseAnArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        reverse(arr, 0, arr.length-1);
        Arrays.stream(arr).forEach(System.out::println);
    }
    static void reverse(int[] arr, int start, int end){
        while(start<=end){
            int temp =arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
