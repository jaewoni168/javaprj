package day08;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Iterator;

public class HashMapTest {
    public static void main(String[] args) {
        // Map 컬렉션 생성
        Map<String, Integer> map = new HashMap<String, Integer>();

        // 객체 저장
        map.put("강감찬", 80);
        map.put("이순신", 50);
        map.put("원균", 30);
        map.put("장보고", 70);
        map.put("강감찬", 95);

        System.out.println("등록수: " + map.size() + "명");  // 등록수: 4명 / 강감찬은 중복되서

        // 찾기
        System.out.println("강감찬 나이: " + map.get("강감찬") + "살"); // 강감찬 나이: 95살 / 마지막 이 95

        // 객체를 하나씩 처리
        Set<String> keySet=map.keySet();   // key set
        Iterator<String> keyIterator = keySet.iterator();  // 반복자

        // 키를 먼저 가져와서 반복절에 넣고 반복절이 돌린다음 하나하나씩 출력을 한다.
        while (keyIterator.hasNext()){
            String key = keyIterator.next();
            Integer value = map.get(key);
            System.out.println(key + " : "+ value);
        }

        // 삭제
        map.remove("원균");
        System.out.println("등록수: " + map.size() + "명");   // 등록수 : 3명

        // key value -> Map entry set
        Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
        Iterator<Map.Entry<String, Integer>> entryIterator = entrySet.iterator();

        while (entryIterator.hasNext()){
            Map.Entry<String, Integer> entry = entryIterator.next();
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key + " : " + value);
        }

        System.out.println();

    }
}
