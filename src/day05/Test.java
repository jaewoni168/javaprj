package day05;
import java.util.Arrays;

public class Test {
    static Integer[] a = new Integer[]{10, 3, 5, 2, 8};

    static int Test1(int key, int low, int high) {
        int mid;

        if (low <= high) {
            mid = (low + high) / 2;

            if (key == a[mid]) {
                return mid;
            } else if (key < a[mid]) {
                return Test1(key, low, mid - 1);
            } else {
                return Test1(key, mid + 1, high);
            }
        }
        return -1;
    }

    static int Test2(int key, int low, int high) {
        int mid;
        while (low <= high) {
            mid = (low + high) / 2;

            if (key == a[mid]) {
                return mid;
            } else if (key < a[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));

        System.out.println("1. 순환 호출을 이용한 이진 탐색");
        System.out.println(Test1(5,0, a.length-1));

        System.out.println("\n2. 반복을 이용한 이진 탐색");
        System.out.println(Test1(20,0, a.length-1));

    }
}
