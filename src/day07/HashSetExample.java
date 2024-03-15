package day07;

import java.util.*;

public class HashSetExample {
    public static void main(String[] args) {
        Set<String> set = new HashSet<String>();

        set.add("Java");
        set.add("JDBC");
        set.add("Servlet/JSP");
        set.add("Java");
        set.add("myBatis");

        int size = set.size();
        System.out.println("총 객체수: " + size);

        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.println("\t" + element);
        }

        set.remove("JDBC");
        set.remove("myBatis");
        set.add("자바공부");
        System.out.println("총 객체수: " + set.size());
        for(String element: set) {  // '향상된 for 문' 으로 사용하기
            System.out.println("\t" + element);
        }


        set.clear();
        if(set.isEmpty()) {System.out.println("비어있음");}

        System.out.println("============================");

        Collection<Integer> c = new ArrayList<Integer>();
        for(int i = 0; i<10; i++) c.add(i);
        for(int i:c ) System.out.print(i+ " ");
        System.out.println("\n===========================");

        // 탐색중 제거
        // 탐색중에 제거가 안되기 때문에 iterator 를 사용해야한다.
        Iterator<Integer> iter = c.iterator();
        while (iter.hasNext()){
            int i = iter.next();
            if(i%2==0) iter.remove();  // i 에 해당하는 것들 중에서 2의 배수만 삭제하겠다.
        }

        for (int i : c) System.out.print(i + " ");

    }
}
