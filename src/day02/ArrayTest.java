package day02;

public class ArrayTest {
    public static void main(String[] args) {
//        int[] scores = {83, 90, 87};
//
//        System.out.println("scores[0] : " + scores[0]);    // 83
//        System.out.println("scores[1] : " + scores[1]);    // 90
//        System.out.println("scores[2] : " + scores[2]);    // 87
//
//        int sum = 0;
//        for (int i = 0; i < 3; i++) {
//            sum += scores[i];
//        }
//        System.out.println("총합 : " + sum);        // 260
//        double avg = (double) sum / 3;
//        System.out.println("평균 : " + avg);        // 86.66666666667

//        int[] scores;
//        scores = new int[]{83, 90, 87, 4, 4, 4};
//        int sum1 = 0;
//        for (int i = 0; i < scores.length; i++) {
//            sum1 += scores[i];
//        }
//        System.out.println("총합 : " + sum1);    // 260
//
//        int sum2 = add(new int[]{83, 90, 87, 100, 40});
//        System.out.println("총합 : " + sum2);
//        System.out.println();
//    } // main
//
////    정적 멤버 메소드
//    public static int add(int[] scores) {
//        int sum = 0;
//        for (int i = 0; i < scores.length; i++) {
//            sum += scores[i];
//        }
//        return sum;
//    } // member method 함수 끝
//        int[] arr1 = new int[3];
//        for(int i=0; i<3; i++) {
//            System.out.println("arr1[" + i + "] : " + arr1[i]);
//        }
//        arr1[0] = 10;
//        arr1[1] = 20;
//        arr1[2] = 30;
//        for(int i=0; i<3; i++) {
//            System.out.println("arr1[" + i + "] : " + arr1[i]);
//        }
//
//        double[] arr2 = new double[3];
//        for(int i=0; i<3; i++) {
//            System.out.println("arr2[" + i + "] : " + arr2[i]);
//        }
//        arr2[0] = 0.1;
//        arr2[1] = 0.2;
//        arr2[2] = 0.3;
//        for(int i=0; i<3; i++) {
//            System.out.println("arr2[" + i + "] : " + arr2[i]);
//        }
//
//        String[] arr3 = new String[3];
//        for(int i=0; i<3; i++) {
//            System.out.println("arr3[" + i + "] : " + arr3[i]);
//        }
//        arr3[0] = "1월";
//        arr3[1] = "2월";
//        arr3[2] = "3월";
//        for(int i=0; i<3; i++) {
//            System.out.println("arr3[" + i + "] : " + arr3[i]);
//        }

        int[] scores = { 83, 90, 87 };

        int sum = 0;
        for(int i=0; i<scores.length; i++) {
            sum += scores[i];
        }
        System.out.println("총합 : " + sum);       // 260

        double avg = (double) sum / scores.length;
        System.out.println("평균 : " + avg);       // 86.66666666666667
    }
}
