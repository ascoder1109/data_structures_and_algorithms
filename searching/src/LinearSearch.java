import java.util.Arrays;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        System.out.println(linearSearch(arr,4));
    }
    static int linearSearch(int[] arr, int element) {
        for(int i = 0 ; i< arr.length; i++){
            if(arr[i] == element){
                return i;
            }

        }
        return -1;
    }
}
