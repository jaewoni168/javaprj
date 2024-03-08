// 다세대 주택으로 비유하면서 할 거임

package day02;

public class ArrayInArray {
    public static void main(String[] args) {
//        2차원 함수라 for문을 두개 돌려야 한다.
        int[][] mathScores = new int[2][3];            // 한 층당 방이 3개 즉 2층집에 방이 6개
        for(int i=0; i<mathScores.length; i++) {
            for(int k=0; k<mathScores[i].length; k++) {
                System.out.println("mathScores["+i+"]["+k+"]="
                        +mathScores[i][k]);
            }
        }
        System.out.println();

        // case 2
        int[][] englishScores = new int[2][];
        englishScores[0] = new int[2];  // 1층에 방이 2개
        englishScores[1] = new int[3];  // 2층에 방이 3개


        for(int i=0; i<englishScores.length; i++) {
            for(int k=0; k<englishScores[i].length; k++) {
                System.out.println("englishScores["+i+"]["+k+"]=" + englishScores[i][k]);
            }
        }
        System.out.println();

        int[][] javaScores = { {95, 80}, {92, 96, 80} };


        for(int i=0; i<javaScores.length; i++) {
            for(int k=0; k<javaScores[i].length; k++) {
                System.out.println("javaScores["+i+"]["+k+"]="
                        +javaScores[i][k]);
            }
        }

    }
}
