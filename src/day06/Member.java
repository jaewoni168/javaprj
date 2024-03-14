package day06;

public class Member {
    String id;
    public Member(String id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Member) {
            Member member = (Member) obj;
            if (id.equals(member.id)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }

    @Override
    public String toString() {
        return id.toString();
    }

    public static void main(String[] args) {
        Member obj1 = new Member("blue");
        Member obj2 = new Member("blue");
        Member obj3 = new Member("red");

//        if(obj1.equals(obj2)) {
//            System.out.println("obj1과 obj2는 같습니다.");
//        } else {
//            System.out.println("obj1과 obj2는 같지 않다.");
//        }
//
//        if(obj1.equals(obj3)) {
//            System.out.println("obj1과 obj3는 같습니다.");
//        } else {
//            System.out.println("obj1과 obj3는 같지 않다.");
//        }

        System.out.println(obj1.equals(obj2)); // true
        System.out.println(obj1.equals(obj3)); // false

        // 원래 주소
        System.out.println(System.identityHashCode(obj1));
        System.out.println(System.identityHashCode(obj2));
        System.out.println(System.identityHashCode(obj3));

        // 재정의한 해시코드 주소
        System.out.println(obj1.hashCode());  // 3027034
        System.out.println(obj2.hashCode());  // 3027034
        System.out.println(obj3.hashCode());
        System.out.println("====================");
        System.out.println(obj1.toString());  // toString()을 오버라이드 하면 blue가 나온다.
        System.out.println(obj1.getClass());
        System.out.println(obj1.getClass().getName());
        System.out.println(Integer.toHexString(obj1.hashCode()));
        System.out.println(obj1.hashCode());
    }
}
