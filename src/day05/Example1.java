// int 정렬
package day05;
import java.util.Arrays;

public class Example1 {
    public static void main(String[] args) {
        int[] a = {17, 14, 11, 19, 13, 15, 20, 12, 16, 18};

//        Arrays.sort(a);

        // 일부분만 배열하려면
        Arrays.sort(a,0,5);
        System.out.println(Arrays.toString(a));
    }
}
