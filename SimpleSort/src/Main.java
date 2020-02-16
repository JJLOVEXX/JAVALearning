import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] array = new int[10];
        for (int i = 0; i < 10; i++) {
            array[i] = (int)(1+ Math.random() * (100 - 1 + 1));
        }
        Arrays.sort(array);
        for (int a:array
             ) {
            System.out.print(a+" ");
        }
    }
}
