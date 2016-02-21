import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        int i;
        int[] m = new int[] { 10, 21, 5, 22, 9, 29, 25, 22, 11, 14, 8, 14 };
        Arrays.sort(m);
        i=22;
        System.out.println(Arrays.binarySearch(m,i));     }}