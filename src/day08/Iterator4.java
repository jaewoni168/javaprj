// 탐색중 제거
package day08;

import java.util.ArrayList;
import java.util.Collection;

public class Iterator4 {
    public static void main(String[] args) {
        Collection<Integer> c = new ArrayList<Integer>();

        for (int i = 0; i < 10; ++i)
            c.add(i);

        for (int i : c)
            System.out.print(i + " ");

        System.out.println();


        // 19~20 은 c 컬렉션 객체에서 짝수인 값들을 제거하는 코드를 위와같이 구현 X
        // 컬렉션 객체를 for문으로 탐색하는 도중에, 그 컬렉션 객체가 수저되는 메소드
//        (add, remove, addAll, clear 등)가 호출되면 에러 발생
//         컬렉션 객체를 탐색하는 도중에, 이터레이터 객체의 remove 메소드를 호출하는 것은 허용
        for (int i : c)
            if (i % 2 == 0) c.remove(i);

        for (int i : c)
            System.out.print(i + " ");
    }
}
