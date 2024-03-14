package day06;

import java.util.Objects;
import java.util.HashMap;

public class Key {
    private int number;

    public Key(int number){
        this.number = number;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;
        if (!(obj instanceof Key key)) return false;
        return number == key.number;
    }

    @Override
    public int hashCode() {
        return Objects.hash(number);
    }

    public static void main(String[] args) {
        HashMap<Key, String> hashMap = new HashMap<Key, String>();

        hashMap.put(new Key(1), "이순신");
        String value = hashMap.get(new Key(1));
        System.out.println(value);  // 이순신

        Key a=new Key(1);
        String value2 = hashMap.get(a);
        System.out.println(value2);  // 이순신



    }
}
