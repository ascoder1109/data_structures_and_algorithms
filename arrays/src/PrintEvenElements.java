
import java.util.Arrays;

public class PrintEvenElements {
    public static void main(String[] args) {
        int[] arr= {1,2,3,4,5,6};
        printEvenIntegers(arr);

    }
    static void printEvenIntegers(int[] arr){
        Arrays.stream(arr).filter(n -> n%2==0).forEach(System.out::println);
    }
}
    