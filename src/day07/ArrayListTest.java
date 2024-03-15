package day07;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {
    public static void main(String[] args) {

        List<String> list = new ArrayList<String>();

        list.add("Java");
        list.add("JSP");
        list.add("Servlet");
        list.add("Spring");
        list.add("JPA");

        for(int i = 0; i<list.size(); i++){
            String str = list.get(i);
            System.out.println(i+":"+str);
        }
        int size = list.size();
        System.out.println("총계수: " + size);

        String str2 = list.get(2);
        System.out.println("2: " + str2);

        list.remove(2);         // 제거하는 것

        // 향상된 for 문
        for(String val:list)
            System.out.println(val + " ");
//==============================================================
        // 값이 Java 인 것을 찾아서 수정하기

        for(int i = 0; i<list.size(); i++){
            if(list.get(i)=="Java"){
                list.set(i,"자바");
            }
            System.out.println(i+":"+list.get(i));
        }
    }
}
