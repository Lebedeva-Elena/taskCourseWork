import java.util.Arrays;

public class Main {
     int[][] result = new int[2][];

    public static void main(String[] args) {
        int[][] result = new int[2][];
        int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
        if (result.length % 2 == 0) {
            result[result.length/2-1] = Arrays.copyOfRange(array, 0, array.length/2);
            result[result.length/2] = Arrays.copyOfRange(array,array.length/2 , array.length);

        } else {
            result[result.length/2-1] = Arrays.copyOfRange(array, 0, array.length/2+1);
            result[result.length/2] = Arrays.copyOfRange(array,array.length/2+1 , array.length);
        }
        System.out.println(Arrays.deepToString(result));
    }
}











